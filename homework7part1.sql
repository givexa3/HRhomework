CREATE SCHEMA `database`;

CREATE  TABLE `database`.`Teacher` (
  `idTeacher` INT NULL ,
  `name` VARCHAR(45) NULL ,
  `lastname` VARCHAR(45) NULL ,
  `gender` VARCHAR(45) NULL ,
  `subject` VARCHAR(45) NULL ,
  PRIMARY KEY (`idTeacher`) );

CREATE  TABLE `database`.`Pupil` (
  `idPupil` INT NULL ,
  `name` VARCHAR(45) NULL ,
  `lastname` VARCHAR(45) NULL ,
  `gender` VARCHAR(45) NULL ,
  `class` VARCHAR(45) NULL ,
  PRIMARY KEY (`idPupil`) );

INSERT INTO `database`.`teacher` (`idTeacher`, `name`, `lastname`, `gender`, `subject`) VALUES ('1', 'nodar', 'dgebuadze', 'male', 'math');
INSERT INTO `database`.`teacher` (`idTeacher`, `name`, `lastname`, `gender`, `subject`) VALUES ('2', 'ana', 'bolqvadze', 'female', 'english');
INSERT INTO `database`.`teacher` (`idTeacher`, `name`, `lastname`, `gender`, `subject`) VALUES ('3', 'avto', 'katamadze', 'male', 'history');
INSERT INTO `database`.`pupil` (`idPupil`, `name`, `lastname`, `gender`, `class`) VALUES ('1', 'sandro', 'tavadze', 'male', 'history');
INSERT INTO `database`.`pupil` (`idPupil`, `name`, `lastname`, `gender`, `class`) VALUES ('2', 'mari', 'buadze', 'female', 'math');
INSERT INTO `database`.`pupil` (`idPupil`, `name`, `lastname`, `gender`, `class`) VALUES ('3', 'giorgi', 'dvali', 'male', 'english');
INSERT INTO `database`.`pupil` (`idPupil`, `name`, `lastname`, `gender`, `class`) VALUES ('4', 'sandro', 'tavadze', 'male', 'math');
INSERT INTO `database`.`pupil` (`idPupil`, `name`, `lastname`, `gender`, `class`) VALUES ('5', 'giorgi', 'dvali', 'male', 'math');
INSERT INTO `database`.`pupil` (`idPupil`, `name`, `lastname`, `gender`, `class`) VALUES ('6', 'mari', 'buadze', 'female', 'history');
INSERT INTO `database`.`pupil` (`idPupil`, `name`, `lastname`, `gender`, `class`) VALUES ('7', 'sandro', 'tavadze', 'male', 'english');

