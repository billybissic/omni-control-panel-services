package application.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UploadStash {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer upload_stash_id; 
	private Integer upload_stash_uuid;
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
	 * @return the upload_stash_uuid
	 */
	public Integer getUpload_stash_uuid() {
		return upload_stash_uuid;
	}
	/**
	 * @param upload_stash_uuid the upload_stash_uuid to set
	 */
	public void setUpload_stash_uuid(Integer upload_stash_uuid) {
		this.upload_stash_uuid = upload_stash_uuid;
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
}
