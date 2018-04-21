package application;

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
	private Integer captions_id;
	private String caption_timestamp;
	private String last_modified_timestamp;
	private Integer serial_number;
	private Integer gallery_group_type_id;
	private Integer uuid;
	private String date_start;
	private String date_end;
	private Integer is_private;
	private Integer theme_id;
	
	public Integer getGallery_id() {
		return gallery_id;
	}
	public void setGallery_id(Integer gallery_id) {
		this.gallery_id = gallery_id;
	}
	public String getGallery_name() {
		return gallery_name;
	}
	public void setGallery_name(String gallery_name) {
		this.gallery_name = gallery_name;
	}
	public String getGallery_summary() {
		return gallery_summary;
	}
	public void setGallery_summary(String gallery_summary) {
		this.gallery_summary = gallery_summary;
	}
	public Integer getCaptions_id() {
		return captions_id;
	}
	public void setCaptions_id(Integer captions_id) {
		this.captions_id = captions_id;
	}
	public String getCaption_timestamp() {
		return caption_timestamp;
	}
	public void setCaption_timestamp(String caption_timestamp) {
		this.caption_timestamp = caption_timestamp;
	}
	public String getLast_modified_timestamp() {
		return last_modified_timestamp;
	}
	public void setLast_modified_timestamp(String last_modified_timestamp) {
		this.last_modified_timestamp = last_modified_timestamp;
	}
	public Integer getSerial_number() {
		return serial_number;
	}
	public void setSerial_number(Integer serial_number) {
		this.serial_number = serial_number;
	}
	public Integer getGallery_group_type_id() {
		return gallery_group_type_id;
	}
	public void setGallery_group_type_id(Integer gallery_group_type_id) {
		this.gallery_group_type_id = gallery_group_type_id;
	}
	public Integer getUuid() {
		return uuid;
	}
	public void setUuid(Integer uuid) {
		this.uuid = uuid;
	}
	public String getDate_start() {
		return date_start;
	}
	public void setDate_start(String date_start) {
		this.date_start = date_start;
	}
	public String getDate_end() {
		return date_end;
	}
	public void setDate_end(String date_end) {
		this.date_end = date_end;
	}
	public Integer getIs_private() {
		return is_private;
	}
	public void setIs_private(Integer is_private) {
		this.is_private = is_private;
	}
	public Integer getTheme_id() {
		return theme_id;
	}
	public void setTheme_id(Integer theme_id) {
		this.theme_id = theme_id;
	}
	
}
