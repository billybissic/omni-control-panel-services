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
public class AlbumType {

	private String _id;
	private String album_type_name;
	private String album_type_description;
	
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
	 * @return the album_type_name
	 */
	public String getAlbum_type_name() {
		return album_type_name;
	}
	/**
	 * @param album_type_name the album_type_name to set
	 */
	public void setAlbum_type_name(String album_type_name) {
		this.album_type_name = album_type_name;
	}
	/**
	 * @return the album_type_description
	 */
	public String getAlbum_type_description() {
		return album_type_description;
	}
	/**
	 * @param album_type_description the album_type_description to set
	 */
	public void setAlbum_type_description(String album_type_description) {
		this.album_type_description = album_type_description;
	}
}
