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
public class EntertainerInformation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer entertainer_id;
	private String first_name;
	private String last_name;
	private String stage_name;
	private String home_address;
	private String cell_phone_number;
	private String date_of_birth;
	private boolean has_danced_before;
	
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
	 * @return the first_name
	 */
	public String getFirst_name() {
		return first_name;
	}
	/**
	 * @param first_name the first_name to set
	 */
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	/**
	 * @return the last_name
	 */
	public String getLast_name() {
		return last_name;
	}
	/**
	 * @param last_name the last_name to set
	 */
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	/**
	 * @return the stage_name
	 */
	public String getStage_name() {
		return stage_name;
	}
	/**
	 * @param stage_name the stage_name to set
	 */
	public void setStage_name(String stage_name) {
		this.stage_name = stage_name;
	}
	/**
	 * @return the home_address
	 */
	public String getHome_address() {
		return home_address;
	}
	/**
	 * @param home_address the home_address to set
	 */
	public void setHome_address(String home_address) {
		this.home_address = home_address;
	}
	/**
	 * @return the cell_phone_number
	 */
	public String getCell_phone_number() {
		return cell_phone_number;
	}
	/**
	 * @param cell_phone_number the cell_phone_number to set
	 */
	public void setCell_phone_number(String cell_phone_number) {
		this.cell_phone_number = cell_phone_number;
	}
	/**
	 * @return the date_of_birth
	 */
	public String getDate_of_birth() {
		return date_of_birth;
	}
	/**
	 * @param date_of_birth the date_of_birth to set
	 */
	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	/**
	 * @return the has_danced_before
	 */
	public boolean isHas_danced_before() {
		return has_danced_before;
	}
	/**
	 * @param has_danced_before the has_danced_before to set
	 */
	public void setHas_danced_before(boolean has_danced_before) {
		this.has_danced_before = has_danced_before;
	}
}
