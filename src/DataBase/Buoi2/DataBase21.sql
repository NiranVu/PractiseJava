CREATE DATABASE IF NOT EXISTS `student_cms_plusplus` DEFAULT CHARACTER SET utf8mb4;
USE student_cms_plusplus;
CREATE TABLE IF NOT EXISTS `student` (
											`id` INT NOT NULL AUTO_INCREMENT,
											`name` VARCHAR(50) NULL,
											`mssv` INT NULL,
											`password` VARCHAR(50) NULL,
											`phone` INT NULL,
											`address` VARCHAR(100) NULL,
											`age` INT NULL,
											`email` VARCHAR(50) NULL,
											`created_timstamp` TIMESTAMP NULL,
											`last_updated_timestamp` TIMESTAMP NULL,
                                            PRIMARY KEY (`id`));
CREATE TABLE IF NOT EXISTS `class` (
											`id` INT NOT NULL AUTO_INCREMENT,
                                            `name` VARCHAR(50) NULL,
                                            `major` VARCHAR(50) NULL,
                                            `total_student` INT NULL,
                                            `teacher_name` VARCHAR(50) NULL,
                                            `teacher_phone`INT NULL,
                                            `created_timstamp` TIMESTAMP NULL,
                                            PRIMARY KEY (`id`));
CREATE TABLE IF NOT EXISTS `student_class` (
											`student_id` INT NULL,
											`class_id` INT NULL);
                                                    
INSERT INTO `student` (`name`, `mssv`, `password`, `phone`, `address`, `age`, `email`, `created_timstamp`, `last_updated_timestamp`)
VALUE (	"Duc", "123", "456", "789", "vds3543", "12", "duc@gmai@.com", NOW(), CURRENT_TIMESTAMP());

INSERT INTO `class` (`name`, `major`, `total_student`, `teacher_name`, `teacher_phone`, `created_timstamp`)
VALUE("PLUSPLSU", "IT", "3", "Kiem", "123456789", NOW());

INSERT INTO `student_class` (`student_id`, `class_id`)
VALUE (1, 1);