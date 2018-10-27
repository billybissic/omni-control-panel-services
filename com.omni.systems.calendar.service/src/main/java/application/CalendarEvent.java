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

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//import lombok.AllArgsConstructor;
//import lombok.Data;

/**
 * @author Billy Bissic
 *
 */

//@AllArgsConstructor
//@Data
@Document(collection = "calendar-events")
public class CalendarEvent {

	@Id private ObjectId _id;
	private String start;
	private String end;
	private String title;
	private Colors colors;
	private boolean allDay;
	private Resizable resizable;
	private boolean draggable;
	private Details details;
	
	/**
	 * @return the _id
	 */
	public ObjectId get_id() {
		return _id;
	}
	/**
	 * @param _id the _id to set
	 */
	public void set_id(ObjectId _id) {
		this._id = _id;
	}
	/**
	 * @return the start
	 */
	public String getStart() {
		return start;
	}
	/**
	 * @param date the start to set
	 */
	public void setStart(String date) {
		this.start = date;
	}
	/**
	 * @return the end
	 */
	public String getEnd() {
		return end;
	}
	/**
	 * @param end the end to set
	 */
	public void setEnd(String end) {
		this.end = end;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the color
	 */
	public Colors getColors() {
		return colors;
	}
	/**
	 * @param color the color to set
	 */
	public void setColors(Colors colors) {
		this.colors = colors;
	}
	/**
	 * @return the allDay
	 */
	public boolean isAllDay() {
		return allDay;
	}
	/**
	 * @param allDay the allDay to set
	 */
	public void setAllDay(boolean allDay) {
		this.allDay = allDay;
	}
	/**
	 * @return the resizable
	 */
	public Resizable getResizable() {
		return resizable;
	}
	/**
	 * @param resizable the resizable to set
	 */
	public void setResizable(Resizable resizable) {
		this.resizable = resizable;
	}
	/**
	 * @return the draggable
	 */
	public boolean isDraggable() {
		return draggable;
	}
	/**
	 * @param draggable the draggable to set
	 */
	public void setDraggable(boolean draggable) {
		this.draggable = draggable;
	}
	/**
	 * @return the details
	 */
	public Details getDetails() {
		return details;
	}
	/**
	 * @param details the details to set
	 */
	public void setDetails(Details details) {
		this.details = details;
	}
	
}
