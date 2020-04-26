 -- Научитесь делать следующие запросы:
 -- выведите всю таблицу
 Select * from Jaeger;

 -- отобразите только не уничтоженных роботов
Select * from Jaeger
WHERE status <> 'Destroyed';

 -- отобразите роботов нескольких серий, например Mark-1 и Mark-6
Select * from Jaeger
WHERE mark = 'Mark-1'
OR mark = 'Mark-6';

 -- отсортируйте таблицу по убыванию по столбцу mark
 Select * from Jaeger
 ORDER BY mark DESC;

 -- отобразите самого старого робота
Select * From Jaeger
where launch = (Select MIN(launch) from Jaeger);

 -- отобразите роботов, которые уничтожили больше/меньше всех kaiju
Select mark From Jaeger
where kaijukill = (Select MAX(kaijukill) from Jaeger);

Select mark From Jaeger
where kaijukill = (Select MIN(kaijukill) from Jaeger);

 -- отобразите средний вес роботов
Select AVG(weight) from Jaeger;

 -- увеличьте на единицу количество уничтоженных kaiju у роботов, которые до сих пор не разрушены
UPDATE Jaeger SET kaijukill = kaijukill + 1
  WHERE status <> 'Destroyed';

 -- удалите уничтоженных роботов
Delete From Jaeger where status = 'Destroyed';

