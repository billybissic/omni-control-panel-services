package application;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserAddress {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer profile_address_id; 
	private Integer uuid; 
	private Integer profile_id; 
	private Integer preferred; 
	private String address1; 
	private String address2; 
	private String city_village; 
	private String state_province; 
	private Integer postal_code; 
	private Integer country_code; 
	private Integer latitude; 
	private Integer longitude; 
	private Integer creator; 
	private String date_created; 
	private Integer voided; 
	private String date_voided; 
	private String country_district; 
	private String region; 
	private String township_division;
	
	/**
	 * @return the profile_address_id
	 */
	public Integer getProfile_address_id() {
		return profile_address_id;
	}
	/**
	 * @param profile_address_id the profile_address_id to set
	 */
	public void setProfile_address_id(Integer profile_address_id) {
		this.profile_address_id = profile_address_id;
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
	 * @return the preferred
	 */
	public Integer getPreferred() {
		return preferred;
	}
	/**
	 * @param preferred the preferred to set
	 */
	public void setPreferred(Integer preferred) {
		this.preferred = preferred;
	}
	/**
	 * @return the address1
	 */
	public String getAddress1() {
		return address1;
	}
	/**
	 * @param address1 the address1 to set
	 */
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	/**
	 * @return the address2
	 */
	public String getAddress2() {
		return address2;
	}
	/**
	 * @param address2 the address2 to set
	 */
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	/**
	 * @return the city_village
	 */
	public String getCity_village() {
		return city_village;
	}
	/**
	 * @param city_village the city_village to set
	 */
	public void setCity_village(String city_village) {
		this.city_village = city_village;
	}
	/**
	 * @return the state_province
	 */
	public String getState_province() {
		return state_province;
	}
	/**
	 * @param state_province the state_province to set
	 */
	public void setState_province(String state_province) {
		this.state_province = state_province;
	}
	/**
	 * @return the postal_code
	 */
	public Integer getPostal_code() {
		return postal_code;
	}
	/**
	 * @param postal_code the postal_code to set
	 */
	public void setPostal_code(Integer postal_code) {
		this.postal_code = postal_code;
	}
	/**
	 * @return the country_code
	 */
	public Integer getCountry_code() {
		return country_code;
	}
	/**
	 * @param country_code the country_code to set
	 */
	public void setCountry_code(Integer country_code) {
		this.country_code = country_code;
	}
	/**
	 * @return the latitude
	 */
	public Integer getLatitude() {
		return latitude;
	}
	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(Integer latitude) {
		this.latitude = latitude;
	}
	/**
	 * @return the longitude
	 */
	public Integer getLongitude() {
		return longitude;
	}
	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(Integer longitude) {
		this.longitude = longitude;
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
	 * @return the country_district
	 */
	public String getCountry_district() {
		return country_district;
	}
	/**
	 * @param country_district the country_district to set
	 */
	public void setCountry_district(String country_district) {
		this.country_district = country_district;
	}
	/**
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}
	/**
	 * @param region the region to set
	 */
	public void setRegion(String region) {
		this.region = region;
	}
	/**
	 * @return the township_division
	 */
	public String getTownship_division() {
		return township_division;
	}
	/**
	 * @param township_division the township_division to set
	 */
	public void setTownship_division(String township_division) {
		this.township_division = township_division;
	}
}
