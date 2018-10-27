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
public class EmployeeEducation {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer employment_education_id;
	private Integer employee_id;
	private String school_name;
	private String location;
	private Integer years_attended;
	private String major;
	private String degree_recieved;
	
	/**
	 * @return the employment_education_id
	 */
	public Integer getEmployment_education_id() {
		return employment_education_id;
	}
	/**
	 * @param employment_education_id the employment_education_id to set
	 */
	public void setEmployment_education_id(Integer employment_education_id) {
		this.employment_education_id = employment_education_id;
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
	 * @return the school_name
	 */
	public String getSchool_name() {
		return school_name;
	}
	/**
	 * @param school_name the school_name to set
	 */
	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * @return the years_attended
	 */
	public Integer getYears_attended() {
		return years_attended;
	}
	/**
	 * @param years_attended the years_attended to set
	 */
	public void setYears_attended(Integer years_attended) {
		this.years_attended = years_attended;
	}
	/**
	 * @return the major
	 */
	public String getMajor() {
		return major;
	}
	/**
	 * @param major the major to set
	 */
	public void setMajor(String major) {
		this.major = major;
	}
	/**
	 * @return the degree_recieved
	 */
	public String getDegree_recieved() {
		return degree_recieved;
	}
	/**
	 * @param degree_recieved the degree_recieved to set
	 */
	public void setDegree_recieved(String degree_recieved) {
		this.degree_recieved = degree_recieved;
	}
}
