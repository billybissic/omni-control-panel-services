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

package application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import application.domain.ApplicationSettings;
import application.exception.ApplicationSettingAlreadyExistsException;
import application.exception.ApplicationSettingNotFoundException;
import application.exception.NoDataAvailableException;
import application.repository.ApplicationSettingsRepository;

@Controller
@RequestMapping(path="api/ApplicationSettings")
public class SettingsController {
	@Autowired
	private ApplicationSettingsRepository applicationSettingsRepository;
	
	@RequestMapping(path="/getAllApplicationSettings", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getAllApplicationSettings()
	{
		try
		{
			Iterable<ApplicationSettings> applicationSettings = applicationSettingsRepository.findAll();
			if(applicationSettings == null) {
				throw new NoDataAvailableException();
			}
			return new ResponseEntity<Iterable<ApplicationSettings>>(applicationSettings, HttpStatus.OK);
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	@RequestMapping(path="/getApplicationSettingsByApplicationName", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> gettApplicationSettingsByName(@RequestParam String applicationname)
	{
		try
		{
			Iterable<ApplicationSettings> applicationSettings = applicationSettingsRepository.findByApplicationName(applicationname);
			if(applicationSettings == null) {
				throw new NoDataAvailableException();
			}
			return new ResponseEntity<Iterable<ApplicationSettings>>(applicationSettings, HttpStatus.OK);
		}
		catch(DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}

	@RequestMapping(path="/addNewApplicationSetting", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> addNewApplicationSetting(@RequestBody ApplicationSettings applicationSettings)	
	{
		try
		{
			applicationSettingsRepository.save(applicationSettings);
			return new ResponseEntity<ApplicationSettings>(applicationSettings, HttpStatus.OK);
		}
		catch(DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	@RequestMapping(path="/deleteApplicationSetting/{_id}", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> deleteApplicationSetting(@PathVariable String _id) {
		
		try
		{
		ApplicationSettings applicationSettings = applicationSettingsRepository.findByApplicationSettingsId(Integer.parseInt(_id));
		
		if (applicationSettings == null ) {
			throw new ApplicationSettingNotFoundException();
		}
			applicationSettingsRepository.delete(applicationSettings);
			return new ResponseEntity<ApplicationSettings>(applicationSettings, HttpStatus.ACCEPTED);
		
		}
		catch(DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
}
