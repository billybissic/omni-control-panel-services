package application;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GroupRoles {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer group_id;
	private Integer role_id;
	/**
	 * @return the group_id
	 */
	public Integer getGroup_id() {
		return group_id;
	}
	/**
	 * @param group_id the group_id to set
	 */
	public void setGroup_id(Integer group_id) {
		this.group_id = group_id;
	}
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
}
