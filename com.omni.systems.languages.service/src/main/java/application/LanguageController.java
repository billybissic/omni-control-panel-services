package application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/LanguageServices")
public class LanguageController {
	
	@Autowired
	private LanguageCodesRepository languagesRepository;
	
	@GetMapping(path="/getAllLanguages")
	public @ResponseBody Iterable<LanguageCodes> getAllLanguages() {
		return languagesRepository.findAll();
	}
	
	@GetMapping(path="/getLanguageByLanguageCode")
	public @ResponseBody Iterable<LanguageCodes> getLanguageByLanguageCode(@RequestParam String languagecode) {
		return languagesRepository.findByLanguageCode(languagecode);
	}

}
