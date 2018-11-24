package application.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GalleryOrderCategory {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "gallery_order_category_id")
	private Integer id;
	private String gallery_order_category_name;
	private String gallery_order_category_description;
	
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
	 * @return the gallery_order_category_name
	 */
	public String getGallery_order_category_name() {
		return gallery_order_category_name;
	}
	/**
	 * @param gallery_order_category_name the gallery_order_category_name to set
	 */
	public void setGallery_order_category_name(String gallery_order_category_name) {
		this.gallery_order_category_name = gallery_order_category_name;
	}
	/**
	 * @return the gallery_order_category_description
	 */
	public String getGallery_order_category_description() {
		return gallery_order_category_description;
	}
	/**
	 * @param gallery_order_category_description the gallery_order_category_description to set
	 */
	public void setGallery_order_category_description(String gallery_order_category_description) {
		this.gallery_order_category_description = gallery_order_category_description;
	}
}
