package application;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Captions {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer caption_id; 
	private Integer language_code; 
	private Integer caption_type_id; 
	private Integer caption_sub_type_id;
	private String caption;
	/**
	 * @return the caption_id
	 */
	public Integer getCaption_id() {
		return caption_id;
	}
	/**
	 * @param caption_id the caption_id to set
	 */
	public void setCaption_id(Integer caption_id) {
		this.caption_id = caption_id;
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
	 * @return the caption_sub_type_id
	 */
	public Integer getCaption_sub_type_id() {
		return caption_sub_type_id;
	}
	/**
	 * @param caption_sub_type_id the caption_sub_type_id to set
	 */
	public void setCaption_sub_type_id(Integer caption_sub_type_id) {
		this.caption_sub_type_id = caption_sub_type_id;
	}
	/**
	 * @return the caption
	 */
	public String getCaption() {
		return caption;
	}
	/**
	 * @param caption the caption to set
	 */
	public void setCaption(String caption) {
		this.caption = caption;
	}
}
