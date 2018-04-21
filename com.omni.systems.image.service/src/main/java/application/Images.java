package application;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Images {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer image_id;
	private String image_name;
	private Integer image_size;
	private Integer image_width;
	private Integer image_height;
	private Integer image_metadata_id;
	private Integer image_bits;
	private Integer image_media_type;
	private Integer image_major_mime;
	private Integer image_minor_mime;
	private String image_description;
	private Integer uuid;
	private String image_user_text;
	private String image_timestamp;
	private String image_sha1;
	
	public Integer getImage_id() {
		return image_id;
	}
	public void setImage_id(Integer image_id) {
		this.image_id = image_id;
	}
	public String getImage_name() {
		return image_name;
	}
	public void setImage_name(String image_name) {
		this.image_name = image_name;
	}
	public Integer getImage_size() {
		return image_size;
	}
	public void setImage_size(Integer image_size) {
		this.image_size = image_size;
	}
	public Integer getImage_width() {
		return image_width;
	}
	public void setImage_width(Integer image_width) {
		this.image_width = image_width;
	}
	public Integer getImage_height() {
		return image_height;
	}
	public void setImage_height(Integer image_height) {
		this.image_height = image_height;
	}
	public Integer getImage_metadata_id() {
		return image_metadata_id;
	}
	public void setImage_metadata_id(Integer image_metadata_id) {
		this.image_metadata_id = image_metadata_id;
	}
	public Integer getImage_bits() {
		return image_bits;
	}
	public void setImage_bits(Integer image_bits) {
		this.image_bits = image_bits;
	}
	public Integer getImage_media_type() {
		return image_media_type;
	}
	public void setImage_media_type(Integer image_media_type) {
		this.image_media_type = image_media_type;
	}
	public Integer getImage_major_mime() {
		return image_major_mime;
	}
	public void setImage_major_mime(Integer image_major_mime) {
		this.image_major_mime = image_major_mime;
	}
	public Integer getImage_minor_mime() {
		return image_minor_mime;
	}
	public void setImage_minor_mime(Integer image_minor_mime) {
		this.image_minor_mime = image_minor_mime;
	}
	public String getImage_description() {
		return image_description;
	}
	public void setImage_description(String image_description) {
		this.image_description = image_description;
	}
	public Integer getUuid() {
		return uuid;
	}
	public void setUuid(Integer uuid) {
		this.uuid = uuid;
	}
	public String getImage_user_text() {
		return image_user_text;
	}
	public void setImage_user_text(String image_user_text) {
		this.image_user_text = image_user_text;
	}
	public String getImage_timestamp() {
		return image_timestamp;
	}
	public void setImage_timestamp(String image_timestamp) {
		this.image_timestamp = image_timestamp;
	}
	public String getImage_sha1() {
		return image_sha1;
	}
	public void setImage_sha1(String image_sha1) {
		this.image_sha1 = image_sha1;
	}	
}
