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
import application.domain.Subscriber;
import application.exception.DuplicateSubscriberException;
import application.exception.DuplicateSubscriberGroupException;
import application.exception.NoDataAvailableException;
import application.exception.NoUnassignedSubscribersFoundException;
import application.exception.SubscriberNotFoundException;
import application.repository.SubscriberGroupMembersRepository;
import application.repository.SubscriberGroupsRepository;
import application.repository.SubscriberRepository;

/**
 * @author Billy Bissic
 *
 */
@RestController
@RequestMapping(path="/MailingListServices")
public class MailingListController {
	
	@Autowired
	private SubscriberRepository subscribersRepository;
	@Autowired
	private SubscriberGroupsRepository subscriberGroupsRepository;
	@Autowired
	private SubscriberGroupMembersRepository subscriberGroupMembersRepository;
	
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
	
	@GetMapping(path="/getSubscribersCount")
	public @ResponseBody long getSubscribersCount()
	{
		return subscribersRepository.count();
	}
	
	@GetMapping(path="/seeAllSubscribers")
	public @ResponseBody Iterable<Subscriber> getAllSubscribers() 
	{
		return subscribersRepository.findAll();
	}
	
	@GetMapping(path="/findSubscriberById")
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
	
	@GetMapping(path="/getAllSubscriberGroups")
	public @ResponseBody Iterable<SubscriberGroups> getAllSubscriberGroups()
	{
		return subscriberGroupsRepository.findAll();
	}
	
	@GetMapping(path="/getUnAssignedSubscribers")
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
	
	@RequestMapping(path="/deleteSubscriber/{id}", method = RequestMethod.GET)
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
	
	@RequestMapping(path="/deleteSubscriberGroup/{id}", method = RequestMethod.GET)
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
	
	@RequestMapping(path="/deleteSubscriberGroupMember/{groupId}/{subscriberId}", method = RequestMethod.GET)
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
}

