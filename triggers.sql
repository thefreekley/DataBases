USE Pharmacy;

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


DROP TRIGGER IF EXISTS employeeCheckInsertFK;
DELIMITER //
CREATE TRIGGER employeeCheckInsertFK
BEFORE INSERT
ON employee FOR EACH ROW
BEGIN
	IF (new.post_id NOT IN (SELECT id from post))
		THEN SIGNAL SQLSTATE "45000"
			SET MESSAGE_TEXT = "Check post for insert. FK trouble";
    END IF;
    
    IF (new.pharmacy_id NOT IN (SELECT id from pharmacy))
		THEN SIGNAL SQLSTATE "45000"
			SET MESSAGE_TEXT = "Check pharmacy for insert. FK trouble";
    END IF;
    
END
// DELIMITER ;

--                 UPDATE                --

DROP TRIGGER IF EXISTS postCheckUpdateFK;
DELIMITER //
CREATE TRIGGER postCheckUpdateFK
BEFORE UPDATE
ON post FOR EACH ROW
BEGIN
	IF (old.id != new.id AND old.id in (select id FROM post))
    		THEN SIGNAL SQLSTATE "45000"
			SET MESSAGE_TEXT = "Check index for update.";
    END IF;	
END
// DELIMITER ;

DROP TRIGGER IF EXISTS streetCheckUpdateFK;
DELIMITER //
CREATE TRIGGER streetCheckUpdateFK
BEFORE UPDATE
ON street FOR EACH ROW
BEGIN
	IF (old.id != new.id AND old.id in (select id FROM street))
    		THEN SIGNAL SQLSTATE "45000"
			SET MESSAGE_TEXT = "Check index for update.";
    END IF;	
END
// DELIMITER ;

DROP TRIGGER IF EXISTS zoneOfInfluenceCheckUpdateFK;
DELIMITER //
CREATE TRIGGER zoneOfInfluenceCheckUpdateFK
BEFORE UPDATE
ON zone_of_influence FOR EACH ROW
BEGIN
	IF (old.id != new.id AND old.id in (select id FROM zone_of_influence))
    		THEN SIGNAL SQLSTATE "45000"
			SET MESSAGE_TEXT = "Check index for update.";
    END IF;	
END
// DELIMITER ;

DROP TRIGGER IF EXISTS employeeCheckUpdateFK;
DELIMITER //
CREATE TRIGGER employeeCheckUpdateFK
BEFORE UPDATE
ON employee FOR EACH ROW
BEGIN
	IF (old.id != new.id AND old.id in (select id FROM employee))
    		THEN SIGNAL SQLSTATE "45000"
			SET MESSAGE_TEXT = "Check index for update.";
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


DROP TRIGGER IF EXISTS drugsCheckUpdateFK;
DELIMITER //
CREATE TRIGGER drugsCheckUpdateFK
BEFORE UPDATE
ON drugs FOR EACH ROW
BEGIN
	IF (old.id != new.id AND old.id in (select id FROM drugs))
    		THEN SIGNAL SQLSTATE "45000"
			SET MESSAGE_TEXT = "Check index for update.";
    END IF;	
END
// DELIMITER ;

--                 DELETE                --


DROP TRIGGER IF EXISTS postCheckDeleteFK;
DELIMITER //
CREATE TRIGGER postCheckDeleteFK
BEFORE DELETE
ON post FOR EACH ROW
BEGIN
	IF (old.id IN (SELECT post_id FROM employee))
	THEN SIGNAL SQLSTATE "45000"
		SET MESSAGE_TEXT = "It's employee here. FK trouble";
	END IF;
END
// DELIMITER ;


DROP TRIGGER IF EXISTS streetCheckDeleteFK;
DELIMITER //
CREATE TRIGGER streetCheckDeleteFK
BEFORE DELETE
ON street FOR EACH ROW
BEGIN
	IF (old.id IN (SELECT street_id FROM pharmacy))
	THEN SIGNAL SQLSTATE "45000"
		SET MESSAGE_TEXT = "It's pharmacy here. FK trouble";
	END IF;
END
// DELIMITER ;

DROP TRIGGER IF EXISTS zoneOfInfluenceCheckDeleteFK;
DELIMITER //
CREATE TRIGGER zoneOfInfluenceCheckDeleteFK 
BEFORE DELETE
ON zone_of_influence FOR EACH ROW
BEGIN
	IF (old.id IN (SELECT zone_of_influence_id FROM drugs_has_zone_of_influence))
	THEN SIGNAL SQLSTATE "45000"
		SET MESSAGE_TEXT = "Drugs has zone of influence. FK trouble";
	END IF;
END
// DELIMITER ;


DROP TRIGGER IF EXISTS drugsCheckDeleteFK;
DELIMITER //
CREATE TRIGGER drugsCheckDeleteFK 
BEFORE DELETE
ON drugs FOR EACH ROW
BEGIN
	IF (old.id IN (SELECT drugs_id FROM drugs_has_zone_of_influence))
	THEN SIGNAL SQLSTATE "45000"
		SET MESSAGE_TEXT = "Zone of influence has drugs. FK trouble";
	END IF;
    
    	IF (old.id IN (SELECT drugs_id FROM pharmacy_has_drugs))
	THEN SIGNAL SQLSTATE "45000"
		SET MESSAGE_TEXT = "Pharmacy has drugs. FK trouble";
	END IF;
END
// DELIMITER;


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
