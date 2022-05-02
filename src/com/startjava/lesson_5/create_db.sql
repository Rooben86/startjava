CREATE DATABASE Jaegers;
\c jaegers;
CREATE TABLE Jaegers (
    id SERIAL PRIMARY KEY,
    modelName TEXT,
    mark TEXT,
    height REAL,
    weight REAL,
    status TEXT,
    launch DATE,
    kaijuKill INTEGER
    );