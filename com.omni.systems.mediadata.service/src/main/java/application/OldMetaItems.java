package application;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OldMetaItems {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer old_meta_item_id; 
	private String old_meta_item_title; 
	private String old_meta_item_value; 
	private String old_meta_item_keywords; 
	private String old_meta_item_desc; 
	private String old_meta_item_topic; 
	private Integer old_meta_item_gallery_type_id; 
	private Integer old_meta_item_media_type_id; 
	private Integer old_meta_item_media_id; 
	private Integer old_meta_item_is_editable; 
	private String old_meta_item_date;
	
	public Integer getOld_meta_item_id() {
		return old_meta_item_id;
	}
	public void setOld_meta_item_id(Integer old_meta_item_id) {
		this.old_meta_item_id = old_meta_item_id;
	}
	public String getOld_meta_item_title() {
		return old_meta_item_title;
	}
	public void setOld_meta_item_title(String old_meta_item_title) {
		this.old_meta_item_title = old_meta_item_title;
	}
	public String getOld_meta_item_value() {
		return old_meta_item_value;
	}
	public void setOld_meta_item_value(String old_meta_item_value) {
		this.old_meta_item_value = old_meta_item_value;
	}
	public String getOld_meta_item_keywords() {
		return old_meta_item_keywords;
	}
	public void setOld_meta_item_keywords(String old_meta_item_keywords) {
		this.old_meta_item_keywords = old_meta_item_keywords;
	}
	public String getOld_meta_item_desc() {
		return old_meta_item_desc;
	}
	public void setOld_meta_item_desc(String old_meta_item_desc) {
		this.old_meta_item_desc = old_meta_item_desc;
	}
	public String getOld_meta_item_topic() {
		return old_meta_item_topic;
	}
	public void setOld_meta_item_topic(String old_meta_item_topic) {
		this.old_meta_item_topic = old_meta_item_topic;
	}
	public Integer getOld_meta_item_gallery_type_id() {
		return old_meta_item_gallery_type_id;
	}
	public void setOld_meta_item_gallery_type_id(Integer old_meta_item_gallery_type_id) {
		this.old_meta_item_gallery_type_id = old_meta_item_gallery_type_id;
	}
	public Integer getOld_meta_item_media_type_id() {
		return old_meta_item_media_type_id;
	}
	public void setOld_meta_item_media_type_id(Integer old_meta_item_media_type_id) {
		this.old_meta_item_media_type_id = old_meta_item_media_type_id;
	}
	public Integer getOld_meta_item_media_id() {
		return old_meta_item_media_id;
	}
	public void setOld_meta_item_media_id(Integer old_meta_item_media_id) {
		this.old_meta_item_media_id = old_meta_item_media_id;
	}
	public Integer getOld_meta_item_is_editable() {
		return old_meta_item_is_editable;
	}
	public void setOld_meta_item_is_editable(Integer old_meta_item_is_editable) {
		this.old_meta_item_is_editable = old_meta_item_is_editable;
	}
	public String getOld_meta_item_date() {
		return old_meta_item_date;
	}
	public void setOld_meta_item_date(String old_meta_item_date) {
		this.old_meta_item_date = old_meta_item_date;
	}
}
