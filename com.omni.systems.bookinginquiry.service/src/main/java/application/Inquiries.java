package application;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Inquiries {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer inquiry_id;
	private Date inquiry_time;
	private String first_name;
	private String last_name;
	private String day_phone_number;
	private String email_address;
	private Integer contact_time_id;
	private Integer inquiry_type_id;
	private String message;
	
	public Integer getInquiry_id() {
		return inquiry_id;
	}
	public void setInquiry_id(Integer inquiry_id) {
		this.inquiry_id = inquiry_id;
	}
	public Date getInquiry_time() {
		return inquiry_time;
	}
	public void setInquiry_time(Date inquiry_time) {
		this.inquiry_time = inquiry_time;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getDay_phone_number() {
		return day_phone_number;
	}
	public void setDay_phone_number(String day_phone_number) {
		this.day_phone_number = day_phone_number;
	}
	public String getEmail_address() {
		return email_address;
	}
	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}
	public Integer getContact_time_id() {
		return contact_time_id;
	}
	public void setContact_time_id(Integer contact_time_id) {
		this.contact_time_id = contact_time_id;
	}
	public Integer getInquiry_type_id() {
		return inquiry_type_id;
	}
	public void setInquiry_type_id(Integer inquiry_type_id) {
		this.inquiry_type_id = inquiry_type_id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
