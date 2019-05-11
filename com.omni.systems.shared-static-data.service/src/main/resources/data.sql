INSERT INTO `employment_position_types` (`position_type_name`,`position_type_desc`) VALUES ('WaitStaff','Employment position type for bartender, waiter, waitress.');
INSERT INTO `employment_position_types` (`position_type_name`,`position_type_desc`) VALUES ('Entertainer','Employment position for exotic dancers');
INSERT INTO `employment_position_types` (`position_type_name`,`position_type_desc`) VALUES ('Security','Employment position for venue security.');
INSERT INTO `employment_position_types` (`position_type_name`,`position_type_desc`) VALUES ('DJ','Employment position for music entertainment.');

INSERT INTO `employment_position_statuses` (`position_status_name`,`position_status_desc`) VALUES ('Vacant','Specifies that the position is open and not filled. It is possible to apply for a position in this status.');
INSERT INTO `employment_position_statuses` (`position_status_name`,`position_status_desc`) VALUES ('Filled','Specifies that the position has been filled. System is not accepting anymore applicants with this status.');
INSERT INTO `employment_position_statuses` (`position_status_name`,`position_status_desc`) VALUES ('Closed','Specifies that the position is no longer available. Marking it closed will allow the automated process to remove positions in this status.');

INSERT INTO `employment_application_types` (`application_type_name`,`application_type_desc`) VALUES ('General Application','Basic employment application.');
INSERT INTO `employment_application_types` (`application_type_name`,`application_type_desc`) VALUES ('Entertainer Application','Application for entertainer or exotic dancer.');

INSERT INTO `shared_static_data`.`employment_arrangement_types` (`arrangement_type_name`, `arrangement_type_desc`) VALUES ('Part Time', 'Part time employment.');
INSERT INTO `shared_static_data`.`employment_arrangement_types` (`arrangement_type_name`, `arrangement_type_desc`) VALUES ('Full Time', 'Full time employment.');
INSERT INTO `shared_static_data`.`employment_arrangement_types` (`arrangement_type_name`, `arrangement_type_desc`) VALUES ('Contract', 'Contract employment.');
INSERT INTO `shared_static_data`.`employment_arrangement_types` (`arrangement_type_name`, `arrangement_type_desc`) VALUES ('Hourly', 'Hourly wage employment.');
INSERT INTO `shared_static_data`.`employment_arrangement_types` (`arrangement_type_name`, `arrangement_type_desc`) VALUES ('Salary', 'Salary waged employment.');
