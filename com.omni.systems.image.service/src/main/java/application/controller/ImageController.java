package application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import application.domain.ImageEffects;
import application.domain.ImageLinks;
import application.domain.ImageMetaData;
import application.domain.ImageStyles;
import application.domain.Images;
import application.domain.OldImages;
import application.exception.ImageEffectAlreadyExistsException;
import application.exception.ImageEffectNotFoundException;
import application.exception.ImageLinkAlreadyExistsException;
import application.exception.ImageLinkNotFoundException;
import application.exception.ImageNotFoundException;
import application.exception.ImageStyleAlreadyExistsException;
import application.exception.ImageStyleNotFoundException;
import application.exception.NoDataAvailableException;
import application.exception.OldImageNotFoundException;
import application.repository.ImageEffectsRepository;
import application.repository.ImageLinksRepository;
import application.repository.ImageMetaDataRepository;
import application.repository.ImageStylesRepository;
import application.repository.ImagesRepository;
import application.repository.OldImagesRepository;

@Controller
@RequestMapping(path="/api/ImageServices")
public class ImageController {

	@Autowired
	private ImageEffectsRepository imageEffectsRepository;
	@Autowired
	private ImageLinksRepository imageLinksRepository;
	@Autowired
	private ImageMetaDataRepository imageMetadataRepository;
	@Autowired
	private ImagesRepository imagesRepository;
	@Autowired
	private ImageStylesRepository imageStylesRepository;
	@Autowired
	private OldImagesRepository oldImagesRepository;
	
	@RequestMapping(path="/addImageEffect", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> addNewImageEffect(@RequestBody ImageEffects newImageEffect ) {
		
		try
		{
			/* check to see if the data already exists and throw exception if it does */
			if(imageEffectsRepository.findById(newImageEffect.getImage_effect_id()).isPresent()) {
				throw new ImageEffectAlreadyExistsException(newImageEffect);
			}
			
			/* save the new data and return OK status */
			imageEffectsRepository.save(newImageEffect);
			return new ResponseEntity<HttpStatus>(HttpStatus.CREATED);
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	@GetMapping(path="/getAllImageEffects")
	public @ResponseBody ResponseEntity<Object> getAllImageEffects() {
		try
		{
			Long effectsCount = imageEffectsRepository.count();
			Iterable<ImageEffects> imageEffects;
			
			if(effectsCount == 0)
			{
				throw new NoDataAvailableException();
			}
			else
			{
				imageEffects = imageEffectsRepository.findAll();
				return new ResponseEntity<Object>(imageEffects, HttpStatus.OK);
			}
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	@GetMapping(path="/deleteImageEffect")
	public @ResponseBody ResponseEntity<Object> deleteImageEffect(@RequestBody ImageEffects imageEffect) {
		try
		{
			if(imageEffectsRepository.findById(imageEffect.getImage_effect_id()).isPresent())
			{
				imageEffectsRepository.delete(imageEffect);
				return new ResponseEntity<Object>(HttpStatus.OK);
			}
			else
			{
				throw new ImageEffectNotFoundException(imageEffect);
			}
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	@RequestMapping(path="/addImageLink", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> addNewImageLink(@RequestBody ImageLinks newImageLink) {

		try
		{
			if(imageLinksRepository.findByImageId(newImageLink.getImage_id()).isPresent()) {
				throw new ImageLinkAlreadyExistsException(newImageLink);
			}
			imageLinksRepository.save(newImageLink);
			return new ResponseEntity<HttpStatus>(HttpStatus.CREATED);
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	@GetMapping(path="/getAllImageLinks")
	public @ResponseBody ResponseEntity<Object> getallImageLinks() {
		
		try
		{
			long imageLinkCount = imageLinksRepository.count();
			Iterable<ImageLinks> imageLinks;
			
			if(imageLinkCount == 0) 
			{
				throw new NoDataAvailableException();
			}
			else
			{
				imageLinks = imageLinksRepository.findAll();
				return new ResponseEntity<Object>(imageLinks, HttpStatus.OK);
			}
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	@GetMapping(path="/deleteImageLinks")
	public @ResponseBody ResponseEntity<Object> deleteImageLinks(@RequestBody ImageLinks imageLink) {
		
		try
		{
			if(imageLinksRepository.findByImageId(imageLink.getImage_id()).isPresent())
			{
				imageLinksRepository.delete(imageLink);
				return new ResponseEntity<Object>(HttpStatus.OK);
			}
			else
			{
				throw new ImageLinkNotFoundException(imageLink);
			}
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	/* NOTE: /addImage is being removed as it will be handled by a separate process.
	 * 			Image uploads go directly into the UploadStash table. The stand alone
	 * 			process picks up the images in the UploadStash table for processing
	 * 			then moves them into the actual Image table.
	 */
	/*
	@RequestMapping(path="/addImage", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> addNewImage(@RequestBody Images newImage) {
		
		imagesRepository.save(newImage);
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}*/
	
	@GetMapping(path="/deleteImage")
	public @ResponseBody ResponseEntity<Object> deleteImage(@RequestBody Images image) {
		
		/*TODO: Add deletion for image meta data to the delete image process.*/
		try
		{
			if(imagesRepository.findbyId(image.getImage_id()).isPresent())
			{
				imagesRepository.delete(image);
				return new ResponseEntity<Object>(HttpStatus.OK);
			}
			else
			{
				throw new ImageNotFoundException(image);
			}
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	@RequestMapping(path="/addImageStyle,", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> addNewImageStyle(@RequestBody ImageStyles newImageStyle) {
		
		try
		{
			if(imageStylesRepository.findByStyleName(newImageStyle.getImage_style_name()).isPresent()) {
				throw new ImageStyleAlreadyExistsException(newImageStyle);
			}
			imageStylesRepository.save(newImageStyle);
			return new ResponseEntity<HttpStatus>(HttpStatus.CREATED);
		}
		catch(DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	@GetMapping(path="/getImageStyles")
	public @ResponseBody ResponseEntity<Object> getImageStyles() {
		try
		{
			long imageStyleCount = imageStylesRepository.count();
			Iterable<ImageStyles> imageStyles;
			if(imageStyleCount == 0)
			{
				throw new NoDataAvailableException();
			}
			else
			{
				imageStyles = imageStylesRepository.findAll();
				return new ResponseEntity<Object>(imageStyles, HttpStatus.OK);
			}
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	@GetMapping(path="/deleteImageStyle")
	public @ResponseBody ResponseEntity<Object> deleteImageStyle(@RequestBody ImageStyles imageStyle) {
		try
		{
			if(imageStylesRepository.findbyId(imageStyle.getImage_style_id()).isPresent())
			{
				imageStylesRepository.delete(imageStyle);
				return new ResponseEntity<Object>(HttpStatus.OK);
			}
			else
			{
				throw new ImageStyleNotFoundException(imageStyle);
			}
		}
		catch(DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	/* TODO: Change path to /moveImageToOldImage - to be called when editing the Image to allow for an undo option */
	/*@GetMapping(path="/addOldImage")
	public @ResponseBody String addOldImage() {
		
		return "Saved";
	}*/
	
	@GetMapping(path="/deleteOldImage")
	public @ResponseBody ResponseEntity<Object> deleteOldImage(@RequestBody OldImages oldImage) {
		try
		{
			if(oldImagesRepository.findbyId(oldImage.getOld_image_id()).isPresent())
			{
				oldImagesRepository.delete(oldImage);
				return new ResponseEntity<Object>(HttpStatus.OK);
			}
			else
			{
				throw new OldImageNotFoundException(oldImage);
			}
		}
		catch(DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
}
