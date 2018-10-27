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

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Billy Bissic
 *
 */

@Entity
public class EmployeeHistory {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer employee_history_id;
	private Integer employee_id;
	private String employer_name;
	private String job_title;
	private String start_date;
	private String end_date;
	private String work_phone;
	private String starting_pay_rate;
	private String ending_pay_rate;
	private String address;
	private String city;
	private String state;
	private String zip;
	
	/**
	 * @return the employee_history_id
	 */
	public Integer getEmployee_history_id() {
		return employee_history_id;
	}
	/**
	 * @param employee_history_id the employee_history_id to set
	 */
	public void setEmployee_history_id(Integer employee_history_id) {
		this.employee_history_id = employee_history_id;
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
	 * @return the employer_name
	 */
	public String getEmployer_name() {
		return employer_name;
	}
	/**
	 * @param employer_name the employer_name to set
	 */
	public void setEmployer_name(String employer_name) {
		this.employer_name = employer_name;
	}
	/**
	 * @return the job_title
	 */
	public String getJob_title() {
		return job_title;
	}
	/**
	 * @param job_title the job_title to set
	 */
	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}
	/**
	 * @return the start_date
	 */
	public String getStart_date() {
		return start_date;
	}
	/**
	 * @param start_date the start_date to set
	 */
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	/**
	 * @return the end_date
	 */
	public String getEnd_date() {
		return end_date;
	}
	/**
	 * @param end_date the end_date to set
	 */
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
	/**
	 * @return the work_phone
	 */
	public String getWork_phone() {
		return work_phone;
	}
	/**
	 * @param work_phone the work_phone to set
	 */
	public void setWork_phone(String work_phone) {
		this.work_phone = work_phone;
	}
	/**
	 * @return the starting_pay_rate
	 */
	public String getStarting_pay_rate() {
		return starting_pay_rate;
	}
	/**
	 * @param starting_pay_rate the starting_pay_rate to set
	 */
	public void setStarting_pay_rate(String starting_pay_rate) {
		this.starting_pay_rate = starting_pay_rate;
	}
	/**
	 * @return the ending_pay_rate
	 */
	public String getEnding_pay_rate() {
		return ending_pay_rate;
	}
	/**
	 * @param ending_pay_rate the ending_pay_rate to set
	 */
	public void setEnding_pay_rate(String ending_pay_rate) {
		this.ending_pay_rate = ending_pay_rate;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the zip
	 */
	public String getZip() {
		return zip;
	}
	/**
	 * @param zip the zip to set
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}

}
