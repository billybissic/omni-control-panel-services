package application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/MediaDataServices")
public class MediaDataController {

	@Autowired
	private CaptionsRepository captionsRepository;
	@Autowired
	private CaptionTypesRepository captionTypesRepository;
	@Autowired
	private MediaTypesRepository mediaTypesRepository;
	@Autowired
	private MetaItemRepository metaItemRepository;
	@Autowired
	private MimeTypeCategoryRepository mimeTypeCategoryRepository;
	@Autowired
	private OldMetaItemsRepository oldMetaItemsRepository;

	@GetMapping(path="/addNewCaption")
	public @ResponseBody String addNewCaption(@RequestParam String newcaption,
											  @RequestParam Integer captiontypeid,
											  @RequestParam Integer captionsubtypeid,
											  @RequestParam Integer languagecode) {
		Captions caption = new Captions();
		caption.setCaption(newcaption);
		caption.setCaption_type_id(captiontypeid);
		caption.setCaption_sub_type_id(captionsubtypeid);
		caption.setLanguage_code(languagecode);
		captionsRepository.save(caption);
		return "Saved";
	}
	
	@GetMapping(path="/getAllCaptions")
	public @ResponseBody Iterable<Captions> getAllCaptions() {
		return captionsRepository.findAll();
	}
	
	@GetMapping(path="/deleteCaption")
	public @ResponseBody String deleteCaption(@RequestParam Integer id) {
		Captions caption = new Captions();
		caption.setCaption_id(id);
		captionsRepository.delete(caption);
		return "Delete";
	}
	
	@GetMapping(path="/addNewCaptionType")
	public @ResponseBody String addNewCaptionType(@RequestParam String captiontypename,
												  @RequestParam String captiontypedescription) {
		CaptionTypes cType = new CaptionTypes();
		cType.setCaption_type_name(captiontypename);
		cType.setCaption_type_description(captiontypedescription);
		captionTypesRepository.save(cType);
		return "Saved";
	}
		
	@GetMapping(path="/getAllCaptionTypes")
	public @ResponseBody Iterable<CaptionTypes> getAllCaptionTypes() {
		return captionTypesRepository.findAll();
	}
	
	@GetMapping(path="/deleteCaptionType")
	public @ResponseBody String deleteCaptionType(@RequestParam Integer id) {
		CaptionTypes cType = new CaptionTypes();
		cType.setCaption_type_id(id);
		captionTypesRepository.delete(cType);
		return "Deleted";
	}
	
	@GetMapping(path="/addNewMediaType")
	public @ResponseBody String addNewMediaType(@RequestParam String mediatypeabbreviation,
												@RequestParam String mediatypedescription,
												@RequestParam String mediatypefileextension) {
		MediaTypes mType = new MediaTypes();
		mType.setMedia_type_abbreviation(mediatypeabbreviation);
		mType.setMedia_type_description(mediatypedescription);
		mType.setMedia_type_file_extension(mediatypefileextension);
		mediaTypesRepository.save(mType);
		return "Saved";
	}
	
	@GetMapping(path="/getAllMediaTypes")
	public @ResponseBody Iterable<MediaTypes> getAllMediaTypes() {
		return mediaTypesRepository.findAll();
	}
	
	@GetMapping(path="/deleteMediaType")
	public @ResponseBody String deleteMediaTypes(@RequestParam Integer id) {
		MediaTypes mType = new MediaTypes();
		mType.setMedia_type_id(id);
		mediaTypesRepository.delete(mType);
		return "Deleted";
	}
	
	@GetMapping(path="/addNewMetaItem")
	public @ResponseBody String addNewMetaItem(@RequestParam String date,
											   @RequestParam String desc,
											   @RequestParam Integer gallerytypeid,
											   @RequestParam Integer iseditable,
											   @RequestParam String keywords,
											   @RequestParam Integer mediaid,
											   @RequestParam Integer mediatypeid,
											   @RequestParam String title,
											   @RequestParam String topic,
											   @RequestParam String value) {
		MetaItem mItem = new MetaItem();
		mItem.setDate(date);
		mItem.setDesc(desc);
		mItem.setGallery_type_id(gallerytypeid);
		mItem.setIs_editable(iseditable);
		mItem.setKeywords(keywords);
		mItem.setMedia_id(mediaid);
		mItem.setMedia_type_id(mediatypeid);
		mItem.setTitle(title);
		mItem.setValue(value);
		metaItemRepository.save(mItem);
		return "Saved";
	}
	@GetMapping(path="/getAllMetaItems")
	public @ResponseBody Iterable<MetaItem> getallMetaItems() {
		return metaItemRepository.findAll();
	}
	
	@GetMapping(path="/deleteMetaItem")
	public @ResponseBody String deletedMetaItem(@RequestParam Integer id) {
		MetaItem mItem = new MetaItem();
		mItem.setMeta_item_id(id);
		metaItemRepository.delete(mItem);
		return "Deleted";
	}
	
	@GetMapping(path="/addNewMimeTypeCategory")
	public @ResponseBody String addNewMimeTypeCategory(@RequestParam String mimedescription,
													   @RequestParam String mimetype) {
		MimeTypeCategory mTypeCategory = new MimeTypeCategory();
		mTypeCategory.setMime_description(mimedescription);
		mTypeCategory.setMime_type(mimetype);
		mimeTypeCategoryRepository.save(mTypeCategory);
		return "Added";
	}
	
	@GetMapping(path="/getAllMimeTypeCategories")
	public @ResponseBody Iterable<MimeTypeCategory> getAllMimeTypeCategories() {
		return mimeTypeCategoryRepository.findAll();
	}
	
	@GetMapping(path="/deleteMimeTypeCategory")
	public @ResponseBody String deleteMimeTypeCategory(@RequestParam Integer id) {
		MimeTypeCategory mTypeCategory = new MimeTypeCategory();
		mTypeCategory.setMime_type_id(id);
		mimeTypeCategoryRepository.delete(mTypeCategory);
		return "Deleted";
	}
	
	@GetMapping(path="/addOldMetaItems")
	public @ResponseBody String addOldMetaItem(@RequestParam String date,
											   @RequestParam String desc,
											   @RequestParam Integer gallerytypeid,
											   @RequestParam Integer iseditable,
											   @RequestParam String keywords,
											   @RequestParam Integer mediaid,
											   @RequestParam Integer metaitypeid,
											   @RequestParam String title,
											   @RequestParam String topic,
											   @RequestParam String value) {
		OldMetaItems oMetaItem = new OldMetaItems();
		oMetaItem.setOld_meta_item_date(date);
		oMetaItem.setOld_meta_item_desc(desc);
		oMetaItem.setOld_meta_item_gallery_type_id(gallerytypeid);
		oMetaItem.setOld_meta_item_is_editable(iseditable);
		oMetaItem.setOld_meta_item_keywords(keywords);
		oMetaItem.setOld_meta_item_media_id(mediaid);
		oMetaItem.setOld_meta_item_media_type_id(metaitypeid);
		oMetaItem.setOld_meta_item_title(title);
		oMetaItem.setOld_meta_item_topic(topic);
		oMetaItem.setOld_meta_item_value(value);
		oldMetaItemsRepository.save(oMetaItem);
		return "Saved";
	}
	
	@GetMapping(path="/getAllOldMetaItems")
	public @ResponseBody Iterable<OldMetaItems> getAllOldMetaItems() {
		return oldMetaItemsRepository.findAll();
	}
	
	@GetMapping(path="/deleteOldMetaItem")
	public @ResponseBody String deleteOldMetaItem(@RequestParam Integer id) {
		OldMetaItems oMetaItem = new OldMetaItems();
		oMetaItem.setOld_meta_item_id(id);
		oldMetaItemsRepository.delete(oMetaItem);
		return "Deleted";
	}
}
