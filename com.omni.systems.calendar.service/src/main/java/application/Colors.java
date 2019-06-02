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
package application;

/**
 * @author Billy Bissic
 *
 */
public class Colors {
	
	private String primary_color;
	private String secondary_color;
	
	/**
	 * @return the primary_color
	 */
	public String getPrimary_color() {
		return primary_color;
	}
	/**
	 * @param primary_color the primary_color to set
	 */
	public void setPrimary_color(String primary_color) {
		this.primary_color = primary_color;
	}
	/**
	 * @return the secondary_color
	 */
	public String getSecondary_color() {
		return secondary_color;
	}
	/**
	 * @param secondary_color the secondary_color to set
	 */
	public void setSecondary_color(String secondary_color) {
		this.secondary_color = secondary_color;
	}
}
