package application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/ImageServices")
public class ImageController {

	@Autowired
	private ImageEffectsRepository imageEffectsRepository;
	@Autowired
	private ImageLinksRepository imageLinksRepository;
	@Autowired
	private ImagesRepository imagesRepository;
	@Autowired
	private ImageStylesRepository imageStylesRepository;
	@Autowired
	private OldImagesRepository oldImagesRepository;
	
	@GetMapping(path="/addImageEffect")
	public @ResponseBody String addNewImageEffect(@RequestParam Integer imagestyleid,
										   @RequestParam Integer weight,
										   @RequestParam String name,
										   @RequestParam String data) {
		ImageEffects iEffect = new ImageEffects();
		iEffect.setImage_style_id(imagestyleid);
		iEffect.setName(name);
		iEffect.setWeight(weight);
		iEffect.setData(data);
		imageEffectsRepository.save(iEffect);
		return "Saved";
	}
	
	@GetMapping(path="/getAllImageEffects")
	public @ResponseBody Iterable<ImageEffects> getAllImageEffects() {
		return imageEffectsRepository.findAll();
	}
	
	@GetMapping(path="/deleteImageEffect")
	public @ResponseBody String deleteImageEffect(@RequestParam Integer id) {
		ImageEffects iEffect = new ImageEffects();
		iEffect.setImage_effects_id(id);
		return "Deleted";
	}
	
	@GetMapping(path="/addImageLink")
	public @ResponseBody String addNewImageLink(@RequestParam String imagelinksfrom,
												@RequestParam String imagelinksto) {
		ImageLinks iLinks = new ImageLinks();
		iLinks.setImage_links_from(imagelinksto);
		iLinks.setImage_links_to(imagelinksto);
		imageLinksRepository.save(iLinks);
		return "Saved";
	}
	
	@GetMapping(path="/getAllImageLinks")
	public @ResponseBody Iterable<ImageLinks> getallImageLinks() {
		return imageLinksRepository.findAll();
	}
	
	@GetMapping(path="/deleteImageLinks")
	public @ResponseBody String deleteImageLinks(@RequestParam String imagelinksfrom,
												 @RequestParam String imagelinksto) {
		
		ImageLinks iLinks = new ImageLinks();
		iLinks.setImage_links_from(imagelinksfrom);
		iLinks.setImage_links_to(imagelinksto);
		return "Deleted";
	}
	
	@GetMapping(path="/addImage")
	public @ResponseBody String addNewImage(@RequestParam String imagename,
											@RequestParam String imagedescription,
											@RequestParam Integer imagebits,
											@RequestParam Integer imageheight,
											@RequestParam Integer imagewidth,
											@RequestParam Integer imagesize,
											@RequestParam Integer imagemajormime,
											@RequestParam Integer imagemediatype,
											@RequestParam Integer imageminormime,
											@RequestParam Integer imagemetadataid,
											@RequestParam String imagesha1,
											@RequestParam String imagetimestamp,
											@RequestParam String imageusertext,
											@RequestParam Integer uuid) {
		Images image = new Images();
		image.setImage_name(imagename);
		image.setImage_description(imagedescription);
		image.setImage_bits(imagebits);
		image.setImage_width(imagewidth);
		image.setImage_height(imageheight);
		image.setImage_size(imagesize);
		image.setImage_major_mime(imagemajormime);
		image.setImage_minor_mime(imageminormime);
		image.setImage_media_type(imagemediatype);
		image.setImage_metadata_id(imagemetadataid);
		image.setImage_sha1(imagesha1);
		image.setImage_timestamp(imagetimestamp);
		image.setImage_user_text(imageusertext);
		imagesRepository.save(image);
		return "Saved";
	}
	
	@GetMapping(path="/getAllImages")
	public @ResponseBody Iterable<Images> getAllImages() {
		return imagesRepository.findAll();
	}
	
	@GetMapping(path="/deleteImage")
	public @ResponseBody String deleteImage(@RequestParam Integer id) {
		Images image = new Images();
		image.setImage_id(id);
		imagesRepository.delete(image);
		return "Deleted";
	}
	
	@GetMapping(path="/addImageStyle")
	public @ResponseBody String addNewImageStyle(@RequestParam String imagestylename) {
		ImageStyles iStyle = new ImageStyles();
		iStyle.setImage_style_name(imagestylename);
		imageStylesRepository.save(iStyle);
		return "Saved";
	}
	
	@GetMapping(path="/getImageStyles")
	public @ResponseBody Iterable<ImageStyles> getImageStyles() {
		return imageStylesRepository.findAll();
	}
	
	@GetMapping(path="/deleteImageStyle")
	public @ResponseBody String deleteImageStyle(@RequestParam Integer id) {
		ImageStyles iStyle = new ImageStyles();
		iStyle.setImage_style_id(id);
		imageStylesRepository.delete(iStyle);
		return "Deleted";
	}
	
	@GetMapping(path="/addOldImage")
	public @ResponseBody String addOldImage(@RequestParam String imagename,
											@RequestParam String imagedescription,
											@RequestParam Integer imagebits,
											@RequestParam Integer imageheight,
											@RequestParam Integer imagewidth,
											@RequestParam Integer imagesize,
											@RequestParam Integer imagemajormime,
											@RequestParam Integer imagemediatype,
											@RequestParam Integer imageminormime,
											@RequestParam Integer imagemetadataid,
											@RequestParam String imagesha1,
											@RequestParam String imagetimestamp,
											@RequestParam String imageusertext,
											@RequestParam Integer uuid) {
		
		OldImages oImage = new OldImages();
		oImage.setOld_image_name(imagename);
		oImage.setOld_image_description(imagedescription);
		oImage.setOld_image_bits(imagebits);
		oImage.setOld_image_width(imagewidth);
		oImage.setOld_image_height(imageheight);
		oImage.setOld_image_size(imagesize);
		oImage.setOld_image_major_mime(imagemajormime);
		oImage.setOld_image_minor_mime(imageminormime);
		oImage.setOld_image_media_type(imagemediatype);
		oImage.setOld_image_meta_data(imagemetadataid);
		oImage.setOld_image_timestamp(imagetimestamp);
		oImage.setOld_image_user_text(imageusertext);
		oldImagesRepository.save(oImage);
		return "Saved";
	}
	@GetMapping(path="getOldImages")
	public @ResponseBody Iterable<OldImages> getOldImages() {
		return oldImagesRepository.findAll();
	}
	
	@GetMapping(path="/deleteOldImage")
	public @ResponseBody String deleteOldImage(@RequestParam Integer oldimageid) {
		OldImages oImage = new OldImages();
		oImage.setOld_image_id(oldimageid);
		return "Deleted";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
