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

public class EntertainerExperience {
	
	private String nameOfVenue;
	private String city;
	private String state;
	private Integer lengthOfEmploymentYears;
	private Integer lengthOfEmploymentMonths;
	
	/**
	 * @return the nameOfVenue
	 */
	public String getNameOfVenue() {
		return nameOfVenue;
	}
	/**
	 * @param nameOfVenue the nameOfVenue to set
	 */
	public void setNameOfVenue(String nameOfVenue) {
		this.nameOfVenue = nameOfVenue;
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
	 * @return the lengthOfEmploymentYears
	 */
	public Integer getLengthOfEmploymentYears() {
		return lengthOfEmploymentYears;
	}
	/**
	 * @param lengthOfEmploymentYears the lengthOfEmploymentYears to set
	 */
	public void setLengthOfEmploymentYears(Integer lengthOfEmploymentYears) {
		this.lengthOfEmploymentYears = lengthOfEmploymentYears;
	}
	/**
	 * @return the lengthOfEmploymentMonths
	 */
	public Integer getLengthOfEmploymentMonths() {
		return lengthOfEmploymentMonths;
	}
	/**
	 * @param lengthOfEmploymentMonths the lengthOfEmploymentMonths to set
	 */
	public void setLengthOfEmploymentMonths(Integer lengthOfEmploymentMonths) {
		this.lengthOfEmploymentMonths = lengthOfEmploymentMonths;
	}
}
