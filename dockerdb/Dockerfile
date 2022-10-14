FROM docker.io/library/mariadb:10

COPY /mywind/northwind.sql /docker-entrypoint-initdb.d/northwind01.sql
COPY /mywind/northwind-data.sql /docker-entrypoint-initdb.d/northwind02.sql

RUN chown -R mysql:root /var/lib/mysql /var/run/mysqld && \
    chmod -R g=u /var/lib/mysql /var/run/mysqld
