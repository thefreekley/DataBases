USE Pharmacy;

DROP PROCEDURE IF EXISTS insert_into_pharmacy;

Delimiter //
CREATE PROCEDURE insert_into_pharmacy(
  name varchar(45),
  house_number varchar(45),
  web_page_address varchar(45),
  work_time varchar(45),
  weekend_on_saturday boolean, 
  weekend_on_sunday boolean,
  street_id int
)
BEGIN
	INSERT INTO pharmacy (
		name,house_number,web_page_address,work_time,weekend_on_saturday,weekend_on_sunday,street_id
    )
    VALUES (
		name,house_number,web_page_address,work_time,weekend_on_saturday,weekend_on_sunday,street_id
    );
END //
 Delimiter ;
 
 
DROP PROCEDURE IF EXISTS print_pharmacy_has_drugs;

Delimiter //
CREATE PROCEDURE print_pharmacy_has_drugs(in filter_drugs varchar(45))
BEGIN
DECLARE count INT unsigned DEFAULT 0;

select pharmacy_has_drugs.id,drugs.name,pharmacy.name from pharmacy_has_drugs
left join pharmacy on pharmacy.id = pharmacy_id
left join drugs on drugs.id = drugs_id
WHERE drugs.name = filter_drugs OR filter_drugs = 'ALL';

END 
// Delimiter ;



drop procedure if exists create_random_tables;

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

