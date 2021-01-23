USE Pharmacy;

SET GLOBAL log_bin_trust_function_creators = 1;

DROP FUNCTION IF EXISTS avg_seniority;
DROP FUNCTION IF EXISTS get_post_by_employee_id;

DELIMITER //
CREATE FUNCTION avg_seniority()
RETURNS FLOAT
BEGIN
	RETURN (SELECT AVG(seniority) FROM employee);
END
// DELIMITER ;


