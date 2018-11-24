package application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import application.domain.Gallery;
import application.domain.GalleryChildren;
import application.domain.GalleryGroupType;
import application.domain.GalleryStyleType;
import application.domain.GalleryItem;
import application.domain.GalleryObjectType;
import application.domain.GalleryOrderCategory;
import application.domain.GalleryOrderDirection;
import application.domain.GalleryOrderType;
import application.domain.GalleryStat;
import application.exception.GalleryAlreadyExistsException;
import application.exception.GalleryChildAlreadyExistsException;
import application.exception.GalleryChildNotFoundException;
import application.exception.GalleryGroupTypeAlreadyExistsException;
import application.exception.GalleryGroupTypeNotFoundException;
import application.exception.GalleryStyleTypeAlreadyExistsException;
import application.exception.GalleryStyleTypeNotFoundException;
import application.exception.GalleryItemAlreadyExistsException;
import application.exception.GalleryItemNotFoundException;
import application.exception.GalleryNotFoundException;
import application.exception.GalleryObjectTypeAlreadyExistsException;
import application.exception.GalleryObjectTypeNotFoundException;
import application.exception.GalleryOrderCategoryAlreadyExistsException;
import application.exception.GalleryOrderCategoryNotFoundException;
import application.exception.GalleryOrderDirectionAlreadyExistsException;
import application.exception.GalleryOrderDirectionNotFoundException;
import application.exception.GalleryOrderTypeNotFoundException;
import application.exception.NoDataAvailableException;
import application.repository.GalleryChildrenRepository;
import application.repository.GalleryGroupTypeRepository;
import application.repository.GalleryStyleTypeRepository;
import application.repository.GalleryItemRepository;
import application.repository.GalleryObjectTypeRepository;
import application.repository.GalleryOrderCategoryRepository;
import application.repository.GalleryOrderDirectionRepository;
import application.repository.GalleryOrderTypeRepository;
import application.repository.GalleryRepository;
import application.repository.GalleryStatRepository;

@Controller
@RequestMapping(path="/api/GalleryServices")
public class PhotoGalleryController {

	//@Autowired
	//private GalleryRepository galleryRepository;
	//@Autowired
	//private GalleryChildrenRepository galleryChildrenRepository;
	@Autowired
	private GalleryGroupTypeRepository galleryGroupTypeRepository;
	@Autowired
	private GalleryStyleTypeRepository galleryStyleTypeRepository;
	@Autowired
	private GalleryItemRepository galleryItemRepository;
	@Autowired
	private GalleryObjectTypeRepository galleryObjectTypeRepository;
	//@Autowired
	//private GalleryStatRepository galleryStatRepository;
	@Autowired
	private GalleryOrderDirectionRepository galleryOrderDirectionRepository;
	@Autowired
	private GalleryOrderCategoryRepository galleryOrderCategoryRepository;
	@Autowired
	private GalleryOrderTypeRepository galleryOrderTypeRepository;
	
	//TODO: Migrate over to the gallery services server
	/*@RequestMapping(path="/addGallery", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> addNewGallery(@RequestBody Gallery newGallery) {
	
		try
		{
			// check to see if the data already exists and throw exception if it does 
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
			// All other errors send generic message to browser 
			return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			// TODO: log the exception 
		}
	}*/
	
	//TODO: Migrate over to the gallery services server
	/*@RequestMapping(path="/getGalleryCount", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getGalleryCount()
	{
		try
		{
			return new ResponseEntity<Object>(galleryRepository.count(), HttpStatus.OK);
		}
		catch (DataAccessException ex)
		{
			return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}*/
	
	//TODO: Migrate over to the gallery services server
	/*@RequestMapping(path="/getAllGalleries", method = RequestMethod.GET)
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
			return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}*/
	
	//TODO: Migrate over to the gallery services server
	/*@RequestMapping(path="/deleteGallery", method = RequestMethod.DELETE)
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
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}*/
	
	//TODO: Migrate over to the gallery services server
	/*@RequestMapping(path="/addGalleryChild", method = RequestMethod.POST)
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
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}*/
	
	//TODO: Migrate over to the gallery services server
	/*@RequestMapping(path="/getGalleryChildren", method = RequestMethod.GET)
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
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
	}*/

	//TODO: Migrate over to the gallery services server
	/*@RequestMapping(path="/deleteGalleryChild", method = RequestMethod.DELETE)
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
			
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
	}*/
	
	
	/*     
	 *     call: /addGalleryGroupType
	 *   method: POST 
	 */
	@RequestMapping(path="/addGalleryGroupType", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> addNewGalleryGroupType(@RequestBody GalleryGroupType galleryGroupType) {
		try
		{
			System.out.println(galleryGroupType);
			if(galleryGroupTypeRepository.findByGalleryGroupTypeName(galleryGroupType.getGalleryGroupTypeName()).isPresent()) {
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
	
    /*     
     *     call: /getGalleryGroupTypes 
	 *   method: GET 
	 */
	@RequestMapping(path="/getGalleryGroupTypes", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getAllGalleryGoupTypes()
	{
		try
		{
			long galleryGroupTypeCount = galleryGroupTypeRepository.count();
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
	
	/*
	 *    call: /countGalleryGroupTypes
	 * 	method: GET
	 */
	@RequestMapping(path="/countGalleryGroupTypes", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> countGalleryGroupTypes()
	{
		try
		{
			long galleryGroupTypeCount = galleryGroupTypeRepository.count();
			return new ResponseEntity<Object>(galleryGroupTypeCount, HttpStatus.OK);
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	/*     
     *     call: /getGalleryGroupTypeById/{id} 
	 *   method: POST 
	 */
	@RequestMapping(path="/getGalleryGroupTypeById/{id}", method = RequestMethod.POST)
	public ResponseEntity<?> getGalleryGroupTypeBydId(@PathVariable Integer id)
	{
		try
		{
			GalleryGroupType galleryGroupType = galleryGroupTypeRepository.findById(id);
			return new ResponseEntity<Object>(galleryGroupType, HttpStatus.OK);
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	/*     
	 *     call: /deleteGalleryGroupType/{id}
	 *   method: DELETE
	 */
	@RequestMapping(path="/deleteGalleryGroupType/{id}", method = RequestMethod.DELETE)
	public @ResponseBody ResponseEntity<?> deleteGalleryGroupType(@PathVariable Integer id) {
		try
		{
			GalleryGroupType galleryGroupType = galleryGroupTypeRepository.findById(id);
			if (galleryGroupType == null) {
				throw new GalleryGroupTypeNotFoundException(galleryGroupType);
			}
			galleryGroupTypeRepository.delete(id);
			return new ResponseEntity<GalleryGroupType>(HttpStatus.NO_CONTENT);
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	/*     
	 *     call: /addGallerStyleType
	 *   method: POST 
	 */
	@RequestMapping(path="/addGallerStyleType", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> addNewGalleryStyleType(@RequestBody GalleryStyleType galleryStyleType)
	{
		try
		{
			if(galleryStyleTypeRepository.findById(galleryStyleType.getId()).isPresent()) {
				throw new GalleryStyleTypeAlreadyExistsException(galleryStyleType);
			}
			else
			{
				galleryStyleTypeRepository.save(galleryStyleType);
				return new ResponseEntity<Object>(galleryStyleType, HttpStatus.CREATED);
			}
			
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	/*     
     *     call: /getGalleryStyleByMimeTypeId/{id} 
	 *   method: POST 
	 */
	@RequestMapping(path="/getGalleryStyleByMimeTypeId/{id}", method = RequestMethod.POST)
	public ResponseEntity<?> getGalleryStyleByMimeTypeId(@PathVariable Integer id)
	{
		try
		{
			Long galleryItemCount = galleryStyleTypeRepository.countGalleryStylesById(id);
			Iterable<GalleryStyleType> galleryStyleType;
		
			if (galleryItemCount == 0) {
				throw new NoDataAvailableException();
			}
			else
			{
				galleryStyleType = galleryStyleTypeRepository.findAllGalleryStylesForMimeTypeId(id);
				return new ResponseEntity<Object>(galleryStyleType, HttpStatus.OK);
			}
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	/*     
	 *     call: /getAllGalleryStyles 
	 *   method: GET
	 */
	@RequestMapping(path="/getAllGalleryStyles", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getAllGalleryStyles()
	{
		try
		{
			Long galleryItemCount = galleryStyleTypeRepository.count();
			Iterable<GalleryStyleType> galleryStyleType;
		
			if (galleryItemCount == 0) {
				throw new NoDataAvailableException();
			}
			else
			{
				galleryStyleType = galleryStyleTypeRepository.findAll();
				return new ResponseEntity<Object>(galleryStyleType, HttpStatus.OK);
			}
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	/*     
	 *     call: /deleteGalleryStyleType/{id}
	 *   method: DELETE 
	 */
	@RequestMapping(path="/deleteGalleryStyleType/{id}", method = RequestMethod.DELETE)
	public @ResponseBody ResponseEntity<?> deleteGalleryStyleType(@PathVariable Integer id) {
		try
		{
			GalleryStyleType galleryStyleType = galleryStyleTypeRepository.getById(id);
			
			if (galleryStyleType == null) {
				throw new GalleryStyleTypeNotFoundException(galleryStyleType);
			}
			galleryStyleTypeRepository.delete(id);
			return new ResponseEntity<GalleryStyleType>(HttpStatus.NO_CONTENT);
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	/*TODO: Consider removing this. The gallery items are being migrated to mongo db */
	/*@RequestMapping(path="/addGalleryItem", method = RequestMethod.POST)
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
			// All other errors send generic message to browser 
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			// TODO: log the exception 
		}
	}
	
	/*TODO: Consider removing this. The gallery items are being migrated to mongo db */
	
	/*TODO: Consider removing this. The gallery items are being migrated to mongo db */
	/*@RequestMapping(path="/getAllGalleryItems", method = RequestMethod.GET)
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
			 //All other errors send generic message to browser 
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			 //TODO: log the exception 
		}
	}*/
	
	/*TODO: Consider removing this. The gallery items are being migrated to mongo db */
	/*@RequestMapping(path="/deleteGalleryItem", method = RequestMethod.DELETE)
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
			// All other errors send generic message to browser 
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			// TODO: log the exception 
		}
	}*/
	
	/*
	 *       call: /addGalleryObjectType
	 *     method: POST
	 */
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
	
	
	/*
	 *       call: /getAllGalleryObjectTypes
	 *     method: GET
	 */
	@RequestMapping(path="/getAllGalleryObjectTypes", method = RequestMethod.GET)
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
	
	
	/*
	 *       call: /deleteGalleryObjectType/{id}
	 *     method: DELETE
	 */
	@RequestMapping(path="/deleteGalleryObjectType/{id}", method = RequestMethod.DELETE)
	public @ResponseBody ResponseEntity<?> deleteGalleryObjectType(@PathVariable Integer id)
	{
		try
		{
			GalleryObjectType galleryObjectType = galleryObjectTypeRepository.findById(id);
			if(galleryObjectType == null) {
				throw new GalleryObjectTypeNotFoundException(galleryObjectType);
			}
			galleryObjectTypeRepository.delete(galleryObjectType);
			return new ResponseEntity<GalleryObjectType>(HttpStatus.NO_CONTENT);
		}  
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	
	/*     
	 *     call: /addGalleryOrderCategory
	 *   method: POST
	 */
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
	
	
	/*     
	 *     call: /getAllGalleryOrderCategories 
	 *   method: GET
	 */
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
	
	
	/*     
	 *     call: /deleteGalleryOrderCategory{id} 
	 * 	 method: DELETE
	 */
	@RequestMapping(path="/deleteGalleryOrderCategory{id}", method = RequestMethod.DELETE)
	public @ResponseBody ResponseEntity<?> deleteGalleryOrderCategory(@PathVariable Integer id)
	{
		try
		{
			GalleryOrderCategory galleryOrderCategory = galleryOrderCategoryRepository.findById(id);
			if (galleryOrderCategory == null) {
				throw new GalleryOrderCategoryNotFoundException(galleryOrderCategory);
			}
			galleryOrderCategoryRepository.delete(galleryOrderCategory);
			return new ResponseEntity<GalleryOrderCategory>(HttpStatus.NO_CONTENT);
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	
	/*      
	 *      call: /getAllGalleryOrderDirections 
	 *    method: GET
	 */
	@RequestMapping(path="/getAllGalleryOrderDirections", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getAllGalleryOrderDirections() 
	{
		try
		{
			Long galleryOrderDirectionCount = galleryOrderDirectionRepository.count();
			Iterable<GalleryOrderDirection> galleryOrderDirection;
			
			if(galleryOrderDirectionCount == 0)
			{
				throw new NoDataAvailableException();
			}
			else
			{
				galleryOrderDirection = galleryOrderDirectionRepository.findAll();
				return new ResponseEntity<Object>(galleryOrderDirection, HttpStatus.OK);
			}
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	
	/*      
	 *      call: /addGalleryOrderDirection
	 *    method: POST
	 */
	@RequestMapping(path="/addGalleryOrderDirection", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> addGalleryOrderDirection(@RequestBody GalleryOrderDirection galleryOrderDirection)
	{
		try
		{
			if(galleryOrderDirectionRepository.findByGalleryOrderDirectionName(galleryOrderDirection.getGalleryOrderDirectionName()).isPresent())
			{
				throw new GalleryOrderDirectionAlreadyExistsException(galleryOrderDirection);
			}
			return new ResponseEntity<Object>(galleryOrderDirection, HttpStatus.CREATED);
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	/*      
	 *      call: /deleteGalleryOrderDirection
	 *    method: DELETE
	 */
	@RequestMapping(path="/deleteGalleryOrderDirection", method = RequestMethod.DELETE)
	public @ResponseBody ResponseEntity<?> deleteGalleryOrderDirection(@PathVariable Integer id)
	{
		try
		{
			GalleryOrderDirection galleryOrderDirection = galleryOrderDirectionRepository.findById(id);
			if(galleryOrderDirection == null) {
				throw new GalleryOrderDirectionNotFoundException(galleryOrderDirection);
			}
			galleryOrderDirectionRepository.delete(galleryOrderDirection);
			return new ResponseEntity<GalleryOrderDirection>(HttpStatus.NO_CONTENT);
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	
	/*      
	 *      call: /getAllGalleryOrderTypes 
	 *    method: GET 
	 */
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
	
	
	/*      
	 *      call: /deleteGalleryOrderType/{id}
	 *    method: DELETE
	 */
	@RequestMapping(path="/deleteGalleryOrderType/{id}", method = RequestMethod.DELETE)
	public @ResponseBody ResponseEntity<?> deleteGalleryOrderType(@PathVariable Integer id)
	{
		try
		{
			GalleryOrderType galleryOrderType = galleryOrderTypeRepository.findById(id);
			if (galleryOrderType == null)
			{
				throw new GalleryOrderTypeNotFoundException(galleryOrderType);
			}
			
			galleryOrderTypeRepository.delete(galleryOrderType);
			return new ResponseEntity<GalleryOrderType>(HttpStatus.NO_CONTENT);
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