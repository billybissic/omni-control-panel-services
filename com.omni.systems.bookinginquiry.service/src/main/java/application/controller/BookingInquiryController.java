/**
*	MIT License
*
*	Copyright (c) 2018 Billy Bissic
*
*	Permission is hereby granted, free of charge, to any person obtaining a copy
*	of this software and associated documentation files (the "Software"), to deal
*	in the Software without restriction, including without limitation the rights
*	to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
*	copies of the Software, and to permit persons to whom the Software is
*	furnished to do so, subject to the following conditions:
*
*	The above copyright notice and this permission notice shall be included in all
*	copies or substantial portions of the Software.
*
*	THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
*	IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
*	FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
*	AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
*	LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
*	OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
*	SOFTWARE.
**/
package application.controller;

/**
 * @author Billy Bissic
 *
 */
import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import application.domain.ContactTimes;
import application.domain.Inquiries;
import application.domain.InquiryStatus;
import application.domain.InquiryTypes;
import application.exception.InquiryStatusCodesNotFoundException;
import application.repository.ContactTimesRepository;
import application.repository.InquiriesRepository;
import application.repository.InquiryStatusRepository;
import application.repository.InquiryTypesRepository;

@Controller
@RequestMapping(path="/BookingInquiryServices")
public class BookingInquiryController {

	@Autowired
	private InquiriesRepository inquiriesRepository;
	@Autowired
	private ContactTimesRepository contactTimesRepository;
	@Autowired
	private InquiryTypesRepository inquiryTypesRepository;
	@Autowired
	private InquiryStatusRepository inquiryStatusRepository;
	
	@GetMapping(path="/getInquiryStatuses")
	public @ResponseBody Iterable<InquiryStatus> getInquiryStatuses() {
		return inquiryStatusRepository.findAll();
	}
	
	@GetMapping(path="/getPendingInquiryCount")
	public @ResponseBody ResponseEntity<?> getPendingInquiryCount() {
		Integer pendingStatusCode = null;
		Iterable<InquiryStatus> inquiryStatuses = inquiryStatusRepository.findAll();
		
		for (InquiryStatus status: inquiryStatuses) {
			if (status.getInquiry_status_name() == "Pending")
			{
				pendingStatusCode = status.getInquiry_status_id();
				break;
			}
		}
		
		if (pendingStatusCode == null) {
			throw new InquiryStatusCodesNotFoundException();
		}
		
		pendingStatusCode = inquiriesRepository.countByInquiryStatusId(pendingStatusCode);
		return new ResponseEntity<Integer>(pendingStatusCode, HttpStatus.OK);
	}
	@CrossOrigin(origins = "http://www.menageadultclub.com,"
 						 + "http://cs1.menageadultclub.com")
	@GetMapping(path="/getInquiryTypes")
	public @ResponseBody Iterable<InquiryTypes> getInquiryTypes()
	{
		return inquiryTypesRepository.findAll();
	}
	
	@GetMapping(path="/getContactTimes")
	public @ResponseBody Iterable<ContactTimes> getContactTimes()
	{
		return contactTimesRepository.findAll();
	}
	
	@CrossOrigin(origins = "http://www.menageadultclub.com,"
			 			 + "http://cs1.menageadultclub.com")
	@GetMapping(path="/getInquiries")
	public @ResponseBody Iterable<Inquiries> getInquiries()
	{
		return inquiriesRepository.findAll();
	}
	
	@RequestMapping(value="/createInquiry", method = RequestMethod.POST)
	public ResponseEntity<Inquiries> createNewInquiry(@RequestBody Inquiries inquiry)
	{
		inquiriesRepository.save(inquiry);
		return new ResponseEntity<Inquiries>(inquiry, HttpStatus.OK);
	}
	
	@RequestMapping(value="/createContactTime", method = RequestMethod.POST)
	public ResponseEntity<ContactTimes> createContactTime(@RequestBody ContactTimes contactTime)
	{
		contactTimesRepository.save(contactTime);
		return new ResponseEntity<ContactTimes>(contactTime, HttpStatus.CREATED);
	}
	
	@RequestMapping(value="/createInquiryStatus", method = RequestMethod.POST)
	public ResponseEntity<InquiryStatus> createInquiryStatus(@RequestBody InquiryStatus inquiryStatus)
	{
		inquiryStatusRepository.save(inquiryStatus);
		return new ResponseEntity<InquiryStatus>(inquiryStatus, HttpStatus.CREATED);
	}
	
	@RequestMapping(value="/createInquiryType", method = RequestMethod.POST)
	public ResponseEntity<InquiryTypes> createInquiryType(@RequestBody InquiryTypes inquiryType)
	{
		inquiryTypesRepository.save(inquiryType);
		return new ResponseEntity<InquiryTypes>(inquiryType, HttpStatus.CREATED);
	}
	
	@DeleteMapping(value="/deleteInquiry/{id}")
	public ResponseEntity<HttpStatus> deleteInquiry(@PathVariable Integer id)
	{
		try
		{
			inquiriesRepository.deleteById(id);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		}
		catch (HibernateException ex)
		{
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.I_AM_A_TEAPOT);
		}
	}
	
	@DeleteMapping(value="/deleteInquiryType/{id}")
	public ResponseEntity<HttpStatus> deleteInquiryType(@PathVariable Integer id)
	{
		try
		{
		inquiryTypesRepository.deleteById(id);
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		}
		catch (HibernateException ex)
		{
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.I_AM_A_TEAPOT);
		}
	}
	
	@DeleteMapping(value="/deleteInquiryStatus/{id}")
	public ResponseEntity<HttpStatus> deleteInquiryStatus(@PathVariable Integer id)
	{		
		try {
			inquiryStatusRepository.deleteById(id);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		}
		catch (HibernateException ex)
		{
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.I_AM_A_TEAPOT);
		}
	}
	
	@DeleteMapping(value="/deleteContactTime/{id}")
	public ResponseEntity<HttpStatus> deleteContactTime(@PathVariable Integer id)
	{
		try 
		{
			contactTimesRepository.deleteById(id);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		}
		catch (HibernateException ex)
		{
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.I_AM_A_TEAPOT);
		}
	}
}
