package application;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserIdentity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer person_id; 
	private Integer user_profile_id; 
	private Integer user_id; 
	private Integer preffered; 
	private String prefix; 
	private String given_name; 
	private String middle_name; 
	private String family_name_prefix; 
	private String family_name; 
	private String family_name2; 
	private String family_name_suffix; 
	private String degree; 
	private String date_created; 
	private Integer voided; 
	private String date_voided; 
	private String void_reason; 
	private String date_changed;
	
	/**
	 * @return the person_id
	 */
	public Integer getPerson_id() {
		return person_id;
	}
	/**
	 * @param person_id the person_id to set
	 */
	public void setPerson_id(Integer person_id) {
		this.person_id = person_id;
	}
	/**
	 * @return the user_profile_id
	 */
	public Integer getUser_profile_id() {
		return user_profile_id;
	}
	/**
	 * @param user_profile_id the user_profile_id to set
	 */
	public void setUser_profile_id(Integer user_profile_id) {
		this.user_profile_id = user_profile_id;
	}
	/**
	 * @return the user_id
	 */
	public Integer getUser_id() {
		return user_id;
	}
	/**
	 * @param user_id the user_id to set
	 */
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	/**
	 * @return the preffered
	 */
	public Integer getPreffered() {
		return preffered;
	}
	/**
	 * @param preffered the preffered to set
	 */
	public void setPreffered(Integer preffered) {
		this.preffered = preffered;
	}
	/**
	 * @return the prefix
	 */
	public String getPrefix() {
		return prefix;
	}
	/**
	 * @param prefix the prefix to set
	 */
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	/**
	 * @return the given_name
	 */
	public String getGiven_name() {
		return given_name;
	}
	/**
	 * @param given_name the given_name to set
	 */
	public void setGiven_name(String given_name) {
		this.given_name = given_name;
	}
	/**
	 * @return the middle_name
	 */
	public String getMiddle_name() {
		return middle_name;
	}
	/**
	 * @param middle_name the middle_name to set
	 */
	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}
	/**
	 * @return the family_name_prefix
	 */
	public String getFamily_name_prefix() {
		return family_name_prefix;
	}
	/**
	 * @param family_name_prefix the family_name_prefix to set
	 */
	public void setFamily_name_prefix(String family_name_prefix) {
		this.family_name_prefix = family_name_prefix;
	}
	/**
	 * @return the family_name
	 */
	public String getFamily_name() {
		return family_name;
	}
	/**
	 * @param family_name the family_name to set
	 */
	public void setFamily_name(String family_name) {
		this.family_name = family_name;
	}
	/**
	 * @return the family_name2
	 */
	public String getFamily_name2() {
		return family_name2;
	}
	/**
	 * @param family_name2 the family_name2 to set
	 */
	public void setFamily_name2(String family_name2) {
		this.family_name2 = family_name2;
	}
	/**
	 * @return the family_name_suffix
	 */
	public String getFamily_name_suffix() {
		return family_name_suffix;
	}
	/**
	 * @param family_name_suffix the family_name_suffix to set
	 */
	public void setFamily_name_suffix(String family_name_suffix) {
		this.family_name_suffix = family_name_suffix;
	}
	/**
	 * @return the degree
	 */
	public String getDegree() {
		return degree;
	}
	/**
	 * @param degree the degree to set
	 */
	public void setDegree(String degree) {
		this.degree = degree;
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
}
