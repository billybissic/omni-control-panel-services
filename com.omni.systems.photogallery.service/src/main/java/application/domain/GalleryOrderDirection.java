package application.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GalleryOrderDirection {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "gallery_order_direction_id")
	private Integer id;
	@Column(name = "gallery_order_direction_name")
	private String galleryOrderDirectionName;
	private String gallery_order_direction_description;
	
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
	 * @return the galleryOrderDirectionName
	 */
	public String getGalleryOrderDirectionName() {
		return galleryOrderDirectionName;
	}
	/**
	 * @param galleryOrderDirectionName the galleryOrderDirectionName to set
	 */
	public void setGalleryOrderDirectionName(String galleryOrderDirectionName) {
		this.galleryOrderDirectionName = galleryOrderDirectionName;
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
