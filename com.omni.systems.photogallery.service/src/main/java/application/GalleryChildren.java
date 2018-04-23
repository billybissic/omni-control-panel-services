package application;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GalleryChildren {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer child_id;
	private Integer parent_id;
	
	public Integer getChild_id() {
		return child_id;
	}
	public void setChild_id(Integer child_id) {
		this.child_id = child_id;
	}
	public Integer getParent_id() {
		return parent_id;
	}
	public void setParent_id(Integer parent_id) {
		this.parent_id = parent_id;
	}
}
