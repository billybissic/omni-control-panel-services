package application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/MailingListServices")
public class MailingListController {
	
	@Autowired
	private SubscribersRepository subscribersRepository;
	
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

	@GetMapping(path="/seeAllSubscribers")
	public @ResponseBody Iterable<Subscribers> getAllSubscribers() 
	{
		return subscribersRepository.findAll();
	}
	
	@GetMapping(path="/findSubscriberById")
	public ResponseEntity<Subscribers> getSubscriberById(@RequestBody Subscribers subscriber)
	{
		Subscribers existingSubscriber = subscribersRepository.findOne(subscriber.getSubscriber_id());
		if (existingSubscriber.equals(subscriber))
		{
			return new ResponseEntity<Subscribers>(subscriber, HttpStatus.OK);
		}
		else
		{
			throw new SubscriberNotFoundException(subscriber.getSubscriber_email() + ", not found");
		}
	}
}

