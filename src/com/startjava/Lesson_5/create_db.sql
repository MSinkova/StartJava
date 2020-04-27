-- create database

create database Jaegers;

create table Jaeger (
    id SERIAL primary key,
    modelName TEXT,
    mark CHAR(6),
    height INTEGER,
    weight double precision,
    status TEXT,
    origin TEXT,
    launch DATE,
    kaijuKill INTEGER
);
