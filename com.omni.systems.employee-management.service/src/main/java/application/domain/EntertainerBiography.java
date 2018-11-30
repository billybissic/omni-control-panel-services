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

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Billy Bissic
 *
 */
@Document(collection="entertainer_biographies")
public class EntertainerBiography {
	private String _id;
	private String entertainerStageName;
	private String bigoraphicalContent;
	private String profileImage;
	
	/**
	 * @return the _id
	 */
	public String get_id() {
		return _id;
	}
	/**
	 * @param _id the _id to set
	 */
	public void set_id(String _id) {
		this._id = _id;
	}
	/**
	 * @return the entertainerStageName
	 */
	public String getEntertainerStageName() {
		return entertainerStageName;
	}
	/**
	 * @param entertainerStageName the entertainerStageName to set
	 */
	public void setEntertainerStageName(String entertainerStageName) {
		this.entertainerStageName = entertainerStageName;
	}
	/**
	 * @return the bigoraphicalContent
	 */
	public String getBigoraphicalContent() {
		return bigoraphicalContent;
	}
	/**
	 * @param bigoraphicalContent the bigoraphicalContent to set
	 */
	public void setBigoraphicalContent(String bigoraphicalContent) {
		this.bigoraphicalContent = bigoraphicalContent;
	}
	/**
	 * @return the profileImage
	 */
	public String getProfileImage() {
		return profileImage;
	}
	/**
	 * @param profileImage the profileImage to set
	 */
	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}
}
