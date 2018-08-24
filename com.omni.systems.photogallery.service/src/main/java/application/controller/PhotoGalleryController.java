package application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import application.domain.Gallery;
import application.domain.GalleryChildren;
import application.domain.GalleryGroupType;
import application.domain.GalleryItem;
import application.domain.GalleryObjectType;
import application.domain.GalleryOrderCategory;
import application.domain.GalleryOrderType;
import application.domain.GalleryStat;
import application.exception.GalleryAlreadyExistsException;
import application.exception.GalleryChildAlreadyExistsException;
import application.exception.GalleryChildNotFoundException;
import application.exception.GalleryGroupTypeAlreadyExistsException;
import application.exception.GalleryGroupTypeNotFoundException;
import application.exception.GalleryItemAlreadyExistsException;
import application.exception.GalleryItemNotFoundException;
import application.exception.GalleryNotFoundException;
import application.exception.GalleryObjectTypeAlreadyExistsException;
import application.exception.GalleryObjectTypeNotFoundException;
import application.exception.GalleryOrderCategoryAlreadyExistsException;
import application.exception.GalleryOrderCategoryNotFoundException;
import application.exception.NoDataAvailableException;
import application.repository.GalleryChildrenRepository;
import application.repository.GalleryGroupTypeRepository;
import application.repository.GalleryItemRepository;
import application.repository.GalleryObjectTypeRepository;
import application.repository.GalleryOrderCategoryRepository;
import application.repository.GalleryOrderTypeRepository;
import application.repository.GalleryRepository;
import application.repository.GalleryStatRepository;

@Controller
@RequestMapping(path="/api/GalleryServices")
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
	@Autowired
	private GalleryOrderCategoryRepository galleryOrderCategoryRepository;
	@Autowired
	private GalleryOrderTypeRepository galleryOrderTypeRepository;
	
	@RequestMapping(path="/addGallery", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> addNewGallery(@RequestBody Gallery newGallery) {
	
		try
		{
			/* check to see if the data already exists and throw exception if it does */
			if(galleryRepository.findById(newGallery.getGallery_id()).isPresent()) {
				throw new GalleryAlreadyExistsException(newGallery);
			}
			else
			{
				galleryRepository.save(newGallery);
				return new ResponseEntity<HttpStatus>(HttpStatus.CREATED);
			}
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	@RequestMapping(path="/getGalleryCount", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getGalleryCount()
	{
		try
		{
			return new ResponseEntity<Object>(galleryRepository.count(), HttpStatus.OK);
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	@RequestMapping(path="/getAllGalleries", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<Object> getAllGalleries()
	{
		try
		{
			Long galleryCount = galleryRepository.count();
			Iterable<Gallery> galleries;
			
			if(galleryCount == 0)
			{
				throw new NoDataAvailableException();
			}
			else
			{
				galleries = galleryRepository.findAll();
				return new ResponseEntity<Object>(galleries, HttpStatus.OK);
			}
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	@RequestMapping(path="/deleteGallery", method = RequestMethod.DELETE)
	public @ResponseBody ResponseEntity<?> deleteGallery(@RequestBody Gallery gallery)
	{
		try
		{
			if(galleryRepository.findById(gallery.getGallery_id()).isPresent()) {
				galleryRepository.delete(gallery);
				return new ResponseEntity<Object>(gallery, HttpStatus.OK);
			}
			else
			{
				throw new GalleryNotFoundException(gallery);
			}
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	@RequestMapping(path="/addGalleryChild", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> addNewGalleryChild(@RequestBody GalleryChildren galleryChild) {

		try
		{
			if(galleryChildrenRepository.findGalleryChild(galleryChild.getParent_id(), galleryChild.getChild_id()).isPresent()) {
				throw new GalleryChildAlreadyExistsException(galleryChild);
			}
			else
			{
				galleryChildrenRepository.save(galleryChild);
				return new ResponseEntity<Object>(galleryChild, HttpStatus.CREATED);
			}
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	@RequestMapping(path="/getGalleryChildren", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getAllGalleryChildren(@RequestBody Gallery gallery)
	{
		try
		{
			Long galleryChildrenCount = galleryChildrenRepository.countChildrenOfParent(gallery.getGallery_id());
			Iterable<GalleryChildren> galleryChildren;
			
			if(galleryChildrenCount == 0)
			{
				throw new NoDataAvailableException();
			}
			else
			{
				galleryChildren = galleryChildrenRepository.findAllChildrenOfParent(gallery.getGallery_id());
				return new ResponseEntity<Object>(galleryChildren, HttpStatus.OK);
			}
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}

	@RequestMapping(path="/deleteGalleryChild", method = RequestMethod.DELETE)
	public @ResponseBody ResponseEntity<?> deleteGalleryChild(@RequestBody GalleryChildren galleryChild) {
		
		try
		{
			if(galleryChildrenRepository.findGalleryChild(galleryChild.getParent_id(), galleryChild.getChild_id()).isPresent()) {
				galleryChildrenRepository.delete(galleryChild);
				return new ResponseEntity<Object>(galleryChild, HttpStatus.OK);
			}
			else
			{
				throw new GalleryChildNotFoundException(galleryChild);
			}
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	@RequestMapping(path="/addGalleryGroupType", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> addNewGalleryGroupType(@RequestBody GalleryGroupType galleryGroupType) {
		try
		{
			if(galleryGroupTypeRepository.findByGroupName(galleryGroupType.getGroup_type_name()).isPresent()) {
				throw new GalleryGroupTypeAlreadyExistsException(galleryGroupType);
			}
			else
			{
				galleryGroupTypeRepository.save(galleryGroupType);
				return new ResponseEntity<Object>(galleryGroupType, HttpStatus.CREATED);
			}
			
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	@RequestMapping(path="/getGalleryGroupTypes", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getAllGalleryGoupTypes()
	{
		try
		{
			Long galleryGroupTypeCount = galleryGroupTypeRepository.count();
			Iterable<GalleryGroupType> galleryGroupTypes;
			
			if(galleryGroupTypeCount == 0) {
				throw new NoDataAvailableException();
			}
			else
			{
				galleryGroupTypes = galleryGroupTypeRepository.findAll();
				return new ResponseEntity<Object>(galleryGroupTypes, HttpStatus.OK);
			}
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}

	@RequestMapping(path="/deleteGalleryGroupType", method = RequestMethod.DELETE)
	public @ResponseBody ResponseEntity<?> deleteGalleryGroupType(@RequestBody GalleryGroupType galleryGroupType) {
		try
		{
			if(galleryGroupTypeRepository.findByGroupName(galleryGroupType.getGroup_type_name()).isPresent()) {
				galleryGroupTypeRepository.delete(galleryGroupType);
				return new ResponseEntity<Object>(galleryGroupType, HttpStatus.OK);
			}
			else
			{
				throw new GalleryGroupTypeNotFoundException(galleryGroupType);
			}
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	@RequestMapping(path="/addGalleryItem", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> addNewGalleryItem(@RequestBody GalleryItem galleryItem) {
		
		try 
		{
			if(galleryItemRepository.findById(galleryItem.getGallery_id(), galleryItem.getGallery_item_id()).isPresent()) {
				throw new GalleryItemAlreadyExistsException(galleryItem);
			}
			else
			{
				galleryItemRepository.save(galleryItem);
				return new ResponseEntity<Object>(galleryItem, HttpStatus.CREATED);
			}
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	@RequestMapping(path="/getAllGalleryItems", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getAllGalleryItems(@RequestBody Gallery gallery)
	{
		try
		{
			Long galleryItemCount = galleryItemRepository.countGalleryItems(gallery.getGallery_id());
			Iterable<GalleryItem> galleryItems;
		
			if (galleryItemCount == 0) {
				throw new NoDataAvailableException();
			}
			else
			{
				galleryItems = galleryItemRepository.findAllGalleryItemsForGallery(gallery.getGallery_id());
				return new ResponseEntity<Object>(galleryItems, HttpStatus.OK);
			}
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	@RequestMapping(path="/deleteGalleryItem", method = RequestMethod.DELETE)
	public @ResponseBody ResponseEntity<?> deleteGalleryItem(@RequestParam GalleryItem galleryItem) {
		try
		{
			if(galleryItemRepository.findById(galleryItem.getGallery_item_id(), galleryItem.getGallery_id()).isPresent()) {
				galleryItemRepository.delete(galleryItem);
				return new ResponseEntity<Object>(galleryItem, HttpStatus.OK);
			}
			else
			{
				throw new GalleryItemNotFoundException(galleryItem);
			}
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	@RequestMapping(path="/addGalleryObjectType", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> addNewGalleryObjectType(@RequestBody GalleryObjectType galleryObjectType) {
		try
		{
			if(galleryObjectTypeRepository.findByTypeName(galleryObjectType.getGallery_object_type_name()).isPresent()) {
				throw new GalleryObjectTypeAlreadyExistsException(galleryObjectType);
			}
			else
			{
				galleryObjectTypeRepository.save(galleryObjectType);
				return new ResponseEntity<Object>(galleryObjectType, HttpStatus.CREATED);
			}
			
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	@GetMapping(path="/getAllGalleryObjectTypes")
	public @ResponseBody ResponseEntity<?> getAllGalleryObjectTypes()
	{
		Long galleryObjectTypeCount = galleryObjectTypeRepository.count();
		Iterable<GalleryObjectType> galleryObjectTypes;
		try
		{
			if(galleryObjectTypeCount == 0) {
				throw new NoDataAvailableException();
			}
			else
			{
				galleryObjectTypes = galleryObjectTypeRepository.findAll();
				return new ResponseEntity<Object>(galleryObjectTypes, HttpStatus.OK);
			}
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	@RequestMapping(path="/deleteGalleryObjectType", method = RequestMethod.DELETE)
	public @ResponseBody ResponseEntity<?> deleteGalleryObjectType(@RequestBody GalleryObjectType galleryObjectType)
	{
		try
		{
			if(galleryObjectTypeRepository.findByTypeName(galleryObjectType.getGallery_object_type_name()).isPresent()) {
				galleryObjectTypeRepository.delete(galleryObjectType);
				return new ResponseEntity<Object>(galleryObjectType, HttpStatus.OK);
			}
			else
			{
				throw new GalleryObjectTypeNotFoundException(galleryObjectType);
			}
		}  
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	@RequestMapping(path="/addGalleryOrderCategory", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> addGalleryOrderCategory(@RequestBody GalleryOrderCategory galleryOrderCategory)
	{
		try
		{
			if(galleryOrderCategoryRepository.findByCategoryName(galleryOrderCategory.getGallery_order_category_name()).isPresent()) {
				throw new GalleryOrderCategoryAlreadyExistsException(galleryOrderCategory);
			}
			else
			{
				galleryOrderCategoryRepository.save(galleryOrderCategory);
				return new ResponseEntity<Object>(galleryOrderCategory, HttpStatus.CREATED);
			}
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	@RequestMapping(path="/getAllGalleryOrderCategories", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getAllGalleryOrderCategories()
	{
		try
		{
			Long galleryOrderCategoryCount = galleryOrderCategoryRepository.count();
			Iterable<GalleryOrderCategory> galleryOrderCategories;
			
			if (galleryOrderCategoryCount == 0)
			{
				throw new NoDataAvailableException();
			}
			else
			{
				galleryOrderCategories = galleryOrderCategoryRepository.findAll();
				return new ResponseEntity<Object>(galleryOrderCategories, HttpStatus.OK);
			}
			
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	@RequestMapping(path="/deleteGalleryOrderCategory", method = RequestMethod.DELETE)
	public @ResponseBody ResponseEntity<?> deleteGalleryOrderCategory(@RequestBody GalleryOrderCategory galleryOrderCategory)
	{
		try
		{
			if(galleryOrderCategoryRepository.findByCategoryName(galleryOrderCategory.getGallery_order_category_name()).isPresent()) {
				galleryOrderCategoryRepository.delete(galleryOrderCategory);
				return new ResponseEntity<Object>(galleryOrderCategory, HttpStatus.OK);
			}
			else
			{
				throw new GalleryOrderCategoryNotFoundException(galleryOrderCategory);
			}
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	@RequestMapping(path="/getAllGalleryOrderTypes", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getAllGalleryOrderTypes()
	{
		try
		{
			Long galleryOrderTypeCount = galleryOrderTypeRepository.count();
			Iterable<GalleryOrderType> galleryOrderTypes;
			
			if(galleryOrderTypeCount == 0)
			{
				throw new NoDataAvailableException();
			}
			else
			{
				galleryOrderTypes = galleryOrderTypeRepository.findAll();
				return new ResponseEntity<Object>(galleryOrderTypes, HttpStatus.OK);
			}
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	/* TODO: Change addGalleryStats to updateGalleryStats. During the update perform an add if the stats 
	 * do not exists for an existing gallery.
	 * TODO: Alter getGalleryStats to accept an argument for the gallery_id instead of pulling all gallery stats.
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
	}*/
	
	
}