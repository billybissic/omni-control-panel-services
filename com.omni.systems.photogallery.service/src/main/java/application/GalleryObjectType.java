package application;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GalleryObjectType {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer gallery_object_type_id;
	private String gallery_object_type;
	
	public Integer getGallery_object_type_id() {
		return gallery_object_type_id;
	}
	public void setGallery_object_type_id(Integer gallery_object_type_id) {
		this.gallery_object_type_id = gallery_object_type_id;
	}
	public String getGallery_object_type() {
		return gallery_object_type;
	}
	public void setGallery_object_type(String gallery_object_type) {
		this.gallery_object_type = gallery_object_type;
	}
	
	
}
