package application;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ImageLinks {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer image_link_id;
	private String image_links_from;
	private String image_links_to;
	
	public Integer getImage_link_id() {
		return image_link_id;
	}
	public void setImage_link_id(Integer image_link_id) {
		this.image_link_id = image_link_id;
	}
	public String getImage_links_from() {
		return image_links_from;
	}
	public void setImage_links_from(String image_links_from) {
		this.image_links_from = image_links_from;
	}
	public String getImage_links_to() {
		return image_links_to;
	}
	public void setImage_links_to(String image_links_to) {
		this.image_links_to = image_links_to;
	}
}
