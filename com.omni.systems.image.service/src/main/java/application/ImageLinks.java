package application;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ImageLinks {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String image_links_from;
	private String image_links_to;
	
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
