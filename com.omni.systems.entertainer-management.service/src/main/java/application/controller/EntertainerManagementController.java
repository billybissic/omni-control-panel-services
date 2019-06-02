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

import application.domain.EntertainerContent;
import application.exceptions.DocumentAlreadyExistsException;
import application.exceptions.DocumentNotFoundException;
import application.repository.EntertainerContentRepository;

/**
 * @author Billy Bissic
 *
 */

@Controller
@RequestMapping(path="/api/EntertainerManagement")
public class EntertainerManagementController {
	
	@Autowired
	private EntertainerContentRepository entertainerContentRepository;
	
	@RequestMapping(path="/getEntertainerContentById/{_id}", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getSimpleContentById(@PathVariable String _id)
	{
		try
		{
			EntertainerContent entertainerContent = entertainerContentRepository.findOne(_id);
			if (entertainerContent == null) {
				throw new DocumentNotFoundException();
			}
			return new ResponseEntity<EntertainerContent>(entertainerContent, HttpStatus.OK);
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	@RequestMapping(path="/getAllEntertainerContent", method = RequestMethod.GET)
	public @ResponseBody Iterable<EntertainerContent> getAllContentById()
	{
		return entertainerContentRepository.findAll();
	}
	
	@RequestMapping(path="/getEntertainerContentByEntertainerName", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getSimpleContentByDocumentName(@RequestParam String entertainerName)
	{
		try
		{
			EntertainerContent entertainerContent = entertainerContentRepository.findByEntertainerName(entertainerName);
			if (entertainerContent == null) {
				throw new DocumentNotFoundException();
			}
			return new ResponseEntity<EntertainerContent>(entertainerContent, HttpStatus.OK);
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	@RequestMapping(path="/createNewEntertainerContentDocument", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> createNewSimpleContentDocument(@RequestBody EntertainerContent document)
	{
		try
		{
			EntertainerContent simpleContent = entertainerContentRepository.findByEntertainerName(document.getEntertainerName());
			if (simpleContent == null)
			{
				entertainerContentRepository.save(document);
				return new ResponseEntity<EntertainerContent>(document, HttpStatus.CREATED);
			}
			else
			{
				throw new DocumentAlreadyExistsException(document);
			}
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		
			/* TODO: log the exception */
		}
	}
	
	@RequestMapping(path="/updateEntertainerContentDocument", method = RequestMethod.POST)
	public ResponseEntity<?> updateSimpleContentDocument(@RequestBody EntertainerContent document)
	{
		try
		{
			EntertainerContent simpleContent = entertainerContentRepository.findOne(document.getEntertainerName());
			if (simpleContent == null)
			{
				throw new DocumentNotFoundException();
			}
			else 
			{
				entertainerContentRepository.save(document);
				return new ResponseEntity<EntertainerContent>(document, HttpStatus.ACCEPTED);
			}
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		
			/* TODO: log the exception */
		}
	}
	
	@RequestMapping(path="/deleteEntertainerContentById/{_id}", method = RequestMethod.DELETE)
	public ResponseEntity<HttpStatus> deleteSimpleContentById(@PathVariable String _id)
	{
		try
		{
			EntertainerContent entertainerContent = entertainerContentRepository.findOne(_id);
			if (entertainerContent == null)
			{
				throw new DocumentNotFoundException();
			}
			else
			{
				entertainerContentRepository.delete(entertainerContent);
				return new ResponseEntity<HttpStatus>(HttpStatus.OK);
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
