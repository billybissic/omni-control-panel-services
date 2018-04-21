package application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/AccountsServices")
public class AccountsController {
	
	@Autowired
	private UserAddressRepository userAddressRepository;
	@Autowired
	private UserIdentityRepository userIdentityRepository;
	@Autowired
	private UsersRepository usersRepository;
	
	@GetMapping(path="/addNewUserAddress")
	public @ResponseBody String addNewUserAddress(@RequestParam String address1,
												  @RequestParam String address2,
												  @RequestParam String cityvillage,
												  @RequestParam Integer countrycode,
												  @RequestParam String countydistrict,
												  @RequestParam Integer creator,
												  @RequestParam Integer latitude,
												  @RequestParam Integer longitude,
												  @RequestParam Integer postalcode,
												  @RequestParam Integer preferred,
												  @RequestParam Integer profileid,
												  @RequestParam String region,
												  @RequestParam String stateprovince,
												  @RequestParam String townshipdivision,
												  @RequestParam Integer uuid,
												  @RequestParam Integer voided) {
		UserAddress uAddress = new UserAddress();
		uAddress.setAddress1(address1);
		uAddress.setAddress2(address2);
		uAddress.setCity_village(cityvillage);
		uAddress.setCountry_code(countrycode);
		uAddress.setCountry_district(countydistrict);
		uAddress.setCreator(creator);
		uAddress.setLatitude(latitude);
		uAddress.setLongitude(longitude);
		uAddress.setPostal_code(postalcode);
		uAddress.setPreferred(preferred);
		uAddress.setProfile_id(profileid);
		uAddress.setRegion(region);
		uAddress.setState_province(stateprovince);
		uAddress.setUuid(uuid);
		uAddress.setVoided(voided);
		userAddressRepository.save(uAddress);
		return "Deleted";
	}
	
	@GetMapping(path="/getAllUserAddresses")
	public @ResponseBody Iterable<UserAddress> getAllUserAddresses() {
		return userAddressRepository.findAll();
	}
	
	@GetMapping(path="/deleteUserAddress")
	public @ResponseBody String deleteUserAddress(@RequestParam Integer id) {
		UserAddress uAddress = new UserAddress();
		uAddress.setProfile_address_id(id);
		userAddressRepository.delete(uAddress);
		return "Deleted";
	}
	
	@GetMapping(path="/addNewUserIdentity")
	public @ResponseBody String addNewUserIdentity(@RequestParam String degree,
												   @RequestParam String familyname,
												   @RequestParam String familynameprefix,
												   @RequestParam String familynamesuffix,
												   @RequestParam String familyname2,
												   @RequestParam String givenname,
												   @RequestParam String middlename,
												   @RequestParam Integer preferred,
												   @RequestParam String prefix,
												   @RequestParam Integer uuid,
												   @RequestParam Integer userprofileid,
												   @RequestParam Integer voided) {
		UserIdentity uIdentity = new UserIdentity();
		uIdentity.setDegree(degree);
		uIdentity.setFamily_name(familyname);
		uIdentity.setFamily_name_prefix(familynameprefix);
		uIdentity.setFamily_name_suffix(familynamesuffix);
		uIdentity.setFamily_name2(familyname2);
		uIdentity.setGiven_name(givenname);
		uIdentity.setMiddle_name(middlename);
		uIdentity.setPreffered(preferred);
		uIdentity.setPrefix(prefix);
		uIdentity.setUser_id(uuid);
		uIdentity.setUser_profile_id(userprofileid);
		uIdentity.setVoided(voided);
		userIdentityRepository.save(uIdentity);
		return "Deleted";
	}
	
	@GetMapping(path="/getAllUserIdentities")
	public @ResponseBody Iterable<UserIdentity> getAllUserIdentities() {
		return userIdentityRepository.findAll();
	}
	
	@GetMapping(path="/deleteUserIdentity")
	public @ResponseBody String deleteUserIdentity(@RequestParam Integer id) {
		UserIdentity uIdentity = new UserIdentity();
		uIdentity.setPerson_id(id);
		userIdentityRepository.delete(uIdentity);
		return "Deleted";
	}
	
	@GetMapping(path="/addNewUser")
	public @ResponseBody String addNewUser(@RequestParam String useremail,
										   @RequestParam Integer useremailauthenticated,
										   @RequestParam Integer userlanguagecode,
										   @RequestParam String username,
										   @RequestParam String userpassword,
										   @RequestParam Integer usertimezonecode,
										   @RequestParam Integer uuid) {
		Users user = new Users();
		user.setUser_email(useremail);
		user.setUser_email_authenticated(useremailauthenticated);
		user.setUser_language_code(userlanguagecode);
		user.setUser_name(username);
		user.setUser_password(userpassword);
		user.setUser_preferred_admin_language_code(usertimezonecode);
		user.setUuid(uuid);
		usersRepository.save(user);
		return "Deleted";
	}
	
	@GetMapping(path="/getAllUsers")
	public @ResponseBody Iterable<Users> getAllUsers() {
		return usersRepository.findAll();
	}
	
	@GetMapping(path="/deleteUser")
	public @ResponseBody String deleteUser(@RequestParam Integer id) {
		Users user = new Users();
		user.setUuid(id);
		usersRepository.delete(user);
		return "Deleted";
	}
}
