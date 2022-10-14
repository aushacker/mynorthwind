FROM docker.io/library/mariadb:10

COPY /mywind/northwind.sql /docker-entrypoint-initdb.d/northwind01.sql
COPY /mywind/northwind-data.sql /docker-entrypoint-initdb.d/northwind02.sql

RUN mkdir /var/lib/mysqldata && \
    chown -R mysql:root /var/lib/mysqldata /var/run/mysqld && \
    chmod -R g=u /var/lib/mysqldata /var/run/mysqld

CMD ["mariadbd", "--datadir=/var/lib/mysqldata"]
