package application.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GalleryObjectType {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer gallery_object_type_id;
	private String gallery_object_type_name;
	private String gallery_object_type_description;
	
	/**
	 * @return the gallery_object_type_id
	 */
	public Integer getGallery_object_type_id() {
		return gallery_object_type_id;
	}
	/**
	 * @param gallery_object_type_id the gallery_object_type_id to set
	 */
	public void setGallery_object_type_id(Integer gallery_object_type_id) {
		this.gallery_object_type_id = gallery_object_type_id;
	}
	/**
	 * @return the gallery_object_type_name
	 */
	public String getGallery_object_type_name() {
		return gallery_object_type_name;
	}
	/**
	 * @param gallery_object_type_name the gallery_object_type_name to set
	 */
	public void setGallery_object_type_name(String gallery_object_type_name) {
		this.gallery_object_type_name = gallery_object_type_name;
	}
	/**
	 * @return the gallery_object_type_description
	 */
	public String getGallery_object_type_description() {
		return gallery_object_type_description;
	}
	/**
	 * @param gallery_object_type_description the gallery_object_type_description to set
	 */
	public void setGallery_object_type_description(String gallery_object_type_description) {
		this.gallery_object_type_description = gallery_object_type_description;
	}
}
