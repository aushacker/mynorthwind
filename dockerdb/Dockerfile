FROM docker.io/library/mariadb:10

COPY /mywind/northwind.sql /docker-entrypoint-initdb.d/northwind01.sql
COPY /mywind/northwind-data.sql /docker-entrypoint-initdb.d/northwind02.sql
