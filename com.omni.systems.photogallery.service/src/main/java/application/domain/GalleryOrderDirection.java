package application.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GalleryOrderDirection {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer gallery_order_direction_id;
	private String gallery_order_direction_name;
	private String gallery_order_direction_description;
	
	/**
	 * @return the gallery_order_direction_id
	 */
	public Integer getGallery_order_direction_id() {
		return gallery_order_direction_id;
	}
	/**
	 * @param gallery_order_direction_id the gallery_order_direction_id to set
	 */
	public void setGallery_order_direction_id(Integer gallery_order_direction_id) {
		this.gallery_order_direction_id = gallery_order_direction_id;
	}
	/**
	 * @return the gallery_order_direction_name
	 */
	public String getGallery_order_direction_name() {
		return gallery_order_direction_name;
	}
	/**
	 * @param gallery_order_direction_name the gallery_order_direction_name to set
	 */
	public void setGallery_order_direction_name(String gallery_order_direction_name) {
		this.gallery_order_direction_name = gallery_order_direction_name;
	}
	/**
	 * @return the gallery_order_direction_description
	 */
	public String getGallery_order_direction_description() {
		return gallery_order_direction_description;
	}
	/**
	 * @param gallery_order_direction_description the gallery_order_direction_description to set
	 */
	public void setGallery_order_direction_description(String gallery_order_direction_description) {
		this.gallery_order_direction_description = gallery_order_direction_description;
	}
}
