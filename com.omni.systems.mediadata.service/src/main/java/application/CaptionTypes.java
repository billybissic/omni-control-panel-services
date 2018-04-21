package application;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CaptionTypes {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer caption_type_id; 
	private String caption_type_name; 
	private String caption_type_description;
	
	/**
	 * @return the caption_type_id
	 */
	public Integer getCaption_type_id() {
		return caption_type_id;
	}
	/**
	 * @param caption_type_id the caption_type_id to set
	 */
	public void setCaption_type_id(Integer caption_type_id) {
		this.caption_type_id = caption_type_id;
	}
	/**
	 * @return the caption_type_name
	 */
	public String getCaption_type_name() {
		return caption_type_name;
	}
	/**
	 * @param caption_type_name the caption_type_name to set
	 */
	public void setCaption_type_name(String caption_type_name) {
		this.caption_type_name = caption_type_name;
	}
	/**
	 * @return the caption_type_description
	 */
	public String getCaption_type_description() {
		return caption_type_description;
	}
	/**
	 * @param caption_type_description the caption_type_description to set
	 */
	public void setCaption_type_description(String caption_type_description) {
		this.caption_type_description = caption_type_description;
	}
}
