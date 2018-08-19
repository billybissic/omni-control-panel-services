package application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	@RequestMapping(value="/createInquiry", method = RequestMethod.POST)
	public ResponseEntity<Inquiries> createNewInquiry(@RequestBody Inquiries inquiry)
	{
		inquiriesRepository.save(inquiry);
		return new ResponseEntity<Inquiries>(inquiry, HttpStatus.OK);
	}
}
