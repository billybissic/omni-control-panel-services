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
@Document(collection="entertainer_applications")
public class EntertainerApplication {
	@Id 
	private String _id;
	private String firstName;
	private String lastName;
	private EmployeeAddress employeeAddress;
	private EmployeeInformation employeeInformation;
	private EntertainerInformation entertainerInformation;
	private String employmentArrangementType;
	private String employmentPositionType;
	private Iterable<EntertainerExperience> entertainerExperiences;
	private Iterable<EmployeeReferences> employeeReferences;
	private EmployeeSignature employeeSignatures;
	
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
	 * @return the entertainerInformation
	 */
	public EntertainerInformation getEntertainerInformation() {
		return entertainerInformation;
	}
	/**
	 * @param entertainerInformation the entertainerInformation to set
	 */
	public void setEntertainerInformation(EntertainerInformation entertainerInformation) {
		this.entertainerInformation = entertainerInformation;
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
	 * @return the entertainerExperiences
	 */
	public Iterable<EntertainerExperience> getEntertainerExperiences() {
		return entertainerExperiences;
	}
	/**
	 * @param entertainerExperiences the entertainerExperiences to set
	 */
	public void setEntertainerExperiences(Iterable<EntertainerExperience> entertainerExperiences) {
		this.entertainerExperiences = entertainerExperiences;
	}
	/**
	 * @return the employeeReferences
	 */
	public Iterable<EmployeeReferences> getEmployeeReferences() {
		return employeeReferences;
	}
	/**
	 * @param employeeReferences the employeeReferences to set
	 */
	public void setEmployeeReferences(Iterable<EmployeeReferences> employeeReferences) {
		this.employeeReferences = employeeReferences;
	}
	/**
	 * @return the employeeSignatures
	 */
	public EmployeeSignature getEmployeeSignatures() {
		return employeeSignatures;
	}
	/**
	 * @param employeeSignatures the employeeSignatures to set
	 */
	public void setEmployeeSignatures(EmployeeSignature employeeSignatures) {
		this.employeeSignatures = employeeSignatures;
	}
}
