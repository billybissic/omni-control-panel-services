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
public class EventFrequency {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer event_frequency_id;
	private String event_frequency_name;
	private String event_frequency_description;
	private Integer event_frequency_multiplier;
	
	/**
	 * @return the event_frequency_id
	 */
	public Integer getEvent_frequency_id() {
		return event_frequency_id;
	}
	/**
	 * @param event_frequency_id the event_frequency_id to set
	 */
	public void setEvent_frequency_id(Integer event_frequency_id) {
		this.event_frequency_id = event_frequency_id;
	}
	/**
	 * @return the event_frequency_name
	 */
	public String getEvent_frequency_name() {
		return event_frequency_name;
	}
	/**
	 * @param event_frequency_name the event_frequency_name to set
	 */
	public void setEvent_frequency_name(String event_frequency_name) {
		this.event_frequency_name = event_frequency_name;
	}
	/**
	 * @return the event_frequency_description
	 */
	public String getEvent_frequency_description() {
		return event_frequency_description;
	}
	/**
	 * @param event_frequency_description the event_frequency_description to set
	 */
	public void setEvent_frequency_description(String event_frequency_description) {
		this.event_frequency_description = event_frequency_description;
	}
	/**
	 * @return the event_frequency_multiplier
	 */
	public Integer getEvent_frequency_multiplier() {
		return event_frequency_multiplier;
	}
	/**
	 * @param event_frequency_multiplier the event_frequency_multiplier to set
	 */
	public void setEvent_frequency_multiplier(Integer event_frequency_multiplier) {
		this.event_frequency_multiplier = event_frequency_multiplier;
	}
}
