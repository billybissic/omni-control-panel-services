package application.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GalleryChildren {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer gallery_relationship_id;
	private Integer child_id;
	private Integer parent_id;
	
	/**
	 * @return the gallery_relationship_id
	 */
	public Integer getGallery_relationship_id() {
		return gallery_relationship_id;
	}
	/**
	 * @param gallery_relationship_id the gallery_relationship_id to set
	 */
	public void setGallery_relationship_id(Integer gallery_relationship_id) {
		this.gallery_relationship_id = gallery_relationship_id;
	}
	/**
	 * @return the child_id
	 */
	public Integer getChild_id() {
		return child_id;
	}
	/**
	 * @param child_id the child_id to set
	 */
	public void setChild_id(Integer child_id) {
		this.child_id = child_id;
	}
	/**
	 * @return the parent_id
	 */
	public Integer getParent_id() {
		return parent_id;
	}
	/**
	 * @param parent_id the parent_id to set
	 */
	public void setParent_id(Integer parent_id) {
		this.parent_id = parent_id;
	}
}
