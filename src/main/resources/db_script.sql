CREATE DATABASE IF NOT EXISTS lab_3;
USE lab_3;

DROP TABLE IF EXISTS booking_record;
DROP TABLE IF EXISTS user;
DROP TABLE IF EXISTS user_bank_account;
DROP TABLE IF EXISTS hotel_room;
DROP TABLE IF EXISTS hotel;
DROP TABLE IF EXISTS hotel_feedback;
DROP TABLE IF EXISTS hotel_location;
DROP TABLE IF EXISTS reserved_money;
DROP TABLE IF EXISTS hotel_room_type;

CREATE TABLE hotel (
                       id INT NOT NULL AUTO_INCREMENT,
                       hotel_name VARCHAR(45) NOT NULL,
                       PRIMARY KEY (id)
);

CREATE TABLE hotel_feedback (
                                id INT NOT NULL AUTO_INCREMENT,
                                feedback VARCHAR(400),
                                rating INT NOT NULL,
                                PRIMARY KEY (id),
                                INDEX fk_rating_index (rating DESC)
);

CREATE TABLE hotel_location (
                                id INT NOT NULL AUTO_INCREMENT,
                                country VARCHAR(30) NOT NULL,
                                city VARCHAR(45) NOT NULL,
                                street VARCHAR(60) NOT NULL,
                                PRIMARY KEY (id),
                                INDEX country_index (country ASC),
                                INDEX city_index (city ASC)
);

CREATE TABLE hotel_room_type (
                                 id INT NOT NULL AUTO_INCREMENT,
                                 type VARCHAR(45) NOT NULL,
                                 PRIMARY KEY (id)
);

CREATE TABLE hotel_room (
                            id INT NOT NULL AUTO_INCREMENT,
                            room_number INT NOT NULL,
                            is_booked TINYINT NOT NULL,
                            price_per_day DECIMAL(10, 2) NOT NULL,
                            hotel_room_type_id INT NOT NULL,
                            hotel_id INT NOT NULL,
                            PRIMARY KEY (id),
                            INDEX fk_hotel_room_type (hotel_room_type_id ASC),
                            CONSTRAINT fk_hotel_room_type
                                FOREIGN KEY (hotel_room_type_id)
                                    REFERENCES hotel_room_type(id),
                            CONSTRAINT fk_hotel
                                FOREIGN KEY (hotel_id)
                                    REFERENCES hotel(id)
);

CREATE TABLE user (
                      id INT NOT NULL AUTO_INCREMENT,
                      name VARCHAR(45) NOT NULL,
                      surname VARCHAR(45) NOT NULL,
                      mail VARCHAR(45) NOT NULL,
                      user_bank_account VARCHAR(16) NOT NULL,
                      PRIMARY KEY (id)
);

CREATE TABLE booking_record (
                                id INT NOT NULL AUTO_INCREMENT,
                                reservation_end_date DATETIME NOT NULL,
                                reservation_start_date DATETIME NOT NULL,
                                is_approved_by_mail TINYINT NOT NULL,
                                price DECIMAL(10, 2) NOT NULL,
                                hotel_id INT NOT NULL,
                                user_id INT NOT NULL,
                                PRIMARY KEY (id),
                                CONSTRAINT fk_hotel_1
                                    FOREIGN KEY (hotel_id)
                                        REFERENCES hotel(id),
                                CONSTRAINT fk_user
                                    FOREIGN KEY (user_id)
                                        REFERENCES user(id)
);
