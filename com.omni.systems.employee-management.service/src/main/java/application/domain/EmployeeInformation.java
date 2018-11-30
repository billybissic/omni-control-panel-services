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

public class EmployeeInformation {
	
	private String cellPhoneNumber;
	private String homePhoneNumber;
	private String dateOfBirth;
	private String emailAddress;
	private boolean elgibleForEmployment;
	private boolean isUsVeteran;
	private boolean backgrounCheckAgreement;
	
	/**
	 * @return the cellPhoneNumber
	 */
	public String getCellPhoneNumber() {
		return cellPhoneNumber;
	}
	/**
	 * @param cellPhoneNumber the cellPhoneNumber to set
	 */
	public void setCellPhoneNumber(String cellPhoneNumber) {
		this.cellPhoneNumber = cellPhoneNumber;
	}
	/**
	 * @return the homePhoneNumber
	 */
	public String getHomePhoneNumber() {
		return homePhoneNumber;
	}
	/**
	 * @param homePhoneNumber the homePhoneNumber to set
	 */
	public void setHomePhoneNumber(String homePhoneNumber) {
		this.homePhoneNumber = homePhoneNumber;
	}
	/**
	 * @return the dateOfBirth
	 */
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}
	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	/**
	 * @return the elgibleForEmployment
	 */
	public boolean isElgibleForEmployment() {
		return elgibleForEmployment;
	}
	/**
	 * @param elgibleForEmployment the elgibleForEmployment to set
	 */
	public void setElgibleForEmployment(boolean elgibleForEmployment) {
		this.elgibleForEmployment = elgibleForEmployment;
	}
	/**
	 * @return the isUsVeteran
	 */
	public boolean isUsVeteran() {
		return isUsVeteran;
	}
	/**
	 * @param isUsVeteran the isUsVeteran to set
	 */
	public void setUsVeteran(boolean isUsVeteran) {
		this.isUsVeteran = isUsVeteran;
	}
	/**
	 * @return the backgrounCheckAgreement
	 */
	public boolean isBackgrounCheckAgreement() {
		return backgrounCheckAgreement;
	}
	/**
	 * @param backgrounCheckAgreement the backgrounCheckAgreement to set
	 */
	public void setBackgrounCheckAgreement(boolean backgrounCheckAgreement) {
		this.backgrounCheckAgreement = backgrounCheckAgreement;
	}
}
