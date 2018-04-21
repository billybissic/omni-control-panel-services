package application;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FileArchive {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer file_archive_id; 
	private  String file_archive_name; 
	private Integer file_archive_storage_group; 
	private Integer file_archive_storage_key; 
	private Integer file_archive_deleted_user; 
	private  String file_archive_deleted_timestamp; 
	private Integer file_archive_deleted_reason; 
	private Integer file_archive_size; 
	private Integer file_archive_width; 
	private Integer file_archive_height; 
	private Integer file_archive_metadata; 
	private Integer file_archive_bits; 
	private Integer file_archive_media_type; 
	private Integer file_archive_major_mime; 
	private Integer file_archive_minor_mime; 
	private Integer file_archive_user; 
	private  String file_archive_timestamp; 
	private Integer file_archive_deleted;
	
	/**
	 * @return the file_archive_id
	 */
	public Integer getFile_archive_id() {
		return file_archive_id;
	}
	/**
	 * @param file_archive_id the file_archive_id to set
	 */
	public void setFile_archive_id(Integer file_archive_id) {
		this.file_archive_id = file_archive_id;
	}
	/**
	 * @return the file_archive_name
	 */
	public String getFile_archive_name() {
		return file_archive_name;
	}
	/**
	 * @param file_archive_name the file_archive_name to set
	 */
	public void setFile_archive_name(String file_archive_name) {
		this.file_archive_name = file_archive_name;
	}
	/**
	 * @return the file_archive_storage_group
	 */
	public Integer getFile_archive_storage_group() {
		return file_archive_storage_group;
	}
	/**
	 * @param file_archive_storage_group the file_archive_storage_group to set
	 */
	public void setFile_archive_storage_group(Integer file_archive_storage_group) {
		this.file_archive_storage_group = file_archive_storage_group;
	}
	/**
	 * @return the file_archive_storage_key
	 */
	public Integer getFile_archive_storage_key() {
		return file_archive_storage_key;
	}
	/**
	 * @param file_archive_storage_key the file_archive_storage_key to set
	 */
	public void setFile_archive_storage_key(Integer file_archive_storage_key) {
		this.file_archive_storage_key = file_archive_storage_key;
	}
	/**
	 * @return the file_archive_deleted_user
	 */
	public Integer getFile_archive_deleted_user() {
		return file_archive_deleted_user;
	}
	/**
	 * @param file_archive_deleted_user the file_archive_deleted_user to set
	 */
	public void setFile_archive_deleted_user(Integer file_archive_deleted_user) {
		this.file_archive_deleted_user = file_archive_deleted_user;
	}
	/**
	 * @return the file_archive_deleted_timestamp
	 */
	public String getFile_archive_deleted_timestamp() {
		return file_archive_deleted_timestamp;
	}
	/**
	 * @param file_archive_deleted_timestamp the file_archive_deleted_timestamp to set
	 */
	public void setFile_archive_deleted_timestamp(String file_archive_deleted_timestamp) {
		this.file_archive_deleted_timestamp = file_archive_deleted_timestamp;
	}
	/**
	 * @return the file_archive_deleted_reason
	 */
	public Integer getFile_archive_deleted_reason() {
		return file_archive_deleted_reason;
	}
	/**
	 * @param file_archive_deleted_reason the file_archive_deleted_reason to set
	 */
	public void setFile_archive_deleted_reason(Integer file_archive_deleted_reason) {
		this.file_archive_deleted_reason = file_archive_deleted_reason;
	}
	/**
	 * @return the file_archive_size
	 */
	public Integer getFile_archive_size() {
		return file_archive_size;
	}
	/**
	 * @param file_archive_size the file_archive_size to set
	 */
	public void setFile_archive_size(Integer file_archive_size) {
		this.file_archive_size = file_archive_size;
	}
	/**
	 * @return the file_archive_width
	 */
	public Integer getFile_archive_width() {
		return file_archive_width;
	}
	/**
	 * @param file_archive_width the file_archive_width to set
	 */
	public void setFile_archive_width(Integer file_archive_width) {
		this.file_archive_width = file_archive_width;
	}
	/**
	 * @return the file_archive_height
	 */
	public Integer getFile_archive_height() {
		return file_archive_height;
	}
	/**
	 * @param file_archive_height the file_archive_height to set
	 */
	public void setFile_archive_height(Integer file_archive_height) {
		this.file_archive_height = file_archive_height;
	}
	/**
	 * @return the file_archive_metadata
	 */
	public Integer getFile_archive_metadata() {
		return file_archive_metadata;
	}
	/**
	 * @param file_archive_metadata the file_archive_metadata to set
	 */
	public void setFile_archive_metadata(Integer file_archive_metadata) {
		this.file_archive_metadata = file_archive_metadata;
	}
	/**
	 * @return the file_archive_bits
	 */
	public Integer getFile_archive_bits() {
		return file_archive_bits;
	}
	/**
	 * @param file_archive_bits the file_archive_bits to set
	 */
	public void setFile_archive_bits(Integer file_archive_bits) {
		this.file_archive_bits = file_archive_bits;
	}
	/**
	 * @return the file_archive_media_type
	 */
	public Integer getFile_archive_media_type() {
		return file_archive_media_type;
	}
	/**
	 * @param file_archive_media_type the file_archive_media_type to set
	 */
	public void setFile_archive_media_type(Integer file_archive_media_type) {
		this.file_archive_media_type = file_archive_media_type;
	}
	/**
	 * @return the file_archive_major_mime
	 */
	public Integer getFile_archive_major_mime() {
		return file_archive_major_mime;
	}
	/**
	 * @param file_archive_major_mime the file_archive_major_mime to set
	 */
	public void setFile_archive_major_mime(Integer file_archive_major_mime) {
		this.file_archive_major_mime = file_archive_major_mime;
	}
	/**
	 * @return the file_archive_minor_mime
	 */
	public Integer getFile_archive_minor_mime() {
		return file_archive_minor_mime;
	}
	/**
	 * @param file_archive_minor_mime the file_archive_minor_mime to set
	 */
	public void setFile_archive_minor_mime(Integer file_archive_minor_mime) {
		this.file_archive_minor_mime = file_archive_minor_mime;
	}
	/**
	 * @return the file_archive_user
	 */
	public Integer getFile_archive_user() {
		return file_archive_user;
	}
	/**
	 * @param file_archive_user the file_archive_user to set
	 */
	public void setFile_archive_user(Integer file_archive_user) {
		this.file_archive_user = file_archive_user;
	}
	/**
	 * @return the file_archive_timestamp
	 */
	public String getFile_archive_timestamp() {
		return file_archive_timestamp;
	}
	/**
	 * @param file_archive_timestamp the file_archive_timestamp to set
	 */
	public void setFile_archive_timestamp(String file_archive_timestamp) {
		this.file_archive_timestamp = file_archive_timestamp;
	}
	/**
	 * @return the file_archive_deleted
	 */
	public Integer getFile_archive_deleted() {
		return file_archive_deleted;
	}
	/**
	 * @param file_archive_deleted the file_archive_deleted to set
	 */
	public void setFile_archive_deleted(Integer file_archive_deleted) {
		this.file_archive_deleted = file_archive_deleted;
	}
}
