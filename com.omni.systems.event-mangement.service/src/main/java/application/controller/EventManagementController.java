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
package application.controller;

import org.hibernate.HibernateException;
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

import application.domain.EventFrequency;
import application.domain.EventStatus;
import application.domain.EventTypes;
import application.repository.EventFrequencyRepository;
import application.repository.EventStatusRepository;
import application.repository.EventTypesRepository;

/**
 * @author Billy Bissic
 *
 */

@Controller
@RequestMapping(path="/api/EventManagementService")
public class EventManagementController {

	@Autowired
	private EventStatusRepository eventStatusRepository;
	@Autowired
	private EventTypesRepository eventTypesRepository;
	@Autowired
	private EventFrequencyRepository eventFrequencyRepository;
	
	@RequestMapping(value="/addEventStatus", method = RequestMethod.POST)
	public ResponseEntity<?> addEventStatus(@RequestBody EventStatus eventStatus) {
		try
		{
			eventStatusRepository.save(eventStatus);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		}
		catch (HibernateException ex)
		{
			System.out.println(ex);;
			return new ResponseEntity<HttpStatus>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@RequestMapping(value="/addEventType", method = RequestMethod.POST)
	public ResponseEntity<?> addEventType(@RequestBody EventTypes eventType) {
		try
		{
			eventTypesRepository.save(eventType);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		}
		catch (HibernateException ex)
		{
			System.out.println(ex);;
			return new ResponseEntity<HttpStatus>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@DeleteMapping(path="/deleteEventStatus/{id}")
	public ResponseEntity<HttpStatus> deleteEventStatus(@PathVariable Integer id)
	{
		try
		{
			eventStatusRepository.deleteById(id);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		}
		catch (HibernateException ex)
		{
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@DeleteMapping(path="/deleteEventType/{id}")
	public ResponseEntity<HttpStatus> deleteEventType(@PathVariable Integer id)
	{
		try
		{
			eventTypesRepository.deleteById(id);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		}
		catch (HibernateException ex)
		{
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@DeleteMapping(path="/deleteEventFrequency/{id}")
	public ResponseEntity<HttpStatus> deleteEventFrequency(@PathVariable Integer id)
	{
		try
		{
			eventFrequencyRepository.deleteById(id);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		}
		catch (HibernateException ex)
		{
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping(path="/getEventStatuses")
	public ResponseEntity<?> getEventStatuses()
	{
		try
		{
			Iterable<EventStatus> eventStatuses = eventStatusRepository.findAll();
			return new ResponseEntity<Iterable<EventStatus>>(eventStatuses, HttpStatus.OK);
		}
		catch (HibernateException ex)
		{
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping(path="/getEventStatus")
	public ResponseEntity<?> getEventStatus(@RequestParam Integer event_status_id)
	{
		try
		{
			EventStatus eventStatus = eventStatusRepository.findById(event_status_id);
			return new ResponseEntity<EventStatus>(eventStatus, HttpStatus.OK);
		}
		catch (HibernateException ex)
		{
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping(path="/getEventTypes")
	public ResponseEntity<?> getEventTypes()
	{
		try
		{
			Iterable<EventTypes> eventTypes = eventTypesRepository.findAll();
			return new ResponseEntity<Iterable<EventTypes>>(eventTypes, HttpStatus.OK);
		}
		catch (HibernateException ex)
		{
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping(path="/getEventFrequency")
	public ResponseEntity<?> getEventFrequency()
	{
		try
		{
			Iterable<EventFrequency> eventFrequency = eventFrequencyRepository.findAll();
			return new ResponseEntity<Iterable<EventFrequency>>(eventFrequency, HttpStatus.OK);
		}
		catch (HibernateException ex)
		{
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping(path="/getEventType")
	public ResponseEntity<?> getEventType(Integer event_type_id)
	{
		try
		{
			EventTypes eventType = eventTypesRepository.findById(event_type_id);
			return new ResponseEntity<EventTypes>(eventType, HttpStatus.OK);
		}
		catch (HibernateException ex)
		{
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.BAD_REQUEST);
		}
	}
}
