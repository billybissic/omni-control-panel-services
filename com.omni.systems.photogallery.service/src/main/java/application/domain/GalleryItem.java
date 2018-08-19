package application.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GalleryItem {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer gallery_item_id;
	private Integer gallery_object_type_id;
	private Integer display_object_id;
	private Integer media_type_id;
	private Integer image_id;
	private Integer item_weight;
	private Integer gallery_id;
	private String last_changed_timestamp;
	private Integer last_changed_by_uuid;
	
	/**
	 * @return the gallery_item_id
	 */
	public Integer getGallery_item_id() {
		return gallery_item_id;
	}
	/**
	 * @param gallery_item_id the gallery_item_id to set
	 */
	public void setGallery_item_id(Integer gallery_item_id) {
		this.gallery_item_id = gallery_item_id;
	}
	/**
	 * @return the gallery_object_type_id
	 */
	public Integer getGallery_object_type_id() {
		return gallery_object_type_id;
	}
	/**
	 * @param gallery_object_type_id the gallery_object_type_id to set
	 */
	public void setGallery_object_type_id(Integer gallery_object_type_id) {
		this.gallery_object_type_id = gallery_object_type_id;
	}
	/**
	 * @return the display_object_id
	 */
	public Integer getDisplay_object_id() {
		return display_object_id;
	}
	/**
	 * @param display_object_id the display_object_id to set
	 */
	public void setDisplay_object_id(Integer display_object_id) {
		this.display_object_id = display_object_id;
	}
	/**
	 * @return the media_type_id
	 */
	public Integer getMedia_type_id() {
		return media_type_id;
	}
	/**
	 * @param media_type_id the media_type_id to set
	 */
	public void setMedia_type_id(Integer media_type_id) {
		this.media_type_id = media_type_id;
	}
	/**
	 * @return the image_id
	 */
	public Integer getImage_id() {
		return image_id;
	}
	/**
	 * @param image_id the image_id to set
	 */
	public void setImage_id(Integer image_id) {
		this.image_id = image_id;
	}
	/**
	 * @return the item_weight
	 */
	public Integer getItem_weight() {
		return item_weight;
	}
	/**
	 * @param item_weight the item_weight to set
	 */
	public void setItem_weight(Integer item_weight) {
		this.item_weight = item_weight;
	}
	/**
	 * @return the gallery_id
	 */
	public Integer getGallery_id() {
		return gallery_id;
	}
	/**
	 * @param gallery_id the gallery_id to set
	 */
	public void setGallery_id(Integer gallery_id) {
		this.gallery_id = gallery_id;
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
	public Integer getLast_changed_by_uuid() {
		return last_changed_by_uuid;
	}
	/**
	 * @param last_changed_by_uuid the last_changed_by_uuid to set
	 */
	public void setLast_changed_by_uuid(Integer last_changed_by_uuid) {
		this.last_changed_by_uuid = last_changed_by_uuid;
	}
}
