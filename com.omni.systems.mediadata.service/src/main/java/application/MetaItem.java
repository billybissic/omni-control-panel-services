package application;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MetaItem {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer meta_item_id; 
	private String meta_item_title; 
	private String meta_item_value; 
	private String meta_item_keywords; 
	private String meta_item_desc; 
	private String meta_item_topic; 
	private Integer gallery_type_id; 
	private Integer media_type_id; 
	private Integer media_id; 
	private Integer is_editable; 
	private String meta_item_date;
	
	public Integer getMeta_item_id() {
		return meta_item_id;
	}
	public void setMeta_item_id(Integer meta_item_id) {
		this.meta_item_id = meta_item_id;
	}
	public String getMeta_item_title() {
		return meta_item_title;
	}
	public void setMeta_item_title(String title) {
		this.meta_item_title = title;
	}
	public String getMeta_item_value() {
		return meta_item_value;
	}
	public void setMeta_item_value(String value) {
		this.meta_item_value = value;
	}
	public String getMeta_item_keywords() {
		return meta_item_keywords;
	}
	public void setMeta_item_keywords(String keywords) {
		this.meta_item_keywords = keywords;
	}
	public String getMeta_item_desc() {
		return meta_item_desc;
	}
	public void setMeta_item_desc(String desc) {
		this.meta_item_desc = desc;
	}
	public String getMeta_item_topic() {
		return meta_item_topic;
	}
	public void setMeta_item_topic(String topic) {
		this.meta_item_topic = topic;
	}
	public Integer getGallery_type_id() {
		return gallery_type_id;
	}
	public void setGallery_type_id(Integer gallery_type_id) {
		this.gallery_type_id = gallery_type_id;
	}
	public Integer getMedia_type_id() {
		return media_type_id;
	}
	public void setMedia_type_id(Integer media_type_id) {
		this.media_type_id = media_type_id;
	}
	public Integer getMedia_id() {
		return media_id;
	}
	public void setMedia_id(Integer media_id) {
		this.media_id = media_id;
	}
	public Integer getIs_editable() {
		return is_editable;
	}
	public void setIs_editable(Integer is_editable) {
		this.is_editable = is_editable;
	}
	public String getMeta_item_date() {
		return meta_item_date;
	}
	public void setMeta_item_date(String date) {
		this.meta_item_date = date;
	}
}
