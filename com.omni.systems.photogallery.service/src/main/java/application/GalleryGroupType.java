package application;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GalleryGroupType {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer group_type_id;
	private String group_name;
	private String group_description;
	/**
	 * @return the group_type_id
	 */
	public Integer getGroup_type_id() {
		return group_type_id;
	}
	/**
	 * @param group_type_id the group_type_id to set
	 */
	public void setGroup_type_id(Integer group_type_id) {
		this.group_type_id = group_type_id;
	}
	/**
	 * @return the group_name
	 */
	public String getGroup_name() {
		return group_name;
	}
	/**
	 * @param group_name the group_name to set
	 */
	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}
	/**
	 * @return the group_description
	 */
	public String getGroup_description() {
		return group_description;
	}
	/**
	 * @param group_description the group_description to set
	 */
	public void setGroup_description(String group_description) {
		this.group_description = group_description;
	}	
}
