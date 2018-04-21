package application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/FileServices")
public class FileController {

	@Autowired
	FileArchiveRepository fileArchiveRepository;
	@Autowired
	FilesRepository fileRepository;
	@Autowired
	UploadsRepository uploadsRepository;
	@Autowired
	UploadStashRepository uploadStashRepository;
	
	@GetMapping(path="/getAllFileArchives")
	public @ResponseBody Iterable<FileArchive> getAllFileArchives() {
		return fileArchiveRepository.findAll();
	}

	@GetMapping(path="/addNewFile")
	public @ResponseBody String addNewFile(@RequestParam String filepath,
										   @RequestParam Integer filetype,
										   @RequestParam Integer isurl) {
		Files file = new Files();
		file.setFile_path(filepath);
		file.setFile_type(filetype);
		file.setIs_url(isurl);
		fileRepository.save(file);
		return "Saved";
	}
	
	@GetMapping(path="/getAllFiles")
	public @ResponseBody Iterable<Files> getAllFile() {
		return fileRepository.findAll();
	}
	
	@GetMapping(path="/deleteFile")
	public @ResponseBody String deleteFile(@RequestParam Integer id) {
		Files file = new Files();
		file.setFile_id(id);
		fileRepository.delete(file);
		return "Deleted";
	}
	@GetMapping(path="/addNewUpload")
	public @ResponseBody String addNewUpload(@RequestParam Integer clusterjobids,
											 @RequestParam Integer consumedquota,
											 @RequestParam Integer errorcode,
											 @RequestParam Integer eventcode,
											 @RequestParam Integer externalid,
											 @RequestParam Integer info,
											 @RequestParam Integer languagecode,
											 @RequestParam Integer laststatusupdate,
											 @RequestParam Integer statusid,
											 @RequestParam String timestamp,
											 @RequestParam Integer uuid) {
		Uploads upload = new Uploads();
		upload.setCluster_job_ids(clusterjobids);
		upload.setConsumed_quota(consumedquota);
		upload.setError_code(errorcode);
		upload.setEvent_code(eventcode);
		upload.setExternal_id(externalid);
		upload.setInfo(info);
		upload.setLanguage_code(languagecode);
		upload.setLast_status_update(laststatusupdate);
		upload.setStatus_id(statusid);
		upload.setTimestamp(timestamp);
		upload.setUuid(uuid);
		uploadsRepository.save(upload);
		return "Saved";
		
	}
	
	@GetMapping(path="/getAllUploads")
	public @ResponseBody Iterable<Uploads> getAllUploads() {
		return uploadsRepository.findAll();
	}
	
	@GetMapping(path="/deleteUpload")
	public @ResponseBody String deleteUpload(@RequestParam Integer id) {
		Uploads upload = new Uploads();
		upload.setUpload_id(id);
		uploadsRepository.delete(upload);
		return "Deleted";
	}
	
	@GetMapping(path="/addNewUploadStash")
	public @ResponseBody String addNewUploadStash(@RequestParam Integer uploadstashchunk,
												  @RequestParam Integer uploadstashimageheight,
												  @RequestParam Integer uploadstashimagewidth,
												  @RequestParam Integer uploadstashmajormime,
												  @RequestParam Integer uploadstashmediatype,
												  @RequestParam Integer uploadstashminormime,
												  @RequestParam String uploadstashoriginalpath,
												  @RequestParam String uploadstashpath,
												  @RequestParam String uploadstashsha1,
												  @RequestParam Integer uploadstashsize,
												  @RequestParam Integer uploadstashsourcetype,
												  @RequestParam Integer uploadstashstatus,
												  @RequestParam String uploadstashtimestamp,
												  @RequestParam Integer uploadstashuser) {
		UploadStash uStash = new UploadStash();
		uStash.setUpload_stash_chunk(uploadstashchunk);
		uStash.setUpload_stash_image_height(uploadstashimageheight);
		uStash.setUpload_stash_image_width(uploadstashimagewidth);
		uStash.setUpload_stash_major_mime(uploadstashmajormime);
		uStash.setUpload_stash_media_type(uploadstashmediatype);
		uStash.setUpload_stash_minor_mime(uploadstashminormime);
		uStash.setUpload_stash_original_path(uploadstashoriginalpath);
		uStash.setUpload_stash_path(uploadstashpath);
		uStash.setUpload_stash_sha1(uploadstashsha1);
		uStash.setUpload_stash_size(uploadstashsize);
		uStash.setUpload_stash_source_type(uploadstashsourcetype);
		uStash.setUpload_stash_status(uploadstashstatus);
		uStash.setUpload_stash_timestamp(uploadstashtimestamp);
		uStash.setUpload_stash_user(uploadstashuser);
		uploadStashRepository.save(uStash);
		return "Saved";
	}
	@GetMapping(path="/getAllUploadStash")
	public @ResponseBody Iterable<UploadStash> getallUploadStash() {
		return uploadStashRepository.findAll();
	}
	
	@GetMapping(path="/deleteUploadStash")
	public @ResponseBody String deleteUploadStash(@RequestParam Integer id) {
		UploadStash uStash = new UploadStash();
		uStash.setUpload_stash_id(id);
		uploadStashRepository.delete(uStash);
		return "Deleted";
	}
}
