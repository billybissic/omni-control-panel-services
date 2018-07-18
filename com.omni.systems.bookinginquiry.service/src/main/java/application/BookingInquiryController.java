package application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/BookingInquiryServices")
public class BookingInquiryController {

	@Autowired
	private InquiriesRepository inquiriesRepository;
	@Autowired
	private ContactTimesRepository contactTimesRepository;
	@Autowired
	private InquiryTypesRepository inquiryTypesRepository;
	
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
	
	@GetMapping(path="/getInquiries")
	public @ResponseBody Iterable<Inquiries> getInquiries()
	{
		return inquiriesRepository.findAll();
	}
	
	@GetMapping(path="/createInquiry")
	public @ResponseBody String createInquiry(@RequestParam String firstName,
											  @RequestParam String lastName,
											  @RequestParam String emailAddress,
											  @RequestParam String dayPhone,
											  @RequestParam String eveningPhone,
											  @RequestParam Integer contactTimeId,
											  @RequestParam Integer inquiryTypeId,
											  @RequestParam String message)
	{
		Inquiries inquiry = new Inquiries();
		inquiry.setFirst_name(firstName);
		inquiry.setLast_name(lastName);
		inquiry.setEmail_address(emailAddress);
		inquiry.setDay_phone_number(dayPhone);
		inquiry.setEvening_phone_number(eveningPhone);
		inquiry.setContact_time_id(contactTimeId);
		inquiry.setInquiry_type_id(inquiryTypeId);
		inquiry.setMessage(message);
		inquiriesRepository.save(inquiry);
		return "Inquiry Submitted.";
	}
}
