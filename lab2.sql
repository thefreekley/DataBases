USE labor_sql;

SELECT model,speed,price 
FROM pc
WHERE speed between 500 and 750
ORDER BY hd;

SELECT name
FROM passenger
WHERE name LIKE  '% C%';

SELECT name,date
FROM battles
JOIN outcomes ON battle=name
WHERE result = 'OK';

SELECT DISTINCT maker 
FROM product as product1
WHERE  maker = 
ANY(SELECT maker
 FROM product 
WHERE type='Laptop') and type='PC';

SELECT maker,MAX(speed) 
FROM product
JOIN pc on pc.model=product.model
WHERE  maker = 
ANY(SELECT maker
 FROM product 
WHERE type='Printer') and type='PC'
GROUP BY maker
HAVING MAX(speed);

SELECT CONCAT( DAY(date), '.', MONTH(date), '.', YEAR(date) ) as date
from battles;

SELECT AVG(hd) 
FROM product
JOIN pc on pc.model=product.model
WHERE  maker = 
ANY(SELECT maker
 FROM product 
WHERE type='Printer') and type='PC';

SELECT a_pc.speed, midl_price
FROM
(SELECT speed,AVG(price) as midl_price FROM pc GROUP BY speed ) a_pc
JOIN (SELECT speed from pc where speed>600) b_pc
ON a_pc.speed=b_pc.speed;

SELECT name,ships.class,launched,type,country,numGuns,bore,displacement
FROM ships
JOIN classes on ships.class=classes.class
WHERE CASE 
	WHEN bore=15 THEN TRUE
    WHEN numGuns=8 THEN TRUE
    WHEN displacement=3200 THEN TRUE
    WHEN type='bb' THEN TRUE
    WHEN country='USA' THEN TRUE
    WHEN launched=1915 THEN TRUE
    WHEN ships.class='Kongo' THEN TRUE
END










 










