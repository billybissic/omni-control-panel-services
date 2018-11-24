package application.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GalleryOrderType {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="gallery_order_type_id")
	private Integer id;
	private String gallery_order_type_name;
	private String gallery_order_type_description;
	private Integer gallery_order_direction_id;
	private Integer gallery_order_category_id;
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the gallery_order_type_name
	 */
	public String getGallery_order_type_name() {
		return gallery_order_type_name;
	}
	/**
	 * @param gallery_order_type_name the gallery_order_type_name to set
	 */
	public void setGallery_order_type_name(String gallery_order_type_name) {
		this.gallery_order_type_name = gallery_order_type_name;
	}
	/**
	 * @return the gallery_order_type_description
	 */
	public String getGallery_order_type_description() {
		return gallery_order_type_description;
	}
	/**
	 * @param gallery_order_type_description the gallery_order_type_description to set
	 */
	public void setGallery_order_type_description(String gallery_order_type_description) {
		this.gallery_order_type_description = gallery_order_type_description;
	}
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
	 * @return the gallery_order_category_id
	 */
	public Integer getGallery_order_category_id() {
		return gallery_order_category_id;
	}
	/**
	 * @param gallery_order_category_id the gallery_order_category_id to set
	 */
	public void setGallery_order_category_id(Integer gallery_order_category_id) {
		this.gallery_order_category_id = gallery_order_category_id;
	}
}
