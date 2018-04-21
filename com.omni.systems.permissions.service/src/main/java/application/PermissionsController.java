package application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/Permissions")
public class PermissionsController {
	@Autowired
	private GroupRolesRepository groupRolesRepository;
	@Autowired 
	private PrivilegeRepository privilegeRepository;
	@Autowired
	private RolePrivilegesRepository rolePrivilegesRepository;
	@Autowired
	private RolesRepository rolesRepository;
	@Autowired
	private UserRolesRepository userRolesRepository;
	
	@GetMapping(path="/addNewGroupRole")
	public @ResponseBody String addNewGroupRole(@RequestParam Integer groupid,
												@RequestParam Integer roleid) {
		GroupRoles gRole = new GroupRoles();
		gRole.setGroup_id(groupid);
		gRole.setRole_id(roleid);
		groupRolesRepository.save(gRole);
		return "Saved";
	}
	@GetMapping(path="/getAllGroupRoles")
	public @ResponseBody Iterable<GroupRoles> getAllGroupRoles() {
		return groupRolesRepository.findAll();
	}
	
	@GetMapping(path="deleteGroupRole")
	public @ResponseBody String deleteGroupRole(@RequestParam Integer groupid,
												@RequestParam Integer roleid) {
		GroupRoles gRole = new GroupRoles();
		gRole.setGroup_id(groupid);
		gRole.setRole_id(roleid);
		groupRolesRepository.delete(gRole);
		return "Deleted";
	}
	
	@GetMapping(path="/addNewPrivilege")
	public @ResponseBody String addNewPrivilege(@RequestParam String privilegename,
												@RequestParam String privilegedescription) {
		Privilege privilege = new Privilege();
		privilege.setPrivilege(privilegename);
		privilege.setPrivilege_description(privilegedescription);
		privilegeRepository.save(privilege);
		return "Saved";
	}
	@GetMapping(path="/getAllPrivileges")
	public @ResponseBody Iterable<Privilege> getAllPrivileges() {
		return privilegeRepository.findAll();
	}
	
	@GetMapping(path="/deletePrivilege")
	public @ResponseBody String deletePrivilege(@RequestParam Integer id) {
		Privilege privilege = new Privilege();
		privilege.setPrivilege_id(id);
		privilegeRepository.delete(privilege);
		return "Deleted";
	}
	
	@GetMapping(path="/addNewRolePrivilege")
	public @ResponseBody String addNewRolePrivilege(@RequestParam Integer privilegeid,
													@RequestParam Integer roleid) {
		RolePrivileges rPrivilege = new RolePrivileges();
		rPrivilege.setPrivilege_id(privilegeid);
		rPrivilege.setRole_id(roleid);
		rolePrivilegesRepository.save(rPrivilege);
		return "Saved";
	}
	
	@GetMapping(path="/getAllRolePrivileges")
	public @ResponseBody Iterable<RolePrivileges> getAllRolePrivileges() {
		return rolePrivilegesRepository.findAll();
	}
	
	@GetMapping(path="/deleteRolePrivilege")
	public @ResponseBody String deleteRolePrivilege(@RequestParam Integer privilegeid,
													@RequestParam Integer roleid) {
		RolePrivileges rPrivilege = new RolePrivileges();
		rPrivilege.setPrivilege_id(privilegeid);
		rPrivilege.setRole_id(roleid);
		rolePrivilegesRepository.delete(rPrivilege);
		return "Deleted";
	}
	
	@GetMapping(path="/addNewRole")
	public @ResponseBody String addNewRole(@RequestParam String rolename,
										   @RequestParam String roledescription) {
		Roles role = new Roles();
		role.setRole_name(rolename);
		role.setRole_description(roledescription);
		rolesRepository.save(role);
		return "Saved";
	}
	
	@GetMapping(path="/getAllRoles")
	public @ResponseBody Iterable<Roles> getAllRoles() {
		return rolesRepository.findAll();
	}
	
	@GetMapping(path="/getAllUserRoles")
	public @ResponseBody Iterable<UserRoles> getAllUserRoles() {
		return userRolesRepository.findAll();
	}
	
	@GetMapping(path="/deleteRole")
	public @ResponseBody String deleteRole(@RequestParam Integer roleid,
										   @RequestParam String rolename,
										   @RequestParam String roledescription) {
		Roles role = new Roles();
		role.setRole_id(roleid);
		role.setRole_name(rolename);
		role.setRole_description(roledescription);
		rolesRepository.delete(role);
		return "Deleted";
	}
}
