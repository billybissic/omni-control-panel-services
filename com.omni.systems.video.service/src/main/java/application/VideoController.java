package application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/VideoService")
public class VideoController {
	@Autowired
	private UserVideosRepository userVideosRepository;
	@Autowired 
	private VideosRepository videosRepository;
	
	@GetMapping(path="addNewUserVideo")
	public @ResponseBody String addNewUserVideo(@RequestParam Integer uuid,
												@RequestParam Integer videoid) {
		UserVideos uVideo = new UserVideos();
		uVideo.setUuid(uuid);
		uVideo.setVideo_id(videoid);
		userVideosRepository.save(uVideo);
		return "Saved";
	}
	
	@GetMapping(path="/getAllUserVideos")
	public @ResponseBody Iterable<UserVideos> getAllUserVideos() {
		return userVideosRepository.findAll();
	}
	
	@GetMapping(path="/deleteUserVideo")
	public @ResponseBody String deleteUserVideo(@RequestParam Integer uuid,
												@RequestParam Integer videoid) {
		UserVideos uVideo = new UserVideos();
		uVideo.setUuid(uuid);
		uVideo.setVideo_id(videoid);
		return "Deleted";
	}
	
	@GetMapping(path="/addNewVideo")
	public @ResponseBody String addNewVideo(@RequestParam Integer duration,
											@RequestParam Integer externalid,
											@RequestParam Integer languagecode,
											@RequestParam Integer videobits,
											@RequestParam  String videoname,
											@RequestParam  String videodescription,
											@RequestParam  String videousertext,
											@RequestParam Integer videoheight,
											@RequestParam Integer videowidth,
											@RequestParam Integer videoimageid,
											@RequestParam Integer videomajormime,
											@RequestParam Integer videomediatype,
											@RequestParam Integer videominormime,
											@RequestParam  String videosha1,
											@RequestParam Integer videosize,
											@RequestParam  String videotimestamp) {
		Videos video = new Videos();
		video.setDuration(duration);
		video.setExternal_id(externalid);
		video.setLanguage_code(languagecode);
		video.setVideo_bits(videobits);
		video.setVideo_name(videoname);
		video.setVideo_description(videodescription);
		video.setVideo_user_text(videousertext);
		video.setVideo_height(videoheight);
		video.setVideo_width(videowidth);
		video.setVideo_image_id(videoimageid);
		video.setVideo_major_mime(videomajormime);
		video.setVideo_minor_mime(videominormime);
		video.setVideo_sha1(videosha1);
		video.setVideo_size(videosize);
		video.setVideo_timestamp(videotimestamp);
		videosRepository.save(video);
		return "Saved";
	}
	@GetMapping(path="/getAllVideos")
	public @ResponseBody Iterable<Videos> getAllVideos() {
		return videosRepository.findAll();
	}
	
	@GetMapping(path="/deleteVideo")
	public @ResponseBody String deleteVideo(@RequestParam Integer id) {
		Videos video = new Videos();
		video.setVideo_id(id);
		videosRepository.delete(video);
		return "Deleted";
	}
	
	
}
