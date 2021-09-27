-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema lab_1
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema lab_1
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `lab_1` DEFAULT CHARACTER SET utf8 ;
USE `lab_1` ;

-- -----------------------------------------------------
-- Table `lab_1`.`hotel`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `lab_1`.`hotel` ;

CREATE TABLE IF NOT EXISTS `lab_1`.`hotel` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `hotel_name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `lab_1`.`hotel_feedback`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `lab_1`.`hotel_feedback` ;

CREATE TABLE IF NOT EXISTS `lab_1`.`hotel_feedback` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `feedback` VARCHAR(400) NULL,
  `rating` INT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `lab_1`.`hotel_location`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `lab_1`.`hotel_location` ;

CREATE TABLE IF NOT EXISTS `lab_1`.`hotel_location` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `country` VARCHAR(30) NOT NULL,
  `city` VARCHAR(45) NOT NULL,
  `street` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `lab_1`.`hotel_feedback_has_hotel`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `lab_1`.`hotel_feedback_has_hotel` ;

CREATE TABLE IF NOT EXISTS `lab_1`.`hotel_feedback_has_hotel` (
  `hotel_feedback_id` INT NOT NULL,
  `hotel_id` INT NOT NULL,
  PRIMARY KEY (`hotel_feedback_id`, `hotel_id`),
  INDEX `fk_hotel_feedback_has_hotel_hotel1_idx` (`hotel_id` ASC) VISIBLE,
  INDEX `fk_hotel_feedback_has_hotel_hotel_feedback1_idx` (`hotel_feedback_id` ASC) VISIBLE,
  CONSTRAINT `fk_hotel_feedback_has_hotel_hotel_feedback1`
    FOREIGN KEY (`hotel_feedback_id`)
    REFERENCES `lab_1`.`hotel_feedback` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_hotel_feedback_has_hotel_hotel1`
    FOREIGN KEY (`hotel_id`)
    REFERENCES `lab_1`.`hotel` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `lab_1`.`reserved_money`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `lab_1`.`reserved_money` ;

CREATE TABLE IF NOT EXISTS `lab_1`.`reserved_money` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `is_reserved` TINYINT NOT NULL,
  `sum` DECIMAL(10,2) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `lab_1`.`user_bank_account`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `lab_1`.`user_bank_account` ;

CREATE TABLE IF NOT EXISTS `lab_1`.`user_bank_account` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `balance` DECIMAL(10,2) NOT NULL,
  `reserved_money_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_user_bank_account_reserved_money1_idx` (`reserved_money_id` ASC) VISIBLE,
  CONSTRAINT `fk_user_bank_account_reserved_money1`
    FOREIGN KEY (`reserved_money_id`)
    REFERENCES `lab_1`.`reserved_money` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `lab_1`.`user`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `lab_1`.`user` ;

CREATE TABLE IF NOT EXISTS `lab_1`.`user` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `surname` VARCHAR(45) NOT NULL,
  `mail` VARCHAR(45) NOT NULL,
  `phone_number` VARCHAR(45) NOT NULL,
  `user_bank_account_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_user_user_bank_account1_idx` (`user_bank_account_id` ASC) VISIBLE,
  CONSTRAINT `fk_user_user_bank_account1`
    FOREIGN KEY (`user_bank_account_id`)
    REFERENCES `lab_1`.`user_bank_account` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `lab_1`.`booking_record`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `lab_1`.`booking_record` ;

CREATE TABLE IF NOT EXISTS `lab_1`.`booking_record` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `reservation_end_date` DATETIME NOT NULL,
  `reservation_start_date` DATETIME NOT NULL,
  `is_approved_by_mail` TINYINT NOT NULL,
  `price` DECIMAL(10,2) NOT NULL,
  `hotel_id` INT NOT NULL,
  `user_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_booking_record_hotel1_idx` (`hotel_id` ASC) VISIBLE,
  INDEX `fk_booking_record_user1_idx` (`user_id` ASC) VISIBLE,
  CONSTRAINT `fk_booking_record_hotel1`
    FOREIGN KEY (`hotel_id`)
    REFERENCES `lab_1`.`hotel` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_booking_record_user1`
    FOREIGN KEY (`user_id`)
    REFERENCES `lab_1`.`user` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `lab_1`.`hotel_room_type`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `lab_1`.`hotel_room_type` ;

CREATE TABLE IF NOT EXISTS `lab_1`.`hotel_room_type` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `type` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `lab_1`.`hotel_room`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `lab_1`.`hotel_room` ;

CREATE TABLE IF NOT EXISTS `lab_1`.`hotel_room` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `room_number` INT NOT NULL,
  `is_booked` TINYINT NOT NULL,
  `price_per_day` DECIMAL(10,2) NOT NULL,
  `hotel_room_type_id` INT NOT NULL,
  `hotel_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_hotel_room_hotel_room_type1_idx` (`hotel_room_type_id` ASC) VISIBLE,
  INDEX `fk_hotel_room_hotel1_idx` (`hotel_id` ASC) VISIBLE,
  CONSTRAINT `fk_hotel_room_hotel_room_type1`
    FOREIGN KEY (`hotel_room_type_id`)
    REFERENCES `lab_1`.`hotel_room_type` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_hotel_room_hotel1`
    FOREIGN KEY (`hotel_id`)
    REFERENCES `lab_1`.`hotel` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `lab_1`.`hotel_location_has_hotel`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `lab_1`.`hotel_location_has_hotel` ;

CREATE TABLE IF NOT EXISTS `lab_1`.`hotel_location_has_hotel` (
  `hotel_location_id` INT NOT NULL,
  `hotel_id` INT NOT NULL,
  PRIMARY KEY (`hotel_location_id`, `hotel_id`),
  INDEX `fk_hotel_location_has_hotel_hotel1_idx` (`hotel_id` ASC) VISIBLE,
  INDEX `fk_hotel_location_has_hotel_hotel_location1_idx` (`hotel_location_id` ASC) VISIBLE,
  CONSTRAINT `fk_hotel_location_has_hotel_hotel_location1`
    FOREIGN KEY (`hotel_location_id`)
    REFERENCES `lab_1`.`hotel_location` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_hotel_location_has_hotel_hotel1`
    FOREIGN KEY (`hotel_id`)
    REFERENCES `lab_1`.`hotel` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
