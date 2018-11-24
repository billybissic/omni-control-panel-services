package application.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GalleryObjectType {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "gallery_object_type_id")
	private Integer id;
	private String gallery_object_type_name;
	private String gallery_object_type_description;
	
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
