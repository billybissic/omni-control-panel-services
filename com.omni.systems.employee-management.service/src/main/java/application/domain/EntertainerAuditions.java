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
public class EntertainerAuditions {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer entertainer_audition_id;
	private Integer entertainer_id;
	private String audition_date;
	private String audition_time;
	private String audition_results;
	
	/**
	 * @return the entertainer_audition_id
	 */
	public Integer getEntertainer_audition_id() {
		return entertainer_audition_id;
	}
	/**
	 * @param entertainer_audition_id the entertainer_audition_id to set
	 */
	public void setEntertainer_audition_id(Integer entertainer_audition_id) {
		this.entertainer_audition_id = entertainer_audition_id;
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
	 * @return the audition_date
	 */
	public String getAudition_date() {
		return audition_date;
	}
	/**
	 * @param audition_date the audition_date to set
	 */
	public void setAudition_date(String audition_date) {
		this.audition_date = audition_date;
	}
	/**
	 * @return the audition_time
	 */
	public String getAudition_time() {
		return audition_time;
	}
	/**
	 * @param audition_time the audition_time to set
	 */
	public void setAudition_time(String audition_time) {
		this.audition_time = audition_time;
	}
	/**
	 * @return the audition_results
	 */
	public String getAudition_results() {
		return audition_results;
	}
	/**
	 * @param audition_results the audition_results to set
	 */
	public void setAudition_results(String audition_results) {
		this.audition_results = audition_results;
	}
}
