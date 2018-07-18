package application;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ContactTimes {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer contact_timeframe_id;
	private String contact_timeframe;
	private String contact_timeframe_description;
	
	public Integer getContact_timeframe_id() {
		return contact_timeframe_id;
	}
	public void setContact_timeframe_id(Integer contact_timeframe_id) {
		this.contact_timeframe_id = contact_timeframe_id;
	}
	public String getContact_timeframe() {
		return contact_timeframe;
	}
	public void setContact_timeframe(String contact_timeframe) {
		this.contact_timeframe = contact_timeframe;
	}
	public String getContact_timeframe_description() {
		return contact_timeframe_description;
	}
	public void setContact_timeframe_description(String contact_timeframe_description) {
		this.contact_timeframe_description = contact_timeframe_description;
	}
}
