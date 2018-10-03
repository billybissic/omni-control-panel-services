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
public class EventDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer event_details_id;
	private Integer event_id;
	private Integer event_type_id;
	private Integer event_status_id;
	private String event_host;
	private String event_location;
	private String event_date;
	private String event_start_time;
	private String event_end_time;
	private Integer event_image_id;
	private String last_changed_timestamp;
	private Integer last_updated_by;
	
	/**
	 * @return the event_details_id
	 */
	public Integer getEvent_details_id() {
		return event_details_id;
	}
	/**
	 * @param event_details_id the event_details_id to set
	 */
	public void setEvent_details_id(Integer event_details_id) {
		this.event_details_id = event_details_id;
	}
	/**
	 * @return the event_id
	 */
	public Integer getEvent_id() {
		return event_id;
	}
	/**
	 * @param event_id the event_id to set
	 */
	public void setEvent_id(Integer event_id) {
		this.event_id = event_id;
	}
	/**
	 * @return the event_type_id
	 */
	public Integer getEvent_type_id() {
		return event_type_id;
	}
	/**
	 * @param event_type_id the event_type_id to set
	 */
	public void setEvent_type_id(Integer event_type_id) {
		this.event_type_id = event_type_id;
	}
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
	 * @return the event_host
	 */
	public String getEvent_host() {
		return event_host;
	}
	/**
	 * @param event_host the event_host to set
	 */
	public void setEvent_host(String event_host) {
		this.event_host = event_host;
	}
	/**
	 * @return the event_location
	 */
	public String getEvent_location() {
		return event_location;
	}
	/**
	 * @param event_location the event_location to set
	 */
	public void setEvent_location(String event_location) {
		this.event_location = event_location;
	}
	/**
	 * @return the event_date
	 */
	public String getEvent_date() {
		return event_date;
	}
	/**
	 * @param event_date the event_date to set
	 */
	public void setEvent_date(String event_date) {
		this.event_date = event_date;
	}
	/**
	 * @return the event_start_time
	 */
	public String getEvent_start_time() {
		return event_start_time;
	}
	/**
	 * @param event_start_time the event_start_time to set
	 */
	public void setEvent_start_time(String event_start_time) {
		this.event_start_time = event_start_time;
	}
	/**
	 * @return the event_end_time
	 */
	public String getEvent_end_time() {
		return event_end_time;
	}
	/**
	 * @param event_end_time the event_end_time to set
	 */
	public void setEvent_end_time(String event_end_time) {
		this.event_end_time = event_end_time;
	}
	/**
	 * @return the event_image_id
	 */
	public Integer getEvent_image_id() {
		return event_image_id;
	}
	/**
	 * @param event_image_id the event_image_id to set
	 */
	public void setEvent_image_id(Integer event_image_id) {
		this.event_image_id = event_image_id;
	}
	/**
	 * @return the last_changed_timestamp
	 */
	public String getLast_changed_timestamp() {
		return last_changed_timestamp;
	}
	/**
	 * @param last_changed_timestamp the last_changed_timestamp to set
	 */
	public void setLast_changed_timestamp(String last_changed_timestamp) {
		this.last_changed_timestamp = last_changed_timestamp;
	}
	/**
	 * @return the last_updated_by
	 */
	public Integer getLast_updated_by() {
		return last_updated_by;
	}
	/**
	 * @param last_updated_by the last_updated_by to set
	 */
	public void setLast_updated_by(Integer last_updated_by) {
		this.last_updated_by = last_updated_by;
	}
}
