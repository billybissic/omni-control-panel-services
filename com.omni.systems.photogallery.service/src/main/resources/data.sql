/* static data - gallery group type */
INSERT INTO gallery_group_type (group_type_name, group_type_description) 
VALUES ('Photo Thumbnail Grid', 'Photo gallery with square thumnail tiles heavy padding.');

INSERT INTO gallery_group_type (group_type_name, group_type_description) 
VALUES ('Photo Tiled Mosaic', 'Photo gallery with mosaic tiles, ranging in random size.');

INSERT INTO gallery_group_type (group_type_name, group_type_description) 
VALUES ('Photo Square Tiles', 'Photo gallery with consistent size square tiles with elegant padding.');

INSERT INTO gallery_group_type (group_type_name, group_type_description) 
VALUES ('Photo Circles', 'Photo grallery with consistent size circles.');

INSERT INTO gallery_group_type (group_type_name, group_type_description) 
VALUES ('Photo Slideshow', 'Timed slide show of images displaying a large size of images.');

INSERT INTO gallery_group_type (group_type_name, group_type_description) 
VALUES ('Video Thumbnail Grid', 'Video gallery with square thumbnail tiles and heaving padding between thumbnails for each video.');

INSERT INTO gallery_group_type (group_type_name, group_type_description) 
VALUES ('Video Tiled Mosaic', 'Video gallery with square and rectangular tiles in a mosaic pattern with minimal padding between each.');

INSERT INTO gallery_group_type (group_type_name, group_type_description) 
VALUES ('Video Square Tiles', 'Video gallery with square tile in a standard tile pattern with minimal padding between each tile.');

INSERT INTO gallery_group_type (group_type_name, group_type_description) 
VALUES ('Video Circles', 'Video gallery with circle tiles and heavy padding between each tile.');

INSERT INTO gallery_group_type (group_type_name, group_type_description) 
VALUES ('Video Sideshow', 'Single video group for each video file in the jumbotron.');

/* static data - gallery_object_type */
INSERT INTO gallery_object_type (gallery_object_type_name, gallery_object_type_description) 
VALUES ('Thumbail', 'Object of compressed image of the media.');

INSERT INTO gallery_object_type (gallery_object_type_name, gallery_object_type_description) 
VALUES ('Control', 'Botton object pertaining to the media control.');

INSERT INTO gallery_object_type (gallery_object_type_name, gallery_object_type_description) 
VALUES ('Image' , 'Photo object, inherits the information from the respective display object of each image.');

INSERT INTO gallery_object_type (gallery_object_type_name, gallery_object_type_description)
VALUES ('Video', 'Video object, inherits the information from the respective display object of each video.');

/* static data - gallery order category */
INSERT INTO gallery_order_category (gallery_order_category_name, gallery_order_category_description)
VALUES ('Date/Time', 'Order By Date/Time');

INSERT INTO gallery_order_category (gallery_order_category_name, gallery_order_category_description)
VALUES ('Title', 'Order By Title');

INSERT INTO gallery_order_category (gallery_order_category_name, gallery_order_category_description)
VALUES ('File', 'Order By File Name');

INSERT INTO gallery_order_category (gallery_order_category_name, gallery_order_category_description) 
VALUES ('Weight', 'Order By Item Weight');

INSERT INTO gallery_order_category (gallery_order_category_name, gallery_order_category_description)
VALUES ('Popularity', 'Order By Popularity, by number of likes/stars, or by views if no method of likes are enabled.');

INSERT INTO gallery_order_category (gallery_order_category_name, gallery_order_category_description)
VALUES ('Size', 'Order By Size');

/* static data - gallery order direction*/
INSERT INTO gallery_order_direction (gallery_order_direction_name, gallery_order_direction_description)
VALUES ('Ascending', 'Sets container order on gallery order type to organize the gallery contents from least to greatest.');

INSERT INTO gallery_order_direction (gallery_order_direction_name, gallery_order_direction_description)
VALUES ('Descending', 'Sets container order on gallery order type to organize the gallery contents from greatest to least.');

/* static data - gallery order type */
/* date/time */
INSERT INTO gallery_order_type (gallery_order_type_name, gallery_order_type_description, gallery_order_direction_id, gallery_order_category_id)
VALUES ('Ascending Date and Time', 'Order gallery by date and time in ascending order.', 
(SELECT gallery_order_direction_id FROM gallery_order_direction WHERE gallery_order_direction_name = 'Ascending'),
(SELECT gallery_order_category_id FROM gallery_order_category WHERE gallery_order_category_name = 'Date/Time'));

INSERT INTO gallery_order_type (gallery_order_type_name, gallery_order_type_description, gallery_order_direction_id, gallery_order_category_id)
VALUES ('Descending Date and Time', 'Order gallery by date and time in descending order.',
(SELECT gallery_order_direction_id FROM gallery_order_direction WHERE gallery_order_direction_name = 'Descending'),
(SELECT gallery_order_category_id FROM gallery_order_category WHERE gallery_order_category_name = 'Date/Time'));

/* title */
INSERT INTO gallery_order_type (gallery_order_type_name, gallery_order_type_description, gallery_order_direction_id, gallery_order_category_id)
VALUES ('Ascending Titles', 'Order gallery in ascending order by item titles.',
(SELECT gallery_order_direction_id FROM gallery_order_direction WHERE gallery_order_direction_name = 'Ascending'),
(SELECT gallery_order_category_id FROM gallery_order_category WHERE gallery_order_category_name = 'Title'));

INSERT INTO gallery_order_type (gallery_order_type_name, gallery_order_type_description, gallery_order_direction_id, gallery_order_category_id)
VALUES ('Descending Titles', 'Order gallery in descending order by item titles.',
(SELECT gallery_order_direction_id FROM gallery_order_direction WHERE gallery_order_direction_name = 'Descending'),
(SELECT gallery_order_category_id FROM gallery_order_category WHERE gallery_order_category_name = 'Title'));

/* file name */
INSERT INTO gallery_order_type (gallery_order_type_name, gallery_order_type_description, gallery_order_direction_id, gallery_order_category_id)
VALUES ('Ascending File Name', 'Order gallery in ascending order by file name.',
(SELECT gallery_order_direction_id FROM gallery_order_direction WHERE gallery_order_direction_name = 'Ascending'),
(SELECT gallery_order_category_id FROM gallery_order_category WHERE gallery_order_category_name = 'File'));

INSERT INTO gallery_order_type (gallery_order_type_name, gallery_order_type_description, gallery_order_direction_id, gallery_order_category_id)
VALUES ('Descending File Name', 'Order gallery in descedning order by file name.',
(SELECT gallery_order_direction_id FROM gallery_order_direction WHERE gallery_order_direction_name = 'Descending'),
(SELECT gallery_order_category_id FROM gallery_order_category WHERE gallery_order_category_name = 'File'));

/* weight */
INSERT INTO gallery_order_type (gallery_order_type_name, gallery_order_type_description, gallery_order_direction_id, gallery_order_category_id)
VALUES ('Ascending Item Weight', 'Order gallery in ascending order by item weight.', 
(SELECT gallery_order_direction_id FROM gallery_order_direction WHERE gallery_order_direction_name = 'Ascending'),
(SELECT gallery_order_category_id FROM gallery_order_category WHERE gallery_order_category_name = 'Weight'));

INSERT INTO gallery_order_type (gallery_order_type_name, gallery_order_type_description, gallery_order_direction_id, gallery_order_category_id)
VALUES ('Descending Item Weight', 'Order gallery in descending order by item weight.',
(SELECT gallery_order_direction_id FROM gallery_order_direction WHERE gallery_order_direction_name = 'Descending'),
(SELECT gallery_order_category_id FROM gallery_order_category WHERE gallery_order_category_name = 'Weight'));

/* popularity */
INSERT INTO gallery_order_type (gallery_order_type_name, gallery_order_type_description, gallery_order_direction_id, gallery_order_category_id)
VALUES ('Ascending Popularity', 'Order gallery in ascending order by popularity. Least popular gallery items are shown first.',
(SELECT gallery_order_direction_id FROM gallery_order_direction WHERE gallery_order_direction_name = 'Ascending'),
(SELECT gallery_order_category_id FROM gallery_order_category WHERE gallery_order_category_name = 'Popularity'));

INSERT INTO gallery_order_type (gallery_order_type_name, gallery_order_type_description, gallery_order_direction_id, gallery_order_category_id)
VALUES ('Descending Popularity', 'Order gallery in descending order by popularity. Most popular gallery items are show first.',
(SELECT gallery_order_direction_id FROM gallery_order_direction WHERE gallery_order_direction_name = 'Descending'),
(SELECT gallery_order_category_id FROM gallery_order_category WHERE gallery_order_category_name = 'Popularity'));

/* size */
INSERT INTO gallery_order_type (gallery_order_type_name, gallery_order_type_description, gallery_order_direction_id, gallery_order_category_id)
VALUES ('Ascending Size', 'Order gallery in ascending order by file size. Smaller size files are presented first.',
(SELECT gallery_order_direction_id FROM gallery_order_direction WHERE gallery_order_direction_name = 'Ascending'),
(SELECT gallery_order_category_id FROM gallery_order_category WHERE gallery_order_category_name = 'Size'));

INSERT INTO gallery_order_type (gallery_order_type_name, gallery_order_type_description, gallery_order_direction_id, gallery_order_category_id)
VALUES ('Descending Size', 'Order gallery in descending order by file size. Larger size files are presented last.',
(SELECT gallery_order_direction_id FROM gallery_order_direction WHERE gallery_order_direction_name = 'Descending'),
(SELECT gallery_order_category_id FROM gallery_order_category WHERE gallery_order_category_name = 'Size'));