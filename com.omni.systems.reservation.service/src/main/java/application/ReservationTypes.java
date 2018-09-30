package application;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ReservationTypes {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer inquiry_type_id;
	private String inquiry_type_name;
	private String inquiry_type_description;
	
	public Integer getInquiry_type_id() {
		return inquiry_type_id;
	}
	public void setInquiry_type_id(Integer inquiry_type_id) {
		this.inquiry_type_id = inquiry_type_id;
	}
	public String getInquiry_type_name() {
		return inquiry_type_name;
	}
	public void setInquiry_type_name(String inquiry_type_name) {
		this.inquiry_type_name = inquiry_type_name;
	}
	public String getInquiry_type_description() {
		return inquiry_type_description;
	}
	public void setInquiry_type_description(String inquiry_type_description) {
		this.inquiry_type_description = inquiry_type_description;
	}
}
