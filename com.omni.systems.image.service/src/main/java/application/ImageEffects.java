package application;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ImageEffects {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer image_effects_id;
	private Integer image_style_id;
	private Integer weight;
	private String name;
	private String data;
	
	public Integer getImage_effects_id() {
		return image_effects_id;
	}
	public void setImage_effects_id(Integer image_efects_id) {
		this.image_effects_id = image_efects_id;
	}
	public Integer getImage_style_id() {
		return image_style_id;
	}
	public void setImage_style_id(Integer image_style_id) {
		this.image_style_id = image_style_id;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
}
