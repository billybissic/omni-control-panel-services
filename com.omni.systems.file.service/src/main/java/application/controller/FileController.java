package application.controller;

import java.io.FileNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import application.domain.Files;
import application.domain.UploadStash;
import application.exception.FilesNotFoundException;
import application.exception.NoDataAvailableException;
import application.exception.UploadStashAlreadyExistsException;
import application.exception.UploadStashNotFoundException;
import application.repository.FilesRepository;
import application.repository.UploadStashRepository;

@Controller
@RequestMapping(path="/api/FileServices")
public class FileController {

	@Autowired
	FilesRepository fileRepository;
	@Autowired
	UploadStashRepository uploadStashRepository;

	@RequestMapping(path="/addNewFile", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> addNewFile(@RequestBody Files file) {
		try
		{
			fileRepository.save(file);
			return new ResponseEntity<Object>(file, HttpStatus.CREATED);
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	@RequestMapping(path="/getAllFilesForUploadStash", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getAllFilesForUploadStash(@RequestBody UploadStash uploadStash) {
		try
		{
			Long fileCount = fileRepository.countFilesForUploadStash(uploadStash.getUpload_stash_id());
			Iterable<Files> userFiles;
			
			if(fileCount == 0)
			{
				throw new FilesNotFoundException();
			}
			else
			{
				userFiles = fileRepository.findFilesForUploadStash(uploadStash.getUpload_stash_id());
				return new ResponseEntity<Object>(userFiles, HttpStatus.OK);
			}
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	@RequestMapping(path="/deleteFile", method = RequestMethod.DELETE)
	public @ResponseBody ResponseEntity<?> deleteFile(@RequestBody Files file) {
		try
		{
			if(fileRepository.findFile(file.getUpload_stash_id(), file.getFile_id()).isPresent())
			{
				fileRepository.delete(file);
				return new ResponseEntity<Object>(file, HttpStatus.OK);
			}
			else
			{
				throw new FilesNotFoundException();
			}
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	@RequestMapping(path="/addNewUploadStash", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> addNewUploadStash(@RequestBody UploadStash uploadStash) {
		
		try
		{
			if(uploadStashRepository.findById(uploadStash.getUpload_stash_id(), uploadStash.getUpload_stash_uuid()).isPresent()) {
				throw new UploadStashAlreadyExistsException(uploadStash);
			}
			else
			{
				uploadStashRepository.save(uploadStash);
				return new ResponseEntity<Object>(uploadStash, HttpStatus.CREATED);
			}
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	@RequestMapping(path="/getUsersUploadStash", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getUsersUploadStash(@RequestParam Integer uuid) {
		try
		{
			Long userUploadStashCount = uploadStashRepository.count();
			Iterable<UploadStash> usersUploadStash;
			
			if(userUploadStashCount == 0)
			{
				usersUploadStash = uploadStashRepository.findUsersUploadStash(uuid);
				return new ResponseEntity<Object>(usersUploadStash, HttpStatus.OK);
			}
			else
			{
				throw new NoDataAvailableException();
			}
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	@RequestMapping(path="/deleteUploadStash", method = RequestMethod.DELETE)
	public @ResponseBody ResponseEntity<?> deleteUploadStash(@RequestBody UploadStash uploadStash) {
		try
		{
			if(uploadStashRepository.findById(uploadStash.getUpload_stash_id(), uploadStash.getUpload_stash_uuid()).isPresent()) {
				uploadStashRepository.delete(uploadStash);
				return new ResponseEntity<Object>(uploadStash, HttpStatus.OK);
			}
			else
			{
				throw new UploadStashNotFoundException(uploadStash);
			}
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
}
