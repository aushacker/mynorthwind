FROM docker.io/library/mysql:8.0

COPY /mywind/northwind.sql /docker-entrypoint-initdb.d/northwind01.sql
COPY /mywind/northwind-data.sql /docker-entrypoint-initdb.d/northwind02.sql
