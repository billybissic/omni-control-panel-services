package application.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OldImages {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer old_image_id; 
	private String old_image_name; 
	private Integer old_image_archive_name; 
	private Integer old_image_size; 
	private Integer old_image_width; 
	private Integer old_image_height; 
	private Integer old_image_bits; 
	private String old_image_description; 
	private Integer old_image_uuid; 
	private String old_image_user_text; 
	private String old_image_timestamp; 
	private Integer old_image_meta_data; 
	private Integer old_image_media_type; 
	private Integer old_image_major_mime; 
	private Integer old_image_minor_mime; 
	private Integer old_image_deleted;
	
	public Integer getOld_image_id() {
		return old_image_id;
	}
	public void setOld_image_id(Integer old_image_id) {
		this.old_image_id = old_image_id;
	}
	public String getOld_image_name() {
		return old_image_name;
	}
	public void setOld_image_name(String old_image_name) {
		this.old_image_name = old_image_name;
	}
	public Integer getOld_image_archive_name() {
		return old_image_archive_name;
	}
	public void setOld_image_archive_name(Integer old_image_archive_name) {
		this.old_image_archive_name = old_image_archive_name;
	}
	public Integer getOld_image_size() {
		return old_image_size;
	}
	public void setOld_image_size(Integer old_image_size) {
		this.old_image_size = old_image_size;
	}
	public Integer getOld_image_width() {
		return old_image_width;
	}
	public void setOld_image_width(Integer old_image_width) {
		this.old_image_width = old_image_width;
	}
	public Integer getOld_image_height() {
		return old_image_height;
	}
	public void setOld_image_height(Integer old_image_height) {
		this.old_image_height = old_image_height;
	}
	public Integer getOld_image_bits() {
		return old_image_bits;
	}
	public void setOld_image_bits(Integer old_image_bits) {
		this.old_image_bits = old_image_bits;
	}
	public String getOld_image_description() {
		return old_image_description;
	}
	public void setOld_image_description(String old_image_description) {
		this.old_image_description = old_image_description;
	}
	public Integer getOld_image_uuid() {
		return old_image_uuid;
	}
	public void setOld_image_uuid(Integer old_image_uuid) {
		this.old_image_uuid = old_image_uuid;
	}
	public String getOld_image_user_text() {
		return old_image_user_text;
	}
	public void setOld_image_user_text(String old_image_user_text) {
		this.old_image_user_text = old_image_user_text;
	}
	public String getOld_image_timestamp() {
		return old_image_timestamp;
	}
	public void setOld_image_timestamp(String old_image_timestamp) {
		this.old_image_timestamp = old_image_timestamp;
	}
	public Integer getOld_image_meta_data() {
		return old_image_meta_data;
	}
	public void setOld_image_meta_data(Integer old_image_meta_data) {
		this.old_image_meta_data = old_image_meta_data;
	}
	public Integer getOld_image_media_type() {
		return old_image_media_type;
	}
	public void setOld_image_media_type(Integer old_image_media_type) {
		this.old_image_media_type = old_image_media_type;
	}
	public Integer getOld_image_major_mime() {
		return old_image_major_mime;
	}
	public void setOld_image_major_mime(Integer old_image_major_mime) {
		this.old_image_major_mime = old_image_major_mime;
	}
	public Integer getOld_image_minor_mime() {
		return old_image_minor_mime;
	}
	public void setOld_image_minor_mime(Integer old_image_minor_mime) {
		this.old_image_minor_mime = old_image_minor_mime;
	}
	public Integer getOld_image_deleted() {
		return old_image_deleted;
	}
	public void setOld_image_deleted(Integer old_image_deleted) {
		this.old_image_deleted = old_image_deleted;
	}
}
