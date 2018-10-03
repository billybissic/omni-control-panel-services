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
public class EventStatus {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer event_status_id;
	private String event_status_name;
	private String event_status_description;
	
	/**
	 * @return the event_status_id
	 */
	public Integer getEvent_status_id() {
		return event_status_id;
	}
	/**
	 * @param event_status_id the event_status_id to set
	 */
	public void setEvent_status_id(Integer event_status_id) {
		this.event_status_id = event_status_id;
	}
	/**
	 * @return the event_status_name
	 */
	public String getEvent_status_name() {
		return event_status_name;
	}
	/**
	 * @param event_status_name the event_status_name to set
	 */
	public void setEvent_status_name(String event_status_name) {
		this.event_status_name = event_status_name;
	}
	/**
	 * @return the event_status_description
	 */
	public String getEvent_status_description() {
		return event_status_description;
	}
	/**
	 * @param event_status_description the event_status_description to set
	 */
	public void setEvent_status_description(String event_status_description) {
		this.event_status_description = event_status_description;
	}

}
