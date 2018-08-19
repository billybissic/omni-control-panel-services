package application.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ContainerAttributes {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer container_attributes_id;
	private Integer container_id;
	private Integer container_order_type;
	private Integer container_permissions_id;
	private Integer container_type_id;
	private Integer display_object_id;
	
	/**
	 * @return the container_attributes_id
	 */
	public Integer getContainer_attributes_id() {
		return container_attributes_id;
	}
	/**
	 * @param container_attributes_id the container_attributes_id to set
	 */
	public void setContainer_attributes_id(Integer container_attributes_id) {
		this.container_attributes_id = container_attributes_id;
	}
	/**
	 * @return the container_id
	 */
	public Integer getContainer_id() {
		return container_id;
	}
	/**
	 * @param container_id the container_id to set
	 */
	public void setContainer_id(Integer container_id) {
		this.container_id = container_id;
	}
	/**
	 * @return the container_order_type
	 */
	public Integer getContainer_order_type() {
		return container_order_type;
	}
	/**
	 * @param container_order_type the container_order_type to set
	 */
	public void setContainer_order_type(Integer container_order_type) {
		this.container_order_type = container_order_type;
	}
	/**
	 * @return the container_permissions_id
	 */
	public Integer getContainer_permissions_id() {
		return container_permissions_id;
	}
	/**
	 * @param container_permissions_id the container_permissions_id to set
	 */
	public void setContainer_permissions_id(Integer container_permissions_id) {
		this.container_permissions_id = container_permissions_id;
	}
	/**
	 * @return the container_type_id
	 */
	public Integer getContainer_type_id() {
		return container_type_id;
	}
	/**
	 * @param container_type_id the container_type_id to set
	 */
	public void setContainer_type_id(Integer container_type_id) {
		this.container_type_id = container_type_id;
	}
	/**
	 * @return the display_object_id
	 */
	public Integer getDisplay_object_id() {
		return display_object_id;
	}
	/**
	 * @param display_object_id the display_object_id to set
	 */
	public void setDisplay_object_id(Integer display_object_id) {
		this.display_object_id = display_object_id;
	}
	
}
