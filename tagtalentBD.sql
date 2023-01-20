-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`usuario` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(20) NOT NULL,
  `apellido` VARCHAR(20) NOT NULL,
  `correo` VARCHAR(45) NOT NULL,
  `telefono` bigint NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `fecha_nacimiento` DATE NOT NULL,
  `sexo` ENUM('F', 'M') NULL,
  `foto` VARCHAR(255) NULL,
  `descripcion` VARCHAR(255) NULL,
  `ciudad` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`categoria`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`categoria` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`publicacion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`publicacion` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `ofrece` ENUM('S', 'N') NOT NULL,
  `titulo` VARCHAR(45) NOT NULL,
  `descripcion` VARCHAR(450) NOT NULL,
  `img` VARCHAR(455) NOT NULL,
  `usuario_id` INT NOT NULL,
  `categoria_id` INT NOT NULL,
  `fecha` DATE NOT NULL,
  `num_reacciones` INT NULL DEFAULT NULL,
  PRIMARY KEY (`id`, `usuario_id`, `categoria_id`),
  INDEX `fk_publicacion_usuario_idx` (`usuario_id` ASC) VISIBLE,
  INDEX `fk_publicacion_categoria1_idx` (`categoria_id` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`reacciones`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`reacciones` (
  `usuario_id` INT NOT NULL,
  `publicacion_id` INT NOT NULL,
  PRIMARY KEY (`usuario_id`, `publicacion_id`),
  INDEX `fk_reacciones_usuario1_idx` (`usuario_id` ASC) VISIBLE,
  INDEX `fk_reacciones_publicacion1_idx` (`publicacion_id` ASC) VISIBLE)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
