package application;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Files {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer file_id; 
	private  String file_path; 
	private Integer is_url; 
	private Integer file_type;
	
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
	 * @return the file_path
	 */
	public String getFile_path() {
		return file_path;
	}
	/**
	 * @param file_path the file_path to set
	 */
	public void setFile_path(String file_path) {
		this.file_path = file_path;
	}
	/**
	 * @return the is_url
	 */
	public Integer getIs_url() {
		return is_url;
	}
	/**
	 * @param is_url the is_url to set
	 */
	public void setIs_url(Integer is_url) {
		this.is_url = is_url;
	}
	/**
	 * @return the file_type
	 */
	public Integer getFile_type() {
		return file_type;
	}
	/**
	 * @param file_type the file_type to set
	 */
	public void setFile_type(Integer file_type) {
		this.file_type = file_type;
	}
}
