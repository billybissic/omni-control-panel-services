package application.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ContainerOrderType {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer container_order_type_id;
	private String container_order_name;
	private String container_order_description;
	
	public Integer getContainer_order_type_id() {
		return container_order_type_id;
	}
	public void setContainer_order_type_id(Integer container_order_type_id) {
		this.container_order_type_id = container_order_type_id;
	}
	public String getContainer_order_name() {
		return container_order_name;
	}
	public void setContainer_order_name(String container_order_name) {
		this.container_order_name = container_order_name;
	}
	public String getContainer_order_description() {
		return container_order_description;
	}
	public void setContainer_order_description(String container_order_description) {
		this.container_order_description = container_order_description;
	}
	
	

}
