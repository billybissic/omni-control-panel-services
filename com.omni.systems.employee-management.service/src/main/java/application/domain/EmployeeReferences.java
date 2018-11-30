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

public class EmployeeReferences {

	private String referenceEmployerName;
	private String referencePositionTitle;
	private String referenceCompanyName;
	private String referenceCompanyPhone;
	
	/**
	 * @return the referenceEmployerName
	 */
	public String getReferenceEmployerName() {
		return referenceEmployerName;
	}
	/**
	 * @param referenceEmployerName the referenceEmployerName to set
	 */
	public void setReferenceEmployerName(String referenceEmployerName) {
		this.referenceEmployerName = referenceEmployerName;
	}
	/**
	 * @return the referencePositionTitle
	 */
	public String getReferencePositionTitle() {
		return referencePositionTitle;
	}
	/**
	 * @param referencePositionTitle the referencePositionTitle to set
	 */
	public void setReferencePositionTitle(String referencePositionTitle) {
		this.referencePositionTitle = referencePositionTitle;
	}
	/**
	 * @return the referenceCompanyName
	 */
	public String getReferenceCompanyName() {
		return referenceCompanyName;
	}
	/**
	 * @param referenceCompanyName the referenceCompanyName to set
	 */
	public void setReferenceCompanyName(String referenceCompanyName) {
		this.referenceCompanyName = referenceCompanyName;
	}
	/**
	 * @return the referenceCompanyPhone
	 */
	public String getReferenceCompanyPhone() {
		return referenceCompanyPhone;
	}
	/**
	 * @param referenceCompanyPhone the referenceCompanyPhone to set
	 */
	public void setReferenceCompanyPhone(String referenceCompanyPhone) {
		this.referenceCompanyPhone = referenceCompanyPhone;
	}
}
