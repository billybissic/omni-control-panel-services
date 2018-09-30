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
package application;

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

/**
 * @author Billy Bissic
 *
 */
@RestController
@RequestMapping(path="/MailingListServices")
public class MailingListController {
	
	@Autowired
	private SubscribersRepository subscribersRepository;
	@Autowired
	private SubscriberGroupsRepository subscriberGroupsRepository;
	@Autowired
	private SubscriberGroupMembersRepository subscriberGroupMembersRepository;
	
	@RequestMapping(value="/subscribe", method = RequestMethod.POST)
	public ResponseEntity<Subscribers> addNewSubscriber(@RequestBody Subscribers subscriber)
	{
		//Check to see if they have already subscribed.
		List<Subscribers> existingSubscriber = subscribersRepository.findBySubscriberEmail(subscriber.getSubscriber_email());
		if (existingSubscriber.isEmpty())
		{
			subscribersRepository.save(subscriber);
			return new ResponseEntity<Subscribers>(subscriber, HttpStatus.OK);
		}
		else
		{
			throw new DuplicateSubscriberException("Subscriber_email:" + subscriber.getSubscriber_email());
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
	public @ResponseBody Iterable<Subscribers> getAllSubscribers() 
	{
		return subscribersRepository.findAll();
	}
	
	@GetMapping(path="/findSubscriberById")
	public ResponseEntity<Subscribers> getSubscriberById(@RequestBody Subscribers subscriber)
	{
		Subscribers existingSubscriber = subscribersRepository.findById(subscriber.getSubscriber_id());
		if (existingSubscriber.equals(subscriber))
		{
			return new ResponseEntity<Subscribers>(subscriber, HttpStatus.OK);
		}
		else
		{
			throw new SubscriberNotFoundException(subscriber.getSubscriber_email() + ", not found");
		}
	}
	
	@GetMapping(path="/getAllSubscriberGroups")
	public @ResponseBody Iterable<SubscriberGroups> getAllSubscriberGroups()
	{
		return subscriberGroupsRepository.findAll();
	}
	
	/* TODO: Query needs to be fixed */
	/*
	@GetMapping(path="/getUnAssignedSubscribers")
	public @ResponseBody Iterable<Subscribers> getUnAssignedSubscribers()
	{
		List<Integer> memberIds = subscriberGroupMembersRepository.findMemberIds();
		return subscribersRepository.findUnAssignedSubscribers(memberIds);
		//return subscribersRepository.findUnAssignedSubscribers();
	}*/
	
	@GetMapping(path="/getAllSubscriberGroupMembers")
	public @ResponseBody Iterable<SubscriberGroups> getAllSubscriberGroupMembers(Integer groupId)
	{
		return subscriberGroupMembersRepository.subscribersOfGroup(groupId);
	}
	
	@DeleteMapping(path="/deleteSubscriber/{id}")
	public ResponseEntity<HttpStatus> deleteSubscriber(@PathVariable Integer id)
	{
		try
		{
			subscribersRepository.deleteById(id);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		}
		catch (HibernateException ex)
		{
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.I_AM_A_TEAPOT);
		}
	}
	
	@DeleteMapping(path="/deleteSubscriberGroup/{id}")
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
			return new ResponseEntity<HttpStatus>(HttpStatus.I_AM_A_TEAPOT);
		}
	}
	
	@DeleteMapping(path="/deleteSubscriberGroupMember/{groupId}/{subscriberId}")
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
			return new ResponseEntity<HttpStatus>(HttpStatus.I_AM_A_TEAPOT);
		}
	}
}

