USE Pharmacy;

TRUNCATE TABLE Pharmacy;

SET GLOBAL sql_mode='NO_AUTO_VALUE_ON_ZERO';

INSERT street (name) VALUES
("sonachna"),("afsafa"),("sdasda"),("fdsf"),("safagsg"),
("gddfsd"),("fasf"),("asfsaf"),("fasasg"),("fgsdfds");

INSERT post (name) VALUES
("doctor"),("vrachgey"),("cleaner"),("gomogomozek"),("prodavec"),
("conductor"),("president"),("director"),("killer"),("pediatr");

INSERT zone_of_influence (name) VALUES
("heart"),("stomach"),("gizzard"),("kidneys"),("throat"),
("leg"),("head"),("forehead"),("brain"),("finger");

INSERT employee (name,surname,patronim,birth_date,id_code,passport_series,passport_number,seniority,post_id,pharmacy_id) VALUES
("Anya","Chernacuk","Andriivna",'1990-01-02',"32222222222","32323","43411",3,4,2),
("Andre","Pohozei","Mikolays",'1992-05-03',"333443433","321412","43432",4,1,1),
("Bulbik","Kosud","Borysovys",'1995-04-05',"1111111111","332252523","412421",5,2,2),
("Kola","Tovarniskiy","Bulbikovis",'1993-02-01',"44443444444","324234","43534",3,3,3),
("Kola","Lobunes","Adamovis",'1995-04-06',"222222222","325345","7567",10,4,4),
("Nazar","Dmitris","Sadamovis",'1990-10-20',"333333333","64564","756765",5,5,5),
("Valera","Zelenskiy","Anigilovis",'1990-09-12',"44444444","56756","5676",7,6,6),
("Vitalik","Vasiles","Pubertatovis",'1990-11-15',"555555555","6545","5465",54,7,7),
("Moisey","Mobapopa","Visniveskiy",'1990-12-03',"66666666666","645645","76574",43,8,8),
("Pasha","Moseysuk","Dubovskiy",'1990-12-03',"6663242666666","6423423","423423",9,9,9);



INSERT pharmacy (name,house_number,web_page_address,work_time,weekend_on_saturday,weekend_on_sunday,street_id) VALUES
("APTEKA 1","№43","http://www.mysql.ru/docs/madsn/DATETIME.html","8 - 19",true,false,0),
("APTEKA 2","№34","http://www.mysql.ru/docs/madsn/DATETIME.html","8 - 19",false,true,1),
("APTEKA 3","№65","http://www.mysql.ru/docs/man/DTIME.html","8 - 20",false,true,2),
("APTEKA 4","№87","http://www.mysql.ru/docs/man/TdsETIME.html","8 - 22",true,false,3),
("APTEKA HOROSA","№345","http://www.mysql.ru/docs/man/fsafTETIME.html","8 - 22",true,false,4),
("APTEKA PYTASOK","№54","http://www.mysql.ru/docs/man/DfsafTIME.html","8 - 22",false,false,5),
("APTEKA PROLISOK","№24","http://www.mysql.ru/docs/man/DAfdTIME.html","8 - 22",false,false,6),
("APTEKA SMERTELNO","№46","http://www.mysql.ru/docs/man/DfdsETIME.html","8 - 22",true,true,7),
("APTEKA KAKAO","№45","http://www.mysql.ru/docs/man/DATETsad.html","8 - 22",true,false,8),
("APTEKA KAIF","№42","http://www.mysql.ru/docs/man/DATEfsE.html","8 - 22",true,true,9);



INSERT drugs (name,code,by_prescription,narcotic,psychotropic) VALUES
("Parasemol","ВВ-221-22",true,true,true),("Askorbinka","КИ-353-12",false,false,false),
("Kanabis","АА-222-32",false,false,false),("Chokolate","КБ-321-22",true,true,true),
("Psylosibin","ГА-355-16",false,true,true),("Nozepam","АЛ-321-72",true,true,true),
("Opium","КД-623-65",true,true,true),("Libido","СБ-734-85",false,false,false),
("Glisin","СВ-676-86",false,false,false),("Muhomor","ВС-451-11",false,false,false);

INSERT drugs_has_zone_of_influence (drugs_id,zone_of_influence_id) VALUES
(1,9),(2,8),(3,7),(3,6),(4,5),(5,4),(6,3),(4,2),(8,1),(9,10);

INSERT pharmacy_has_drugs (pharmacy_id,drugs_id) VALUES
(10,9),(1,8),(2,7),(3,6),(4,5),(5,4),(6,3),(7,2),(8,1),(9,10);

