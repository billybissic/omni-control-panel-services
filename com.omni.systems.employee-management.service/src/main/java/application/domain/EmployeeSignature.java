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
public class EmployeeSignature {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer employee_signature_id;
	private String employee_id;
	private String employee_signature;
	private String employee_signature_date;
	
	/**
	 * @return the employee_signature_id
	 */
	public Integer getEmployee_signature_id() {
		return employee_signature_id;
	}
	/**
	 * @param employee_signature_id the employee_signature_id to set
	 */
	public void setEmployee_signature_id(Integer employee_signature_id) {
		this.employee_signature_id = employee_signature_id;
	}
	/**
	 * @return the employee_id
	 */
	public String getEmployee_id() {
		return employee_id;
	}
	/**
	 * @param employee_id the employee_id to set
	 */
	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}
	/**
	 * @return the employee_signature
	 */
	public String getEmployee_signature() {
		return employee_signature;
	}
	/**
	 * @param employee_signature the employee_signature to set
	 */
	public void setEmployee_signature(String employee_signature) {
		this.employee_signature = employee_signature;
	}
	/**
	 * @return the employee_signature_date
	 */
	public String getEmployee_signature_date() {
		return employee_signature_date;
	}
	/**
	 * @param employee_signature_date the employee_signature_date to set
	 */
	public void setEmployee_signature_date(String employee_signature_date) {
		this.employee_signature_date = employee_signature_date;
	}
}
