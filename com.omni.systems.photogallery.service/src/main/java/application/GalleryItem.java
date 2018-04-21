package application;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GalleryItem {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer gallery_item_id;
	private String title;
	private Integer caption_id;
	private String description;
	private String keywords;
	private Integer layout_order_number;
	private String order_by;
	private String order_direction;
	private String order_weight;
	private Integer item_type_id;
	private Integer mime_type_id;
	private Integer uuid;
	private Integer gallery_object_type_id;
	private Integer gallery_container_id;
	
	public Integer getGallery_item_id() {
		return gallery_item_id;
	}
	public void setGallery_item_id(Integer gallery_item_id) {
		this.gallery_item_id = gallery_item_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getCaption_id() {
		return caption_id;
	}
	public void setCaption_id(Integer caption_id) {
		this.caption_id = caption_id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public Integer getLayout_order_number() {
		return layout_order_number;
	}
	public void setLayout_order_number(Integer layout_order_number) {
		this.layout_order_number = layout_order_number;
	}
	public String getOrder_by() {
		return order_by;
	}
	public void setOrder_by(String order_by) {
		this.order_by = order_by;
	}
	public String getOrder_direction() {
		return order_direction;
	}
	public void setOrder_direction(String order_direction) {
		this.order_direction = order_direction;
	}
	public String getOrder_weight() {
		return order_weight;
	}
	public void setOrder_weight(String order_weight) {
		this.order_weight = order_weight;
	}
	public Integer getItem_type_id() {
		return item_type_id;
	}
	public void setItem_type_id(Integer item_type_id) {
		this.item_type_id = item_type_id;
	}
	public Integer getMime_type_id() {
		return mime_type_id;
	}
	public void setMime_type_id(Integer mime_type_id) {
		this.mime_type_id = mime_type_id;
	}
	public Integer getUuid() {
		return uuid;
	}
	public void setUuid(Integer uuid) {
		this.uuid = uuid;
	}
	public Integer getGallery_object_type_id() {
		return gallery_object_type_id;
	}
	public void setGallery_object_type_id(Integer gallery_object_type_id) {
		this.gallery_object_type_id = gallery_object_type_id;
	}
	public Integer getGallery_container_id() {
		return gallery_container_id;
	}
	public void setGallery_container_id(Integer gallery_container_id) {
		this.gallery_container_id = gallery_container_id;
	}
}
