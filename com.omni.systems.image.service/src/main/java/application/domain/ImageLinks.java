package application.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ImageLinks {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer image_link_id;
	private String image_url;
	private Integer image_id;
	
	/**
	 * @return the image_link_id
	 */
	public Integer getImage_link_id() {
		return image_link_id;
	}
	/**
	 * @param image_link_id the image_link_id to set
	 */
	public void setImage_link_id(Integer image_link_id) {
		this.image_link_id = image_link_id;
	}
	/**
	 * @return the image_url
	 */
	public String getImage_url() {
		return image_url;
	}
	/**
	 * @param image_url the image_url to set
	 */
	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
	/**
	 * @return the image_id
	 */
	public Integer getImage_id() {
		return image_id;
	}
	/**
	 * @param image_id the image_id to set
	 */
	public void setImage_id(Integer image_id) {
		this.image_id = image_id;
	}
}
