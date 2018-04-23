package application;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MediaTypes {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer media_type_id; 
	private String media_type_abbreviation; 
	private String media_type_description; 
	private String media_type_file_extension;
	
	public Integer getMedia_type_id() {
		return media_type_id;
	}
	public void setMedia_type_id(Integer media_type_id) {
		this.media_type_id = media_type_id;
	}
	public String getMedia_type_abbreviation() {
		return media_type_abbreviation;
	}
	public void setMedia_type_abbreviation(String media_type_abbreviation) {
		this.media_type_abbreviation = media_type_abbreviation;
	}
	public String getMedia_type_description() {
		return media_type_description;
	}
	public void setMedia_type_description(String media_type_description) {
		this.media_type_description = media_type_description;
	}
	public String getMedia_type_file_extension() {
		return media_type_file_extension;
	}
	public void setMedia_type_file_extension(String media_type_file_extension) {
		this.media_type_file_extension = media_type_file_extension;
	}
	
}
