package application;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MediaContainer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer media_container_id;
	private Integer container_permissions_id;
	private Integer container_order_id;
	private Integer container_width;
	private Integer container_height;
	private Integer container_type_id;
	private Integer container_mime_type;
	
	public Integer getMedia_container_id() {
		return media_container_id;
	}
	public void setMedia_container_id(Integer media_container_id) {
		this.media_container_id = media_container_id;
	}
	public Integer getContainer_permissions_id() {
		return container_permissions_id;
	}
	public void setContainer_permissions_id(Integer container_permissions_id) {
		this.container_permissions_id = container_permissions_id;
	}
	public Integer getContainer_order_id() {
		return container_order_id;
	}
	public void setContainer_order_id(Integer container_order_id) {
		this.container_order_id = container_order_id;
	}
	public Integer getContainer_width() {
		return container_width;
	}
	public void setContainer_width(Integer container_width) {
		this.container_width = container_width;
	}
	public Integer getContainer_height() {
		return container_height;
	}
	public void setContainer_height(Integer container_height) {
		this.container_height = container_height;
	}
	public Integer getContainer_type_id() {
		return container_type_id;
	}
	public void setContainer_type_id(Integer container_type_id) {
		this.container_type_id = container_type_id;
	}
	public Integer getContainer_mime_type() {
		return container_mime_type;
	}
	public void setContainer_mime_type(Integer container_mime_type) {
		this.container_mime_type = container_mime_type;
	}
}
