package application.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ImageEffects {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer image_effect_id;
	private Integer image_style_id;
	private String image_effect_name;
	private String image_effect_description;
	
	/**
	 * @return the image_effects_id
	 */
	public Integer getImage_effect_id() {
		return image_effect_id;
	}
	/**
	 * @param image_effects_id the image_effects_id to set
	 */
	public void setImage_effect_id(Integer image_effects_id) {
		this.image_effect_id = image_effects_id;
	}
	/**
	 * @return the image_style_id
	 */
	public Integer getImage_style_id() {
		return image_style_id;
	}
	/**
	 * @param image_style_id the image_style_id to set
	 */
	public void setImage_style_id(Integer image_style_id) {
		this.image_style_id = image_style_id;
	}
	/**
	 * @return the image_effect_name
	 */
	public String getImage_effect_name() {
		return image_effect_name;
	}
	/**
	 * @param image_effect_name the image_effect_name to set
	 */
	public void setImage_effect_name(String image_effect_name) {
		this.image_effect_name = image_effect_name;
	}
	/**
	 * @return the image_effect_description
	 */
	public String getImage_effect_description() {
		return image_effect_description;
	}
	/**
	 * @param image_effect_description the image_effect_description to set
	 */
	public void setImage_effect_description(String image_effect_description) {
		this.image_effect_description = image_effect_description;
	}
}
