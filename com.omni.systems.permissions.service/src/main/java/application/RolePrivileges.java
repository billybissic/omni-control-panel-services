package application;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RolePrivileges {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer role_id;
	private Integer privilege_id;
	
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
}
