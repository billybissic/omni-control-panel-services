package application.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="gallery_style_type")
public class GalleryStyleType {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="gallery_style_id")
	private Integer id;
	@Column(name="gallery_style_name")
	private String galleryStyleName;
	@Column(name="gallery_style_description")
	private String galleryStyleDescription;
	@Column(name="mime_type_group_id")
	private Integer mimeTypeGroupId;
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the galleryStyleName
	 */
	public String getGalleryStyleName() {
		return galleryStyleName;
	}
	/**
	 * @param galleryStyleName the galleryStyleName to set
	 */
	public void setGalleryStyleName(String galleryStyleName) {
		this.galleryStyleName = galleryStyleName;
	}
	/**
	 * @return the galleryStyleDescription
	 */
	public String getGalleryStyleDescription() {
		return galleryStyleDescription;
	}
	/**
	 * @param galleryStyleDescription the galleryStyleDescription to set
	 */
	public void setGalleryStyleDescription(String galleryStyleDescription) {
		this.galleryStyleDescription = galleryStyleDescription;
	}
	/**
	 * @return the mimeTypeGroupId
	 */
	public Integer getMimeTypeGroupId() {
		return mimeTypeGroupId;
	}
	/**
	 * @param mimeTypeGroupId the mimeTypeGroupId to set
	 */
	public void setMimeTypeGroupId(Integer mimeTypeGroupId) {
		this.mimeTypeGroupId = mimeTypeGroupId;
	}
}
