package application;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/GalleryServices")
public class PhotoGalleryController {

	@Autowired
	private GalleryRepository galleryRepository;
	@Autowired
	private GalleryChildrenRepository galleryChildrenRepository;
	@Autowired
	private GalleryGroupTypeRepository galleryGroupTypeRepository;
	@Autowired
	private GalleryItemRepository galleryItemRepository;
	@Autowired
	private GalleryObjectTypeRepository galleryObjectTypeRepository;
	@Autowired
	private GalleryStatRepository galleryStatRepository;
	
	@GetMapping(path="/addGallery")
	public @ResponseBody String addNewGallery(@RequestParam String captiontimestamp,
											  @RequestParam Integer captionid,
											  @RequestParam String dateend,
											  @RequestParam String datestart,
											  @RequestParam Integer gallerygrouptypeid,
											  @RequestParam String gallerysummary,
											  @RequestParam Integer isprivate,
											  @RequestParam String lastmodifiedtimestamp,
											  @RequestParam Integer serialnumber,
											  @RequestParam Integer themeid,
											  @RequestParam Integer uuid) {
		Gallery gallery = new Gallery();
		gallery.setCaption_timestamp(captiontimestamp);
		gallery.setCaptions_id(captionid);
		gallery.setDate_start(datestart);
		gallery.setDate_end(dateend);
		gallery.setGallery_group_type_id(gallerygrouptypeid);
		gallery.setGallery_summary(gallerysummary);
		gallery.setIs_private(isprivate);
		gallery.setLast_modified_timestamp(lastmodifiedtimestamp);
		gallery.setSerial_number(serialnumber);
		gallery.setTheme_id(themeid);
		gallery.setUuid(uuid);
		galleryRepository.save(gallery);
		return "Saved";
	}
	
	@GetMapping(path="/getAllGalleries")
	public @ResponseBody Iterable<Gallery> getAllGalleries()
	{
		return galleryRepository.findAll();
	}
	
	@GetMapping(path="/deleteGallery")
	public @ResponseBody String deleteGallery(@RequestParam Integer id)
	{
		Gallery gallery = new Gallery();
		gallery.setGallery_id(id);
		galleryRepository.delete(gallery);
		return "Deleted";
	}
	
	@GetMapping(path="/addGalleryChild")
	public @ResponseBody String addNewGalleryChild(@RequestParam Integer childid,
												   @RequestParam Integer parentid) {
		GalleryChildren gChild = new GalleryChildren();
		gChild.setChild_id(childid);
		gChild.setParent_id(parentid);
		galleryChildrenRepository.save(gChild);
		return "Saved";
	}
	
	@GetMapping(path="/getGalleryChildren")
	public @ResponseBody Iterable<GalleryChildren> getAllGalleryChildren()
	{
		return galleryChildrenRepository.findAll();
	}

	@GetMapping(path="/deleteGalleryChild")
	public @ResponseBody String deleteGalleryChild(@RequestParam Integer id) {
		GalleryChildren gChild = new GalleryChildren();
		gChild.setChild_id(id);
		galleryChildrenRepository.delete(gChild);
		return "Deleted";
	}
	
	@GetMapping(path="/addGalleryGroupType")
	public @ResponseBody String addNewGalleryGroupType(@RequestParam String groupname) {
		GalleryGroupType gGroupType = new GalleryGroupType();
		gGroupType.setGroup_name(groupname);
		galleryGroupTypeRepository.save(gGroupType);
		return "Saved";
	}
	
	@GetMapping(path="/getGalleryGroupTypes")
	public @ResponseBody Iterable<GalleryGroupType> getAllGalleryGoupTypes()
	{
		return galleryGroupTypeRepository.findAll();
	}

	@GetMapping(path="/deleteGalleryGroupType")
	public @ResponseBody String deleteGalleryGroupType(@RequestParam Integer id) {
		GalleryGroupType gGroupType = new GalleryGroupType();
		gGroupType.setGroup_type_id(id);
		galleryGroupTypeRepository.delete(gGroupType);
		return "Deleted";
	}
	
	@GetMapping(path="/addGalleryItem")
	public @ResponseBody String addNewGalleryItem(@RequestParam String gallery_item,
												  @RequestParam Integer captionid,
												  @RequestParam String description,
												  @RequestParam Integer gallerycontainerid,
												  @RequestParam Integer galleryobjecttypeid,
												  @RequestParam Integer itemtypeid,
												  @RequestParam String keywords,
												  @RequestParam Integer layoutordernumber,
												  @RequestParam Integer mimetypeid,
												  @RequestParam String orderby,
												  @RequestParam String orderdirection,
												  @RequestParam String orderweight,
												  @RequestParam String title,
												  @RequestParam Integer uuid) {
		GalleryItem gItem = new GalleryItem();
		gItem.setGallery_item(gallery_item);
		gItem.setCaption_id(captionid);
		gItem.setDescription(description);
		gItem.setGallery_container_id(gallerycontainerid);
		gItem.setGallery_object_type_id(galleryobjecttypeid);
		gItem.setItem_type_id(itemtypeid);
		gItem.setKeywords(keywords);
		gItem.setLayout_order_number(layoutordernumber);
		gItem.setMime_type_id(mimetypeid);
		gItem.setOrder_by(orderby);
		gItem.setOrder_direction(orderdirection);
		gItem.setOrder_weight(orderweight);
		gItem.setTitle(title);
		galleryItemRepository.save(gItem);
		return "Saved";
	}
	
	@GetMapping(path="/getAllGalleryItems")
	public @ResponseBody Iterable<GalleryItem> getAllGalleryItems()
	{
		return galleryItemRepository.findAll();
	}
	@GetMapping(path="/addGalleryObjectType")
	public @ResponseBody String addNewGalleryObjectType(@RequestParam String galleryobjecttype) {
		GalleryObjectType gObjectType = new GalleryObjectType();
		gObjectType.setGallery_object_type(galleryobjecttype);
		galleryObjectTypeRepository.save(gObjectType);
		return "Saved";
	}
	@GetMapping(path="/getAllGalleryObjectTypes")
	public @ResponseBody Iterable<GalleryObjectType> getAllGalleryObjectTypes()
	{
		return galleryObjectTypeRepository.findAll();
	}
	
	@GetMapping(path="/deleteGalleryObjectType")
	public @ResponseBody String deleteGalleryObjectType(@RequestParam Integer id)
	{
		GalleryObjectType gObjectType = new GalleryObjectType();
		gObjectType.setGallery_object_type_id(id);
		galleryObjectTypeRepository.delete(gObjectType);
		return "Deleted";
	}
	
	@GetMapping(path="/addGalleryStats")
	public @ResponseBody String addNewGalleryStats(@RequestParam Integer galleryid,
												   @RequestParam Integer numberofalbums,
												   @RequestParam Integer numberofmediaitems,
												   @RequestParam Integer numberofviews,
												   @RequestParam String viewedsincetimestamp) {
		GalleryStat gStat = new GalleryStat();
		gStat.setGallery_id(galleryid);
		gStat.setNumber_of_albums(numberofalbums);
		gStat.setNumber_of_media_items(numberofmediaitems);
		gStat.setNumber_of_views(numberofviews);
		gStat.setViewed_since_timestamp(viewedsincetimestamp);
		galleryStatRepository.save(gStat);
		return "Saved";
	}
	@GetMapping(path="/getGalleryStats")
	public @ResponseBody Iterable<GalleryStat> getAllGalleryStats()
	{
		return galleryStatRepository.findAll();
	}
	
	@GetMapping(path="/deleteGalleryStats")
	public @ResponseBody String deleteGalleryStats(@RequestParam Integer id) {
		GalleryStat gStat = new GalleryStat();
		gStat.setGallery_stats_id(id);
		galleryStatRepository.delete(gStat);
		return "Deleted";
	}
	
	
}