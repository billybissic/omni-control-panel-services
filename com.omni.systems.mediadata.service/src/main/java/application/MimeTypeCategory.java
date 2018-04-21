package application;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MimeTypeCategory {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer mime_type_id; 
	private String mime_type; 
	private String mime_description;
	
	public Integer getMime_type_id() {
		return mime_type_id;
	}
	public void setMime_type_id(Integer mime_type_id) {
		this.mime_type_id = mime_type_id;
	}
	public String getMime_type() {
		return mime_type;
	}
	public void setMime_type(String mime_type) {
		this.mime_type = mime_type;
	}
	public String getMime_description() {
		return mime_description;
	}
	public void setMime_description(String mime_description) {
		this.mime_description = mime_description;
	}
}
