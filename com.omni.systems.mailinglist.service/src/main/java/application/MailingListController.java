package application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/MailingListServices")
public class MailingListController {
	
	@Autowired
	private SubscribersRepository subscribersRepository;
	
	@GetMapping(path="/subscribe")
	public @ResponseBody String addNewSubscriber(@RequestParam String first_name,
												 @RequestParam String last_name,
												 @RequestParam String subscriber)
	{
		String returnMessage;
		Subscribers newSubscriber = new Subscribers();
		//Check to see if they have already subscribed.
		List<Subscribers> existingSubscriber = subscribersRepository.findBySubscriberEmail(subscriber);
		if (existingSubscriber.isEmpty())
		{
			newSubscriber.setFirst_name(first_name);
			newSubscriber.setLast_name(last_name);
			newSubscriber.setSubscriber_email(subscriber);
			subscribersRepository.save(newSubscriber);
			returnMessage = "Thanks for subscribing" + first_name + " " + last_name + "!" + subscriber + " has been added to the mailing list.";
			return returnMessage;
		}
		else
		{
			returnMessage = "Already subscribed!";
			return returnMessage;
		}
	}

	@GetMapping(path="/seeAllSubscribers")
	public @ResponseBody Iterable<Subscribers> getAllSubscribers() 
	{
		return subscribersRepository.findAll();
	}
}
