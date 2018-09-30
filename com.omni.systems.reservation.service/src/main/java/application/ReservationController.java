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
public class ReservationController {

	@Autowired
	private ReservationsRepository inquiriesRepository;
	@Autowired
	private ContactTimesRepository contactTimesRepository;
	@Autowired
	private ReservationTypesRepository inquiryTypesRepository;
	
	@GetMapping(path="/getInquiryTypes")
	public @ResponseBody Iterable<ReservationTypes> getInquiryTypes()
	{
		return inquiryTypesRepository.findAll();
	}
	
	@GetMapping(path="/getContactTimes")
	public @ResponseBody Iterable<ContactTimes> getContactTimes()
	{
		return contactTimesRepository.findAll();
	}
	
	@GetMapping(path="/getInquiries")
	public @ResponseBody Iterable<Reservations> getInquiries()
	{
		return inquiriesRepository.findAll();
	}
	
	@RequestMapping(value="/createInquiry", method = RequestMethod.POST)
	public ResponseEntity<Reservations> createNewInquiry(@RequestBody Reservations inquiry)
	{
		inquiriesRepository.save(inquiry);
		return new ResponseEntity<Reservations>(inquiry, HttpStatus.OK);
	}
}
