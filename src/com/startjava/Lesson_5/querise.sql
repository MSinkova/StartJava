 -- Научитесь делать следующие запросы:
 -- выведите всю таблицу
SELECT * FROM Jaeger;

 -- отобразите только не уничтоженных роботов
SELECT * FROM Jaeger
WHERE status <> 'Destroyed';

 -- отобразите роботов нескольких серий, например Mark-1 и Mark-6
SELECT * FROM Jaeger
WHERE mark = 'Mark-1' OR mark = 'Mark-6';

 -- отсортируйте таблицу по убыванию по столбцу mark
SELECT * FROM Jaeger
ORDER BY mark DESC;

 -- отобразите самого старого робота
SELECT * FROM Jaeger
WHERE launch = (SELECT MIN(launch) FROM Jaeger);

 -- отобразите роботов, которые уничтожили больше/меньше всех kaiju
SELECT mark FROM Jaeger
WHERE kaijukill = (SELECT MAX(kaijukill) FROM Jaeger);

SELECT mark FROM Jaeger
WHERE kaijukill = (SELECT MIN(kaijukill) FROM Jaeger);

 -- отобразите средний вес роботов
SELECT AVG(weight) FROM Jaeger;

 -- увеличьте на единицу количество уничтоженных kaiju у роботов, которые до сих пор не разрушены
UPDATE Jaeger SET kaijukill = kaijukill + 1
WHERE status <> 'Destroyed';

 -- удалите уничтоженных роботов
DELETE FROM Jaeger
WHERE status = 'Destroyed';

