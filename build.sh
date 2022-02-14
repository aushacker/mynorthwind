#!/bin/bash
#
# Various fragments for developer builds
#
dbver='1.0'

usage() {
    echo "Usage: build.sh COMMAND COMMAND..."
}

clean() {
    echo "*** Removing all artifacts ***"
    podman ps -a | grep nwdb > /dev/null
    if [[ $? -eq 0 ]];
    then
        stop_db
    fi
    podman rmi mynorthwind:${dbver}
}

build_db() {
    echo "*** Building database image ***"
    pushd dockerdb > /dev/null
    podman build --squash -t mynorthwind:${dbver} .
    popd > /dev/null
}

start_db() {
    echo "*** Starting Northwind database container ***"
    podman run --name nwdb -d --rm \
      -p 3306:3306 \
      -e MYSQL_ROOT_PASSWORD=r00tpa55 \
      -e MYSQL_USER=user1 \
      -e MYSQL_PASSWORD=mypa55 \
      -e MYSQL_DATABASE=northwind \
      mynorthwind:${dbver}
}

stop_db() {
    echo "*** Stopping and removing database container ***"
    podman stop nwdb
}

if [[ $# -lt 1 ]]; then
    usage
    exit 64
fi

for arg in "$@"
do
    case $arg in
        clean) clean ;;
        build_db) build_db ;;
        start_db) start_db ;;
        stop_db) stop_db ;;
        *)
    esac
done
