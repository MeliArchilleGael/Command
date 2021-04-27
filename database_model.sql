-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema DB_command
-- -----------------------------------------------------
-- DROP SCHEMA IF EXISTS `DB_command` ;

-- -----------------------------------------------------
-- Schema DB_command
-- -----------------------------------------------------
-- CREATE SCHEMA IF NOT EXISTS `DB_command` DEFAULT CHARACTER SET utf8 ;

Drop database if exists `DB_command`;
CREATE DATABASE IF NOT EXISTS `DB_command`;
USE `DB_command` ;

-- -----------------------------------------------------
-- Table `DB_command`.`CLient`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `DB_command`.`CLient` ;

CREATE TABLE IF NOT EXISTS `DB_command`.`CLient` (
  `Id_CLient` INT NOT NULL AUTO_INCREMENT,
  `Name` VARCHAR(45) NULL,
  `Location` VARCHAR(45) NULL,
  PRIMARY KEY (`Id_CLient`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DB_command`.`Command`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `DB_command`.`Command` ;

CREATE TABLE IF NOT EXISTS `DB_command`.`Command` (
  `Id_Command` INT NOT NULL AUTO_INCREMENT,
  `Command_Date` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `Montant` BIGINT(10) NOT NULL DEFAULT 0,
  `Id_CLient` INT NOT NULL,
  PRIMARY KEY (`Id_Command`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DB_command`.`Article`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `DB_command`.`Article` ;

CREATE TABLE IF NOT EXISTS `DB_command`.`Article` (
  `Id_Article` INT NOT NULL AUTO_INCREMENT,
  `Name` VARCHAR(45) NULL,
  `Unit_Price` BIGINT(10) NOT NULL DEFAULT 0,
  PRIMARY KEY (`Id_Article`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DB_command`.`Command_has_Article`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `DB_command`.`Command_has_Article` ;

CREATE TABLE IF NOT EXISTS `DB_command`.`Command_has_Article` (
  `Id_Command` INT NOT NULL,
  `Id_Article` INT NOT NULL,
  `Quantity` INT NOT NULL DEFAULT 0,
  PRIMARY KEY (`Id_Command`, `Id_Article`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
