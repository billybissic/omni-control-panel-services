package application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/ApplicationSettings")
public class SettingsController {
	@Autowired
	private ApplicationSettingsRepository applicationSettingsRepository;
	
	@GetMapping(path="/getAllApplicationSettings")
	public @ResponseBody Iterable<ApplicationSettings> getAllApplicationSettings()
	{
		return applicationSettingsRepository.findAll();
	}
	
	@GetMapping(path="/getApplicationSettingsByApplicationName")
	public @ResponseBody Iterable<ApplicationSettings> gettApplicationSettingsByName(@RequestParam String applicationname)
	{
		return applicationSettingsRepository.findByApplicationName(applicationname);
	}

	@GetMapping(path="/addNewApplicationSetting")
	public @ResponseBody String addNewApplicationSetting(@RequestParam String applicationname,
														 @RequestParam String applicationsettingname,
														 @RequestParam String applicationsettingdescription,
														 @RequestParam String applicationsettingvalue,
														 @RequestParam Integer userid)	
	{
		ApplicationSettings aSettings = new ApplicationSettings();
		aSettings.setApplicationName(applicationname);
		aSettings.setApplicationSettingName(applicationsettingname);
		aSettings.setApplicationSettingDescription(applicationsettingdescription);
		aSettings.setApplicationSettingValue(applicationsettingvalue);
		aSettings.setLastModifiedUserid(userid);
		applicationSettingsRepository.save(aSettings);
		return "Saved";
	}
	
	@GetMapping(path="/deleteApplicationSetting")
	public @ResponseBody String deleteApplicationSetting(@RequestParam Integer applicationsettingsid) {
		Iterable<ApplicationSettings> aSettings = applicationSettingsRepository.findByApplicationSettingsId(applicationsettingsid);
		applicationSettingsRepository.delete(aSettings);
		return "Deleted";
	}
}
