package application.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Videos {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer video_id; 
	private Integer external_id; 
	private Integer duration; 
	private Integer language_code; 
	private String video_name; 
	private Integer video_size; 
	private Integer video_width; 
	private Integer video_height; 
	private Integer video_metadata_id; 
	private Integer video_bits; 
	private Integer video_media_type; 
	private Integer video_major_mime; 
	private Integer video_minor_mime; 
	private String video_description; 
	private String video_user_text; 
	private String video_timestamp; 
	private String video_sha1; 
	private Integer video_image_id;
	/**
	 * @return the video_id
	 */
	public Integer getVideo_id() {
		return video_id;
	}
	/**
	 * @param video_id the video_id to set
	 */
	public void setVideo_id(Integer video_id) {
		this.video_id = video_id;
	}
	/**
	 * @return the external_id
	 */
	public Integer getExternal_id() {
		return external_id;
	}
	/**
	 * @param external_id the external_id to set
	 */
	public void setExternal_id(Integer external_id) {
		this.external_id = external_id;
	}
	/**
	 * @return the duration
	 */
	public Integer getDuration() {
		return duration;
	}
	/**
	 * @param duration the duration to set
	 */
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	/**
	 * @return the language_code
	 */
	public Integer getLanguage_code() {
		return language_code;
	}
	/**
	 * @param language_code the language_code to set
	 */
	public void setLanguage_code(Integer language_code) {
		this.language_code = language_code;
	}
	/**
	 * @return the video_name
	 */
	public String getVideo_name() {
		return video_name;
	}
	/**
	 * @param video_name the video_name to set
	 */
	public void setVideo_name(String video_name) {
		this.video_name = video_name;
	}
	/**
	 * @return the video_size
	 */
	public Integer getVideo_size() {
		return video_size;
	}
	/**
	 * @param video_size the video_size to set
	 */
	public void setVideo_size(Integer video_size) {
		this.video_size = video_size;
	}
	/**
	 * @return the video_width
	 */
	public Integer getVideo_width() {
		return video_width;
	}
	/**
	 * @param video_width the video_width to set
	 */
	public void setVideo_width(Integer video_width) {
		this.video_width = video_width;
	}
	/**
	 * @return the video_height
	 */
	public Integer getVideo_height() {
		return video_height;
	}
	/**
	 * @param video_height the video_height to set
	 */
	public void setVideo_height(Integer video_height) {
		this.video_height = video_height;
	}
	/**
	 * @return the video_metadata_id
	 */
	public Integer getVideo_metadata_id() {
		return video_metadata_id;
	}
	/**
	 * @param video_metadata_id the video_metadata_id to set
	 */
	public void setVideo_metadata_id(Integer video_metadata_id) {
		this.video_metadata_id = video_metadata_id;
	}
	/**
	 * @return the video_bits
	 */
	public Integer getVideo_bits() {
		return video_bits;
	}
	/**
	 * @param video_bits the video_bits to set
	 */
	public void setVideo_bits(Integer video_bits) {
		this.video_bits = video_bits;
	}
	/**
	 * @return the video_media_type
	 */
	public Integer getVideo_media_type() {
		return video_media_type;
	}
	/**
	 * @param video_media_type the video_media_type to set
	 */
	public void setVideo_media_type(Integer video_media_type) {
		this.video_media_type = video_media_type;
	}
	/**
	 * @return the video_major_mime
	 */
	public Integer getVideo_major_mime() {
		return video_major_mime;
	}
	/**
	 * @param video_major_mime the video_major_mime to set
	 */
	public void setVideo_major_mime(Integer video_major_mime) {
		this.video_major_mime = video_major_mime;
	}
	/**
	 * @return the video_minor_mime
	 */
	public Integer getVideo_minor_mime() {
		return video_minor_mime;
	}
	/**
	 * @param video_minor_mime the video_minor_mime to set
	 */
	public void setVideo_minor_mime(Integer video_minor_mime) {
		this.video_minor_mime = video_minor_mime;
	}
	/**
	 * @return the video_description
	 */
	public String getVideo_description() {
		return video_description;
	}
	/**
	 * @param video_description the video_description to set
	 */
	public void setVideo_description(String video_description) {
		this.video_description = video_description;
	}
	/**
	 * @return the video_user_text
	 */
	public String getVideo_user_text() {
		return video_user_text;
	}
	/**
	 * @param video_user_text the video_user_text to set
	 */
	public void setVideo_user_text(String video_user_text) {
		this.video_user_text = video_user_text;
	}
	/**
	 * @return the video_timestamp
	 */
	public String getVideo_timestamp() {
		return video_timestamp;
	}
	/**
	 * @param video_timestamp the video_timestamp to set
	 */
	public void setVideo_timestamp(String video_timestamp) {
		this.video_timestamp = video_timestamp;
	}
	/**
	 * @return the video_sha1
	 */
	public String getVideo_sha1() {
		return video_sha1;
	}
	/**
	 * @param video_sha1 the video_sha1 to set
	 */
	public void setVideo_sha1(String video_sha1) {
		this.video_sha1 = video_sha1;
	}
	/**
	 * @return the video_image_id
	 */
	public Integer getVideo_image_id() {
		return video_image_id;
	}
	/**
	 * @param video_image_id the video_image_id to set
	 */
	public void setVideo_image_id(Integer video_image_id) {
		this.video_image_id = video_image_id;
	}
}
