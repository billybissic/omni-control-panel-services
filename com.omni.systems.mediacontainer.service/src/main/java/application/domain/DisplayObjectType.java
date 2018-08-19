package application.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DisplayObjectType {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer display_object_type_id;
	private String display_object_type;
	private String display_object_description;
	
	public Integer getDisplay_object_type_id() {
		return display_object_type_id;
	}
	public void setDisplay_object_type_id(Integer display_object_type_id) {
		this.display_object_type_id = display_object_type_id;
	}
	public String getDisplay_object_type() {
		return display_object_type;
	}
	public void setDisplay_object_type(String display_object_type) {
		this.display_object_type = display_object_type;
	}
	public String getDisplay_object_description() {
		return display_object_description;
	}
	public void setDisplay_object_description(String display_object_description) {
		this.display_object_description = display_object_description;
	}
}
