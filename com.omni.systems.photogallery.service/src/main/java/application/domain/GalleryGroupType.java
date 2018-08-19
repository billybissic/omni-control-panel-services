package application.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GalleryGroupType {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer group_type_id;
	private String group_type_name;
	private String group_type_description;
	
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
	 * @return the group_type_name
	 */
	public String getGroup_type_name() {
		return group_type_name;
	}
	/**
	 * @param group_type_name the group_type_name to set
	 */
	public void setGroup_type_name(String group_type_name) {
		this.group_type_name = group_type_name;
	}
	/**
	 * @return the group_type_description
	 */
	public String getGroup_type_description() {
		return group_type_description;
	}
	/**
	 * @param group_type_description the group_type_description to set
	 */
	public void setGroup_type_description(String group_type_description) {
		this.group_type_description = group_type_description;
	}
}
