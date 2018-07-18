package application;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Subscribers {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer subscriber_id;
	private String first_name;
	private String last_name;
	private String subscriber_email;
	
	public Integer getSubscriber_id() {
		return subscriber_id;
	}
	public void setSubscriber_id(Integer subscriber_id) {
		this.subscriber_id = subscriber_id;
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
	public String getSubscriber_email() {
		return subscriber_email;
	}
	public void setSubscriber_email(String subscriber_email) {
		this.subscriber_email = subscriber_email;
	}
}
