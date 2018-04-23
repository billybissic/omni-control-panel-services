package application;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UsersGroups {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer users_group_id;
	private Integer uuid; 
	private Integer group_id;
	
	/**
	 * @return the users_group_id
	 */
	public Integer getUsers_group_id() {
		return users_group_id;
	}
	/**
	 * @param users_group_id the users_group_id to set
	 */
	public void setUsers_group_id(Integer users_group_id) {
		this.users_group_id = users_group_id;
	}
	/**
	 * @return the uuid
	 */
	public Integer getUuid() {
		return uuid;
	}
	/**
	 * @param uuid the uuid to set
	 */
	public void setUuid(Integer uuid) {
		this.uuid = uuid;
	}
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
}
