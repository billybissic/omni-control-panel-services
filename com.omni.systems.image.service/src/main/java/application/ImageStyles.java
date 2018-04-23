package application;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ImageStyles {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer image_style_id;
	private String image_style_name;
	
	public Integer getImage_style_id() {
		return image_style_id;
	}
	public void setImage_style_id(Integer image_style_id) {
		this.image_style_id = image_style_id;
	}
	public String getImage_style_name() {
		return image_style_name;
	}
	public void setImage_style_name(String image_style_name) {
		this.image_style_name = image_style_name;
	}
}
