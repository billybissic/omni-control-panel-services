package application;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Roles {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer role_id;
	private  String role_name;
	private  String role_description;
	
	/**
	 * @return the role_id
	 */
	public Integer getRole_id() {
		return role_id;
	}
	/**
	 * @param role_id the role_id to set
	 */
	public void setRole_id(Integer role_id) {
		this.role_id = role_id;
	}
	/**
	 * @return the role_name
	 */
	public String getRole_name() {
		return role_name;
	}
	/**
	 * @param role_name the role_name to set
	 */
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	/**
	 * @return the role_description
	 */
	public String getRole_description() {
		return role_description;
	}
	/**
	 * @param role_description the role_description to set
	 */
	public void setRole_description(String role_description) {
		this.role_description = role_description;
	}
}
