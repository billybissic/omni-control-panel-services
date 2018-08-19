package application.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ContainerTypes {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer container_type_id;
	private String container_type_name;
	private String container_type_description;
	
	public Integer getContainer_type_id() {
		return container_type_id;
	}
	public void setContainer_type_id(Integer container_type_id) {
		this.container_type_id = container_type_id;
	}
	public String getContainer_type_name() {
		return container_type_name;
	}
	public void setContainer_type_name(String container_type_name) {
		this.container_type_name = container_type_name;
	}
	public String getContainer_type_description() {
		return container_type_description;
	}
	public void setContainer_type_description(String container_type_description) {
		this.container_type_description = container_type_description;
	}
}
