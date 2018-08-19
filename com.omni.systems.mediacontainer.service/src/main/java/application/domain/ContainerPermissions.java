package application.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ContainerPermissions {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer container_permissions_id;
	private String container_permissions_desc;
	private String container_permissions_name;
	private Integer container_admin;
	private Integer able_to_add_child_container;
	private Integer able_to_add_media_object;
	private Integer able_to_delete_objects;
	private Integer able_to_delete_child_objects;
	private Integer able_to_edit_album;
	private Integer able_to_edit_media_object;
	private Integer able_to_hide_water_mark;
	private Integer able_to_synchronize;
	private Integer able_to_delete_child_container;
	private Boolean is_parent_container;
	private Integer able_to_add_album;
	private Integer able_to_delete_album;
	
	public Integer getContainer_permissions_id() {
		return container_permissions_id;
	}
	public void setContainer_permissions_id(Integer container_permissions_id) {
		this.container_permissions_id = container_permissions_id;
	}
	public String getContainer_permissions_desc() {
		return container_permissions_desc;
	}
	public void setContainer_permissions_desc(String container_permissions_desc) {
		this.container_permissions_desc = container_permissions_desc;
	}
	public String getContainer_permissions_name() {
		return container_permissions_name;
	}
	public void setContainer_permissions_name(String container_permissions_name) {
		this.container_permissions_name = container_permissions_name;
	}
	public Integer getContainer_admin() {
		return container_admin;
	}
	public void setContainer_admin(Integer container_admin) {
		this.container_admin = container_admin;
	}
	public Integer getAble_to_add_child_container() {
		return able_to_add_child_container;
	}
	public void setAble_to_add_child_container(Integer able_to_add_child_container) {
		this.able_to_add_child_container = able_to_add_child_container;
	}
	public Integer getAble_to_add_media_object() {
		return able_to_add_media_object;
	}
	public void setAble_to_add_media_object(Integer able_to_add_media_object) {
		this.able_to_add_media_object = able_to_add_media_object;
	}
	public Integer getAble_to_delete_objects() {
		return able_to_delete_objects;
	}
	public void setAble_to_delete_objects(Integer able_to_delete_objects) {
		this.able_to_delete_objects = able_to_delete_objects;
	}
	public Integer getAble_to_delete_child_objects() {
		return able_to_delete_child_objects;
	}
	public void setAble_to_delete_child_objects(Integer able_to_delete_child_objects) {
		this.able_to_delete_child_objects = able_to_delete_child_objects;
	}
	public Integer getAble_to_edit_album() {
		return able_to_edit_album;
	}
	public void setAble_to_edit_album(Integer able_to_edit_album) {
		this.able_to_edit_album = able_to_edit_album;
	}
	public Integer getAble_to_edit_media_object() {
		return able_to_edit_media_object;
	}
	public void setAble_to_edit_media_object(Integer able_to_edit_media_object) {
		this.able_to_edit_media_object = able_to_edit_media_object;
	}
	public Integer getAble_to_hide_water_mark() {
		return able_to_hide_water_mark;
	}
	public void setAble_to_hide_water_mark(Integer able_to_hide_water_mark) {
		this.able_to_hide_water_mark = able_to_hide_water_mark;
	}
	public Integer getAble_to_synchronize() {
		return able_to_synchronize;
	}
	public void setAble_to_synchronize(Integer able_to_synchronize) {
		this.able_to_synchronize = able_to_synchronize;
	}
	public Integer getAble_to_delete_child_container() {
		return able_to_delete_child_container;
	}
	public void setAble_to_delete_child_container(Integer able_to_delete_child_container) {
		this.able_to_delete_child_container = able_to_delete_child_container;
	}
	public Boolean getIs_parent_container() {
		return is_parent_container;
	}
	public void setIs_parent_container(Boolean is_parent_container) {
		this.is_parent_container = is_parent_container;
	}
	public Integer getAble_to_add_album() {
		return able_to_add_album;
	}
	public void setAble_to_add_album(Integer able_to_add_album) {
		this.able_to_add_album = able_to_add_album;
	}
	public Integer getAble_to_delete_album() {
		return able_to_delete_album;
	}
	public void setAble_to_delete_album(Integer able_to_delete_album) {
		this.able_to_delete_album = able_to_delete_album;
	}
}
