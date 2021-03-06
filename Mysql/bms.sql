-- MySQL Script generated by MySQL Workbench
-- Sat Apr 21 19:43:57 2018
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema BMS
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema BMS
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `BMS` DEFAULT CHARACTER SET utf8 ;
USE `BMS` ;

-- -----------------------------------------------------
-- Table `BMS`.`book`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `BMS`.`book` (
  `id` CHAR(8) NOT NULL,
  `name` NVARCHAR(40) NOT NULL,
  `author` NVARCHAR(20) NOT NULL,
  `publish` NVARCHAR(45) NOT NULL,
  `shelf` VARCHAR(45) NOT NULL,
  `address` VARCHAR(45) NOT NULL,
  `state` INT NOT NULL,
  `pic_path` VARCHAR(60) NOT NULL,
  `borrow_time` INT NOT NULL,
  `price` DECIMAL NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `BMS`.`type`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `BMS`.`type` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `BMS`.`book_type`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `BMS`.`book_type` (
  `type_id` INT NOT NULL,
  `book_id` CHAR(8) NOT NULL,
  PRIMARY KEY (`type_id`, `book_id`),
  INDEX `fk_book_id_idx` (`book_id` ASC),
  CONSTRAINT `fk_type_id`
    FOREIGN KEY (`type_id`)
    REFERENCES `BMS`.`type` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_book_id`
    FOREIGN KEY (`book_id`)
    REFERENCES `BMS`.`book` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
