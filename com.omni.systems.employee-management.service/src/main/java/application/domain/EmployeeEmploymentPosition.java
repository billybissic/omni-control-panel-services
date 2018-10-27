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
public class EmployeeEmploymentPosition {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer employee_position_id;
	private Integer employee_id;
	private Integer employment_position_type_id;
	private String available_start_date;
	private String desired_pay;
	private Integer employment_arrangement_type_id;
	
	/**
	 * @return the employee_position_id
	 */
	public Integer getEmployee_position_id() {
		return employee_position_id;
	}
	/**
	 * @param employee_position_id the employee_position_id to set
	 */
	public void setEmployee_position_id(Integer employee_position_id) {
		this.employee_position_id = employee_position_id;
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
	 * @return the employment_position_type_id
	 */
	public Integer getEmployment_position_type_id() {
		return employment_position_type_id;
	}
	/**
	 * @param employment_position_type_id the employment_position_type_id to set
	 */
	public void setEmployment_position_type_id(Integer employment_position_type_id) {
		this.employment_position_type_id = employment_position_type_id;
	}
	/**
	 * @return the available_start_date
	 */
	public String getAvailable_start_date() {
		return available_start_date;
	}
	/**
	 * @param available_start_date the available_start_date to set
	 */
	public void setAvailable_start_date(String available_start_date) {
		this.available_start_date = available_start_date;
	}
	/**
	 * @return the desired_pay
	 */
	public String getDesired_pay() {
		return desired_pay;
	}
	/**
	 * @param desired_pay the desired_pay to set
	 */
	public void setDesired_pay(String desired_pay) {
		this.desired_pay = desired_pay;
	}
	/**
	 * @return the employment_arrangement_type_id
	 */
	public Integer getEmployment_arrangement_type_id() {
		return employment_arrangement_type_id;
	}
	/**
	 * @param employment_arrangement_type_id the employment_arrangement_type_id to set
	 */
	public void setEmployment_arrangement_type_id(Integer employment_arrangement_type_id) {
		this.employment_arrangement_type_id = employment_arrangement_type_id;
	}
}
