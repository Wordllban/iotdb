CREATE DATABASE IF NOT EXISTS lab_3;
USE lab_3;

DROP TABLE IF EXISTS booking_record;
DROP TABLE IF EXISTS user;
DROP TABLE IF EXISTS user_bank_account;
DROP TABLE IF EXISTS hotel_room;
DROP TABLE IF EXISTS hotel_has_feedback;
DROP TABLE IF EXISTS hotel_has_location;
DROP TABLE IF EXISTS hotel;
DROP TABLE IF EXISTS hotel_feedback;
DROP TABLE IF EXISTS hotel_location;
DROP TABLE IF EXISTS reserved_money;
DROP TABLE IF EXISTS hotel_room_type;

CREATE TABLE hotel (
hotel_id INT NOT NULL AUTO_INCREMENT,
hotel_name VARCHAR(45) NOT NULL,
PRIMARY KEY (hotel_id)
)
ENGINE = InnoDB;

CREATE TABLE hotel_feedback (
hotel_feedback_id INT NOT NULL AUTO_INCREMENT,
feedbkack VARCHAR(400),
rating INT NOT NULL,
PRIMARY KEY (hotel_feedback_id),
INDEX fk_rating_index (rating DESC)
)
ENGINE = InnoDB;

CREATE TABLE hotel_location (
hotel_location_id INT NOT NULL AUTO_INCREMENT,
country VARCHAR(30) NOT NULL,
city VARCHAR(45) NOT NULL,
street VARCHAR(60) NOT NULL,
PRIMARY KEY (hotel_location_id),
INDEX country_index (country ASC),
INDEX city_index (city ASC)
)
ENGINE = InnoDB;

CREATE TABLE hotel_has_feedback (
hotel_feedback_id INT NOT NULL AUTO_INCREMENT,
hotel_id INT NOT NULL,
PRIMARY KEY(hotel_feedback_id, hotel_id),
CONSTRAINT fk_hotel_has_feedback_1
	FOREIGN KEY (hotel_feedback_id)
    REFERENCES hotel_feedback(hotel_feedback_id),
CONSTRAINT fk_hotel_has_feedback
	FOREIGN KEY (hotel_id)
    REFERENCES hotel(hotel_id)
)
ENGINE = InnoDB;

CREATE TABLE hotel_has_location (
hotel_location_id INT NOT NULL AUTO_INCREMENT,
hotel_id INT NOT NULL,
PRIMARY KEY(hotel_location_id, hotel_id),
CONSTRAINT fk_hotel_has_location
	FOREIGN KEY (hotel_location_id)
    REFERENCES hotel_location(hotel_location_id),
CONSTRAINT fk_hotel_has_location_1
	FOREIGN KEY (hotel_id)
    REFERENCES hotel(hotel_id)
)
ENGINE = InnoDB;

CREATE TABLE hotel_room_type (
hotel_room_type_id INT NOT NULL AUTO_INCREMENT,
type VARCHAR(45) NOT NULL,
PRIMARY KEY (hotel_room_type_id)
)
ENGINE = InnoDB;

CREATE TABLE hotel_room (
hotel_room_id INT NOT NULL AUTO_INCREMENT,
room_number INT NOT NULL,
is_booked TINYINT NOT NULL,
price_per_day DECIMAL(10, 2) NOT NULL,
hotel_room_type_id INT NOT NULL,
hotel_id INT NOT NULL,
PRIMARY KEY (hotel_room_id),
INDEX fk_hotel_room_type (hotel_room_type_id ASC),
CONSTRAINT fk_hotel_room_type
	FOREIGN KEY (hotel_room_type_id)
    REFERENCES hotel_room_type(hotel_room_type_id),
CONSTRAINT fk_hotel
	FOREIGN KEY (hotel_id)
    REFERENCES hotel(hotel_id)
)
ENGINE = InnoDB;

CREATE TABLE reserved_money (
reserved_money_id INT NOT NULL AUTO_INCREMENT,
is_reserved TINYINT NOT NULL,
sum DECIMAL(10, 2) NOT NULL,
PRIMARY KEY (reserved_money_id)
)
ENGINE = InnoDB;

CREATE TABLE user_bank_account (
user_bank_account_id INT NOT NULL AUTO_INCREMENT,
balance DECIMAL(10, 2),
reserved_money_id INT,
PRIMARY KEY (user_bank_account_id),
CONSTRAINT fk_reserved_money
	FOREIGN KEY (reserved_money_id)
    REFERENCES reserved_money(reserved_money_id)
)
ENGINE = InnoDB;

CREATE TABLE user (
user_id INT NOT NULL AUTO_INCREMENT,
name VARCHAR(45) NOT NULL,
surname VARCHAR(45) NOT NULL,
mail VARCHAR(45) NOT NULL,
phone_number VARCHAR(45) NOT NULL,
user_bank_account_id INT NOT NULL,
PRIMARY KEY (user_id),
CONSTRAINT fk_user_bank_account
	FOREIGN KEY (user_bank_account_id)
    REFERENCES user_bank_account(user_bank_account_id)
)
ENGINE = InnoDB;

CREATE TABLE booking_record (
booking_record_id INT NOT NULL AUTO_INCREMENT,
reservation_end_date DATETIME NOT NULL,
reservation_start_date DATETIME NOT NULL,
is_approved_by_mail TINYINT NOT NULL,
price DECIMAL(10, 2) NOT NULL,
hotel_id INT NOT NULL,
user_id INT NOT NULL,
PRIMARY KEY (booking_record_id),
CONSTRAINT fk_hotel_1
	FOREIGN KEY (hotel_id)
    REFERENCES hotel(hotel_id),
CONSTRAINT fk_user
	FOREIGN KEY (user_id)
    REFERENCES user(user_id)
)
ENGINE = InnoDB;

-- hotel room type
INSERT INTO hotel_room_type VALUES ('1', 'lux'), ('2', 'half-lux'), ('3', 'standart'), ('4', 'econom');

-- hotel
INSERT INTO hotel VALUES ('1', 'Autumn Circus Hotel'), ('2', 'Quiet Spring Motel'), ('3', 'Historic Temple Hotel'), ('4', 'Majestic Summit Resort'), ('5', 'Ancient Ridge Hotel'), ('6', 'Prince\'s Isle Hotel'), ('7', 'Glacier Resort'), ('8', 'Lunar Hotel'), ('9', 'Citadel Resort'), ('10', 'Oriental Resort');

-- hotel location
INSERT INTO hotel_location VALUES ('1', 'USA', 'Texas(TX)', 'Hunters Cyn'), ('2', 'USA', 'Missouri', 'Rr 2'), ('3', 'USA', 'Florida', 'Mesa Verde Trl'), ('4', 'USA', 'Missouri', 'Maple St'), ('5', 'USA', 'Tennessee', 'E Walnut Grove Church Rd'), ('6', 'USA', 'California', 'State St #38'), ('7', 'USA', 'Michigan', 'Arlington Ln'), ('8', 'USA', 'Pennsylvania', 'Park Rd'), ('9', 'USA', 'Connecticut', 'Somersett Dr'), ('10', 'USA', 'Ohio', 'Sandusky St');

-- hotel feedback 
INSERT INTO hotel_feedback VALUES ('1', 'Awful!', '1'), ('2', 'It was so bad...', '2'), ('3', 'Not bad, but not good enough', '3'), ('4', 'Good.', '4'), ('5', 'Awesome!', '5'), ('6', 'The worst weekend.', '1'), ('7', 'I don\'t advise this hotel', '2'), ('8', 'It\'s okey.', '3'), ('9', 'Nice.', '4'), ('10', 'I\'ll choose this hotel next time', '5');

-- hotel_has_feedback - joining table
INSERT INTO hotel_has_feedback VALUES ('1', '1'), ('2', '2'), ('3', '3'), ('4', '4'), ('5', '5'), ('6', '6'), ('7', '7'), ('8', '8'), ('9', '9'), ('10', '10');

-- hotel_has_location - joining table
INSERT INTO hotel_has_location VALUES ('1', '1'), ('2', '2'), ('3', '3'), ('4', '4'), ('5', '5'), ('6', '6'), ('7', '7'), ('8', '8'), ('9', '9'), ('10', '10');

-- reserved money
INSERT INTO reserved_money VALUES ('1', '0', '228'), ('2', '0', '0'), ('3', '1', '600'), ('4', '1', '700'), ('5', '1', '800'), ('6', '0', '0'), ('7', '0', '0'), ('8', '0', '0'), ('9', '1', '1000'), ('10', '1', '450');

-- user bank account
INSERT INTO user_bank_account VALUES ('1', '2000', '1'), ('2', '2500', '2'), ('3', '1500', '3'), ('4', '4000', '4'), ('5', '3250', '5'), ('6', '3000', '6'), ('7', '7000', '7'), ('8', '2800', '8'), ('9', '3400', '9'), ('10', '10000', '10');

-- user
INSERT INTO user VALUES ('1', 'Sylvia', 'Zupan', 'mmaryoulixx.ital@nalsci.com', '206-434-3202', '1'), ('2', 'Agnieszka', 'Gilbert', '9inesdjazairaya@nalsci.com', '904-636-8267', '2'), ('3', 'Adrijana', 'Elwes', '2silas.mattosbent@systems.com', '605-240-2128', '3'), ('4', 'Geir', 'Abel', '2fdiwa.rajawia.01@hmpoeao.com', '518-420-2050', '4'), ('5', 'Desislav', 'Antonsen', '0dareenf@super.com', '618-334-0745', '5'), ('6', 'Williric', 'Barsamian', '6cupid.guy1b@yalexonyegues.com', '508-846-5238', '6'), ('7', 'Luben', 'Anthonsen', '3mohammad@apreom.site', '334-649-9020', '7'), ('8', 'Sandra', 'Tenskwatawa', '3yahia.zakariab@agung001.com', '812-951-5172', '8'), ('9', 'Maksim', 'Bandoni', 'lneymar_11jr@bestdirstuff.site', '804-836-8772', '9'), ('10', 'Genghis', 'Timotha', 'eoo123456123b@how2s.site', '512-593-0849', '10');

-- booking record
INSERT INTO booking_record VALUES ('1', '2018-06-15', '2018-06-29', '1', '4000', '1', '10'), ('2', '2019-07-16', '2019-08-16', '1', '2000', '2', '9'), ('3', '2020-12-24', '2021-01-12', '1', '6500', '3', '8'), ('4', '2018-09-13', '2018-09-27', '1', '1200', '4', '7'), ('5', '2014-05-20', '2014-05-28', '1', '3400', '5', '6'), ('6', '2019-02-01', '2019-02-18', '1', '5400', '6', '5'), ('7', '2021-10-19', '2021-10-26', '1', '1800', '7', '4'), ('8', '2015-09-28', '2015-10-15', '1', '4300', '8', '3'), ('9', '2017-07-10', '2017-07-24', '1', '2700', '9', '2'), ('10', '2019-05-01', '2019-05-015', '1', '2900', '10', '1');

-- hotel room
INSERT INTO hotel_room VALUES ('1', '42', '1', '200', '1', '1'), ('2', '35', '1', '300', '2', '2'), ('3', '21', '1', '400', '3', '3'), ('4', '22', '0', '120', '4', '4'), ('5', '67', '1', '320', '4', '5'), ('6', '32', '0', '450', '3', '6'), ('7', '180', '1', '600', '2', '7'), ('8', '17', '0', '350', '1', '8'), ('9', '40', '1', '220', '2', '9'), ('10', '32', '1', '460', '3', '10');
