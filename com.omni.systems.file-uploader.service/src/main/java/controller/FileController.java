/**
* MIT License
*
* Copyright (c) 2018 Billy Bissic
*
* Permission is hereby granted, free of charge, to any person obtaining a copy
* of this software and associated documentation files (the "Software"), to deal
* in the Software without restriction, including without limitation the rights
* to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
* copies of the Software, and to permit persons to whom the Software is
* furnished to do so, subject to the following conditions:
* 
* The above copyright notice and this permission notice shall be included in all
* copies or substantial portions of the Software.
* 
* THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
* IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
* FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
* AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
* LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
* OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
* SOFTWARE.
**/
package controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.http.MediaType;

/**
 * @author Billy Bissic
 *
 */
@Controller
@RequestMapping(path="/api/fileService")
public class FileController {
	public static String entertainerImageDirectory = System.getProperty("user.dir") + "/entertainerImages";
	public static String ownersImageDirectory = System.getProperty("user.dir") + "/ownersImages";
	public static String eventFlyerDirectory = System.getProperty("user.dir") + "/eventImages";
	public static String applicationImageDirectory = System.getProperty("user.dir") + "/applicationImages";
	public static String resumeDirectory = System.getProperty("user.dir") + "/resumes";
	public static String uploadDirectory = System.getProperty("user.dir") + "/uploads";
	
	
	@RequestMapping("/upload")
	public ResponseEntity<?> upload(@RequestParam("files") MultipartFile[] files) {
		StringBuilder fileNames = new StringBuilder();
		for(MultipartFile file: files) {
			Path fileNameAndPath = Paths.get(uploadDirectory, file.getOriginalFilename());
			fileNames.append(file.getOriginalFilename() + " ");
			try {
				Files.write(fileNameAndPath,  file.getBytes());
			} catch (IOException e ) {
				e.printStackTrace();
			}
		}
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		
	}
	
	@RequestMapping("/uploadOwnerImages")
	public ResponseEntity<?> uploadOwnerImages(@RequestParam("files") MultipartFile[] files) {
		StringBuilder fileNames = new StringBuilder();
		for(MultipartFile file: files) {
			Path fileNameAndPath = Paths.get(ownersImageDirectory, file.getOriginalFilename());
			fileNames.append(file.getOriginalFilename() + " ");
			try {
				Files.write(fileNameAndPath, file.getBytes());
			} catch (IOException e ) {
				e.printStackTrace();
			}
		}
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}
	
	@RequestMapping("/uploadFlyer")
	public ResponseEntity<?> uploadFlyer(@RequestParam("files") MultipartFile[] files) {
		StringBuilder fileNames = new StringBuilder();
		for(MultipartFile file: files) {
			Path fileNameAndPath = Paths.get(eventFlyerDirectory, file.getOriginalFilename());
			fileNames.append(file.getOriginalFilename() + " ");
			try {
				Files.write(fileNameAndPath, file.getBytes());
			} catch (IOException e ) {
				e.printStackTrace();
			}
		}
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}
	
	@RequestMapping("/uploadApplicationImage")
	public ResponseEntity<?> uploadApplicationImage(@RequestParam("files") MultipartFile[] files) {
		StringBuilder fileNames = new StringBuilder();
		for(MultipartFile file: files) {
			Path fileNameAndPath = Paths.get(applicationImageDirectory, file.getOriginalFilename());
			fileNames.append(file.getOriginalFilename() + " ");
			try {
				Files.write(fileNameAndPath, file.getBytes());
			} catch (IOException e ) {
				e.printStackTrace();
			}
		}
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}
	
	@RequestMapping("/uploadResume")
	public ResponseEntity<?> uploadResume(@RequestParam("files") MultipartFile[] files) {
		StringBuilder fileNames = new StringBuilder();
		for(MultipartFile file: files) {
			Path fileNameAndPath = Paths.get(resumeDirectory, file.getOriginalFilename());
			fileNames.append(file.getOriginalFilename() + " ");
			try {
				Files.write(fileNameAndPath, file.getBytes());
			} catch (IOException e ) {
				e.printStackTrace();
			}
		}
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}
	
	@RequestMapping(value = "/getImage", method = RequestMethod.GET, produces = MediaType.IMAGE_JPEG_VALUE)
	public ResponseEntity<byte[]> getImage(@RequestParam String imageName) throws IOException {

	  	Path fileNameAndPath = Paths.get(uploadDirectory, imageName);
	    byte[] bytes = Files.readAllBytes(fileNameAndPath);
	    
	    return ResponseEntity
	           .ok()
	           .contentType(MediaType.IMAGE_JPEG)
	           .body(bytes);
	}
	
	@RequestMapping(value = "/getEntertainerImage", method = RequestMethod.GET, produces = MediaType.IMAGE_JPEG_VALUE)
	public ResponseEntity<byte[]> getEntertainerImage(@RequestParam String imageName) throws IOException {

	Path fileNameAndPath = Paths.get(uploadDirectory, imageName);
	byte[] bytes = Files.readAllBytes(fileNameAndPath);
	
	return ResponseEntity
	       .ok()
	       .contentType(MediaType.IMAGE_JPEG)
	       .body(bytes);
	}
	
	@RequestMapping(value = "/getOwnerImage", method = RequestMethod.GET, produces = MediaType.IMAGE_JPEG_VALUE)
	public ResponseEntity<byte[]> getOwnerImage(@RequestParam String imageName) throws IOException {

	Path fileNameAndPath = Paths.get(uploadDirectory, imageName);
	byte[] bytes = Files.readAllBytes(fileNameAndPath);
	
	return ResponseEntity
	       .ok()
	       .contentType(MediaType.IMAGE_JPEG)
	       .body(bytes);
	}

	@RequestMapping(value = "/getEventFlyer", method = RequestMethod.GET, produces = MediaType.IMAGE_JPEG_VALUE)
	public ResponseEntity<byte[]> getEventFlyer(@RequestParam String imageName) throws IOException {

	Path fileNameAndPath = Paths.get(uploadDirectory, imageName);
	byte[] bytes = Files.readAllBytes(fileNameAndPath);
	
	return ResponseEntity
	       .ok()
	       .contentType(MediaType.IMAGE_JPEG)
	       .body(bytes);
	}
	
	@RequestMapping(value = "/getApplicationImage", method = RequestMethod.GET, produces = MediaType.IMAGE_JPEG_VALUE)
	public ResponseEntity<byte[]> getApplicationImage(@RequestParam String imageName) throws IOException {

	Path fileNameAndPath = Paths.get(uploadDirectory, imageName);
	byte[] bytes = Files.readAllBytes(fileNameAndPath);
	
	return ResponseEntity
	       .ok()
	       .contentType(MediaType.IMAGE_JPEG)
	       .body(bytes);
	}
	
	@RequestMapping(value = "/getResume", method = RequestMethod.GET, produces = MediaType.IMAGE_JPEG_VALUE)
	public ResponseEntity<byte[]> getResume(@RequestParam String resumeName) throws IOException {

	Path fileNameAndPath = Paths.get(uploadDirectory, resumeName);
	byte[] bytes = Files.readAllBytes(fileNameAndPath);
	
	return ResponseEntity
	       .ok()
	       .contentType(MediaType.IMAGE_JPEG)
	       .body(bytes);
	}
}
