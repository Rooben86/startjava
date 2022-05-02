SELECT * FROM Jaegers;
SELECT * FROM Jaegers WHERE status != 'Destroyed';
SELECT * FROM Jaegers ORDER BY mark DESC;
SELECT * FROM Jaegers WHERE mark = 'Mark-6' OR mark = 'Mark-1';
SELECT * FROM Jaegers ORDER BY mark DESC;
SELECT * FROM Jaegers WHERE launch = (SELECT MIN(launch) FROM Jaegers);
SELECT * FROM Jaegers WHERE kaijukill = (SELECT MAX(kaijukill) FROM Jaegers)
OR kaijukill = (SELECT MIN(kaijukill) FROM Jaegers);
SELECT AVG(weight) FROM Jaegers;
UPDATE Jaegers SET kaijukill = kaijukill + 1 WHERE status != 'Destroyed';
DELETE FROM Jaegers WHERE status = 'Destroyed';