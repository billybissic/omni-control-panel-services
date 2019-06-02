/**
-* MIT License
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

@Document(collection="bartender_applications")
public class BartenderApplication {
	
	@Id 
	private String _id;
	private String firstName;
	private String lastName;
	private EmployeeAddress employeeAddress;
	private EmployeeInformation employeeInformation;
	private EmployeeEmploymentPosition employeeEmploymentPosition;
	private Iterable<EmployeeEducation> employeeEducation;
	private Iterable<EmployeeHistory> employeeHistory;
	private Iterable<EmployeeReference> employeeReferences;
	private EmployeeSignature employeeSignature;
	private Integer applicationStatus;
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
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the employeeAddress
	 */
	public EmployeeAddress getEmployeeAddress() {
		return employeeAddress;
	}
	/**
	 * @param employeeAddress the employeeAddress to set
	 */
	public void setEmployeeAddress(EmployeeAddress employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	/**
	 * @return the employeeInformation
	 */
	public EmployeeInformation getEmployeeInformation() {
		return employeeInformation;
	}
	/**
	 * @param employeeInformation the employeeInformation to set
	 */
	public void setEmployeeInformation(EmployeeInformation employeeInformation) {
		this.employeeInformation = employeeInformation;
	}
	/**
	 * @return the employeeEmploymentPosition
	 */
	public EmployeeEmploymentPosition getEmployeeEmploymentPosition() {
		return employeeEmploymentPosition;
	}
	/**
	 * @param employeeEmploymentPosition the employeeEmploymentPosition to set
	 */
	public void setEmployeeEmploymentPosition(EmployeeEmploymentPosition employeeEmploymentPosition) {
		this.employeeEmploymentPosition = employeeEmploymentPosition;
	}
	/**
	 * @return the employeeEducation
	 */
	public Iterable<EmployeeEducation> getEmployeeEducation() {
		return employeeEducation;
	}
	/**
	 * @param employeeEducation the employeeEducation to set
	 */
	public void setEmployeeEducation(Iterable<EmployeeEducation> employeeEducation) {
		this.employeeEducation = employeeEducation;
	}
	/**
	 * @return the employeeHistory
	 */
	public Iterable<EmployeeHistory> getEmployeeHistory() {
		return employeeHistory;
	}
	/**
	 * @param employeeHistory the employeeHistory to set
	 */
	public void setEmployeeHistory(Iterable<EmployeeHistory> employeeHistory) {
		this.employeeHistory = employeeHistory;
	}
	/**
	 * @return the employeeReferences
	 */
	public Iterable<EmployeeReference> getEmployeeReferences() {
		return employeeReferences;
	}
	/**
	 * @param employeeReferences the employeeReferences to set
	 */
	public void setEmployeeReferences(Iterable<EmployeeReference> employeeReferences) {
		this.employeeReferences = employeeReferences;
	}
	/**
	 * @return the employeeSignature
	 */
	public EmployeeSignature getEmployeeSignature() {
		return employeeSignature;
	}
	/**
	 * @param employeeSignature the employeeSignature to set
	 */
	public void setEmployeeSignature(EmployeeSignature employeeSignature) {
		this.employeeSignature = employeeSignature;
	}
	/**
	 * @return the applicationStatus
	 */
	public Integer getApplicationStatus() {
		return applicationStatus;
	}
	/**
	 * @param applicationStatus the applicationStatus to set
	 */
	public void setApplicationStatus(Integer applicationStatus) {
		this.applicationStatus = applicationStatus;
	}
	
	
}
