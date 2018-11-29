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

import java.util.List;

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

import application.domain.SimpleContent;
import application.exceptions.DocumentAlreadyExistsException;
import application.exceptions.DocumentNotFoundException;
import application.repository.SimpleContentRepository;

/**
 * @author Billy Bissic
 *
 */

@Controller
@RequestMapping(path="/api/ContentManagement")
public class ContentManagementController {

	@Autowired
	private SimpleContentRepository simpleContentRepository;
	
	@RequestMapping(path="/getSimpleContentById/{_id}", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getSimpleContentById(@PathVariable String _id)
	{
		try
		{
			SimpleContent simpleContent = simpleContentRepository.findOne(_id);
			if (simpleContent == null) {
				throw new DocumentNotFoundException();
			}
			return new ResponseEntity<SimpleContent>(simpleContent, HttpStatus.OK);
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	@RequestMapping(path="/getAllSimpleDocuments", method = RequestMethod.GET)
	public @ResponseBody Iterable<SimpleContent> getAllContentById()
	{
		return simpleContentRepository.findAll();
	}
	
	@RequestMapping(path="/getSimpleContentByDocumentName", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getSimpleContentByDocumentName(@RequestParam String documentName)
	{
		try
		{
			SimpleContent simpleContent = simpleContentRepository.findByDocumentName(documentName);
			if (simpleContent == null) {
				throw new DocumentNotFoundException();
			}
			return new ResponseEntity<SimpleContent>(simpleContent, HttpStatus.OK);
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	@RequestMapping(path="/createNewSimpleContentDocument", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> createNewSimpleContentDocument(@RequestBody SimpleContent document)
	{
		try
		{
			SimpleContent simpleContent = simpleContentRepository.findByDocumentName(document.getDocumentName());
			if (simpleContent == null)
			{
				simpleContentRepository.save(document);
				return new ResponseEntity<SimpleContent>(document, HttpStatus.CREATED);
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
	
	@RequestMapping(path="/updateSimpleContentDocument", method = RequestMethod.POST)
	public ResponseEntity<?> updateSimpleContentDocument(@RequestBody SimpleContent document)
	{
		try
		{
			SimpleContent simpleContent = simpleContentRepository.findOne(document.getDocumentName());
			if (simpleContent == null)
			{
				throw new DocumentNotFoundException();
			}
			else 
			{
				simpleContentRepository.save(document);
				return new ResponseEntity<SimpleContent>(document, HttpStatus.ACCEPTED);
			}
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		
			/* TODO: log the exception */
		}
	}
	
	@RequestMapping(path="/deleteSimpleContentById/{_id}", method = RequestMethod.DELETE)
	public ResponseEntity<HttpStatus> deleteSimpleContentById(@PathVariable String _id)
	{
		try
		{
			SimpleContent simpleContent = simpleContentRepository.findOne(_id);
			if (simpleContent == null)
			{
				throw new DocumentNotFoundException();
			}
			else
			{
				simpleContentRepository.delete(simpleContent);
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
