DROP TABLE IF EXISTS `gallery_group_type`;

CREATE TABLE `gallery_group_type` (
  `group_type_id` int(11) NOT NULL AUTO_INCREMENT,
  `group_type_name` varchar(255) DEFAULT NULL,
  `group_type_description` varchar(255) DEFAULT NULL,
  `mime_type_group_id` int(11) NOT NULL,
  PRIMARY KEY (`group_type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `gallery_object_type`;

CREATE TABLE `gallery_object_type` (
  `gallery_object_type_id` int(11) NOT NULL AUTO_INCREMENT,
  `gallery_object_type_description` varchar(255) DEFAULT NULL,
  `gallery_object_type_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`gallery_object_type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `gallery_order_category`;

CREATE TABLE `gallery_order_category` (
  `gallery_order_category_id` int(11) NOT NULL AUTO_INCREMENT,
  `gallery_order_category_name` varchar(255) DEFAULT NULL,
  `gallery_order_category_description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`gallery_order_category_id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `gallery_order_direction`;

CREATE TABLE `gallery_order_direction` (
  `gallery_order_direction_id` int(11) NOT NULL AUTO_INCREMENT,
  `gallery_order_direction_name` varchar(255) DEFAULT NULL,  
  `gallery_order_direction_description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`gallery_order_direction_id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `gallery_order_type`;

CREATE TABLE `gallery_order_type` (
  `gallery_order_type_id` int(11) NOT NULL AUTO_INCREMENT,
  `gallery_order_type_name` varchar(255) DEFAULT NULL,
  `gallery_order_type_description` varchar(255) DEFAULT NULL,
  `gallery_order_category_id` int(11) DEFAULT NULL,
  `gallery_order_direction_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`gallery_order_type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;
