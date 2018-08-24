package application.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Gallery {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer gallery_id;
	private String gallery_name;
	private String gallery_summary;
	private Integer serial_number;
	private Integer mime_type_group_id;
	private Integer gallery_group_type_id;
	private Integer gallery_order_type_id;
	private Integer gallery_caption_id;
	/* both start_date and end_date must be 
	 * available to handle auto publishing */
	private String gallery_start_date; //publishing date for the gallery to go public
	private String gallery_end_date;   //publish date for the gallery to go private
	private Boolean gallery_is_private;
	private Integer gallery_color_theme_id;
	private Integer gallery_admin_uuid;
	private String last_changed_timestamp;
	private Integer last_changed_by_uuid;
	
	/**
	 * @return the gallery_id
	 */
	public Integer getGallery_id() {
		return gallery_id;
	}
	/**
	 * @param gallery_id the gallery_id to set
	 */
	public void setGallery_id(Integer gallery_id) {
		this.gallery_id = gallery_id;
	}
	/**
	 * @return the gallery_name
	 */
	public String getGallery_name() {
		return gallery_name;
	}
	/**
	 * @param gallery_name the gallery_name to set
	 */
	public void setGallery_name(String gallery_name) {
		this.gallery_name = gallery_name;
	}
	/**
	 * @return the gallery_summary
	 */
	public String getGallery_summary() {
		return gallery_summary;
	}
	/**
	 * @param gallery_summary the gallery_summary to set
	 */
	public void setGallery_summary(String gallery_summary) {
		this.gallery_summary = gallery_summary;
	}
	/**
	 * @return the serial_number
	 */
	public Integer getSerial_number() {
		return serial_number;
	}
	/**
	 * @param serial_number the serial_number to set
	 */
	public void setSerial_number(Integer serial_number) {
		this.serial_number = serial_number;
	}
	/**
	 * @return the mime_type_group_id
	 */
	public Integer getMime_type_group_id() {
		return mime_type_group_id;
	}
	/**
	 * @param mime_type_group_id the mime_type_group_id to set
	 */
	public void setMime_type_group_id(Integer mime_type_group_id) {
		this.mime_type_group_id = mime_type_group_id;
	}
	/**
	 * @return the gallery_group_type_id
	 */
	public Integer getGallery_group_type_id() {
		return gallery_group_type_id;
	}
	/**
	 * @param gallery_group_type_id the gallery_group_type_id to set
	 */
	public void setGallery_group_type_id(Integer gallery_group_type_id) {
		this.gallery_group_type_id = gallery_group_type_id;
	}
	/**
	 * @return the gallery_order_type_id
	 */
	public Integer getGallery_order_type_id() {
		return gallery_order_type_id;
	}
	/**
	 * @param gallery_order_type_id the gallery_order_type_id to set
	 */
	public void setGallery_order_type_id(Integer gallery_order_type_id) {
		this.gallery_order_type_id = gallery_order_type_id;
	}
	/**
	 * @return the gallery_caption_id
	 */
	public Integer getGallery_caption_id() {
		return gallery_caption_id;
	}
	/**
	 * @param gallery_caption_id the gallery_caption_id to set
	 */
	public void setGallery_caption_id(Integer gallery_caption_id) {
		this.gallery_caption_id = gallery_caption_id;
	}
	/**
	 * @return the gallery_start_date
	 */
	public String getGallery_start_date() {
		return gallery_start_date;
	}
	/**
	 * @param gallery_start_date the gallery_start_date to set
	 */
	public void setGallery_start_date(String gallery_start_date) {
		this.gallery_start_date = gallery_start_date;
	}
	/**
	 * @return the gallery_end_date
	 */
	public String getGallery_end_date() {
		return gallery_end_date;
	}
	/**
	 * @param gallery_end_date the gallery_end_date to set
	 */
	public void setGallery_end_date(String gallery_end_date) {
		this.gallery_end_date = gallery_end_date;
	}
	/**
	 * @return the gallery_is_private
	 */
	public Boolean getGallery_is_private() {
		return gallery_is_private;
	}
	/**
	 * @param gallery_is_private the gallery_is_private to set
	 */
	public void setGallery_is_private(Boolean gallery_is_private) {
		this.gallery_is_private = gallery_is_private;
	}
	/**
	 * @return the gallery_color_theme_id
	 */
	public Integer getGallery_color_theme_id() {
		return gallery_color_theme_id;
	}
	/**
	 * @param gallery_color_theme_id the gallery_color_theme_id to set
	 */
	public void setGallery_color_theme_id(Integer gallery_color_theme_id) {
		this.gallery_color_theme_id = gallery_color_theme_id;
	}
	/**
	 * @return the gallery_admin_uuid
	 */
	public Integer getGallery_admin_uuid() {
		return gallery_admin_uuid;
	}
	/**
	 * @param gallery_admin_uuid the gallery_admin_uuid to set
	 */
	public void setGallery_admin_uuid(Integer gallery_admin_uuid) {
		this.gallery_admin_uuid = gallery_admin_uuid;
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
