Delimiter //
CREATE PROCEDURE insert_into_pharmacy(name varchar(45))
BEGIN
	INSERT INTO pharmacy (name) VALUES (name);
END //
 Delimiter ;
 
 DROP PROCEDURE IF EXISTS print_pharmacy_has_drugs;


Delimiter //
CREATE PROCEDURE create_random_tables()
BEGIN
	DECLARE new_name VARCHAR(45);
	DECLARE done BOOL DEFAULT FALSE;
    DECLARE zone_of_influence_cursor CURSOR FOR SELECT name FROM zone_of_influence;
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = TRUE;
    
    
	
    set @zone_of_influence_1 := CONCAT('zone_of_influence_',SECOND(NOW()),'_',MINUTE(NOW()),'_',HOUR(NOW()),'_',DAY(NOW()),'_1');
    set @zone_of_influence_2 := CONCAT('zone_of_influence_',SECOND(NOW()),'_',MINUTE(NOW()),'_',HOUR(NOW()),'_',DAY(NOW()),'_2');
    
    set @zone_of_influence_query_1 := CONCAT('CREATE TABLE ', @zone_of_influence_1, ' LIKE zone_of_influence;');
    set @zone_of_influence_query_2 := CONCAT('CREATE TABLE ', @zone_of_influence_2, ' LIKE zone_of_influence;');
    
    
	 prepare query from @zone_of_influence_query_1;
	 execute query;
    
    prepare query from @zone_of_influence_query_2;
	execute query;
    
    
    OPEN zone_of_influence_cursor;
    label2: LOOP
		FETCH zone_of_influence_cursor INTO new_name;
        IF done THEN LEAVE label2;
        END IF;
        
        IF FLOOR(RAND()*10)%2 THEN
        set @values := CONCAT('INSERT ', @zone_of_influence_1 ,' (name) VALUES (\"',new_name,'\");');
		prepare query from @values;
	    execute query;
        ELSE
		set @values := CONCAT('INSERT ', @zone_of_influence_2 ,' (name) VALUES (\"',new_name,'\");');
        prepare query from @values;
	    execute query;
        END IF;
        
    END LOOP;
    CLOSE zone_of_influence_cursor;
END
// Delimiter ;