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
public class EmploymentArrangementType {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer employment_arrangement_type_id;
	private String employment_arrangement_type_name;
	private String employment_arrangement_type_description;
	
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
	/**
	 * @return the employment_arrangement_type_name
	 */
	public String getEmployment_arrangement_type_name() {
		return employment_arrangement_type_name;
	}
	/**
	 * @param employment_arrangement_type_name the employment_arrangement_type_name to set
	 */
	public void setEmployment_arrangement_type_name(String employment_arrangement_type_name) {
		this.employment_arrangement_type_name = employment_arrangement_type_name;
	}
	/**
	 * @return the employment_arrangement_type_description
	 */
	public String getEmployment_arrangement_type_description() {
		return employment_arrangement_type_description;
	}
	/**
	 * @param employment_arrangement_type_description the employment_arrangement_type_description to set
	 */
	public void setEmployment_arrangement_type_description(String employment_arrangement_type_description) {
		this.employment_arrangement_type_description = employment_arrangement_type_description;
	}
}
