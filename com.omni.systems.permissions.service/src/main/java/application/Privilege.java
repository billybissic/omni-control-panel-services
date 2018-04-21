package application;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Privilege {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer privilege_id;
	private  String privilege;
	private  String privilege_description;
	
	/**
	 * @return the privilege_id
	 */
	public Integer getPrivilege_id() {
		return privilege_id;
	}
	/**
	 * @param privilege_id the privilege_id to set
	 */
	public void setPrivilege_id(Integer privilege_id) {
		this.privilege_id = privilege_id;
	}
	/**
	 * @return the privilege
	 */
	public String getPrivilege() {
		return privilege;
	}
	/**
	 * @param privilege the privilege to set
	 */
	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}
	/**
	 * @return the privilege_description
	 */
	public String getPrivilege_description() {
		return privilege_description;
	}
	/**
	 * @param privilege_description the privilege_description to set
	 */
	public void setPrivilege_description(String privilege_description) {
		this.privilege_description = privilege_description;
	}
}
