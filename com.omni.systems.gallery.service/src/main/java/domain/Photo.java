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
package domain;

/**
 * @author Billy Bissic
 *
 */
public class Photo {
	private String file_name;
	private String upload_directory;
	private Integer photo_storage_id;
	private String photo_storage_name;
	
	/**
	 * @return the file_name
	 */
	public String getFile_name() {
		return file_name;
	}
	/**
	 * @param file_name the file_name to set
	 */
	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}
	/**
	 * @return the upload_directory
	 */
	public String getUpload_directory() {
		return upload_directory;
	}
	/**
	 * @param upload_directory the upload_directory to set
	 */
	public void setUpload_directory(String upload_directory) {
		this.upload_directory = upload_directory;
	}
	/**
	 * @return the photo_storage_id
	 */
	public Integer getPhoto_storage_id() {
		return photo_storage_id;
	}
	/**
	 * @param photo_storage_id the photo_storage_id to set
	 */
	public void setPhoto_storage_id(Integer photo_storage_id) {
		this.photo_storage_id = photo_storage_id;
	}
	/**
	 * @return the photo_storage_name
	 */
	public String getPhoto_storage_name() {
		return photo_storage_name;
	}
	/**
	 * @param photo_storage_name the photo_storage_name to set
	 */
	public void setPhoto_storage_name(String photo_storage_name) {
		this.photo_storage_name = photo_storage_name;
	}
}
