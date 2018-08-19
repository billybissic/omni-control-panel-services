package application.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GalleryOrderCategory {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer gallery_order_category_id;
	private String gallery_order_category_name;
	private String gallery_order_category_description;
	
	public Integer getGallery_order_category_id() {
		return gallery_order_category_id;
	}
	public void setGallery_order_category_id(Integer gallery_order_category_id) {
		this.gallery_order_category_id = gallery_order_category_id;
	}
	public String getGallery_order_category_name() {
		return gallery_order_category_name;
	}
	public void setGallery_order_category_name(String gallery_order_category_name) {
		this.gallery_order_category_name = gallery_order_category_name;
	}
	public String getGallery_order_category_description() {
		return gallery_order_category_description;
	}
	public void setGallery_order_category_description(String gallery_order_category_description) {
		this.gallery_order_category_description = gallery_order_category_description;
	}
}
