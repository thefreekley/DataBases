USE Pharmacy;

SET GLOBAL log_bin_trust_function_creators = 1;

DROP FUNCTION IF EXISTS averager;
DROP FUNCTION IF EXISTS get_post_by_employee_id;

DELIMITER //
CREATE FUNCTION averager()
RETURNS FLOAT
BEGIN
	RETURN (SELECT AVG(seniority) FROM employee);
END
// DELIMITER ;


DELIMITER //
CREATE FUNCTION get_post_by_employee_id(employee_id INT)
RETURNS VARCHAR(45)
BEGIN
	RETURN (SELECT name from post where id = (select post_id from employee where id = employee_id));
END 
// DELIMITER ;


-- SELECT name, surname,seniority, averager() 
-- FROM employee
-- where seniority>averager();

SELECT *, get_post_by_employee_id(id) as post_name
FROM employee;


