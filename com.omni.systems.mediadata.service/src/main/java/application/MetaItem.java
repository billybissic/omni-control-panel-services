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
	private String title; 
	private String value; 
	private String keywords; 
	private String desc; 
	private String topic; 
	private Integer gallery_type_id; 
	private Integer media_type_id; 
	private Integer media_id; 
	private Integer is_editable; 
	private String date;
	
	public Integer getMeta_item_id() {
		return meta_item_id;
	}
	public void setMeta_item_id(Integer meta_item_id) {
		this.meta_item_id = meta_item_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
}
