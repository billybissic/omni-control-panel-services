DROP TABLE IF EXISTS `employment_application_types`;
CREATE TABLE `employment_application_types` (
  `application_type_id` int(11) NOT NULL AUTO_INCREMENT,
  `application_type_name` text NOT NULL,
  `application_type_desc` text NOT NULL,
  PRIMARY KEY (`application_type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `employment_position_statuses`;
CREATE TABLE `employment_position_statuses` (
  `position_status_id` int(11) NOT NULL AUTO_INCREMENT,
  `position_status_name` text NOT NULL,
  `position_status_desc` text NOT NULL,
  PRIMARY KEY (`position_status_id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `employment_position_types`;
CREATE TABLE `employment_position_types` (
  `position_type_id` int(11) NOT NULL AUTO_INCREMENT,
  `position_type_name` text NOT NULL,
  `position_type_desc` text NOT NULL,
  PRIMARY KEY (`position_type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `employment_arrangement_types`;
CREATE TABLE `shared_static_data`.`employment_arrangement_types` (
  `arrangement_type_id` INT NOT NULL AUTO_INCREMENT,
  `arrangement_type_name` TEXT NOT NULL,
  `arrangement_type_desc` TEXT NOT NULL,
  PRIMARY KEY (`arrangement_type_id`));