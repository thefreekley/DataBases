USE Pharmacy;

/*
DROP TRIGGER IF EXISTS AinsertFK;
DELIMITER //
CREATE TRIGGER AinsertFK
BEFORE INSERT
ON A FOR EACH ROW
BEGIN
	If (new.prekol not in select(id from prekol))
		THEN SIGNAL SQLSTATE "450000"
			SET MESSAGE_TEXT = "Check street for A. Fk trouble";
	END IF;
END //DELIMITER;
*/

--                 INSERT                --

DROP TRIGGER IF EXISTS pharmacyCheckInsertFK;
DELIMITER //
CREATE TRIGGER pharmacyCheckInsertFK
BEFORE INSERT
ON pharmacy FOR EACH ROW
BEGIN
	IF (new.street_id NOT IN (SELECT id from street))
		THEN SIGNAL SQLSTATE "45000"
			SET MESSAGE_TEXT = "Check street for insert. FK trouble";
    END IF;
END
// DELIMITER ;



DROP TRIGGER IF EXISTS pharmacyCheckUpdateFK;
DELIMITER //
CREATE TRIGGER pharmacyCheckUpdateFK
BEFORE UPDATE
ON pharmacy FOR EACH ROW
BEGIN
	IF (old.id != new.id AND old.id in (select id FROM pharmacy))
    		THEN SIGNAL SQLSTATE "45000"
			SET MESSAGE_TEXT = "Check index for update.";
    END IF;	
END
// DELIMITER ;




DROP TRIGGER IF EXISTS pharmacyCheckDeleteFK;
DELIMITER //
CREATE TRIGGER pharmacyCheckDeleteFK 
BEFORE DELETE
ON pharmacy FOR EACH ROW
BEGIN
	IF (old.id IN (SELECT pharmacy_id FROM pharmacy_has_drugs))
	THEN SIGNAL SQLSTATE "45000"
	SET MESSAGE_TEXT = "Drugs has pharmacy. FK trouble";
	END IF;
END
// DELIMITER;


--                 TASK 2                --
DROP TRIGGER IF EXISTS employeeCheckCode;
DELIMITER //
CREATE TRIGGER employeeCheckCode
BEFORE INSERT 
ON employee FOR EACH ROW
BEGIN
	IF (new.id_code not REGEXP("[^0]{2}$"))
	THEN SIGNAL SQLSTATE "45000"
		SET MESSAGE_TEXT = "ID CODE DOES NOT SUPPORT. ID code trouble";
	END IF;
END // DELIMITER ;


DROP TRIGGER IF EXISTS employeeCheckCodeUpd;
DELIMITER //
CREATE TRIGGER employeeCheckCodeUpd
BEFORE UPDATE
ON employee FOR EACH ROW
BEGIN
	IF (new.id_code not REGEXP("[^0]{2}$"))
	THEN SIGNAL SQLSTATE "45000"
		SET MESSAGE_TEXT = "ID CODE DOES NOT SUPPORT. ID code trouble";
	END IF;
END // DELIMITER ;

/* TASK 3 */


DROP TRIGGER IF EXISTS drugsCheckCode;
DELIMITER //
CREATE TRIGGER drugsCheckCode
BEFORE INSERT 
ON drugs FOR EACH ROW
BEGIN
	IF (new.code not REGEXP("[^МП]{2}-[0-9]{3}-[0-9]{2}"))
	THEN SIGNAL SQLSTATE "45000"
		SET MESSAGE_TEXT = "CODE DOES NOT SUPPORT. Code trouble";
	END IF;
END // DELIMITER ;


DROP TRIGGER IF EXISTS drugsCheckCodeUpd;
DELIMITER //
CREATE TRIGGER drugsCheckCodeUpd
BEFORE UPDATE
ON drugs FOR EACH ROW
BEGIN
	IF (new.code not REGEXP("[^МП]{2}-[0-9]{3}-[0-9]{2}"))
	THEN SIGNAL SQLSTATE "45000"
		SET MESSAGE_TEXT = "CODE DOES NOT SUPPORT. Code trouble";
	END IF;
END // DELIMITER ;

/* TASK 4 */

DROP TRIGGER IF EXISTS streetCreateLog;
DELIMITER //
CREATE TRIGGER streetCreateLog
AFTER INSERT
ON street FOR EACH ROW
BEGIN
	INSERT INTO street_journal (name, timestamp) VALUES (new.name, current_timestamp());
END // DELIMITER ;
