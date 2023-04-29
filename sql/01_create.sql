CREATE USER app;
CREATE DATABASE db;
GRANT ALL PRIVILEGES ON DATABASE db TO app;

create table vehicle
(
    id bigserial primary key,
    brand varchar(255),
    model varchar(255)
);

alter table vehicle owner to app;
