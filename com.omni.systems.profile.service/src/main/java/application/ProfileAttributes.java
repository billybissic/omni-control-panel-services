package application;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProfileAttributes {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer profile_attribute_id; 
	private Integer profile_attribute_type_id; 
	private String value; 
	private Integer profile_id; 
	private Integer creator; 
	private String date_created; 
	private Integer changed_by; 
	private String date_changed; 
	private Integer voided; 
	private Integer voided_by; 
	private String date_voided; 
	private String void_reason; 
	private Integer uuid;
	/**
	 * @return the profile_attribute_id
	 */
	public Integer getProfile_attribute_id() {
		return profile_attribute_id;
	}
	/**
	 * @param profile_attribute_id the profile_attribute_id to set
	 */
	public void setProfile_attribute_id(Integer profile_attribute_id) {
		this.profile_attribute_id = profile_attribute_id;
	}
	/**
	 * @return the profile_attribute_type_id
	 */
	public Integer getProfile_attribute_type_id() {
		return profile_attribute_type_id;
	}
	/**
	 * @param profile_attribute_type_id the profile_attribute_type_id to set
	 */
	public void setProfile_attribute_type_id(Integer profile_attribute_type_id) {
		this.profile_attribute_type_id = profile_attribute_type_id;
	}
	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
	/**
	 * @return the profile_id
	 */
	public Integer getProfile_id() {
		return profile_id;
	}
	/**
	 * @param profile_id the profile_id to set
	 */
	public void setProfile_id(Integer profile_id) {
		this.profile_id = profile_id;
	}
	/**
	 * @return the creator
	 */
	public Integer getCreator() {
		return creator;
	}
	/**
	 * @param creator the creator to set
	 */
	public void setCreator(Integer creator) {
		this.creator = creator;
	}
	/**
	 * @return the date_created
	 */
	public String getDate_created() {
		return date_created;
	}
	/**
	 * @param date_created the date_created to set
	 */
	public void setDate_created(String date_created) {
		this.date_created = date_created;
	}
	/**
	 * @return the changed_by
	 */
	public Integer getChanged_by() {
		return changed_by;
	}
	/**
	 * @param changed_by the changed_by to set
	 */
	public void setChanged_by(Integer changed_by) {
		this.changed_by = changed_by;
	}
	/**
	 * @return the date_changed
	 */
	public String getDate_changed() {
		return date_changed;
	}
	/**
	 * @param date_changed the date_changed to set
	 */
	public void setDate_changed(String date_changed) {
		this.date_changed = date_changed;
	}
	/**
	 * @return the voided
	 */
	public Integer getVoided() {
		return voided;
	}
	/**
	 * @param voided the voided to set
	 */
	public void setVoided(Integer voided) {
		this.voided = voided;
	}
	/**
	 * @return the voided_by
	 */
	public Integer getVoided_by() {
		return voided_by;
	}
	/**
	 * @param voided_by the voided_by to set
	 */
	public void setVoided_by(Integer voided_by) {
		this.voided_by = voided_by;
	}
	/**
	 * @return the date_voided
	 */
	public String getDate_voided() {
		return date_voided;
	}
	/**
	 * @param date_voided the date_voided to set
	 */
	public void setDate_voided(String date_voided) {
		this.date_voided = date_voided;
	}
	/**
	 * @return the void_reason
	 */
	public String getVoid_reason() {
		return void_reason;
	}
	/**
	 * @param void_reason the void_reason to set
	 */
	public void setVoid_reason(String void_reason) {
		this.void_reason = void_reason;
	}
	/**
	 * @return the uuid
	 */
	public Integer getUuid() {
		return uuid;
	}
	/**
	 * @param uuid the uuid to set
	 */
	public void setUuid(Integer uuid) {
		this.uuid = uuid;
	}
	
}
