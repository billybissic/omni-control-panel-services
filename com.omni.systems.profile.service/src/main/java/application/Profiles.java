package application;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Profiles {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer profile_id; 
	private Integer uuid; 
	private String gender; 
	private String birthdate; 
	private Integer creator; 
	private String date_created; 
	private Integer changed_by; 
	private String date_changed; 
	private Integer voided; 
	private String voided_by; 
	private String date_voided; 
	private String void_reason; 
	private Integer notify_user_on_password_change;
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
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the birthdate
	 */
	public String getBirthdate() {
		return birthdate;
	}
	/**
	 * @param birthdate the birthdate to set
	 */
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
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
	public String getVoided_by() {
		return voided_by;
	}
	/**
	 * @param voided_by the voided_by to set
	 */
	public void setVoided_by(String voided_by) {
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
	 * @return the notify_user_on_password_change
	 */
	public Integer getNotify_user_on_password_change() {
		return notify_user_on_password_change;
	}
	/**
	 * @param notify_user_on_password_change the notify_user_on_password_change to set
	 */
	public void setNotify_user_on_password_change(Integer notify_user_on_password_change) {
		this.notify_user_on_password_change = notify_user_on_password_change;
	}
	
}
