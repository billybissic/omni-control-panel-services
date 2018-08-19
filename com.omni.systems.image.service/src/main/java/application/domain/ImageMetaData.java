package application.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ImageMetaData {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer image_metadata_id;
	private Integer image_id;
	private String image_name;
	private String image_title;
	private String image_subject;
	private Integer image_rating;
	private String image_tags;
	private String image_comments;
	private String image_date_taken;
	private String image_program_name;
	private String image_date_acquired;
	private String image_copyright;
	private String image_id_from_meta_data;
	private String image_dimensions;
	private Integer image_width;
	private Integer image_height;
	private String image_horizontal_resolution;
	private String image_vertical_resolution;
	private String image_bit_depth;
	private String image_compression;
	private String image_resolution_unit;
	private String image_color_representation;
	private String image_compressed_bits_pixels;
	private String image_camera_maker;
	private String image_camera_model;
	private String image_f_stop;
	private String image_exposure_time;
	private String image_iso_speed;
	private String image_exposure_bias;
	private String image_focal_length;
	private String image_max_apeture;
	private String image_metering_mode;
	private String image_subject_distance;
	private String image_flash_mode;
	private String image_flash_energy;
	private String image_35_mm_focal_length;
	private String image_lense_maker;
	private String image_lense_model;
	private String image_flash_maker;
	private String image_flash_model;
	private String image_camera_serial_number;
	private String image_contrast;
	private String image_brightness;
	private String image_light_source;
	private String image_exposure_program;
	private String image_saturation;
	private String image_sharpeness;
	private String image_white_balance;
	private String image_photometric_interpolation;
	private String image_digital_zoom;
	private String image_exif_version;
	private String image_item_type;
	private Integer image_size;
	private String image_attributes;
	private String image_owner;
	private Integer image_media_type_id;
	private Integer image_major_mime_id;
	private Integer image_minor_mime_id;
	private String image_description;
	private Integer image_owner_uuid;
	private String image_user_text;
	private String image_create_timestamp;
	private String image_sha1;
	private Integer image_caption_id;
	private Integer image_style_id;
	private Integer image_link_id;
	private Integer image_effects_id;
	private Integer image_layout_order_number;
	private String last_changed_timestamp;
	private Integer last_changed_by_uuid;
	
	/**
	 * @return the image_metadata_id
	 */
	public Integer getImage_metadata_id() {
		return image_metadata_id;
	}
	/**
	 * @param image_metadata_id the image_metadata_id to set
	 */
	public void setImage_metadata_id(Integer image_metadata_id) {
		this.image_metadata_id = image_metadata_id;
	}
	/**
	 * @return the image_id
	 */
	public Integer getImage_id() {
		return image_id;
	}
	/**
	 * @param image_id the image_id to set
	 */
	public void setImage_id(Integer image_id) {
		this.image_id = image_id;
	}
	/**
	 * @return the image_name
	 */
	public String getImage_name() {
		return image_name;
	}
	/**
	 * @param image_name the image_name to set
	 */
	public void setImage_name(String image_name) {
		this.image_name = image_name;
	}
	/**
	 * @return the image_title
	 */
	public String getImage_title() {
		return image_title;
	}
	/**
	 * @param image_title the image_title to set
	 */
	public void setImage_title(String image_title) {
		this.image_title = image_title;
	}
	/**
	 * @return the image_subject
	 */
	public String getImage_subject() {
		return image_subject;
	}
	/**
	 * @param image_subject the image_subject to set
	 */
	public void setImage_subject(String image_subject) {
		this.image_subject = image_subject;
	}
	/**
	 * @return the image_rating
	 */
	public Integer getImage_rating() {
		return image_rating;
	}
	/**
	 * @param image_rating the image_rating to set
	 */
	public void setImage_rating(Integer image_rating) {
		this.image_rating = image_rating;
	}
	/**
	 * @return the image_tags
	 */
	public String getImage_tags() {
		return image_tags;
	}
	/**
	 * @param image_tags the image_tags to set
	 */
	public void setImage_tags(String image_tags) {
		this.image_tags = image_tags;
	}
	/**
	 * @return the image_comments
	 */
	public String getImage_comments() {
		return image_comments;
	}
	/**
	 * @param image_comments the image_comments to set
	 */
	public void setImage_comments(String image_comments) {
		this.image_comments = image_comments;
	}
	/**
	 * @return the image_date_taken
	 */
	public String getImage_date_taken() {
		return image_date_taken;
	}
	/**
	 * @param image_date_taken the image_date_taken to set
	 */
	public void setImage_date_taken(String image_date_taken) {
		this.image_date_taken = image_date_taken;
	}
	/**
	 * @return the image_program_name
	 */
	public String getImage_program_name() {
		return image_program_name;
	}
	/**
	 * @param image_program_name the image_program_name to set
	 */
	public void setImage_program_name(String image_program_name) {
		this.image_program_name = image_program_name;
	}
	/**
	 * @return the image_date_acquired
	 */
	public String getImage_date_acquired() {
		return image_date_acquired;
	}
	/**
	 * @param image_date_acquired the image_date_acquired to set
	 */
	public void setImage_date_acquired(String image_date_acquired) {
		this.image_date_acquired = image_date_acquired;
	}
	/**
	 * @return the image_copyright
	 */
	public String getImage_copyright() {
		return image_copyright;
	}
	/**
	 * @param image_copyright the image_copyright to set
	 */
	public void setImage_copyright(String image_copyright) {
		this.image_copyright = image_copyright;
	}
	/**
	 * @return the image_id_from_meta_data
	 */
	public String getImage_id_from_meta_data() {
		return image_id_from_meta_data;
	}
	/**
	 * @param image_id_from_meta_data the image_id_from_meta_data to set
	 */
	public void setImage_id_from_meta_data(String image_id_from_meta_data) {
		this.image_id_from_meta_data = image_id_from_meta_data;
	}
	/**
	 * @return the image_dimensions
	 */
	public String getImage_dimensions() {
		return image_dimensions;
	}
	/**
	 * @param image_dimensions the image_dimensions to set
	 */
	public void setImage_dimensions(String image_dimensions) {
		this.image_dimensions = image_dimensions;
	}
	/**
	 * @return the image_width
	 */
	public Integer getImage_width() {
		return image_width;
	}
	/**
	 * @param image_width the image_width to set
	 */
	public void setImage_width(Integer image_width) {
		this.image_width = image_width;
	}
	/**
	 * @return the image_height
	 */
	public Integer getImage_height() {
		return image_height;
	}
	/**
	 * @param image_height the image_height to set
	 */
	public void setImage_height(Integer image_height) {
		this.image_height = image_height;
	}
	/**
	 * @return the image_horizontal_resolution
	 */
	public String getImage_horizontal_resolution() {
		return image_horizontal_resolution;
	}
	/**
	 * @param image_horizontal_resolution the image_horizontal_resolution to set
	 */
	public void setImage_horizontal_resolution(String image_horizontal_resolution) {
		this.image_horizontal_resolution = image_horizontal_resolution;
	}
	/**
	 * @return the image_vertical_resolution
	 */
	public String getImage_vertical_resolution() {
		return image_vertical_resolution;
	}
	/**
	 * @param image_vertical_resolution the image_vertical_resolution to set
	 */
	public void setImage_vertical_resolution(String image_vertical_resolution) {
		this.image_vertical_resolution = image_vertical_resolution;
	}
	/**
	 * @return the image_bit_depth
	 */
	public String getImage_bit_depth() {
		return image_bit_depth;
	}
	/**
	 * @param image_bit_depth the image_bit_depth to set
	 */
	public void setImage_bit_depth(String image_bit_depth) {
		this.image_bit_depth = image_bit_depth;
	}
	/**
	 * @return the image_compression
	 */
	public String getImage_compression() {
		return image_compression;
	}
	/**
	 * @param image_compression the image_compression to set
	 */
	public void setImage_compression(String image_compression) {
		this.image_compression = image_compression;
	}
	/**
	 * @return the image_resolution_unit
	 */
	public String getImage_resolution_unit() {
		return image_resolution_unit;
	}
	/**
	 * @param image_resolution_unit the image_resolution_unit to set
	 */
	public void setImage_resolution_unit(String image_resolution_unit) {
		this.image_resolution_unit = image_resolution_unit;
	}
	/**
	 * @return the image_color_representation
	 */
	public String getImage_color_representation() {
		return image_color_representation;
	}
	/**
	 * @param image_color_representation the image_color_representation to set
	 */
	public void setImage_color_representation(String image_color_representation) {
		this.image_color_representation = image_color_representation;
	}
	/**
	 * @return the image_compressed_bits_pixels
	 */
	public String getImage_compressed_bits_pixels() {
		return image_compressed_bits_pixels;
	}
	/**
	 * @param image_compressed_bits_pixels the image_compressed_bits_pixels to set
	 */
	public void setImage_compressed_bits_pixels(String image_compressed_bits_pixels) {
		this.image_compressed_bits_pixels = image_compressed_bits_pixels;
	}
	/**
	 * @return the image_camera_maker
	 */
	public String getImage_camera_maker() {
		return image_camera_maker;
	}
	/**
	 * @param image_camera_maker the image_camera_maker to set
	 */
	public void setImage_camera_maker(String image_camera_maker) {
		this.image_camera_maker = image_camera_maker;
	}
	/**
	 * @return the image_camera_model
	 */
	public String getImage_camera_model() {
		return image_camera_model;
	}
	/**
	 * @param image_camera_model the image_camera_model to set
	 */
	public void setImage_camera_model(String image_camera_model) {
		this.image_camera_model = image_camera_model;
	}
	/**
	 * @return the image_f_stop
	 */
	public String getImage_f_stop() {
		return image_f_stop;
	}
	/**
	 * @param image_f_stop the image_f_stop to set
	 */
	public void setImage_f_stop(String image_f_stop) {
		this.image_f_stop = image_f_stop;
	}
	/**
	 * @return the image_exposure_time
	 */
	public String getImage_exposure_time() {
		return image_exposure_time;
	}
	/**
	 * @param image_exposure_time the image_exposure_time to set
	 */
	public void setImage_exposure_time(String image_exposure_time) {
		this.image_exposure_time = image_exposure_time;
	}
	/**
	 * @return the image_iso_speed
	 */
	public String getImage_iso_speed() {
		return image_iso_speed;
	}
	/**
	 * @param image_iso_speed the image_iso_speed to set
	 */
	public void setImage_iso_speed(String image_iso_speed) {
		this.image_iso_speed = image_iso_speed;
	}
	/**
	 * @return the image_exposure_bias
	 */
	public String getImage_exposure_bias() {
		return image_exposure_bias;
	}
	/**
	 * @param image_exposure_bias the image_exposure_bias to set
	 */
	public void setImage_exposure_bias(String image_exposure_bias) {
		this.image_exposure_bias = image_exposure_bias;
	}
	/**
	 * @return the image_focal_length
	 */
	public String getImage_focal_length() {
		return image_focal_length;
	}
	/**
	 * @param image_focal_length the image_focal_length to set
	 */
	public void setImage_focal_length(String image_focal_length) {
		this.image_focal_length = image_focal_length;
	}
	/**
	 * @return the image_max_apeture
	 */
	public String getImage_max_apeture() {
		return image_max_apeture;
	}
	/**
	 * @param image_max_apeture the image_max_apeture to set
	 */
	public void setImage_max_apeture(String image_max_apeture) {
		this.image_max_apeture = image_max_apeture;
	}
	/**
	 * @return the image_metering_mode
	 */
	public String getImage_metering_mode() {
		return image_metering_mode;
	}
	/**
	 * @param image_metering_mode the image_metering_mode to set
	 */
	public void setImage_metering_mode(String image_metering_mode) {
		this.image_metering_mode = image_metering_mode;
	}
	/**
	 * @return the image_subject_distance
	 */
	public String getImage_subject_distance() {
		return image_subject_distance;
	}
	/**
	 * @param image_subject_distance the image_subject_distance to set
	 */
	public void setImage_subject_distance(String image_subject_distance) {
		this.image_subject_distance = image_subject_distance;
	}
	/**
	 * @return the image_flash_mode
	 */
	public String getImage_flash_mode() {
		return image_flash_mode;
	}
	/**
	 * @param image_flash_mode the image_flash_mode to set
	 */
	public void setImage_flash_mode(String image_flash_mode) {
		this.image_flash_mode = image_flash_mode;
	}
	/**
	 * @return the image_flash_energy
	 */
	public String getImage_flash_energy() {
		return image_flash_energy;
	}
	/**
	 * @param image_flash_energy the image_flash_energy to set
	 */
	public void setImage_flash_energy(String image_flash_energy) {
		this.image_flash_energy = image_flash_energy;
	}
	/**
	 * @return the image_35_mm_focal_length
	 */
	public String getImage_35_mm_focal_length() {
		return image_35_mm_focal_length;
	}
	/**
	 * @param image_35_mm_focal_length the image_35_mm_focal_length to set
	 */
	public void setImage_35_mm_focal_length(String image_35_mm_focal_length) {
		this.image_35_mm_focal_length = image_35_mm_focal_length;
	}
	/**
	 * @return the image_lense_maker
	 */
	public String getImage_lense_maker() {
		return image_lense_maker;
	}
	/**
	 * @param image_lense_maker the image_lense_maker to set
	 */
	public void setImage_lense_maker(String image_lense_maker) {
		this.image_lense_maker = image_lense_maker;
	}
	/**
	 * @return the image_lense_model
	 */
	public String getImage_lense_model() {
		return image_lense_model;
	}
	/**
	 * @param image_lense_model the image_lense_model to set
	 */
	public void setImage_lense_model(String image_lense_model) {
		this.image_lense_model = image_lense_model;
	}
	/**
	 * @return the image_flash_maker
	 */
	public String getImage_flash_maker() {
		return image_flash_maker;
	}
	/**
	 * @param image_flash_maker the image_flash_maker to set
	 */
	public void setImage_flash_maker(String image_flash_maker) {
		this.image_flash_maker = image_flash_maker;
	}
	/**
	 * @return the image_flash_model
	 */
	public String getImage_flash_model() {
		return image_flash_model;
	}
	/**
	 * @param image_flash_model the image_flash_model to set
	 */
	public void setImage_flash_model(String image_flash_model) {
		this.image_flash_model = image_flash_model;
	}
	/**
	 * @return the image_camera_serial_number
	 */
	public String getImage_camera_serial_number() {
		return image_camera_serial_number;
	}
	/**
	 * @param image_camera_serial_number the image_camera_serial_number to set
	 */
	public void setImage_camera_serial_number(String image_camera_serial_number) {
		this.image_camera_serial_number = image_camera_serial_number;
	}
	/**
	 * @return the image_contrast
	 */
	public String getImage_contrast() {
		return image_contrast;
	}
	/**
	 * @param image_contrast the image_contrast to set
	 */
	public void setImage_contrast(String image_contrast) {
		this.image_contrast = image_contrast;
	}
	/**
	 * @return the image_brightness
	 */
	public String getImage_brightness() {
		return image_brightness;
	}
	/**
	 * @param image_brightness the image_brightness to set
	 */
	public void setImage_brightness(String image_brightness) {
		this.image_brightness = image_brightness;
	}
	/**
	 * @return the image_light_source
	 */
	public String getImage_light_source() {
		return image_light_source;
	}
	/**
	 * @param image_light_source the image_light_source to set
	 */
	public void setImage_light_source(String image_light_source) {
		this.image_light_source = image_light_source;
	}
	/**
	 * @return the image_exposure_program
	 */
	public String getImage_exposure_program() {
		return image_exposure_program;
	}
	/**
	 * @param image_exposure_program the image_exposure_program to set
	 */
	public void setImage_exposure_program(String image_exposure_program) {
		this.image_exposure_program = image_exposure_program;
	}
	/**
	 * @return the image_saturation
	 */
	public String getImage_saturation() {
		return image_saturation;
	}
	/**
	 * @param image_saturation the image_saturation to set
	 */
	public void setImage_saturation(String image_saturation) {
		this.image_saturation = image_saturation;
	}
	/**
	 * @return the image_sharpeness
	 */
	public String getImage_sharpeness() {
		return image_sharpeness;
	}
	/**
	 * @param image_sharpeness the image_sharpeness to set
	 */
	public void setImage_sharpeness(String image_sharpeness) {
		this.image_sharpeness = image_sharpeness;
	}
	/**
	 * @return the image_white_balance
	 */
	public String getImage_white_balance() {
		return image_white_balance;
	}
	/**
	 * @param image_white_balance the image_white_balance to set
	 */
	public void setImage_white_balance(String image_white_balance) {
		this.image_white_balance = image_white_balance;
	}
	/**
	 * @return the image_photometric_interpolation
	 */
	public String getImage_photometric_interpolation() {
		return image_photometric_interpolation;
	}
	/**
	 * @param image_photometric_interpolation the image_photometric_interpolation to set
	 */
	public void setImage_photometric_interpolation(String image_photometric_interpolation) {
		this.image_photometric_interpolation = image_photometric_interpolation;
	}
	/**
	 * @return the image_digital_zoom
	 */
	public String getImage_digital_zoom() {
		return image_digital_zoom;
	}
	/**
	 * @param image_digital_zoom the image_digital_zoom to set
	 */
	public void setImage_digital_zoom(String image_digital_zoom) {
		this.image_digital_zoom = image_digital_zoom;
	}
	/**
	 * @return the image_exif_version
	 */
	public String getImage_exif_version() {
		return image_exif_version;
	}
	/**
	 * @param image_exif_version the image_exif_version to set
	 */
	public void setImage_exif_version(String image_exif_version) {
		this.image_exif_version = image_exif_version;
	}
	/**
	 * @return the image_item_type
	 */
	public String getImage_item_type() {
		return image_item_type;
	}
	/**
	 * @param image_item_type the image_item_type to set
	 */
	public void setImage_item_type(String image_item_type) {
		this.image_item_type = image_item_type;
	}
	/**
	 * @return the image_size
	 */
	public Integer getImage_size() {
		return image_size;
	}
	/**
	 * @param image_size the image_size to set
	 */
	public void setImage_size(Integer image_size) {
		this.image_size = image_size;
	}
	/**
	 * @return the image_attributes
	 */
	public String getImage_attributes() {
		return image_attributes;
	}
	/**
	 * @param image_attributes the image_attributes to set
	 */
	public void setImage_attributes(String image_attributes) {
		this.image_attributes = image_attributes;
	}
	/**
	 * @return the image_owner
	 */
	public String getImage_owner() {
		return image_owner;
	}
	/**
	 * @param image_owner the image_owner to set
	 */
	public void setImage_owner(String image_owner) {
		this.image_owner = image_owner;
	}
	/**
	 * @return the image_media_type_id
	 */
	public Integer getImage_media_type_id() {
		return image_media_type_id;
	}
	/**
	 * @param image_media_type_id the image_media_type_id to set
	 */
	public void setImage_media_type_id(Integer image_media_type_id) {
		this.image_media_type_id = image_media_type_id;
	}
	/**
	 * @return the image_major_mime_id
	 */
	public Integer getImage_major_mime_id() {
		return image_major_mime_id;
	}
	/**
	 * @param image_major_mime_id the image_major_mime_id to set
	 */
	public void setImage_major_mime_id(Integer image_major_mime_id) {
		this.image_major_mime_id = image_major_mime_id;
	}
	/**
	 * @return the image_minor_mime_id
	 */
	public Integer getImage_minor_mime_id() {
		return image_minor_mime_id;
	}
	/**
	 * @param image_minor_mime_id the image_minor_mime_id to set
	 */
	public void setImage_minor_mime_id(Integer image_minor_mime_id) {
		this.image_minor_mime_id = image_minor_mime_id;
	}
	/**
	 * @return the image_description
	 */
	public String getImage_description() {
		return image_description;
	}
	/**
	 * @param image_description the image_description to set
	 */
	public void setImage_description(String image_description) {
		this.image_description = image_description;
	}
	/**
	 * @return the image_owner_uuid
	 */
	public Integer getImage_owner_uuid() {
		return image_owner_uuid;
	}
	/**
	 * @param image_owner_uuid the image_owner_uuid to set
	 */
	public void setImage_owner_uuid(Integer image_owner_uuid) {
		this.image_owner_uuid = image_owner_uuid;
	}
	/**
	 * @return the image_user_text
	 */
	public String getImage_user_text() {
		return image_user_text;
	}
	/**
	 * @param image_user_text the image_user_text to set
	 */
	public void setImage_user_text(String image_user_text) {
		this.image_user_text = image_user_text;
	}
	/**
	 * @return the image_create_timestamp
	 */
	public String getImage_create_timestamp() {
		return image_create_timestamp;
	}
	/**
	 * @param image_create_timestamp the image_create_timestamp to set
	 */
	public void setImage_create_timestamp(String image_create_timestamp) {
		this.image_create_timestamp = image_create_timestamp;
	}
	/**
	 * @return the image_sha1
	 */
	public String getImage_sha1() {
		return image_sha1;
	}
	/**
	 * @param image_sha1 the image_sha1 to set
	 */
	public void setImage_sha1(String image_sha1) {
		this.image_sha1 = image_sha1;
	}
	/**
	 * @return the image_caption_id
	 */
	public Integer getImage_caption_id() {
		return image_caption_id;
	}
	/**
	 * @param image_caption_id the image_caption_id to set
	 */
	public void setImage_caption_id(Integer image_caption_id) {
		this.image_caption_id = image_caption_id;
	}
	/**
	 * @return the image_style_id
	 */
	public Integer getImage_style_id() {
		return image_style_id;
	}
	/**
	 * @param image_style_id the image_style_id to set
	 */
	public void setImage_style_id(Integer image_style_id) {
		this.image_style_id = image_style_id;
	}
	/**
	 * @return the image_link_id
	 */
	public Integer getImage_link_id() {
		return image_link_id;
	}
	/**
	 * @param image_link_id the image_link_id to set
	 */
	public void setImage_link_id(Integer image_link_id) {
		this.image_link_id = image_link_id;
	}
	/**
	 * @return the image_effects_id
	 */
	public Integer getImage_effects_id() {
		return image_effects_id;
	}
	/**
	 * @param image_effects_id the image_effects_id to set
	 */
	public void setImage_effects_id(Integer image_effects_id) {
		this.image_effects_id = image_effects_id;
	}
	/**
	 * @return the image_layout_order_number
	 */
	public Integer getImage_layout_order_number() {
		return image_layout_order_number;
	}
	/**
	 * @param image_layout_order_number the image_layout_order_number to set
	 */
	public void setImage_layout_order_number(Integer image_layout_order_number) {
		this.image_layout_order_number = image_layout_order_number;
	}
	/**
	 * @return the last_changed_timestamp
	 */
	public String getLast_changed_timestamp() {
		return last_changed_timestamp;
	}
	/**
	 * @param last_changed_timestamp the last_changed_timestamp to set
	 */
	public void setLast_changed_timestamp(String last_changed_timestamp) {
		this.last_changed_timestamp = last_changed_timestamp;
	}
	/**
	 * @return the last_changed_by_uuid
	 */
	public Integer getLast_changed_by_uuid() {
		return last_changed_by_uuid;
	}
	/**
	 * @param last_changed_by_uuid the last_changed_by_uuid to set
	 */
	public void setLast_changed_by_uuid(Integer last_changed_by_uuid) {
		this.last_changed_by_uuid = last_changed_by_uuid;
	}
}

	