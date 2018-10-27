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
public class EntertainerExperience {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer entertainer_experience_id;
	private Integer entertainer_id;
	private String name_of_venue;
	private String city;
	private String state;
	private Integer length_of_employment_years;
	private Integer length_of_employment_months;
	
	/**
	 * @return the entertainer_experience_id
	 */
	public Integer getEntertainer_experience_id() {
		return entertainer_experience_id;
	}
	/**
	 * @param entertainer_experience_id the entertainer_experience_id to set
	 */
	public void setEntertainer_experience_id(Integer entertainer_experience_id) {
		this.entertainer_experience_id = entertainer_experience_id;
	}
	/**
	 * @return the entertainer_id
	 */
	public Integer getEntertainer_id() {
		return entertainer_id;
	}
	/**
	 * @param entertainer_id the entertainer_id to set
	 */
	public void setEntertainer_id(Integer entertainer_id) {
		this.entertainer_id = entertainer_id;
	}
	/**
	 * @return the name_of_venue
	 */
	public String getName_of_venue() {
		return name_of_venue;
	}
	/**
	 * @param name_of_venue the name_of_venue to set
	 */
	public void setName_of_venue(String name_of_venue) {
		this.name_of_venue = name_of_venue;
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
	 * @return the length_of_employment_years
	 */
	public Integer getLength_of_employment_years() {
		return length_of_employment_years;
	}
	/**
	 * @param length_of_employment_years the length_of_employment_years to set
	 */
	public void setLength_of_employment_years(Integer length_of_employment_years) {
		this.length_of_employment_years = length_of_employment_years;
	}
	/**
	 * @return the length_of_employment_months
	 */
	public Integer getLength_of_employment_months() {
		return length_of_employment_months;
	}
	/**
	 * @param length_of_employment_months the length_of_employment_months to set
	 */
	public void setLength_of_employment_months(Integer length_of_employment_months) {
		this.length_of_employment_months = length_of_employment_months;
	}
}
