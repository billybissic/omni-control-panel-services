package application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/MessageServices")
public class MessageController {

	@Autowired
	private InterfaceMessagesRepository interfaceMessagesRepository;
	@Autowired
	private ServiceMessagesRepository serviceMessagesRepository;
	
	@GetMapping(path="/addNewInterfaceMessage")
	public @ResponseBody String addNewInterfaceMessage(@RequestParam Integer interfacemessageid,
										 @RequestParam String interfacemessagetext,
										 @RequestParam Integer languagecode) {
		InterfaceMessages iMessage = new InterfaceMessages();
		iMessage.setInterfaceMessageId(interfacemessageid);
		iMessage.setInterfaceMessageText(interfacemessagetext);
		iMessage.setLanguage_code(languagecode);
		interfaceMessagesRepository.save(iMessage);
		return "Saved";
	}
	@GetMapping(path="/getAllInterfaceMessages")
	public @ResponseBody Iterable<InterfaceMessages> getAllInterfaceMessages() {
		return interfaceMessagesRepository.findAll();
	}
	
	@GetMapping(path="/getInterfaceMessageById")
	public @ResponseBody Iterable<InterfaceMessages> getInterfaceMessageById(@RequestParam Integer interfacemessageid) {
		return interfaceMessagesRepository.findByInterfaceMessageId(interfacemessageid);
	}
	
	@GetMapping(path="/deleteInterfaceMessageById")
	public @ResponseBody String deleteInterfaceMessageById(@RequestParam Integer interfacemessagebyid) {
		interfaceMessagesRepository.delete(interfaceMessagesRepository.findByInterfaceMessageId(interfacemessagebyid));
		return "Deleted";
	}
	@GetMapping(path="/addNewServiceMessage")
	public @ResponseBody String addNewServiceMessage(@RequestParam Integer servicemessageid,
									   @RequestParam String servicemessagetext,
									   @RequestParam Integer languagecode) {
		ServiceMessages sMessage = new ServiceMessages();
		sMessage.setServiceMessageId(servicemessageid);
		sMessage.setServiceMessageText(servicemessagetext);
		sMessage.setLanguageCode(languagecode);
		serviceMessagesRepository.save(sMessage);
		return "Saved";
	}
	@GetMapping(path="/getAllServiceMessages")
	public @ResponseBody Iterable<ServiceMessages> getAllServiceMessages() {
		return serviceMessagesRepository.findAll();
	}
	
	@GetMapping(path="/getServiceMessageById")
	public @ResponseBody Iterable<ServiceMessages> getServiceMessageById(@RequestParam Integer servicemessageid) {
		return serviceMessagesRepository.findByServiceMessageId(servicemessageid);
	}
	
	@GetMapping(path="/deleteServiceMessageById")
	public @ResponseBody String deleteServiceMessageById(@RequestParam Integer servicemessageid) {
		serviceMessagesRepository.delete(serviceMessagesRepository.findByServiceMessageId(servicemessageid));
		return "Deleted";
	}
}
