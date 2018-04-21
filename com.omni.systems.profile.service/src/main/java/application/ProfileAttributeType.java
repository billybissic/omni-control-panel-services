package application;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProfileAttributeType {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer profile_attritbute_type_id; 
	private String name; 
	private String description; 
	private String format; 
	private String foreign_key; 
	private Integer searchable; 
	private Integer creator; 
	private String date_created; 
	private Integer changed_by; 
	private String date_changed; 
	private String edit_privilege; 
	private Integer uuid; 
	private Integer sort_weight;
	
	public Integer getProfile_attritbute_type_id() {
		return profile_attritbute_type_id;
	}
	public void setProfile_attritbute_type_id(Integer profile_attritbute_type_id) {
		this.profile_attritbute_type_id = profile_attritbute_type_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public String getForeign_key() {
		return foreign_key;
	}
	public void setForeign_key(String foreign_key) {
		this.foreign_key = foreign_key;
	}
	public Integer getSearchable() {
		return searchable;
	}
	public void setSearchable(Integer searchable) {
		this.searchable = searchable;
	}
	public Integer getCreator() {
		return creator;
	}
	public void setCreator(Integer creator) {
		this.creator = creator;
	}
	public String getDate_created() {
		return date_created;
	}
	public void setDate_created(String date_created) {
		this.date_created = date_created;
	}
	public Integer getChanged_by() {
		return changed_by;
	}
	public void setChanged_by(Integer changed_by) {
		this.changed_by = changed_by;
	}
	public String getDate_changed() {
		return date_changed;
	}
	public void setDate_changed(String date_changed) {
		this.date_changed = date_changed;
	}
	public String getEdit_privilege() {
		return edit_privilege;
	}
	public void setEdit_privilege(String edit_privilege) {
		this.edit_privilege = edit_privilege;
	}
	public Integer getUuid() {
		return uuid;
	}
	public void setUuid(Integer uuid) {
		this.uuid = uuid;
	}
	public Integer getSort_weight() {
		return sort_weight;
	}
	public void setSort_weight(Integer sort_weight) {
		this.sort_weight = sort_weight;
	}
}
