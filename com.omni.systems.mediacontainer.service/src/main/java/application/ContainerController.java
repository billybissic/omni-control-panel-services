package application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/ContainerServices")
public class ContainerController {

	@Autowired
	private ContainerOrderTypeRepository containerOrderTypeRepository;
	@Autowired
	private ContainerPermissionsRepository containerPermissionsRepository;
	@Autowired
	private ContainerTypesRepository containerTypesRepository;
	@Autowired
	private DisplayObjectRepository displayObjectRepository;
	@Autowired
	private DisplayObjectTypeRepository displayObjectTypeRepository;
	@Autowired
	private MediaContainerRepository mediaContainerRepository;

	@GetMapping(path="/addContainerOrderType")
	public @ResponseBody String addNewContainerOrderType(@RequestParam String containerordername,
														 @RequestParam String containerorderdescription) {
		
		ContainerOrderType cOrderType = new ContainerOrderType();
		cOrderType.setContainer_order_name(containerordername);
		cOrderType.setContainer_order_description(containerorderdescription);
		containerOrderTypeRepository.save(cOrderType);
		return "Saved";
	}
	
	@GetMapping(path="/getContainerOrderType")
	public @ResponseBody Iterable<ContainerOrderType> getContainerOrderType(){
		return containerOrderTypeRepository.findAll();
	}
	
	@GetMapping(path="/deleteContainerOrderType")
	public @ResponseBody String deleteContainerOrderType(@RequestParam Integer id) {
		ContainerOrderType cOrderType = new ContainerOrderType();
		cOrderType.setContainer_order_type_id(id);
		containerOrderTypeRepository.delete(cOrderType);
		return "Deleted";
	}
	
	@GetMapping(path="/addNewContainerPermissions")
	public @ResponseBody String addNewContainerPermissions(@RequestParam Integer admin,
														   @RequestParam String permissionsname,
														   @RequestParam Boolean is_parent_container,
														   @RequestParam Integer abletoaddalbum,
														   @RequestParam Integer abletoaddchildcontainer,
														   @RequestParam Integer abletoaddmediaobject,
														   @RequestParam Integer abletodeletealbum,
														   @RequestParam Integer abletodeletechildcontainer,
														   @RequestParam Integer abletodeletechildobjects,
														   @RequestParam Integer abletodeleteobjects,
														   @RequestParam Integer abletoeditalbum,
														   @RequestParam Integer albetoeditmediaobject,
														   @RequestParam Integer abletoehidewatermark,
														   @RequestParam Integer albumetosynchronize) {
		
		ContainerPermissions cPermissions = new ContainerPermissions();
		cPermissions.setContainer_admin(admin);
		cPermissions.setContainer_permissions_name(permissionsname);
		cPermissions.setIs_parent_container(is_parent_container);
		cPermissions.setAble_to_add_album(abletoaddalbum);
		cPermissions.setAble_to_add_child_container(abletoaddchildcontainer);
		cPermissions.setAble_to_add_media_object(abletoaddmediaobject);
		cPermissions.setAble_to_delete_child_container(abletodeletechildcontainer);
		cPermissions.setAble_to_delete_child_objects(abletodeletechildobjects);
		cPermissions.setAble_to_delete_objects(abletodeleteobjects);
		cPermissions.setAble_to_edit_album(abletoeditalbum);
		cPermissions.setAble_to_edit_media_object(albetoeditmediaobject);
		cPermissions.setAble_to_hide_water_mark(abletoehidewatermark);
		cPermissions.setAble_to_synchronize(albumetosynchronize);
		containerPermissionsRepository.save(cPermissions);
		return "Saved";
	}
	
	@GetMapping(path="/getContainerPermissiones")
	public @ResponseBody Iterable<ContainerPermissions> getContainerPermissions(){
		return containerPermissionsRepository.findAll();
	}
	
	@GetMapping(path="/deleteContainerPermissions")
	public @ResponseBody String deleteContainerPermissions(@RequestParam Integer id) {
		ContainerPermissions cPermissions = new ContainerPermissions();
		cPermissions.setContainer_permissions_id(id);
		return "Delete";
	}
	
	@GetMapping(path="/addNewContainerTypes")
	public @ResponseBody String addNewContainerTypes(@RequestParam String containertypename,
													 @RequestParam String containertypedescription) {
		ContainerTypes cType = new ContainerTypes();
		cType.setContainer_type_name(containertypename);
		cType.setContainer_type_description(containertypedescription);
		containerTypesRepository.save(cType);
		return "Saved";
	}
	
	@GetMapping(path="/getContainerTypes")
	public @ResponseBody Iterable<ContainerTypes> getContainerTypes() {
		return containerTypesRepository.findAll();
	}
	
	@GetMapping(path="/deleteContainerTypes")
	public @ResponseBody String deleteContainerTypes(@RequestParam Integer id) {
		ContainerTypes cType = new ContainerTypes();
		cType.setContainer_type_id(id);
		return "Deleted";
	}

	@GetMapping(path="/addNewDisplayObject")
	public @ResponseBody String addNewDisplayObject(@RequestParam Integer displayobjecttypeid,
												   @RequestParam Integer height,
												   @RequestParam Integer width,
												   @RequestParam String htmloutput,
												   @RequestParam String scriptoutput,
												   @RequestParam String url,
												   @RequestParam Integer viewsize) {
		DisplayObject dObject = new DisplayObject();
		dObject.setDisplay_object_type_id(displayobjecttypeid);
		dObject.setHeight(height);
		dObject.setHeight(height);
		dObject.setHtml_output(htmloutput);
		dObject.setScript_output(scriptoutput);
		dObject.setUrl(url);
		dObject.setView_size(viewsize);
		displayObjectRepository.save(dObject);
		return "Saved";
	}
	
	@GetMapping(path="/getDisplayObjects")
	public @ResponseBody Iterable<DisplayObject> getDisplayObjects() {
		return displayObjectRepository.findAll();
	}
	
	@GetMapping(path="/deleteDisplayObject")
	public @ResponseBody String deleteDisplayObject(@RequestParam Integer id) {
		DisplayObject dObject = new DisplayObject();
		dObject.setObject_id(id);
		return "Deleted";
	}

	@GetMapping(path="/addNewDisplayObjectType")
	public @ResponseBody String addNewDisplayObjectType(@RequestParam String objecttype,
														@RequestParam String objectdescription) {
		DisplayObjectType dObjectType = new DisplayObjectType();
		dObjectType.setDisplay_object_type(objecttype);
		dObjectType.setDisplay_object_description(objectdescription);
		displayObjectTypeRepository.save(dObjectType);
		return "Saved";
	}
	
	@GetMapping(path="/getAllDisplayObjectTypes")
	public @ResponseBody Iterable<DisplayObjectType> getAllDisplayObjectTypes() {
		return displayObjectTypeRepository.findAll();
	}
	
	@GetMapping(path="/deleteDisplayObjectType")
	public @ResponseBody String deleteDisplayObjectType(@RequestParam Integer id) {
		DisplayObjectType dObjectType = new DisplayObjectType();
		dObjectType.setDisplay_object_type_id(id);
		displayObjectTypeRepository.delete(dObjectType);
		return "Deleted";
	}

	@GetMapping(path="/addNewMediaContainer")
	public @ResponseBody String addNewMediaContainer(@RequestParam Integer containertypeid,
													 @RequestParam Integer containerpermissionsid,
													 @RequestParam Integer containermimetype,
													 @RequestParam Integer containerorderid,
													 @RequestParam Integer containerheight,
													 @RequestParam Integer containerwidth) {
		MediaContainer mContainer = new MediaContainer();
		mContainer.setContainer_type_id(containertypeid);
		mContainer.setContainer_permissions_id(containerpermissionsid);
		mContainer.setContainer_mime_type(containermimetype);
		mContainer.setContainer_order_id(containerorderid);
		mContainer.setContainer_height(containerheight);
		mContainer.setContainer_width(containerwidth);
		mediaContainerRepository.save(mContainer);
		return "Saved";
	}
	
	@GetMapping("/getAllMediaContainers")
	public @ResponseBody Iterable<MediaContainer> getAllMediaContainers() {
		return mediaContainerRepository.findAll();
	}
	
	@GetMapping("/deleteMediaContainer")
	public @ResponseBody String deleteMediaContainer(@RequestParam Integer id) {
		MediaContainer mContainer = new MediaContainer();
		mContainer.setContainer_type_id(id);
		mediaContainerRepository.delete(mContainer);
		return "Deleted";
	}
}
