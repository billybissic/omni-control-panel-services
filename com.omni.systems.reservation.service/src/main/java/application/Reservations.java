package application;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reservations {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer inquiry_id;
	private Date inquiry_time;
	private String first_name;
	private String last_name;
	private String phone_number;
	private String email_address;
	private Integer partys_number_of_people;
	private String desired_date;
	private String desired_time;
	private Integer contact_time_id;
	private Integer inquiry_type_id;
	private String message;
	
	/**
	 * @return the inquiry_id
	 */
	public Integer getInquiry_id() {
		return inquiry_id;
	}
	/**
	 * @param inquiry_id the inquiry_id to set
	 */
	public void setInquiry_id(Integer inquiry_id) {
		this.inquiry_id = inquiry_id;
	}
	/**
	 * @return the inquiry_time
	 */
	public Date getInquiry_time() {
		return inquiry_time;
	}
	/**
	 * @param inquiry_time the inquiry_time to set
	 */
	public void setInquiry_time(Date inquiry_time) {
		this.inquiry_time = inquiry_time;
	}
	/**
	 * @return the first_name
	 */
	public String getFirst_name() {
		return first_name;
	}
	/**
	 * @param first_name the first_name to set
	 */
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	/**
	 * @return the last_name
	 */
	public String getLast_name() {
		return last_name;
	}
	/**
	 * @param last_name the last_name to set
	 */
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	/**
	 * @return the phone_number
	 */
	public String getPhone_number() {
		return phone_number;
	}
	/**
	 * @param phone_number the phone_number to set
	 */
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	/**
	 * @return the email_address
	 */
	public String getEmail_address() {
		return email_address;
	}
	/**
	 * @param email_address the email_address to set
	 */
	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}
	/**
	 * @return the partys_number_of_people
	 */
	public Integer getPartys_number_of_people() {
		return partys_number_of_people;
	}
	/**
	 * @param partys_number_of_people the partys_number_of_people to set
	 */
	public void setPartys_number_of_people(Integer partys_number_of_people) {
		this.partys_number_of_people = partys_number_of_people;
	}
	/**
	 * @return the desired_date
	 */
	public String getDesired_date() {
		return desired_date;
	}
	/**
	 * @param desired_date the desired_date to set
	 */
	public void setDesired_date(String desired_date) {
		this.desired_date = desired_date;
	}
	/**
	 * @return the desired_time
	 */
	public String getDesired_time() {
		return desired_time;
	}
	/**
	 * @param desired_time the desired_time to set
	 */
	public void setDesired_time(String desired_time) {
		this.desired_time = desired_time;
	}
	/**
	 * @return the contact_time_id
	 */
	public Integer getContact_time_id() {
		return contact_time_id;
	}
	/**
	 * @param contact_time_id the contact_time_id to set
	 */
	public void setContact_time_id(Integer contact_time_id) {
		this.contact_time_id = contact_time_id;
	}
	/**
	 * @return the inquiry_type_id
	 */
	public Integer getInquiry_type_id() {
		return inquiry_type_id;
	}
	/**
	 * @param inquiry_type_id the inquiry_type_id to set
	 */
	public void setInquiry_type_id(Integer inquiry_type_id) {
		this.inquiry_type_id = inquiry_type_id;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
}
