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

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Billy Bissic
 *
 */
@Document(collection = "gallery_order_category")
public class OrderCategory {
	
	@Id private String _id;
	private String gallery_order_category_name;
	private String gallery_order_category_description;
	
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
	 * @return the gallery_order_category_name
	 */
	public String getGallery_order_category_name() {
		return gallery_order_category_name;
	}
	/**
	 * @param gallery_order_category_name the gallery_order_category_name to set
	 */
	public void setGallery_order_category_name(String gallery_order_category_name) {
		this.gallery_order_category_name = gallery_order_category_name;
	}
	/**
	 * @return the gallery_order_category_description
	 */
	public String getGallery_order_category_description() {
		return gallery_order_category_description;
	}
	/**
	 * @param gallery_order_category_description the gallery_order_category_description to set
	 */
	public void setGallery_order_category_description(String gallery_order_category_description) {
		this.gallery_order_category_description = gallery_order_category_description;
	}
}
