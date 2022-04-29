jaegers=# SELECT * FROM Jaegers;
jaegers=# SELECT * FROM Jaegers WHERE status != 'Destroyed';
jaegers=# SELECT * FROM Jaegers ORDER BY mark DESC;
jaegers=# SELECT * FROM Jaegers WHERE mark = 'Mark-6' OR mark = 'Mark-1';
jaegers=# SELECT * FROM Jaegers ORDER BY mark DESC;
jaegers=# SELECT * FROM Jaegers WHERE launch = (SELECT MIN(launch) FROM Jaegers);
jaegers=# SELECT AVG(weight) FROM Jaegers;
jaegers=# UPDATE Jaegers SET kaijukill = kaijukill+1 WHERE status != 'Destroyed';
jaegers=# DELETE FROM Jaegers WHERE status = 'Destroyed';