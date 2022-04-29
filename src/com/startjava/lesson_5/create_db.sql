postgres=# CREATE DATABASE Jaegers;
postgres=# \c jaegers;
jaegers=# CREATE TABLE Jaegers (
jaegers(# id SERIAL PRIMARY KEY,
jaegers(# modelName TEXT,
jaegers(# mark TEXT,
jaegers(# height REAL,
jaegers(# weight REAL,
jaegers(# status TEXT,
jaegers(# launch DATE,
jaegers(# kaijuKill INTEGER)
jaegers-# ;