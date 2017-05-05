CREATE TABLE cars (carid VARCHAR(10) NOT NULL, `name` VARCHAR(20), vendor VARCHAR(20), `type` VARCHAR(20), PRIMARY KEY (carid));

INSERT INTO wishlist.cars (carid, `name`, vendor, `type`) 
	VALUES ('N1', 'Skyline GT-R', 'Nissan', '4WD');
INSERT INTO wishlist.cars (carid, `name`, vendor, `type`) 
	VALUES ('N2', 'Запорожец', 'ЗАЗ', 'Автомобиль');
INSERT INTO wishlist.cars (carid, `name`, vendor, `type`) 
	VALUES ('N3', 'Spacio', 'Toyota', 'My car');
