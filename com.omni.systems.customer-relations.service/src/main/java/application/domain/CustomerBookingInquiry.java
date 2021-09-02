package application.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomerBookingInquiry {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer booking_inquiry_id;
	private  String first_name;
	private  String last_name;
	private  String primary_phone;
	private  String secondary_phone;
	private  String email;
	private  String preferred_contact;
	private Integer service_type_id;
	private  String personal_message;
	/**
	 * @return the booking_inquiry_id
	 */
	public Integer getBooking_inquiry_id() {
		return booking_inquiry_id;
	}
	/**
	 * @param booking_inquiry_id the booking_inquiry_id to set
	 */
	public void setBooking_inquiry_id(Integer booking_inquiry_id) {
		this.booking_inquiry_id = booking_inquiry_id;
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
	 * @return the primary_phone
	 */
	public String getPrimary_phone() {
		return primary_phone;
	}
	/**
	 * @param primary_phone the primary_phone to set
	 */
	public void setPrimary_phone(String primary_phone) {
		this.primary_phone = primary_phone;
	}
	/**
	 * @return the secondary_phone
	 */
	public String getSecondary_phone() {
		return secondary_phone;
	}
	/**
	 * @param secondary_phone the secondary_phone to set
	 */
	public void setSecondary_phone(String secondary_phone) {
		this.secondary_phone = secondary_phone;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the preferred_contact
	 */
	public String getPreferred_contact() {
		return preferred_contact;
	}
	/**
	 * @param preferred_contact the preferred_contact to set
	 */
	public void setPreferred_contact(String preferred_contact) {
		this.preferred_contact = preferred_contact;
	}
	/**
	 * @return the service_type_id
	 */
	public Integer getService_type_id() {
		return service_type_id;
	}
	/**
	 * @param service_type_id the service_type_id to set
	 */
	public void setService_type_id(Integer service_type_id) {
		this.service_type_id = service_type_id;
	}
	/**
	 * @return the personal_message
	 */
	public String getPersonal_message() {
		return personal_message;
	}
	/**
	 * @param personal_message the personal_message to set
	 */
	public void setPersonal_message(String personal_message) {
		this.personal_message = personal_message;
	}
}
