package application.domain;

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
	private Integer container_cover_image_id;
	private  String last_changed_timestamp;
	private  String last_changed_by_uuid;
	
	/**
	 * @return the media_container_id
	 */
	public Integer getMedia_container_id() {
		return media_container_id;
	}
	/**
	 * @param media_container_id the media_container_id to set
	 */
	public void setMedia_container_id(Integer media_container_id) {
		this.media_container_id = media_container_id;
	}
	/**
	 * @return the container_permissions_id
	 */
	public Integer getContainer_permissions_id() {
		return container_permissions_id;
	}
	/**
	 * @param container_permissions_id the container_permissions_id to set
	 */
	public void setContainer_permissions_id(Integer container_permissions_id) {
		this.container_permissions_id = container_permissions_id;
	}
	/**
	 * @return the container_order_id
	 */
	public Integer getContainer_order_id() {
		return container_order_id;
	}
	/**
	 * @param container_order_id the container_order_id to set
	 */
	public void setContainer_order_id(Integer container_order_id) {
		this.container_order_id = container_order_id;
	}
	/**
	 * @return the container_width
	 */
	public Integer getContainer_width() {
		return container_width;
	}
	/**
	 * @param container_width the container_width to set
	 */
	public void setContainer_width(Integer container_width) {
		this.container_width = container_width;
	}
	/**
	 * @return the container_height
	 */
	public Integer getContainer_height() {
		return container_height;
	}
	/**
	 * @param container_height the container_height to set
	 */
	public void setContainer_height(Integer container_height) {
		this.container_height = container_height;
	}
	/**
	 * @return the container_type_id
	 */
	public Integer getContainer_type_id() {
		return container_type_id;
	}
	/**
	 * @param container_type_id the container_type_id to set
	 */
	public void setContainer_type_id(Integer container_type_id) {
		this.container_type_id = container_type_id;
	}
	/**
	 * @return the container_mime_type
	 */
	public Integer getContainer_mime_type() {
		return container_mime_type;
	}
	/**
	 * @param container_mime_type the container_mime_type to set
	 */
	public void setContainer_mime_type(Integer container_mime_type) {
		this.container_mime_type = container_mime_type;
	}
	/**
	 * @return the container_cover_image_id
	 */
	public Integer getContainer_cover_image_id() {
		return container_cover_image_id;
	}
	/**
	 * @param container_cover_image_id the container_cover_image_id to set
	 */
	public void setContainer_cover_image_id(Integer container_cover_image_id) {
		this.container_cover_image_id = container_cover_image_id;
	}
	/**
	 * @return the last_changed_timestamp
	 */
	public String getLast_changed_timestamp() {
		return last_changed_timestamp;
	}
	/**
	 * @param last_changed_timestamp the last_changed_timestamp to set
	 */
	public void setLast_changed_timestamp(String last_changed_timestamp) {
		this.last_changed_timestamp = last_changed_timestamp;
	}
	/**
	 * @return the last_changed_by_uuid
	 */
	public String getLast_changed_by_uuid() {
		return last_changed_by_uuid;
	}
	/**
	 * @param last_changed_by_uuid the last_changed_by_uuid to set
	 */
	public void setLast_changed_by_uuid(String last_changed_by_uuid) {
		this.last_changed_by_uuid = last_changed_by_uuid;
	}
}
