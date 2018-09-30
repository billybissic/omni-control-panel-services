/**
*	MIT License
*
*	Copyright (c) 2018 Billy Bissic
*
*	Permission is hereby granted, free of charge, to any person obtaining a copy
*	of this software and associated documentation files (the "Software"), to deal
*	in the Software without restriction, including without limitation the rights
*	to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
*	copies of the Software, and to permit persons to whom the Software is
*	furnished to do so, subject to the following conditions:
*
*	The above copyright notice and this permission notice shall be included in all
*	copies or substantial portions of the Software.
*
*	THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
*	IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
*	FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
*	AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
*	LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
*	OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
*	SOFTWARE.
**/
package application;

/**
 * @author Billy Bissic
 *
 */
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class InquiryStatus {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer inquiry_status_id;
	private String inquiry_status_name;
	private String inquiry_status_description;
	
	/**
	 * @return the inquiry_status_id
	 */
	public Integer getInquiry_status_id() {
		return inquiry_status_id;
	}
	/**
	 * @param inquiry_status_id the inquiry_status_id to set
	 */
	public void setInquiry_status_id(Integer inquiry_status_id) {
		this.inquiry_status_id = inquiry_status_id;
	}
	/**
	 * @return the inquiry_status_name
	 */
	public String getInquiry_status_name() {
		return inquiry_status_name;
	}
	/**
	 * @param inquiry_status_name the inquiry_status_name to set
	 */
	public void setInquiry_status_name(String inquiry_status_name) {
		this.inquiry_status_name = inquiry_status_name;
	}
	/**
	 * @return the inquiry_status_description
	 */
	public String getInquiry_status_description() {
		return inquiry_status_description;
	}
	/**
	 * @param inquiry_status_description the inquiry_status_description to set
	 */
	public void setInquiry_status_description(String inquiry_status_description) {
		this.inquiry_status_description = inquiry_status_description;
	}
	
}
