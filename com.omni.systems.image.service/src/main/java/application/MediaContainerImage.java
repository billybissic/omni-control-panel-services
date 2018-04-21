package application;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MediaContainerImage {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer media_container_image_id;
	private Integer media_image_id;
	private Integer media_width;
	private Integer media_height;
	
	public Integer getMedia_container_image_id() {
		return media_container_image_id;
	}
	public void setMedia_container_image_id(Integer media_container_image_id) {
		this.media_container_image_id = media_container_image_id;
	}
	public Integer getMedia_image_id() {
		return media_image_id;
	}
	public void setMedia_image_id(Integer media_image_id) {
		this.media_image_id = media_image_id;
	}
	public Integer getMedia_width() {
		return media_width;
	}
	public void setMedia_width(Integer media_width) {
		this.media_width = media_width;
	}
	public Integer getMedia_height() {
		return media_height;
	}
	public void setMedia_height(Integer media_height) {
		this.media_height = media_height;
	}
}
