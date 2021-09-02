DROP TABLE IF EXISTS `application_settings`;

CREATE TABLE `application_settings` (
  `application_settings_id` int(11) NOT NULL AUTO_INCREMENT,
  `application_name` varchar(255) NOT NULL,
  `application_setting_description` varchar(255) NOT NULL,
  `application_setting_name` varchar(255) NOT NULL,
  `application_setting_value` varchar(255) NOT NULL,
  `last_changed_timestamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `last_modified_userid` int(11) NOT NULL,
  PRIMARY KEY (`application_settings_id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;