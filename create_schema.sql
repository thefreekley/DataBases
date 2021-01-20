CREATE DATABASE IF NOT EXISTS Pharmacy;
USE Pharmacy;




DROP table if exists pharmacy; 
CREATE TABLE pharmacy (
id int primary key auto_increment,
name varchar(45) DEFAULT NULL,
house_number varchar(45) DEFAULT NULL,
web_page_address varchar(45) DEFAULT NULL,
work_time varchar(45) DEFAULT NULL,
weekend_on_saturday boolean DEFAULT NULL, 
weekend_on_sunday boolean DEFAULT NULL,
street_id int DEFAULT NULL
);


DROP table if exists street; 
CREATE TABLE street (
  id int primary key auto_increment,
  name varchar(45) DEFAULT NULL
);

DROP table if exists post; 
CREATE TABLE post (
  id int primary key auto_increment,
  name varchar(45) DEFAULT NULL
);

DROP table if exists zone_of_influence; 
CREATE TABLE zone_of_influence (
  id int primary key auto_increment,
  name varchar(45) DEFAULT NULL
);


DROP table if exists employee; 
CREATE TABLE employee (
  id int primary key auto_increment,
  name varchar(45) DEFAULT NULL,
  surname varchar(45) DEFAULT NULL,
  patronim varchar(45) DEFAULT NULL,
  birth_date date DEFAULT NULL,
  id_code varchar(45) DEFAULT NULL,
  passport_series varchar(45) DEFAULT NULL,
  passport_number varchar(45) DEFAULT NULL,
  seniority int DEFAULT NULL,
  post_id int DEFAULT NULL,
  pharmacy_id int DEFAULT NULL
); 



DROP table if exists drugs; 
CREATE TABLE drugs (
   id int primary key auto_increment,
  name varchar(45) DEFAULT NULL,
  code varchar(45) DEFAULT NULL,
  by_prescription boolean DEFAULT NULL, 
  narcotic boolean DEFAULT NULL,
  psychotropic boolean DEFAULT NULL
); 

DROP table if exists drugs_has_zone_of_influence; 
CREATE TABLE drugs_has_zone_of_influence (
   id int primary key auto_increment,
  drugs_id int DEFAULT NULL,
  zone_of_influence_id int DEFAULT NULL
); 


DROP table if exists pharmacy_has_drugs; 
CREATE TABLE pharmacy_has_drugs (
   id int primary key auto_increment,
  pharmacy_id int DEFAULT NULL,
  drugs_id int DEFAULT NULL
); 

DROP table if exists street_journal;
CREATE TABLE street_journal (
  id int primary key auto_increment,
  name varchar(45) DEFAULT NULL,
  timestamp datetime DEFAULT NULL
);
