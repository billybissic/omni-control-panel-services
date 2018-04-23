package application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/CustomerRelations")
public class CustomerRelationsController {

	@Autowired
	private CustomerBookingInquiryRepository customerBookingInquiryRepository;
	@Autowired
	private CustomerMailinglistRepository customerMailinglistRepository;
	@Autowired
	private ServiceTypeRepository serviceTypeRepository;
	
	@GetMapping(path="/addNewBookingInquiry")
	public @ResponseBody String addNewBookingInquiry(@RequestParam  String firstname,
													 @RequestParam  String lastname,
													 @RequestParam  String primaryphone,
													 @RequestParam  String secondaryphone,
													 @RequestParam  String email,
													 @RequestParam  String preferredcontact,
													 @RequestParam Integer servicetypeid,
													 @RequestParam  String personalmessage) {
		CustomerBookingInquiry cBookingInquiry = new CustomerBookingInquiry();
		cBookingInquiry.setFirst_name(firstname);
		cBookingInquiry.setLast_name(lastname);
		cBookingInquiry.setPrimary_phone(primaryphone);
		cBookingInquiry.setSecondary_phone(secondaryphone);
		cBookingInquiry.setEmail(email);
		cBookingInquiry.setPreferred_contact(preferredcontact);
		cBookingInquiry.setService_type_id(servicetypeid);
		cBookingInquiry.setPersonal_message(personalmessage);
		customerBookingInquiryRepository.save(cBookingInquiry);
		return "Saved";
	}
	@GetMapping(path="/getAllBookingInquiries")
	public @ResponseBody Iterable<CustomerBookingInquiry> getAllBookingInquiries() {
		return customerBookingInquiryRepository.findAll();
	}
	
	@GetMapping(value="/addNewMailinglistEntry")
	public @ResponseBody String addNewMailingListEntry(@RequestParam String firstname,
													   @RequestParam String lastname,
													   @RequestParam String email,
													   @RequestParam String birthday) {
		CustomerMailinglist cMailingList = new CustomerMailinglist();
		cMailingList.setFirstName(firstname);
		cMailingList.setLastName(lastname);
		cMailingList.setEmail(email);
		cMailingList.setBirthday(birthday);
		customerMailinglistRepository.save(cMailingList);
		return "Saved";
	}
	@GetMapping(value="/addNewMailingListEntryWithoutBirthday")
	public @ResponseBody String addNewMailingListEntryWithoutBirthday(@RequestParam String firstname,
																	  @RequestParam String lastname,
																	  @RequestParam String email) {
		CustomerMailinglist cMailingList = new CustomerMailinglist();
		cMailingList.setFirstName(firstname);
		cMailingList.setLastName(lastname);
		cMailingList.setEmail(email);
		customerMailinglistRepository.save(cMailingList);
		return "Saved";
	}
	
	@GetMapping(path="/getAllMailinglistEntries")
	public @ResponseBody Iterable<CustomerMailinglist> getAllMailinglistEntries() {
		return customerMailinglistRepository.findAll();
	}
	
	@GetMapping(path="/getMailingListEntryByEmail")
	public @ResponseBody Iterable<CustomerMailinglist> getMailingListEntryByEmail(@RequestParam String email) {
		return customerMailinglistRepository.findByEmail(email);
	}
	
	@GetMapping(path="/addNewServiceType")
	public @ResponseBody String addNewServiceType(@RequestParam String servicetypename,
												  @RequestParam String servicetypedesc) {
		ServiceType sType = new ServiceType();
		sType.setServiceTypeName(servicetypename);
		sType.setServiceTypeDescription(servicetypedesc);
		serviceTypeRepository.save(sType);
		return "Saved";
	}
	@GetMapping(path="/getAllServiceTypes")
	public @ResponseBody Iterable<ServiceType> getAllServiceTypes() {
		return serviceTypeRepository.findAll();
	}
	
}
