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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Billy Bissic
 *
 */
@Controller
@RequestMapping(path="/api/CalendarEvents")
public class CalendarEventController {

	@Autowired
	private  CalendarEventRepository calendarEventRepository;
	
	@GetMapping(path="/getCalendarEvents")
	public @ResponseBody Iterable<CalendarEvent> getCalendarEvents() {
		return calendarEventRepository.findAll();
	}
	
	@GetMapping(path="/getCalendarEventsByMonth")
	public @ResponseBody Iterable<CalendarEvent> getCalendarEventsByMonth(@RequestParam String start) {
		return calendarEventRepository.findByStart(start);
	}
	
	@RequestMapping(value="/addCalendarEvent", method = RequestMethod.POST)
	public ResponseEntity<?> createCalendarEvent(@RequestBody CalendarEvent calendarEvent ) 
	{
		calendarEventRepository.save(calendarEvent);
		return new ResponseEntity<CalendarEvent>(calendarEvent, HttpStatus.CREATED);
	}
	
	@RequestMapping(path="/deleteCalendarEvent/{_id}", method = RequestMethod.GET)
	public ResponseEntity<HttpStatus> deleteCalendarEvent(@PathVariable String _id)
	{
		calendarEventRepository.delete(calendarEventRepository.findOne(_id));
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}
}
