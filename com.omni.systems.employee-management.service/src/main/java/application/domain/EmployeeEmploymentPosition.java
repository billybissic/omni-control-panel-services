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

/**
 * @author Billy Bissic
 *
 */

public class EmployeeEmploymentPosition {

	private String employmentPositionType;
	private String availableStartDate;
	private String desiredPay;
	private String employmentArrangementType;
	
	/**
	 * @return the employmentPositionType
	 */
	public String getEmploymentPositionType() {
		return employmentPositionType;
	}
	/**
	 * @param employmentPositionType the employmentPositionType to set
	 */
	public void setEmploymentPositionType(String employmentPositionType) {
		this.employmentPositionType = employmentPositionType;
	}
	/**
	 * @return the availableStartDate
	 */
	public String getAvailableStartDate() {
		return availableStartDate;
	}
	/**
	 * @param availableStartDate the availableStartDate to set
	 */
	public void setAvailableStartDate(String availableStartDate) {
		this.availableStartDate = availableStartDate;
	}
	/**
	 * @return the desiredPay
	 */
	public String getDesiredPay() {
		return desiredPay;
	}
	/**
	 * @param desiredPay the desiredPay to set
	 */
	public void setDesiredPay(String desiredPay) {
		this.desiredPay = desiredPay;
	}
	/**
	 * @return the employmentArrangementType
	 */
	public String getEmploymentArrangementType() {
		return employmentArrangementType;
	}
	/**
	 * @param employmentArrangementType the employmentArrangementType to set
	 */
	public void setEmploymentArrangementType(String employmentArrangementType) {
		this.employmentArrangementType = employmentArrangementType;
	}
}
