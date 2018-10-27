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

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Billy Bissic
 *
 */

@Entity
public class EmployeeReferences {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer employee_reference_id;
	private Integer employee_id;
	private String reference_employer_name;
	private String reference_position_title;
	private String reference_company_name;
	private String reference_company_phone;
	
	/**
	 * @return the employee_reference_id
	 */
	public Integer getEmployee_reference_id() {
		return employee_reference_id;
	}
	/**
	 * @param employee_reference_id the employee_reference_id to set
	 */
	public void setEmployee_reference_id(Integer employee_reference_id) {
		this.employee_reference_id = employee_reference_id;
	}
	/**
	 * @return the employee_id
	 */
	public Integer getEmployee_id() {
		return employee_id;
	}
	/**
	 * @param employee_id the employee_id to set
	 */
	public void setEmployee_id(Integer employee_id) {
		this.employee_id = employee_id;
	}
	/**
	 * @return the reference_employer_name
	 */
	public String getReference_employer_name() {
		return reference_employer_name;
	}
	/**
	 * @param reference_employer_name the reference_employer_name to set
	 */
	public void setReference_employer_name(String reference_employer_name) {
		this.reference_employer_name = reference_employer_name;
	}
	/**
	 * @return the reference_position_title
	 */
	public String getReference_position_title() {
		return reference_position_title;
	}
	/**
	 * @param reference_position_title the reference_position_title to set
	 */
	public void setReference_position_title(String reference_position_title) {
		this.reference_position_title = reference_position_title;
	}
	/**
	 * @return the reference_company_name
	 */
	public String getReference_company_name() {
		return reference_company_name;
	}
	/**
	 * @param reference_company_name the reference_company_name to set
	 */
	public void setReference_company_name(String reference_company_name) {
		this.reference_company_name = reference_company_name;
	}
	/**
	 * @return the reference_company_phone
	 */
	public String getReference_company_phone() {
		return reference_company_phone;
	}
	/**
	 * @param reference_company_phone the reference_company_phone to set
	 */
	public void setReference_company_phone(String reference_company_phone) {
		this.reference_company_phone = reference_company_phone;
	}
}
