package application.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Files {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer file_id; 
	private  String file_name; 
	private Integer upload_stash_id;
	
	/**
	 * @return the file_id
	 */
	public Integer getFile_id() {
		return file_id;
	}
	/**
	 * @param file_id the file_id to set
	 */
	public void setFile_id(Integer file_id) {
		this.file_id = file_id;
	}
	/**
	 * @return the file_name
	 */
	public String getFile_name() {
		return file_name;
	}
	/**
	 * @param file_name the file_name to set
	 */
	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}
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
}
