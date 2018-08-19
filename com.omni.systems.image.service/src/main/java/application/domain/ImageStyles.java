package application.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ImageStyles {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer image_style_id;
	private String image_style_name;
	private String image_style_description;
	
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
	 * @return the image_style_name
	 */
	public String getImage_style_name() {
		return image_style_name;
	}
	/**
	 * @param image_style_name the image_style_name to set
	 */
	public void setImage_style_name(String image_style_name) {
		this.image_style_name = image_style_name;
	}
	/**
	 * @return the image_style_description
	 */
	public String getImage_style_description() {
		return image_style_description;
	}
	/**
	 * @param image_style_description the image_style_description to set
	 */
	public void setImage_style_description(String image_style_description) {
		this.image_style_description = image_style_description;
	}
}
