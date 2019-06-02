/* static data - gallery group type */
INSERT INTO user_media.gallery_style_type (gallery_style_name, gallery_style_description, mime_type_group_id) 
VALUES ('Photo Thumbnail Grid', 'Photo gallery with square thumnail tiles heavy padding.',
(SELECT mtg.mime_type_group_id FROM user_media.mime_type_groups AS mtg WHERE mtg.mime_type_group_name ="Images" ));

INSERT INTO user_media.gallery_style_type (gallery_style_name, gallery_style_description, mime_type_group_id) 
VALUES ('Photo Tiled Mosaic', 'Photo gallery with mosaic tiles, ranging in random size.',
(SELECT mtg.mime_type_group_id FROM user_media.mime_type_groups AS mtg WHERE mtg.mime_type_group_name ="Images" ));

INSERT INTO user_media.gallery_style_type (gallery_style_name, gallery_style_description, mime_type_group_id) 
VALUES ('Photo Square Tiles', 'Photo gallery with consistent size square tiles with elegant padding.',
(SELECT mtg.mime_type_group_id FROM user_media.mime_type_groups AS mtg WHERE mtg.mime_type_group_name ="Images" ));

INSERT INTO user_media.gallery_style_type (gallery_style_name, gallery_style_description, mime_type_group_id) 
VALUES ('Photo Circles', 'Photo gallery with consistent size circles.',
(SELECT mtg.mime_type_group_id FROM user_media.mime_type_groups AS mtg WHERE mtg.mime_type_group_name ="Images" ));

INSERT INTO user_media.gallery_style_type (gallery_style_name, gallery_style_description, mime_type_group_id) 
VALUES ('Photo Slideshow', 'Timed slide show of images displaying a large size of images.',
(SELECT mtg.mime_type_group_id FROM user_media.mime_type_groups AS mtg WHERE mtg.mime_type_group_name ="Images" ));

INSERT INTO user_media.gallery_style_type (gallery_style_name, gallery_style_description, mime_type_group_id) 
VALUES ('Video Thumbnail Grid', 'Video gallery with square thumbnail tiles and heaving padding between thumbnails for each video.',
(SELECT mtg.mime_type_group_id FROM user_media.mime_type_groups AS mtg WHERE mtg.mime_type_group_name ="Videos" ));

INSERT INTO user_media.gallery_style_type (gallery_style_name, gallery_style_description, mime_type_group_id) 
VALUES ('Video Tiled Mosaic', 'Video gallery with square and rectangular tiles in a mosaic pattern with minimal padding between each.',
(SELECT mtg.mime_type_group_id FROM user_media.mime_type_groups AS mtg WHERE mtg.mime_type_group_name ="Videos" ));

INSERT INTO user_media.gallery_style_type (gallery_style_name, gallery_style_description, mime_type_group_id) 
VALUES ('Video Square Tiles', 'Video gallery with square tile in a standard tile pattern with minimal padding between each tile.',
(SELECT mtg.mime_type_group_id FROM user_media.mime_type_groups AS mtg WHERE mtg.mime_type_group_name ="Videos" ));

INSERT INTO user_media.gallery_style_type (gallery_style_name, gallery_style_description, mime_type_group_id) 
VALUES ('Video Circles', 'Video gallery with circle tiles and heavy padding between each tile.',
(SELECT mtg.mime_type_group_id FROM user_media.mime_type_groups AS mtg WHERE mtg.mime_type_group_name ="Videos" ));

INSERT INTO user_media.gallery_style_type (gallery_style_name, gallery_style_description, mime_type_group_id) 
VALUES ('Video Sideshow', 'Single video group for each video file in the jumbotron.',
(SELECT mtg.mime_type_group_id FROM user_media.mime_type_groups AS mtg WHERE mtg.mime_type_group_name ="Videos" ));

/* static data - gallery_group_type */
INSERT INTO gallery_group_type (group_type_name,group_type_description,mime_type_group_id)
VALUES ('Video Gallery','Video gallery, publicly open to site visitors.',
(SELECT mtg.mime_type_group_id FROM user_media.mime_type_groups AS mtg WHERE mtg.mime_type_group_name ="Videos" ));

INSERT INTO gallery_group_type (group_type_name, group_type_description, mime_type_group_id)
VALUES ('Photo Gallery', 'Photo gallery, public open to site visitors.',
(SELECT mtg.mime_type_group_id FROM user_media.mime_type_groups AS mtg WHERE mtg.mime_type_group_name ="Images" ));

INSERT INTO gallery_group_type (group_type_name,group_type_description,mime_type_group_id)
VALUES ('Event Flyers','Flyer storage for the event calendar. Publicly available to site users from the event calendar.',
(SELECT mtg.mime_type_group_id FROM user_media.mime_type_groups AS mtg WHERE mtg.mime_type_group_name ="Images" ));
);

INSERT INTO gallery_group_type (group_type_name,group_type_description,mime_type_group_id)
VALUES ('Celendar Headers','Photos for monthly calendar headers. Available to viewers with full calendar access.',
(SELECT mtg.mime_type_group_id FROM user_media.mime_type_groups AS mtg WHERE mtg.mime_type_group_name ="Images" ));
);

INSERT INTO gallery_group_type (group_type_name,group_type_description,mime_type_group_id)
VALUES ('Landing Videos','Video gallery for landing page. Publicly available to site users upon verifying age.',
(SELECT mtg.mime_type_group_id FROM user_media.mime_type_groups AS mtg WHERE mtg.mime_type_group_name ="Images" ));
);

INSERT INTO gallery_group_type (group_type_name,group_type_description,mime_type_group_id)
VALUES ('Landing Images','Image gallery for landing page. Publicly available to site users upon verifying age.',
(SELECT mtg.mime_type_group_id FROM user_media.mime_type_groups AS mtg WHERE mtg.mime_type_group_name ="Videos" ));
);

INSERT INTO gallery_group_type (group_type_name,group_type_description,mime_type_group_id)
VALUES ('Entertainers','Entertainer profile photographs. Publicly available to site users via the entertainers section.',
(SELECT mtg.mime_type_group_id FROM user_media.mime_type_groups AS mtg WHERE mtg.mime_type_group_name ="Images" ));
);

INSERT INTO gallery_group_type (group_type_name,group_type_description,mime_type_group_id)
VALUES ('Image Backgrounds','Image backgrounds for site pages. Publicly available to the site viewers via their respective pages.',
(SELECT mtg.mime_type_group_id FROM user_media.mime_type_groups AS mtg WHERE mtg.mime_type_group_name ="Images" ));
);

INSERT INTO gallery_group_type (group_type_name,group_type_description,mime_type_group_id)
VALUES ('Video Backgrounds','Video backgrounds for site pages. Publicly available to the site viewers via their respective pages.',
(SELECT mtg.mime_type_group_id FROM user_media.mime_type_groups AS mtg WHERE mtg.mime_type_group_name ="Videos" ));
);

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