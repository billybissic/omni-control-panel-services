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

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Billy Bissic
 *
 */

@Document(collection = "menu-items")
public class DynamicMenu {

	@Id private String _id;
	private String menuItemName;
	private String menuItemType;
	private String menuItemDocumentName;
	private String menuItemDocumentType;
	
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
	 * @return the menuItemName
	 */
	public String getMenuItemName() {
		return menuItemName;
	}
	/**
	 * @param menuItemName the menuItemName to set
	 */
	public void setMenuItemName(String menuItemName) {
		this.menuItemName = menuItemName;
	}
	/**
	 * @return the menuItemType
	 */
	public String getMenuItemType() {
		return menuItemType;
	}
	/**
	 * @param menuItemType the menuItemType to set
	 */
	public void setMenuItemType(String menuItemType) {
		this.menuItemType = menuItemType;
	}
	/**
	 * @return the menuItemDocumentName
	 */
	public String getMenuItemDocumentName() {
		return menuItemDocumentName;
	}
	/**
	 * @param menuItemDocumentName the menuItemDocumentName to set
	 */
	public void setMenuItemDocumentName(String menuItemDocumentName) {
		this.menuItemDocumentName = menuItemDocumentName;
	}
	/**
	 * @return the menuItemDocumentType
	 */
	public String getMenuItemDocumentType() {
		return menuItemDocumentType;
	}
	/**
	 * @param menuItemDocumentType the menuItemDocumentType to set
	 */
	public void setMenuItemDocumentType(String menuItemDocumentType) {
		this.menuItemDocumentType = menuItemDocumentType;
	}
}
