package application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/Profiles")
public class ProfileController {
	
	@Autowired
	private ProfilesRepository profilesRepository;
	@Autowired
	private ProfileAttributesRepository profileAttributesRepository;
	@Autowired
	private ProfileAttributeTypeRepository profileAttributeTypeRepository;

	@GetMapping(path="/addNewProfile")
	public @ResponseBody String addNewProfile(@RequestParam String birthdate,
											  @RequestParam Integer creator,
											  @RequestParam String gender,
											  @RequestParam Integer notifyonpasswordchange,
											  @RequestParam Integer uuid) {
		Profiles profile = new Profiles();
		profile.setBirthdate(birthdate);
		profile.setCreator(creator);
		profile.setGender(gender);
		profile.setNotify_user_on_password_change(notifyonpasswordchange);
		profile.setUuid(uuid);
		profilesRepository.save(profile);
		return "Saved";
	}
	
	@GetMapping(path="/getAllProfiles")
	public @ResponseBody Iterable<Profiles> getAllProfiles() {
		return profilesRepository.findAll();
	}
	
	@GetMapping(path="/deleteProfile")
	public @ResponseBody String deleteProfile(@RequestParam Integer id) {
		Profiles profile = new Profiles();
		profile.setProfile_id(id);
		profilesRepository.delete(profile);
		return "Deleted";
	}
	
	@GetMapping(path="/addNewProfileAttribute")
	public @ResponseBody String addNewProfileAttribute(@RequestParam Integer creator,
													   @RequestParam String datecreated,
													   @RequestParam Integer profileattributetypeid,
													   @RequestParam Integer profileid,
													   @RequestParam Integer uuid,
													   @RequestParam String value) {
		ProfileAttributes pAttributes = new ProfileAttributes();
		pAttributes.setCreator(creator);
		pAttributes.setDate_created(datecreated);
		pAttributes.setProfile_attribute_type_id(profileattributetypeid);
		pAttributes.setProfile_id(profileid);
		pAttributes.setUuid(uuid);
		pAttributes.setValue(value);
		return "Saved";
	}
	
	@GetMapping(path="/getAllProfileAttributes")
	public @ResponseBody Iterable<ProfileAttributes> getAllProfileAttributes() {
		return profileAttributesRepository.findAll();
	}
	
	@GetMapping(path="/deleteProfileAttribute")
	public @ResponseBody String deleteProfileAttribute(@RequestParam Integer id) {
		ProfileAttributes pAttributes = new ProfileAttributes();
		pAttributes.setProfile_attribute_id(id);
		profileAttributesRepository.delete(pAttributes);
		return "Deleted";
	}

	@GetMapping(path="/addNewProfileAttributeType")
	public @ResponseBody String addNewProfileAttributeType(@RequestParam Integer creator,
													   @RequestParam String datecreated,
													   @RequestParam String editprivilege,
													   @RequestParam String format,
													   @RequestParam String name,
													   @RequestParam Integer searchable,
													   @RequestParam Integer sortweight) {
		ProfileAttributeType pAttributeType = new ProfileAttributeType();
		pAttributeType.setCreator(creator);
		pAttributeType.setDate_created(datecreated);
		pAttributeType.setEdit_privilege(editprivilege);
		pAttributeType.setFormat(format);
		pAttributeType.setFormat(format);
		pAttributeType.setName(name);
		pAttributeType.setSearchable(searchable);
		pAttributeType.setSort_weight(sortweight);
		profileAttributeTypeRepository.save(pAttributeType);
		return "Saved";
	}
	@GetMapping(path="/getAllProfileAttributeTypes")
	public @ResponseBody Iterable<ProfileAttributeType> getAllProfileAttributeTypes() {
		return profileAttributeTypeRepository.findAll();
	}
	
	@GetMapping(path="/deleteProfileAttributeType")
	public @ResponseBody String deleteProfileAttributeType(@RequestParam Integer id) {
		ProfileAttributeType pAttributeType = new ProfileAttributeType();
		pAttributeType.setProfile_attritbute_type_id(id);
		return "Deleted";
	}
}
