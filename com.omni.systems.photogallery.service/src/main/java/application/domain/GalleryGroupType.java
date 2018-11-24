/**
* MIT License
*
* Copyright (c) 2018 Billy Bissic
*
* Permission is hereby granted, free of charge, to any person obtaining a copy
* of this software and associated documentation files (the "Software"), to deal
* in the Software without restriction, including without limitation the rights
* to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
* copies of the Software, and to permit persons to whom the Software is
* furnished to do so, subject to the following conditions:
* 
* The above copyright notice and this permission notice shall be included in all
* copies or substantial portions of the Software.
* 
* THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
* IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
* FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
* AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
* LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
* OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
* SOFTWARE.
**/
package application.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Billy Bissic
 *
 */

@Entity
public class GalleryGroupType {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "group_type_id")
	private Integer id;
	@Column(name = "group_type_name")
	private String galleryGroupTypeName;
	@Column(name= "group_type_description")
	private String galleryGroupTypeDescription;
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
	 * @return the galleryGroupTypeName
	 */
	public String getGalleryGroupTypeName() {
		return galleryGroupTypeName;
	}
	/**
	 * @param galleryGroupTypeName the galleryGroupTypeName to set
	 */
	public void setGalleryGroupTypeName(String galleryGroupTypeName) {
		this.galleryGroupTypeName = galleryGroupTypeName;
	}
	/**
	 * @return the galleryGroupTypeDescription
	 */
	public String getGalleryGroupTypeDescription() {
		return galleryGroupTypeDescription;
	}
	/**
	 * @param galleryGroupTypeDescription the galleryGroupTypeDescription to set
	 */
	public void setGalleryGroupTypeDescription(String galleryGroupTypeDescription) {
		this.galleryGroupTypeDescription = galleryGroupTypeDescription;
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
