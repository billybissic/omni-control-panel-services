package controller;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import domain.Album;
import domain.AlbumType;
import domain.OrderCategory;
import domain.OrderDirection;
import domain.Photo;
import repository.AlbumRepository;
import repository.AlbumTypeRepository;
import repository.OrderCategoryRepository;
import repository.OrderDirectionRepository;
import storage.StorageFileNotFoundException;
import storage.StorageService;

@Controller
@RequestMapping(path="/api/GalleryServices")
public class GalleryServiceController {

    private final StorageService storageService;
    private AlbumRepository albumRepository;
    private AlbumTypeRepository albumTypeRepository;
    private OrderCategoryRepository orderCategoryRepository;
    private OrderDirectionRepository orderDirectionRepository;
    private MongoOperations mongoOperations;

    @Autowired
    public GalleryServiceController(StorageService storageService) {
        this.storageService = storageService;
    }

    @PostMapping("/uploadFile")
    public ResponseEntity<HttpStatus> uploadFile(@RequestParam("file") MultipartFile file) {
    	storageService.store(file);
    	return new ResponseEntity<HttpStatus>(HttpStatus.ACCEPTED);
    }
    
    @ExceptionHandler(StorageFileNotFoundException.class)
    public ResponseEntity<?> handleStorageFileNotFound(StorageFileNotFoundException exc) {
        return ResponseEntity.notFound().build();
    }
    
    @RequestMapping(value="/createAlbum", method = RequestMethod.POST)
    public ResponseEntity<?> createNewAlbum(@RequestBody Album album)
    {
    	
		albumRepository.save(album);
		return new ResponseEntity<Album>(album, HttpStatus.CREATED);
    }
    
    @RequestMapping(value="/createNewAlbumType", method = RequestMethod.POST)
    public ResponseEntity<?> createNewAlbumType(@RequestBody AlbumType albumType)
    {
    	albumTypeRepository.save(albumType);
    	return new ResponseEntity<AlbumType>(albumType, HttpStatus.CREATED);
    }
    
    @RequestMapping(value="/addNewOrderDirection", method = RequestMethod.POST)
    public ResponseEntity<?> addNewOrderDirection(@RequestBody OrderDirection orderDirection)
    {
    	orderDirectionRepository.save(orderDirection);
    	return new ResponseEntity<OrderDirection>(orderDirection, HttpStatus.CREATED);
    }
    
    @RequestMapping(value="/addNewOrderCategory", method = RequestMethod.POST)
    public ResponseEntity<?> addNewOrderCategory(@RequestBody OrderCategory orderCategory)
    {
    	orderCategoryRepository.save(orderCategory);
    	return new ResponseEntity<OrderCategory>(orderCategory, HttpStatus.CREATED);
    }
    
    @RequestMapping(value="/addPhotoToAlbum", method = RequestMethod.POST)
    public ResponseEntity<?> addPhotoToAlbum(@RequestBody Album album, @RequestBody Photo newPhoto)
    {
    	Query query = new Query();
    	Update update = new Update();
    	
    	query.addCriteria(Criteria.where("_id").is(album.get_id()));
    	update.set("photos", newPhoto);
    	
    	Album editedAlbum = mongoOperations.findAndModify(query, update, 
    			new FindAndModifyOptions().returnNew(true), Album.class);
    	
    	return new ResponseEntity<Album>(editedAlbum, HttpStatus.OK);
    }
    
    @RequestMapping(value="/addPhotosToAlbum", method = RequestMethod.POST)
    public ResponseEntity<?> addPhotosToAlbum(@RequestBody Album album, @RequestBody List<Photo> newPhotos)
    {
    	Query query = new Query();
    	Update update = new Update();
    	
    	query.addCriteria(Criteria.where("_id").is(album.get_id()));
    	update.set("photos", newPhotos);
    		
    	Album editedAlbum = mongoOperations.findAndModify(query, update,
    			new FindAndModifyOptions().returnNew(true), Album.class);
    	
    	return new ResponseEntity<Album>(editedAlbum, HttpStatus.OK);
    }
    
    @RequestMapping(value="/updateOrderCategory", method = RequestMethod.POST)
    public ResponseEntity<?> updateOrderCategory(@RequestBody OrderCategory orderCategory)
    {
    	Query query = new Query();
    	Update update = new Update();
    	
    	query.addCriteria(Criteria.where("_id").is(orderCategory.get_id()));
    	update.set("gallery_order_category_name", orderCategory.getGallery_order_category_name());
    	update.set("gallery_order_category_description", orderCategory.getGallery_order_category_description());
    	
    	OrderCategory editedOrderCategory = mongoOperations.findAndModify(query, update, 
    			new FindAndModifyOptions().returnNew(true), OrderCategory.class);
    	
    	return new ResponseEntity<OrderCategory>(editedOrderCategory, HttpStatus.OK);
    }
    
    @RequestMapping(value="/updateOrderDirection", method = RequestMethod.POST)
    public ResponseEntity<?> updateOrderDirection(@RequestBody OrderDirection orderDirection)
    {
    	Query query = new Query();
    	Update update = new Update();
    	
    	query.addCriteria(Criteria.where("_id").is(orderDirection.get_id()));
    	update.set("order_direction_name", orderDirection.getOrder_direction_name());
    	update.set("order_direction_description", orderDirection.getOrder_direction_description());
    	
    	OrderDirection editedOrderDirection = mongoOperations.findAndModify(query, update,
    			new FindAndModifyOptions().returnNew(true), OrderDirection.class);
    	return new ResponseEntity<OrderDirection>(editedOrderDirection, HttpStatus.OK);
    }
    
    @RequestMapping(value="/deletePhotoFromAlbum", method = RequestMethod.POST)
    public void deletePhotoFromAlbum(@RequestBody Album album)
    {
    	
    }
    
    @RequestMapping(value="/deleteAlbum", method = RequestMethod.POST)
    public ResponseEntity<?> deleteAlbum(@RequestBody Album album)
    {
    	albumRepository.deleteById(album.get_id());
    	return new ResponseEntity<HttpStatus>(HttpStatus.OK);
    }
    
    @RequestMapping(value="/deleteAlbumType", method = RequestMethod.POST)
    public ResponseEntity<?> deleteAlbumType(@RequestBody AlbumType albumType)
    {
    	albumTypeRepository.deleteById(albumType.get_id());
    	return new ResponseEntity<HttpStatus>(HttpStatus.OK);
    }
    
    @RequestMapping(value="/deleteOrderCategory", method = RequestMethod.POST)
    public ResponseEntity<?> deleteOrderCategory(@RequestBody OrderCategory orderCategory)
    {
    	orderCategoryRepository.deleteById(orderCategory.get_id());
    	return new ResponseEntity<HttpStatus>(HttpStatus.OK);
    }
    
    @RequestMapping(value="/deleteOrderDirection", method = RequestMethod.POST)
    public ResponseEntity<?> deleteOrderDirection(@RequestBody OrderDirection orderDirection)
    {
    	orderDirectionRepository.deleteById(orderDirection.get_id());
    	return new ResponseEntity<HttpStatus>(HttpStatus.OK);
    }

}
