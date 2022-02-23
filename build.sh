#!/bin/bash
#
# Tools for developer desktop builds.
# Builds and runs app and db containers locally.
#
# Requires:
# - podman
# - buildah
# - local images for JBoss EAP (artifacts and runtime)
#
# Feb 23, 2022
#
mavenMirror='http://maximin:8081/repository/maven-redhat/'
eapImage='registry.redhat.io/jboss-eap-7/eap73-openjdk8-openshift-rhel7'
eapImageRuntime='registry.redhat.io/jboss-eap-7/eap73-openjdk8-runtime-openshift-rhel7'

usage() {
    echo "Usage: build.sh COMMAND [COMMAND]..."
}

clean() {
    echo "*** Removing all artifacts ***"
    podman ps -a | grep nwdb > /dev/null
    if [[ $? -eq 0 ]];
    then
        stop_db
    fi
    podman rmi nw-db
}

build_app() {
    echo "*** Building application image ***"
    pushd javadb > /dev/null
    podman rmi northwind-app-artifacts
    podman rmi northwind-app

    builder=$(buildah from ${eapImage})
    buildah config \
        -e MAVEN_MIRROR_URL="${mavenMirror}" \
        -e GALLEON_PROVISION_DEFAULT_FAT_SERVER="true" \
        -e CUSTOM_INSTALL_DIRECTORIES=s2i/custom \
        -e ARTIFACT_DIR="" \
        ${builder}
    buildah copy --chown 185:0 ${builder} . /tmp/src
    buildah run ${builder} -- /usr/local/s2i/assemble
    buildah commit ${builder} northwind-app-artifacts

    rt=$(buildah from ${eapImageRuntime})
    buildah config \
        -e GALLEON_PROVISION_LAYERS="jaxrs-server,observability" \
        ${rt}
    buildah copy --chown 185:0 --from ${builder} ${rt} '/s2i-output/server' $JBOSS_HOME
    buildah config --cmd /home/jboss/bin/openshift-launch.sh ${rt}
    buildah commit --rm ${rt} northwind-app

    buildah rm ${builder}
    popd > /dev/null
}

build_db() {
    echo "*** Building database image ***"
    pushd dockerdb > /dev/null
    podman rmi mynorthwind
    podman build --squash -t mynorthwind .
    popd > /dev/null
}

start_app() {
    echo "*** Starting web container ***"
    podman run --name nw-app -d --rm \
      -p 8080:8080 \
      -e DB_SERVICE_PREFIX_MAPPING=northwind-mysql=DS1 \
      -e NORTHWIND_MYSQL_SERVICE_HOST=$(hostname) \
      -e NORTHWIND_MYSQL_SERVICE_PORT=3306 \
      -e DS1_JNDI=java:/NorthwindDS \
      -e DS1_DATABASE=northwind \
      -e DS1_NONXA=true \
      -e DS1_USERNAME=user1 \
      -e DS1_PASSWORD=mypa55 \
      -e DS1_MIN_POOL_SIZE=20 \
      -e DS1_MAX_POOL_SIZE=20 \
      -e DS1_CONNECTION_CHECKER=org.jboss.jca.adapters.jdbc.extensions.mysql.MySQLValidConnectionChecker \
      -e DS1_EXCEPTION_SORTER=org.jboss.jca.adapters.jdbc.extensions.mysql.MySQLExceptionSorter \
      northwind-app-artifacts
}

start_db() {
    echo "*** Starting Northwind database container ***"
    podman run --name nw-db -d --rm \
      -p 3306:3306 \
      -e MYSQL_ROOT_PASSWORD=r00tpa55 \
      -e MYSQL_USER=user1 \
      -e MYSQL_PASSWORD=mypa55 \
      -e MYSQL_DATABASE=northwind \
      mynorthwind
}

stop_app() {
    echo "*** Stopping app container ***"
    podman stop nw-app
}

stop_db() {
    echo "*** Stopping database container ***"
    podman stop nw-db
}

# Exit if no target command specified
if [[ $# -lt 1 ]]; then
    usage
    exit 64
fi

# Execute individual commands in order
for arg in "$@"
do
    case $arg in
        clean) clean ;;
        build_app) build_app ;;
        build_db) build_db ;;
        start_app) start_app ;;
        start_db) start_db ;;
        stop_app) stop_app ;;
        stop_db) stop_db ;;
        *)
    esac
done
