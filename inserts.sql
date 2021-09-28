-- hotel room_type
INSERT INTO `lab_1`.`hotel_room_type` (`id`, `type`) VALUES ('1', 'lux');
INSERT INTO `lab_1`.`hotel_room_type` (`id`, `type`) VALUES ('2', 'half-lux');
INSERT INTO `lab_1`.`hotel_room_type` (`id`, `type`) VALUES ('3', 'standart');
INSERT INTO `lab_1`.`hotel_room_type` (`id`, `type`) VALUES ('4', 'econom');

-- hotel
INSERT INTO `lab_1`.`hotel` (`id`, `hotel_name`) VALUES ('1', 'Autumn Circus Hotel');
INSERT INTO `lab_1`.`hotel` (`id`, `hotel_name`) VALUES ('2', 'Quiet Spring Motel');
INSERT INTO `lab_1`.`hotel` (`id`, `hotel_name`) VALUES ('3', 'Historic Temple Hotel');
INSERT INTO `lab_1`.`hotel` (`id`, `hotel_name`) VALUES ('4', 'Majestic Summit Resort');
INSERT INTO `lab_1`.`hotel` (`id`, `hotel_name`) VALUES ('5', 'Ancient Ridge Hotel');
INSERT INTO `lab_1`.`hotel` (`id`, `hotel_name`) VALUES ('6', 'Prince\'s Isle Hotel');
INSERT INTO `lab_1`.`hotel` (`id`, `hotel_name`) VALUES ('7', 'Glacier Resort');
INSERT INTO `lab_1`.`hotel` (`id`, `hotel_name`) VALUES ('8', 'Lunar Hotel');
INSERT INTO `lab_1`.`hotel` (`id`, `hotel_name`) VALUES ('9', 'Citadel Resort');
INSERT INTO `lab_1`.`hotel` (`id`, `hotel_name`) VALUES ('10', 'Oriental Resort');

-- hotel location
INSERT INTO `lab_1`.`hotel_location` (`id`, `country`, `city`, `street`) VALUES ('1', 'USA', 'Texas(TX)', 'Hunters Cyn');
INSERT INTO `lab_1`.`hotel_location` (`id`, `country`, `city`, `street`) VALUES ('2', 'USA', 'Missouri', 'Rr 2');
INSERT INTO `lab_1`.`hotel_location` (`id`, `country`, `city`, `street`) VALUES ('3', 'USA', 'Florida', 'Mesa Verde Trl');
INSERT INTO `lab_1`.`hotel_location` (`id`, `country`, `city`, `street`) VALUES ('4', 'USA', 'Missouri', 'Maple St');
INSERT INTO `lab_1`.`hotel_location` (`id`, `country`, `city`, `street`) VALUES ('5', 'USA', 'Tennessee', 'E Walnut Grove Church Rd');
INSERT INTO `lab_1`.`hotel_location` (`id`, `country`, `city`, `street`) VALUES ('6', 'USA', 'California', 'State St #38');
INSERT INTO `lab_1`.`hotel_location` (`id`, `country`, `city`, `street`) VALUES ('7', 'USA', 'Michigan', 'Arlington Ln');
INSERT INTO `lab_1`.`hotel_location` (`id`, `country`, `city`, `street`) VALUES ('8', 'USA', 'Pennsylvania', 'Park Rd');
INSERT INTO `lab_1`.`hotel_location` (`id`, `country`, `city`, `street`) VALUES ('9', 'USA', 'Connecticut', 'Somersett Dr');
INSERT INTO `lab_1`.`hotel_location` (`id`, `country`, `city`, `street`) VALUES ('10', 'USA', 'Ohio', 'Sandusky St');

-- hotel feedback 
INSERT INTO `lab_1`.`hotel_feedback` (`id`, `feedback`, `rating`) VALUES ('1', 'Awful!', '1');
INSERT INTO `lab_1`.`hotel_feedback` (`id`, `feedback`, `rating`) VALUES ('2', 'It was so bad...', '2');
INSERT INTO `lab_1`.`hotel_feedback` (`id`, `feedback`, `rating`) VALUES ('3', 'Not bad, but not good enough', '3');
INSERT INTO `lab_1`.`hotel_feedback` (`id`, `feedback`, `rating`) VALUES ('4', 'Good.', '4');
INSERT INTO `lab_1`.`hotel_feedback` (`id`, `feedback`, `rating`) VALUES ('5', 'Awesome!', '5');
INSERT INTO `lab_1`.`hotel_feedback` (`id`, `feedback`, `rating`) VALUES ('6', 'The worst weekend.', '1');
INSERT INTO `lab_1`.`hotel_feedback` (`id`, `feedback`, `rating`) VALUES ('7', 'I don\'t advise this hotel', '2');
INSERT INTO `lab_1`.`hotel_feedback` (`id`, `feedback`, `rating`) VALUES ('8', 'It\'s okey.', '3');
INSERT INTO `lab_1`.`hotel_feedback` (`id`, `feedback`, `rating`) VALUES ('9', 'Nice.', '4');
INSERT INTO `lab_1`.`hotel_feedback` (`id`, `feedback`, `rating`) VALUES ('10', 'I\'ll choose this hotel next time', '5');

-- hotel feedback has hotel - joining table
INSERT INTO `lab_1`.`hotel_feedback_has_hotel` (`hotel_feedback_id`, `hotel_id`) VALUES ('1', '1');
INSERT INTO `lab_1`.`hotel_feedback_has_hotel` (`hotel_feedback_id`, `hotel_id`) VALUES ('2', '2');
INSERT INTO `lab_1`.`hotel_feedback_has_hotel` (`hotel_feedback_id`, `hotel_id`) VALUES ('3', '3');
INSERT INTO `lab_1`.`hotel_feedback_has_hotel` (`hotel_feedback_id`, `hotel_id`) VALUES ('4', '4');
INSERT INTO `lab_1`.`hotel_feedback_has_hotel` (`hotel_feedback_id`, `hotel_id`) VALUES ('5', '5');
INSERT INTO `lab_1`.`hotel_feedback_has_hotel` (`hotel_feedback_id`, `hotel_id`) VALUES ('6', '6');
INSERT INTO `lab_1`.`hotel_feedback_has_hotel` (`hotel_feedback_id`, `hotel_id`) VALUES ('7', '7');
INSERT INTO `lab_1`.`hotel_feedback_has_hotel` (`hotel_feedback_id`, `hotel_id`) VALUES ('8', '8');
INSERT INTO `lab_1`.`hotel_feedback_has_hotel` (`hotel_feedback_id`, `hotel_id`) VALUES ('9', '9');
INSERT INTO `lab_1`.`hotel_feedback_has_hotel` (`hotel_feedback_id`, `hotel_id`) VALUES ('10', '10');

-- hotel location has hotel - joining table
INSERT INTO `lab_1`.`hotel_location_has_hotel` (`hotel_location_id`, `hotel_id`) VALUES ('1', '1');
INSERT INTO `lab_1`.`hotel_location_has_hotel` (`hotel_location_id`, `hotel_id`) VALUES ('2', '2');
INSERT INTO `lab_1`.`hotel_location_has_hotel` (`hotel_location_id`, `hotel_id`) VALUES ('3', '3');
INSERT INTO `lab_1`.`hotel_location_has_hotel` (`hotel_location_id`, `hotel_id`) VALUES ('4', '4');
INSERT INTO `lab_1`.`hotel_location_has_hotel` (`hotel_location_id`, `hotel_id`) VALUES ('5', '5');
INSERT INTO `lab_1`.`hotel_location_has_hotel` (`hotel_location_id`, `hotel_id`) VALUES ('6', '6');
INSERT INTO `lab_1`.`hotel_location_has_hotel` (`hotel_location_id`, `hotel_id`) VALUES ('7', '7');
INSERT INTO `lab_1`.`hotel_location_has_hotel` (`hotel_location_id`, `hotel_id`) VALUES ('8', '8');
INSERT INTO `lab_1`.`hotel_location_has_hotel` (`hotel_location_id`, `hotel_id`) VALUES ('9', '9');
INSERT INTO `lab_1`.`hotel_location_has_hotel` (`hotel_location_id`, `hotel_id`) VALUES ('10', '10');

-- reserved money
INSERT INTO `lab_1`.`reserved_money` (`id`, `is_reserved`, `sum`) VALUES ('2', '0', '0');
INSERT INTO `lab_1`.`reserved_money` (`id`, `is_reserved`, `sum`) VALUES ('3', '1', '600');
INSERT INTO `lab_1`.`reserved_money` (`id`, `is_reserved`, `sum`) VALUES ('4', '1', '700');
INSERT INTO `lab_1`.`reserved_money` (`id`, `is_reserved`, `sum`) VALUES ('5', '1', '800');
INSERT INTO `lab_1`.`reserved_money` (`id`, `is_reserved`, `sum`) VALUES ('6', '0', '0');
INSERT INTO `lab_1`.`reserved_money` (`id`, `is_reserved`, `sum`) VALUES ('7', '0', '0');
INSERT INTO `lab_1`.`reserved_money` (`id`, `is_reserved`, `sum`) VALUES ('8', '0', '0');
INSERT INTO `lab_1`.`reserved_money` (`id`, `is_reserved`, `sum`) VALUES ('9', '1', '1000');
INSERT INTO `lab_1`.`reserved_money` (`id`, `is_reserved`, `sum`) VALUES ('10', '1', '450');

-- user bank account
INSERT INTO `lab_1`.`user_bank_account` (`id`, `balance`, `reserved_money_id`) VALUES ('1', '2000', '1');
INSERT INTO `lab_1`.`user_bank_account` (`id`, `balance`, `reserved_money_id`) VALUES ('2', '2500', '2');
INSERT INTO `lab_1`.`user_bank_account` (`id`, `balance`, `reserved_money_id`) VALUES ('3', '1500', '3');
INSERT INTO `lab_1`.`user_bank_account` (`id`, `balance`, `reserved_money_id`) VALUES ('4', '4000', '4');
INSERT INTO `lab_1`.`user_bank_account` (`id`, `balance`, `reserved_money_id`) VALUES ('5', '3250', '5');
INSERT INTO `lab_1`.`user_bank_account` (`id`, `balance`, `reserved_money_id`) VALUES ('6', '3000', '6');
INSERT INTO `lab_1`.`user_bank_account` (`id`, `balance`, `reserved_money_id`) VALUES ('7', '7000', '7');
INSERT INTO `lab_1`.`user_bank_account` (`id`, `balance`, `reserved_money_id`) VALUES ('8', '2800', '8');
INSERT INTO `lab_1`.`user_bank_account` (`id`, `balance`, `reserved_money_id`) VALUES ('9', '3400', '9');
INSERT INTO `lab_1`.`user_bank_account` (`id`, `balance`, `reserved_money_id`) VALUES ('10', '10000', '10');

-- user
INSERT INTO `lab_1`.`user` (`id`, `name`, `surname`, `mail`, `phone_number`, `user_bank_account_id`) VALUES ('1', 'Sylvia', 'Zupan', 'mmaryoulixx.ital@nalsci.com', '206-434-3202', '1');
INSERT INTO `lab_1`.`user` (`id`, `name`, `surname`, `mail`, `phone_number`, `user_bank_account_id`) VALUES ('2', 'Agnieszka', 'Gilbert', '9inesdjazairaya@nalsci.com', '904-636-8267', '2');
INSERT INTO `lab_1`.`user` (`id`, `name`, `surname`, `mail`, `phone_number`, `user_bank_account_id`) VALUES ('3', 'Adrijana', 'Elwes', '2silas.mattosbent@systems.com', '605-240-2128', '3');
INSERT INTO `lab_1`.`user` (`id`, `name`, `surname`, `mail`, `phone_number`, `user_bank_account_id`) VALUES ('4', 'Geir', 'Abel', '2fdiwa.rajawia.01@hmpoeao.com', '518-420-2050', '4');
INSERT INTO `lab_1`.`user` (`id`, `name`, `surname`, `mail`, `phone_number`, `user_bank_account_id`) VALUES ('5', 'Desislav', 'Antonsen', '0dareenf@super.com', '618-334-0745', '5');
INSERT INTO `lab_1`.`user` (`id`, `name`, `surname`, `mail`, `phone_number`, `user_bank_account_id`) VALUES ('6', 'Williric', 'Barsamian', '6cupid.guy1b@yalexonyegues.com', '508-846-5238', '6');
INSERT INTO `lab_1`.`user` (`id`, `name`, `surname`, `mail`, `phone_number`, `user_bank_account_id`) VALUES ('7', 'Luben', 'Anthonsen', '3mohammad@apreom.site', '334-649-9020', '7');
INSERT INTO `lab_1`.`user` (`id`, `name`, `surname`, `mail`, `phone_number`, `user_bank_account_id`) VALUES ('8', 'Sandra', 'Tenskwatawa', '3yahia.zakariab@agung001.com', '812-951-5172', '8');
INSERT INTO `lab_1`.`user` (`id`, `name`, `surname`, `mail`, `phone_number`, `user_bank_account_id`) VALUES ('9', 'Maksim', 'Bandoni', 'lneymar_11jr@bestdirstuff.site', '804-836-8772', '9');
INSERT INTO `lab_1`.`user` (`id`, `name`, `surname`, `mail`, `phone_number`, `user_bank_account_id`) VALUES ('10', 'Genghis', 'Timotha', 'eoo123456123b@how2s.site', '512-593-0849', '10');

-- booking record
INSERT INTO `lab_1`.`booking_record` (`id`, `reservation_end_date`, `reservation_start_date`, `is_approved_by_mail`, `price`, `hotel_id`, `user_id`) VALUES ('1', '2018-06-15', '2018-06-29', '1', '4000', '1', '10');
INSERT INTO `lab_1`.`booking_record` (`id`, `reservation_end_date`, `reservation_start_date`, `is_approved_by_mail`, `price`, `hotel_id`, `user_id`) VALUES ('2', '2019-07-16', '2019-08-16', '1', '2000', '2', '9');
INSERT INTO `lab_1`.`booking_record` (`id`, `reservation_end_date`, `reservation_start_date`, `is_approved_by_mail`, `price`, `hotel_id`, `user_id`) VALUES ('3', '2020-12-24', '2021-01-12', '1', '6500', '3', '8');
INSERT INTO `lab_1`.`booking_record` (`id`, `reservation_end_date`, `reservation_start_date`, `is_approved_by_mail`, `price`, `hotel_id`, `user_id`) VALUES ('4', '2018-09-13', '2018-09-27', '1', '1200', '4', '7');
INSERT INTO `lab_1`.`booking_record` (`id`, `reservation_end_date`, `reservation_start_date`, `is_approved_by_mail`, `price`, `hotel_id`, `user_id`) VALUES ('5', '2014-05-20', '2014-05-28', '1', '3400', '5', '6');
INSERT INTO `lab_1`.`booking_record` (`id`, `reservation_end_date`, `reservation_start_date`, `is_approved_by_mail`, `price`, `hotel_id`, `user_id`) VALUES ('6', '2019-02-01', '2019-02-18', '1', '5400', '6', '5');
INSERT INTO `lab_1`.`booking_record` (`id`, `reservation_end_date`, `reservation_start_date`, `is_approved_by_mail`, `price`, `hotel_id`, `user_id`) VALUES ('7', '2021-10-19', '2021-10-26', '1', '1800', '7', '4');
INSERT INTO `lab_1`.`booking_record` (`id`, `reservation_end_date`, `reservation_start_date`, `is_approved_by_mail`, `price`, `hotel_id`, `user_id`) VALUES ('8', '2015-09-28', '2015-10-15', '1', '4300', '8', '3');
INSERT INTO `lab_1`.`booking_record` (`id`, `reservation_end_date`, `reservation_start_date`, `is_approved_by_mail`, `price`, `hotel_id`, `user_id`) VALUES ('9', '2017-07-10', '2017-07-24', '1', '2700', '9', '2');
INSERT INTO `lab_1`.`booking_record` (`id`, `reservation_end_date`, `reservation_start_date`, `is_approved_by_mail`, `price`, `hotel_id`, `user_id`) VALUES ('10', '2019-05-01', '2019-05-015', '1', '2900', '10', '1');

-- hotel room
INSERT INTO `lab_1`.`hotel_room` (`id`, `room_number`, `is_booked`, `price_per_day`, `hotel_room_type_id`, `hotel_id`) VALUES ('1', '42', '1', '200', '1', '1');
INSERT INTO `lab_1`.`hotel_room` (`id`, `room_number`, `is_booked`, `price_per_day`, `hotel_room_type_id`, `hotel_id`) VALUES ('2', '35', '1', '300', '2', '2');
INSERT INTO `lab_1`.`hotel_room` (`id`, `room_number`, `is_booked`, `price_per_day`, `hotel_room_type_id`, `hotel_id`) VALUES ('3', '21', '1', '400', '3', '3');
INSERT INTO `lab_1`.`hotel_room` (`id`, `room_number`, `is_booked`, `price_per_day`, `hotel_room_type_id`, `hotel_id`) VALUES ('4', '22', '0', '120', '4', '4');
INSERT INTO `lab_1`.`hotel_room` (`id`, `room_number`, `is_booked`, `price_per_day`, `hotel_room_type_id`, `hotel_id`) VALUES ('5', '67', '1', '320', '4', '5');
INSERT INTO `lab_1`.`hotel_room` (`id`, `room_number`, `is_booked`, `price_per_day`, `hotel_room_type_id`, `hotel_id`) VALUES ('6', '32', '0', '450', '3', '6');
INSERT INTO `lab_1`.`hotel_room` (`id`, `room_number`, `is_booked`, `price_per_day`, `hotel_room_type_id`, `hotel_id`) VALUES ('7', '180', '1', '600', '2', '7');
INSERT INTO `lab_1`.`hotel_room` (`id`, `room_number`, `is_booked`, `price_per_day`, `hotel_room_type_id`, `hotel_id`) VALUES ('8', '17', '0', '350', '1', '8');
INSERT INTO `lab_1`.`hotel_room` (`id`, `room_number`, `is_booked`, `price_per_day`, `hotel_room_type_id`, `hotel_id`) VALUES ('9', '40', '1', '220', '2', '9');
INSERT INTO `lab_1`.`hotel_room` (`id`, `room_number`, `is_booked`, `price_per_day`, `hotel_room_type_id`, `hotel_id`) VALUES ('10', '32', '1', '460', '3', '10');