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
package application;

//import lombok.AllArgsConstructor;
//import lombok.Data;

/**
 * @author Billy Bissic
 *
 */
//@Data
//@AllArgsConstructor
public class Details {
	private String description;
	private String host;
	private String location;
	private Integer event_type_id;
	private Integer event_status_id;
	private Integer event_frequency_id;
	private Integer event_image_id;
	
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the host
	 */
	public String getHost() {
		return host;
	}
	/**
	 * @param host the host to set
	 */
	public void setHost(String host) {
		this.host = host;
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
	
	/*protected Details() { }
	
	public Details(final String description, 
				   final String host, 
				   final String location, 
				   final Integer event_type_id, 
				   final Integer event_status_id, 
				   final Integer event_frequency_id,
				   final Integer event_image_id)
	{
		this.description = description;
		this.host = host;
		this.location = location;
		this.event_type_id = event_type_id;
		this.event_status_id = event_status_id;
		this.event_frequency_id = event_frequency_id;
		this.event_image_id = event_image_id;
	}

	/** @return the description */
	//public String getDescription() { return description; }
	/** @return the host */
	//public String getHost() { return host; }
	/** @return the location */
	//public String getLocation() { return location; }
	/** @return the event_type_id */
	//public Integer getEvent_type_id() { return event_type_id; }
	/** @return the event_status_id */
	//public Integer getEvent_status_id() { return event_status_id; }
	/** @return the event_frequency_id */
	//public Integer getEvent_frequency_id() { return event_frequency_id; }
	/** @return the event_image_id */
	//public Integer getEvent_image_id() { return event_image_id; }
	
	
}
