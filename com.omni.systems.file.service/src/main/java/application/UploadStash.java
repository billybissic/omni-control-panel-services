package application;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UploadStash {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer upload_stash_id; 
	private Integer upload_stash_user; 
	private  String upload_stash_original_path; 
	private  String upload_stash_path; 
	private Integer upload_stash_source_type; 
	private  String upload_stash_timestamp; 
	private Integer upload_stash_status; 
	private Integer upload_stash_chunk; 
	private Integer upload_stash_size; 
	private  String upload_stash_sha1; 
	private Integer upload_stash_major_mime; 
	private Integer upload_stash_minor_mime; 
	private Integer upload_stash_media_type; 
	private Integer upload_stash_image_width; 
	private Integer upload_stash_image_height;
	
	/**
	 * @return the upload_stash_id
	 */
	public Integer getUpload_stash_id() {
		return upload_stash_id;
	}
	/**
	 * @param upload_stash_id the upload_stash_id to set
	 */
	public void setUpload_stash_id(Integer upload_stash_id) {
		this.upload_stash_id = upload_stash_id;
	}
	/**
	 * @return the upload_stash_user
	 */
	public Integer getUpload_stash_user() {
		return upload_stash_user;
	}
	/**
	 * @param upload_stash_user the upload_stash_user to set
	 */
	public void setUpload_stash_user(Integer upload_stash_user) {
		this.upload_stash_user = upload_stash_user;
	}
	/**
	 * @return the upload_stash_original_path
	 */
	public String getUpload_stash_original_path() {
		return upload_stash_original_path;
	}
	/**
	 * @param upload_stash_original_path the upload_stash_original_path to set
	 */
	public void setUpload_stash_original_path(String upload_stash_original_path) {
		this.upload_stash_original_path = upload_stash_original_path;
	}
	/**
	 * @return the upload_stash_path
	 */
	public String getUpload_stash_path() {
		return upload_stash_path;
	}
	/**
	 * @param upload_stash_path the upload_stash_path to set
	 */
	public void setUpload_stash_path(String upload_stash_path) {
		this.upload_stash_path = upload_stash_path;
	}
	/**
	 * @return the upload_stash_source_type
	 */
	public Integer getUpload_stash_source_type() {
		return upload_stash_source_type;
	}
	/**
	 * @param upload_stash_source_type the upload_stash_source_type to set
	 */
	public void setUpload_stash_source_type(Integer upload_stash_source_type) {
		this.upload_stash_source_type = upload_stash_source_type;
	}
	/**
	 * @return the upload_stash_timestamp
	 */
	public String getUpload_stash_timestamp() {
		return upload_stash_timestamp;
	}
	/**
	 * @param upload_stash_timestamp the upload_stash_timestamp to set
	 */
	public void setUpload_stash_timestamp(String upload_stash_timestamp) {
		this.upload_stash_timestamp = upload_stash_timestamp;
	}
	/**
	 * @return the upload_stash_status
	 */
	public Integer getUpload_stash_status() {
		return upload_stash_status;
	}
	/**
	 * @param upload_stash_status the upload_stash_status to set
	 */
	public void setUpload_stash_status(Integer upload_stash_status) {
		this.upload_stash_status = upload_stash_status;
	}
	/**
	 * @return the upload_stash_chunk
	 */
	public Integer getUpload_stash_chunk() {
		return upload_stash_chunk;
	}
	/**
	 * @param upload_stash_chunk the upload_stash_chunk to set
	 */
	public void setUpload_stash_chunk(Integer upload_stash_chunk) {
		this.upload_stash_chunk = upload_stash_chunk;
	}
	/**
	 * @return the upload_stash_size
	 */
	public Integer getUpload_stash_size() {
		return upload_stash_size;
	}
	/**
	 * @param upload_stash_size the upload_stash_size to set
	 */
	public void setUpload_stash_size(Integer upload_stash_size) {
		this.upload_stash_size = upload_stash_size;
	}
	/**
	 * @return the upload_stash_sha1
	 */
	public String getUpload_stash_sha1() {
		return upload_stash_sha1;
	}
	/**
	 * @param upload_stash_sha1 the upload_stash_sha1 to set
	 */
	public void setUpload_stash_sha1(String upload_stash_sha1) {
		this.upload_stash_sha1 = upload_stash_sha1;
	}
	/**
	 * @return the upload_stash_major_mime
	 */
	public Integer getUpload_stash_major_mime() {
		return upload_stash_major_mime;
	}
	/**
	 * @param upload_stash_major_mime the upload_stash_major_mime to set
	 */
	public void setUpload_stash_major_mime(Integer upload_stash_major_mime) {
		this.upload_stash_major_mime = upload_stash_major_mime;
	}
	/**
	 * @return the upload_stash_minor_mime
	 */
	public Integer getUpload_stash_minor_mime() {
		return upload_stash_minor_mime;
	}
	/**
	 * @param upload_stash_minor_mime the upload_stash_minor_mime to set
	 */
	public void setUpload_stash_minor_mime(Integer upload_stash_minor_mime) {
		this.upload_stash_minor_mime = upload_stash_minor_mime;
	}
	/**
	 * @return the upload_stash_media_type
	 */
	public Integer getUpload_stash_media_type() {
		return upload_stash_media_type;
	}
	/**
	 * @param upload_stash_media_type the upload_stash_media_type to set
	 */
	public void setUpload_stash_media_type(Integer upload_stash_media_type) {
		this.upload_stash_media_type = upload_stash_media_type;
	}
	/**
	 * @return the upload_stash_image_width
	 */
	public Integer getUpload_stash_image_width() {
		return upload_stash_image_width;
	}
	/**
	 * @param upload_stash_image_width the upload_stash_image_width to set
	 */
	public void setUpload_stash_image_width(Integer upload_stash_image_width) {
		this.upload_stash_image_width = upload_stash_image_width;
	}
	/**
	 * @return the upload_stash_image_height
	 */
	public Integer getUpload_stash_image_height() {
		return upload_stash_image_height;
	}
	/**
	 * @param upload_stash_image_height the upload_stash_image_height to set
	 */
	public void setUpload_stash_image_height(Integer upload_stash_image_height) {
		this.upload_stash_image_height = upload_stash_image_height;
	}
}
