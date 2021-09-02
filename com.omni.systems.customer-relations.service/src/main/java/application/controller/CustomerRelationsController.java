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

import java.util.Arrays;
/**
 * @author Billy Bissic
 *
 */
import java.util.List;

import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import application.domain.SubscriberGroupMembers;
import application.domain.SubscriberGroups;
import application.domain.ContactTimes;
import application.domain.CustomerBookingInquiry;
import application.domain.Inquiries;
import application.domain.InquiryStatus;
import application.domain.InquiryTypes;
import application.domain.ServiceType;
import application.domain.Subscriber;
import application.exception.DuplicateSubscriberException;
import application.exception.DuplicateSubscriberGroupException;
import application.exception.InquiryStatusCodesNotFoundException;
import application.exception.NoDataAvailableException;
import application.exception.NoUnassignedSubscribersFoundException;
import application.exception.SubscriberNotFoundException;
import application.repository.ContactTimesRepository;
import application.repository.CustomerBookingInquiryRepository;
import application.repository.InquiriesRepository;
import application.repository.InquiryStatusRepository;
import application.repository.InquiryTypesRepository;
import application.repository.ServiceTypeRepository;
import application.repository.SubscriberGroupMembersRepository;
import application.repository.SubscriberGroupsRepository;
import application.repository.SubscriberRepository;

/**
 * @author Billy Bissic
 *
 */
@RestController
@RequestMapping(path="/demo/api/CustomRelationServices")
public class CustomerRelationsController {
	
	@Autowired
	private SubscriberRepository subscribersRepository;
	@Autowired
	private SubscriberGroupsRepository subscriberGroupsRepository;
	@Autowired
	private SubscriberGroupMembersRepository subscriberGroupMembersRepository;
	@Autowired
	private CustomerBookingInquiryRepository customerBookingInquiryRepository;
	@Autowired
	private ServiceTypeRepository serviceTypeRepository;
	@Autowired
	private InquiriesRepository inquiriesRepository;
	@Autowired
	private ContactTimesRepository contactTimesRepository;
	@Autowired
	private InquiryTypesRepository inquiryTypesRepository;
	@Autowired
	private InquiryStatusRepository inquiryStatusRepository;
	
	@RequestMapping(value="/subscribe", method = RequestMethod.POST)
	public ResponseEntity<Subscriber> addNewSubscriber(@RequestBody Subscriber subscriber)
	{
		//Check to see if they have already subscribed.
		List<Subscriber> existingSubscriber = subscribersRepository.findBySubscriberEmail(subscriber.getSubscriberEmail());
		if (existingSubscriber.isEmpty())
		{
			subscribersRepository.save(subscriber);
			return new ResponseEntity<Subscriber>(subscriber, HttpStatus.OK);
		}
		else
		{
			throw new DuplicateSubscriberException("Subscriber_email:" + subscriber.getSubscriberEmail());
		}
	}

	@RequestMapping(value="/createGroup", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> createNewGroup(@RequestBody SubscriberGroups subscriberGroup)
	{
		List<SubscriberGroups> existingSubscriberGroup = subscriberGroupsRepository.findById(subscriberGroup.getSubscriber_group_id());
		if (existingSubscriberGroup.isEmpty())
		{
			subscriberGroupsRepository.save(subscriberGroup);
			return new ResponseEntity<Object>(subscriberGroup, HttpStatus.CREATED);
		}
		else
		{
			throw new DuplicateSubscriberGroupException(subscriberGroup.getSubscriber_group_name());
		}
	}
	
	@RequestMapping(value="/assignSubscriberToGroup", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> assignSubscriberToGroup(@RequestBody SubscriberGroupMembers subscriberGroupMember)
	{
		try
		{
			subscriberGroupMembersRepository.save(subscriberGroupMember);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		}
		catch (HibernateException ex)
		{
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@RequestMapping(path="/getSubscribersCount", method = RequestMethod.GET)
	public @ResponseBody long getSubscribersCount()
	{
		return subscribersRepository.count();
	}
	
	
	@RequestMapping(path="/seeAllSubscribers", method = RequestMethod.POST)
	public @ResponseBody Iterable<Subscriber> getAllSubscribers() 
	{
		return subscribersRepository.findAll();
	}
	
	@RequestMapping(path="/findSubscriberById", method = RequestMethod.GET)
	public ResponseEntity<Subscriber> getSubscriberById(@RequestBody Subscriber subscriber)
	{
		Subscriber existingSubscriber = subscribersRepository.findById(subscriber.getSubscriberId());
		if (existingSubscriber.equals(subscriber))
		{
			return new ResponseEntity<Subscriber>(subscriber, HttpStatus.OK);
		}
		else
		{
			throw new SubscriberNotFoundException();
		}
	}
	
	@RequestMapping(path="/getAllSubscriberGroups", method = RequestMethod.GET)
	public @ResponseBody Iterable<SubscriberGroups> getAllSubscriberGroups()
	{
		return subscriberGroupsRepository.findAll();
	}
	
	@RequestMapping(path="/getUnAssignedSubscribers", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getUnAssignedSubscribers()
	{
		/** Get All Group Members */
		Iterable<Integer> subscriberIds = subscriberGroupMembersRepository.findMemberIds();
		if (subscriberIds == null )
		{
			/** If nothing returns for subscriber group members, return all subscribers. */
			Iterable<Subscriber> subscribers = subscribersRepository.findAll();
			
			/** if no subscribers are found from subscribers repository throw error */
			if (subscribers == null) {
				throw new NoDataAvailableException();
			}
			
			/** otherwise return all subscribers found */
			return new ResponseEntity<Iterable<Subscriber>>(subscribers, HttpStatus.OK);
		}
		
		/** Find Members With No Group */
		Iterable<Subscriber> unassignedSubscribers = subscribersRepository.findUnAssignedSubscribers();
		/** If nothing returns for unassigned subscribers, throw error */
		if (unassignedSubscribers == null)
		{
			/** Throw null exception */
			throw new NoUnassignedSubscribersFoundException();
		}
		
		/** otherwise return all unassigned subscribers found */
		return new ResponseEntity<Iterable<Subscriber>>(unassignedSubscribers, HttpStatus.OK);
	}
	
	@RequestMapping(path="/getAllSubscriberGroupMembers/{groupId}", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getAllSubscriberGroupMembers(@PathVariable Integer groupId)
	{
		Iterable<Subscriber> subscribers = subscribersRepository.subscribersOfGroup(groupId);
		
		/** if no subscribers are found from subscribers repository throw error */
		if (subscribers == null )
		{
			throw new NoDataAvailableException();
		}
		
		
		/** otherwise return all subscribers found */
		return new ResponseEntity<Iterable<Subscriber>>(subscribers, HttpStatus.OK);
	}
	
	@RequestMapping(path="/deleteSubscriber/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteSubscriber(@PathVariable Integer id)
	{
		try
		{
			Subscriber subscriber = subscribersRepository.findOne(id);
			if ( subscriber == null )
			{
				throw new SubscriberNotFoundException();
			}
			subscribersRepository.delete(subscriber);
			return new ResponseEntity<Subscriber>(subscriber, HttpStatus.OK);
		}
		catch (HibernateException ex)
		{
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@RequestMapping(path="/deleteSubscriberGroup/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<HttpStatus> deleteSubscriberGroup(@PathVariable Integer id)
	{
		try
		{
			subscriberGroupsRepository.deleteById(id);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		}
		catch (HibernateException ex)
		{
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@RequestMapping(path="/deleteSubscriberGroupMember/{groupId}/{subscriberId}", method = RequestMethod.DELETE)
	public ResponseEntity<HttpStatus> deleteSubscriberGroupMember(@PathVariable Integer groupId, @PathVariable Integer subscriberId)
	{
		try
		{
			subscriberGroupMembersRepository.deleteById(groupId, subscriberId);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		}
		catch (HibernateException ex)
		{
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(path="/addNewBookingInquiry", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> addNewBookingInquiry(@RequestBody CustomerBookingInquiry customerBookingInquiry) {

		try
		{
			customerBookingInquiryRepository.save(customerBookingInquiry);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
			
		} catch (HibernateException ex)
		{
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@RequestMapping(path="/getAllBookingInquiries", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getAllBookingInquiries() {
		try
		{
			Iterable<CustomerBookingInquiry> bookingInquiries = customerBookingInquiryRepository.findAll();
			if (bookingInquiries != null) {
				return new ResponseEntity<Iterable<CustomerBookingInquiry>>(bookingInquiries, HttpStatus.OK);
			}
			else
			{
				return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
			}
		} catch (HibernateException ex)
		{
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@RequestMapping(path="/addNewServiceType", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> addNewServiceType(@RequestBody ServiceType serviceType) {
		
		try
		{
			serviceTypeRepository.save(serviceType);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		} catch (HibernateException ex)
		{
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@RequestMapping(path="/getAllServiceTypes", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getAllServiceTypes() {
		try
		{
			Iterable<ServiceType> serviceTypes = serviceTypeRepository.findAll();
			if (serviceTypes != null) 
			{
				return new ResponseEntity<Iterable<ServiceType>>(serviceTypes, HttpStatus.OK);
			}
			else
			{
				return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
			}
		} catch (HibernateException ex)
		{
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@RequestMapping(path="/getInquiryStatuses", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getInquiryStatuses() {
		
	try {
		Iterable<InquiryStatus> inquiryStatuses = inquiryStatusRepository.findAll();
		if (inquiryStatuses != null) {
			return new ResponseEntity<Iterable<InquiryStatus>>(inquiryStatuses, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<HttpStatus>(HttpStatus.NOT_FOUND);
		}
	} catch (HibernateException ex)
	{
		System.out.println(ex);
		return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	}
	
	@RequestMapping(path = "/getPendingInquiryCount", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getPendingInquiryCount() {
		try {
			Integer pendingStatusCode = null;
			Iterable<InquiryStatus> inquiryStatuses = inquiryStatusRepository.findAll();

			for (InquiryStatus status : inquiryStatuses) {
				if (status.getInquiry_status_name() == "Pending") {
					pendingStatusCode = status.getInquiry_status_id();
					break;
				}
			}

			if (pendingStatusCode == null) {
				throw new InquiryStatusCodesNotFoundException();
			}

			pendingStatusCode = inquiriesRepository.countByInquiryStatusId(pendingStatusCode);
			
			return new ResponseEntity<Integer>(pendingStatusCode, HttpStatus.OK);
		} catch (HibernateException ex) {
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
	
	@RequestMapping(path="/getInquiryTypes", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getInquiryTypes()
	{
		try
		{
			Iterable<InquiryTypes> inquiryTypes = inquiryTypesRepository.findAll();
			if (inquiryTypes != null) {
				return new ResponseEntity<Iterable<InquiryTypes>>(inquiryTypes, HttpStatus.OK);
			}
			else
			{
				return new ResponseEntity<HttpStatus>(HttpStatus.NOT_FOUND);
			}
		} catch (HibernateException ex)
		{
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@RequestMapping(path="/getContactTimes", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getContactTimes()
	{
		try
		{
			Iterable<ContactTimes> contactTimes = contactTimesRepository.findAll();
			if(contactTimes != null) {
				return new ResponseEntity<Iterable<ContactTimes>>(contactTimes, HttpStatus.OK);
			}
			else
			{
				return new ResponseEntity<HttpStatus>(HttpStatus.NOT_FOUND);
			}
		} catch (HibernateException ex)
		{
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@RequestMapping(path="/getInquiries", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getInquiries()
	{
		
		try
		{
			Iterable<Inquiries> inquiries = inquiriesRepository.findAll();
			if (inquiries != null) {
				return new ResponseEntity<Iterable<Inquiries>>(inquiries, HttpStatus.OK);
			}
			else {
				return new ResponseEntity<HttpStatus>(HttpStatus.NOT_FOUND);
			}
		} 
		catch (HibernateException ex)
		{
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@RequestMapping(value="/createInquiry", method = RequestMethod.POST)
	public ResponseEntity<?> createNewInquiry(@RequestBody Inquiries inquiry)
	{
		
		try
		{
			inquiriesRepository.save(inquiry);
			return new ResponseEntity<Inquiries>(inquiry, HttpStatus.OK);
		} 
		catch (HibernateException ex)
		{
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@RequestMapping(value="/createContactTime", method = RequestMethod.POST)
	public ResponseEntity<?> createContactTime(@RequestBody ContactTimes contactTime)
	{
		
		try
		{
			contactTimesRepository.save(contactTime);
			return new ResponseEntity<ContactTimes>(contactTime, HttpStatus.CREATED);
		} 
		catch (HibernateException ex)
		{
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@RequestMapping(value="/createInquiryStatus", method = RequestMethod.POST)
	public ResponseEntity<?> createInquiryStatus(@RequestBody InquiryStatus inquiryStatus)
	{
		try
		{
			inquiryStatusRepository.save(inquiryStatus);
			return new ResponseEntity<InquiryStatus>(inquiryStatus, HttpStatus.CREATED);
		} 
		catch (HibernateException ex)
		{
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@RequestMapping(value="/createInquiryType", method = RequestMethod.POST)
	public ResponseEntity<?> createInquiryType(@RequestBody InquiryTypes inquiryType)
	{
		try
		{
			inquiryTypesRepository.save(inquiryType);
			return new ResponseEntity<InquiryTypes>(inquiryType, HttpStatus.CREATED);
		} 
		catch (HibernateException ex)
		{
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@RequestMapping(value="/deleteInquiry/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteInquiry(@PathVariable Integer id)
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
	
	@RequestMapping(value="/deleteInquiryType/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteInquiryType(@PathVariable Integer id)
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
	
	@RequestMapping(value="/deleteInquiryStatus/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteInquiryStatus(@PathVariable Integer id)
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
	
	@RequestMapping(value="/deleteContactTime/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteContactTime(@PathVariable Integer id)
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

