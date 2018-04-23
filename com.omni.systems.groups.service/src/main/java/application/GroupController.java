package application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/GroupServices")
public class GroupController {

	@Autowired
	private GroupsRepository groupsRepository;
	@Autowired
	private UsersGroupsRepository usersGroupsRepository;

	@GetMapping(path="/addNewGroup")
	public @ResponseBody String addNewGroup(@RequestParam String name,
											@RequestParam String description) {
		Groups group = new Groups();
		group.setGroup_name(name);
		group.setGroup_desc(description);
		return "Saved";
	}
	
	@GetMapping(path="/getAllGroups")
	public @ResponseBody Iterable<Groups> getAllGroups() {
		return groupsRepository.findAll();
	}
	
	@GetMapping(path="/deleteGroup")
	public @ResponseBody String deleteGroup(@RequestParam Integer id) {
		Groups group = new Groups();
		group.setGroup_id(id);
		groupsRepository.delete(group);
		return "Deleted";
	}
	
	@GetMapping(path="/addNewUserGroup")
	public @ResponseBody String addNewUserGroup(@RequestParam Integer groupid,
												@RequestParam Integer uuid) {
		UsersGroups uGroup = new UsersGroups();
		uGroup.setGroup_id(groupid);
		uGroup.setUuid(uuid);
		usersGroupsRepository.save(uGroup);
		return "Saved";
	}
	
	@GetMapping(path="/getAllUserGroup")
	public @ResponseBody Iterable<UsersGroups> getAllUsersGroups() {
		return usersGroupsRepository.findAll();
	}
	
	@GetMapping(path="/deleteUsersGroup")
	public @ResponseBody String deleteUsersGroup(@RequestParam Integer Id) {
		UsersGroups uGroup = new UsersGroups();
		uGroup.setGroup_id(Id);
		usersGroupsRepository.delete(uGroup);
		return "Deleted";
	}
}
