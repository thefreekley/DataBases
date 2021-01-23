CREATE TABLE tourist( 
  id_tourist INT AUTO_INCREMENT PRIMARY KEY,
  tourist_name VARCHAR(100) NOT NULL,
  tourist_age INT NOT NULL,
  tourist_num_phone VARCHAR(45) NOT NULL UNIQUE,
  CONSTRAINT fk_hotel_city
    FOREIGN KEY (id_city)
    REFERENCES city (id_city)
    ON DELETE CASCADE
    ON UPDATE CASCADE
)ENGINE = InnoDB;

SELECT City FROM Customers
UNION
SELECT City FROM Suppliers
ORDER BY City;

DELETE t1 FROM test AS t1, test2 WHERE ...

CREATE INDEX index_tour ON tour (tour_name,price_one_person ASC);

ALTER TABLE tour
	ADD CONSTRAINT fk_tour_pedestrian
		FOREIGN KEY (id_pedestrian)
		REFERENCES pedestrian (id_pedestrian)
		ON DELETE CASCADE
		ON UPDATE CASCADE;
        
	