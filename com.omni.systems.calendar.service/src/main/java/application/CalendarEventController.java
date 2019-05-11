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
package application;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.apache.commons.io.FilenameUtils;

/**
 * @author Billy Bissic
 *
 */

@Controller
@RequestMapping(path="/api/CalendarEvents")
public class CalendarEventController {

	//private static final String CALENDAR_EVENT_UPLOADS = "CALENDAR_EVENT_UPLOADS";

	
	private UploadProperties properties;
	
	
	@Autowired
	public void setApp(UploadProperties properties) {
		this.properties = properties;
		System.out.println(properties.getSaveDirectory());
	}
	
	
	//private String uploadDirectory = this.properties.getSaveDirectory();
	
	//public static String uploadDirectory = System.getenv("CALENDAR_EVENT_UPLOADS");
	
	//public static String testDirectory = CalendarEventController.class.getResource("");
	//public static String uploadDirectory = CalendarEventController.class.getResource("").getPath();
	//@Autowired
	//private static ServletContext context;
	//public static String uploadDirectory = context.getRealPath("/"); // + File.separator + "/eventImages";
	
	//public static String uploadDirectory = System.getProperty("user.dir") + "/eventImages";

	//System.out.println("**** Content path: *** " + context.getRealPath("/"));
	@Autowired
	private  CalendarEventRepository calendarEventRepository;
	
	@CrossOrigin(origins = "http://www.menageadultclub.com,"
						 + "http://menageadultclub.com,"
			 			 + "http://cs1.menageadultclub.com,"
			 			 + "http://localhost:4200")
	@GetMapping(path="/getCalendarEvents")
	public @ResponseBody Iterable<CalendarEvent> getCalendarEvents() {
		return calendarEventRepository.findAll();
	}
	
	@GetMapping(path="/getCalendarEventsByMonth")
	public @ResponseBody Iterable<CalendarEvent> getCalendarEventsByMonth(@RequestParam String start) {
		return calendarEventRepository.findByStart(start);
	}
	
	@RequestMapping(value="/addCalendarEvent", method = RequestMethod.POST)
	public ResponseEntity<?> createCalendarEvent(@RequestBody CalendarEvent calendarEvent) 
	{	
		/* Save the Entity to Database */
		calendarEventRepository.save(calendarEvent);
		return new ResponseEntity<CalendarEvent>(calendarEvent, HttpStatus.CREATED);
	}
	
	@RequestMapping(path="/deleteCalendarEvent/{_id}", method = RequestMethod.GET)
	public ResponseEntity<HttpStatus> deleteCalendarEvent(@PathVariable String _id)
	{
		calendarEventRepository.delete(calendarEventRepository.findOne(_id));
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}
	
	@CrossOrigin(origins = "http://www.menageadultclub.com,"
						 + "http://menageadultclub.com,"
						 + "http://cs1.menageadultclub.com")
	@RequestMapping(value="/uploadFlyer")
	public ResponseEntity<?> uploadFlyer(@RequestParam("files") MultipartFile[] files) {
		
		String uploadDirectory = this.properties.getSaveDirectory();
		System.out.println(uploadDirectory);
		
		StringBuilder fileNames = new StringBuilder();
		
		for(MultipartFile file: files) {
			Path fileNameAndPath = Paths.get(uploadDirectory, file.getOriginalFilename());
			System.out.println(fileNameAndPath);
			
			fileNames.append(file.getOriginalFilename() + " ");
			try {
				Files.write(fileNameAndPath, file.getBytes());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}
	
	@CrossOrigin(origins = "http://www.menageadultclub.com,"
						 + "http://menageadultclub.com,"
			 			 + "http://cs1.menageadultclub.com")
	@RequestMapping(value = "/getEventFlyerJpeg", method = RequestMethod.GET, produces = MediaType.IMAGE_JPEG_VALUE)
	public ResponseEntity<byte[]> getEventFlyerJpeg(@RequestParam String imageName) throws IOException {
		
		String uploadDirectory = this.properties.getSaveDirectory();
		System.out.println(uploadDirectory);
		
		Path fileNameAndPath = Paths.get(uploadDirectory, imageName);
		byte[] bytes = Files.readAllBytes(fileNameAndPath);
		
		String fileExt = FilenameUtils.getExtension(fileNameAndPath.toString());
		
		return ResponseEntity
				.ok()
				.contentType(MediaType.IMAGE_JPEG)
				.body(bytes);
	}
	
	@CrossOrigin(origins = "http://www.menageadultclub.com,"
						 + "http://menageadultclub.com,"
 						 + "http://cs1.menageadultclub.com")
	@RequestMapping(value = "/getEventFlyerGif", method = RequestMethod.GET, produces = MediaType.IMAGE_GIF_VALUE)
	public ResponseEntity<byte[]> getEventFlyerGif(@RequestParam String imageName) throws IOException {
	
	String uploadDirectory = this.properties.getSaveDirectory();
	System.out.println(uploadDirectory);
	
	Path fileNameAndPath = Paths.get(uploadDirectory, imageName);
	byte[] bytes = Files.readAllBytes(fileNameAndPath);
	
	String fileExt = FilenameUtils.getExtension(fileNameAndPath.toString());
	
	return ResponseEntity
		.ok()
		.contentType(MediaType.IMAGE_GIF)
		.body(bytes);
	}
	
	@CrossOrigin(origins = "http://www.menageadultclub.com,"
						 + "http://menageadultclub.com,"
 						 + "http://cs1.menageadultclub.com")
	@RequestMapping(value = "/getEventFlyerPng", method = RequestMethod.GET, produces = MediaType.IMAGE_PNG_VALUE)
	public ResponseEntity<byte[]> getEventFlyerPng(@RequestParam String imageName) throws IOException {
	
	String uploadDirectory = this.properties.getSaveDirectory();
	System.out.println(uploadDirectory);
	
	Path fileNameAndPath = Paths.get(uploadDirectory, imageName);
	byte[] bytes = Files.readAllBytes(fileNameAndPath);
	
	String fileExt = FilenameUtils.getExtension(fileNameAndPath.toString());
	
	return ResponseEntity
		.ok()
		.contentType(MediaType.IMAGE_PNG)
		.body(bytes);
	}
	
	@RequestMapping(value = "/removeEventFlyer", method = RequestMethod.POST)
	public ResponseEntity<?> removeFlyer(@RequestParam String imageName) throws IOException {
		String uploadDirectory = this.properties.getSaveDirectory();
		System.out.println(uploadDirectory);
		
		Path fileNameAndPath = Paths.get(uploadDirectory, imageName);
		Files.deleteIfExists(fileNameAndPath);
		
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}
}
