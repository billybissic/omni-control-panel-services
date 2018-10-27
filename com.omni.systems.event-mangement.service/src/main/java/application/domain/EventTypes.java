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
public class EventTypes {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer event_type_id;
	private String event_type_name;
	private String event_type_description;
	private String primary_color;
	private String secondary_color;
	
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
	 * @return the event_type_name
	 */
	public String getEvent_type_name() {
		return event_type_name;
	}
	/**
	 * @param event_type_name the event_type_name to set
	 */
	public void setEvent_type_name(String event_type_name) {
		this.event_type_name = event_type_name;
	}
	/**
	 * @return the event_type_description
	 */
	public String getEvent_type_description() {
		return event_type_description;
	}
	/**
	 * @param event_type_description the event_type_description to set
	 */
	public void setEvent_type_description(String event_type_description) {
		this.event_type_description = event_type_description;
	}
	/**
	 * @return the primary_color
	 */
	public String getPrimary_color() {
		return primary_color;
	}
	/**
	 * @param primary_color the primary_color to set
	 */
	public void setPrimary_color(String primary_color) {
		this.primary_color = primary_color;
	}
	/**
	 * @return the secondary_color
	 */
	public String getSecondary_color() {
		return secondary_color;
	}
	/**
	 * @param secondary_color the secondary_color to set
	 */
	public void setSecondary_color(String secondary_color) {
		this.secondary_color = secondary_color;
	}
}
