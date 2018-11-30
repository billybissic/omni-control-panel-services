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

import application.domain.BartenderApplication;
import application.domain.EntertainerApplication;
import application.domain.EntertainerAudition;
import application.domain.StaffMember;
import application.exception.BartenderApplicationNotFoundException;
import application.exception.EntertainerApplicationNotFoundException;
import application.exception.EntertainerAuditionNotFoundException;
import application.exception.NoDataAvailableException;
import application.exception.StaffMemberNotFoundException;
import application.repository.BartenderApplicationRepository;
import application.repository.EntertainerApplicationRepository;
import application.repository.EntertainerAuditionRepository;
import application.repository.StaffMemberRepository;

/**
 * @author Billy Bissic
 *
 */

@Controller
@RequestMapping(path="/api/EmployeeManagementService")
public class EmployeeManagementController {

	@Autowired
	private BartenderApplicationRepository barTenderApplicationRepository;
	@Autowired
	private EntertainerApplicationRepository entertainerApplicationRepository;
	@Autowired
	private EntertainerAuditionRepository entertainerAuditionRepository;
	@Autowired
	private StaffMemberRepository staffMemberRepository;
	
	/* Bartender application */
	@RequestMapping(path="/getAllBarTenderApplications", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getAllBarTenderApplications() {
		
		try
		{
			Iterable<BartenderApplication> applications = barTenderApplicationRepository.findAll();
			if (applications == null) {
				throw new NoDataAvailableException();
			}
			
			return new ResponseEntity<Iterable<BartenderApplication>>(applications, HttpStatus.OK);
			
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
		
	}
	
	@RequestMapping(path="/getBarTenderApplicationById", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getAllBarTenderApplicationById(@RequestParam String _id) {
		
		try
		{
			BartenderApplication bartenderApplication = barTenderApplicationRepository.findOne(_id);
			if(bartenderApplication == null) {
				throw new BartenderApplicationNotFoundException();
			}
			return new ResponseEntity<BartenderApplication>(bartenderApplication, HttpStatus.OK);
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
		
	}
	
	@RequestMapping(path="/deleteBarTenderApplicationById/{_id}", method = RequestMethod.DELETE)
	public @ResponseBody ResponseEntity<?> deleteBarTenderApplicationById(@PathVariable String _id)
	{
		try
		{
			BartenderApplication bartenderApplication = barTenderApplicationRepository.findOne(_id);
			if(bartenderApplication == null) {
				throw new BartenderApplicationNotFoundException();
			}
			barTenderApplicationRepository.delete(bartenderApplication);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}

	@RequestMapping(path="/createOrUpdateBartenderApplication", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> createOrUpdateBartenderApplication(@RequestBody BartenderApplication application) {
		try {
			BartenderApplication bartenderApplication = barTenderApplicationRepository.findOne(application.get_id());
			
			if (bartenderApplication == null) {
				barTenderApplicationRepository.insert(bartenderApplication);
				return new ResponseEntity<HttpStatus>(HttpStatus.OK);
			}
			else
			{
				barTenderApplicationRepository.save(bartenderApplication);
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
	
	/* Entertainer application */
	@RequestMapping(path="/getAllEntertainerApplications", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getAllEntertainerApplications() {
		
		try
		{
			Iterable<EntertainerApplication> applications = entertainerApplicationRepository.findAll();
			if (applications == null) {
				throw new NoDataAvailableException();
			}
			
			return new ResponseEntity<Iterable<EntertainerApplication>>(applications, HttpStatus.OK);
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
		
	}
	
	@RequestMapping(path="/getEntertainerApplicationById", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getEntertainerApplicationById(@RequestParam String _id) {
		
		try
		{
			BartenderApplication bartenderApplication = barTenderApplicationRepository.findOne(_id);
			if(bartenderApplication == null) {
				throw new BartenderApplicationNotFoundException();
			}
			return new ResponseEntity<BartenderApplication>(bartenderApplication, HttpStatus.OK);
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	@RequestMapping(path="/deleteEntertainerApplicationById/{_id}", method = RequestMethod.DELETE)
	public @ResponseBody ResponseEntity<?> deleteEntertainerApplicationById(@PathVariable String _id)
	{
		try
		{
			EntertainerApplication entertainerApplication = entertainerApplicationRepository.findOne(_id);
			if(entertainerApplication == null) {
				throw new EntertainerApplicationNotFoundException();
			}
			entertainerApplicationRepository.delete(entertainerApplication);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}

	@RequestMapping(path="/createOrUpdateEntertainerApplication", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> createOrUpdateEntertainerApplication(@RequestBody EntertainerApplication application) {
		try 
		{
			EntertainerApplication entertainerApplication = entertainerApplicationRepository.findOne(application.get_id());
			
			if (entertainerApplication == null) {
				entertainerApplicationRepository.insert(entertainerApplication);
				return new ResponseEntity<HttpStatus>(HttpStatus.OK);
			}
			else
			{
				entertainerApplicationRepository.save(entertainerApplication);
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
	
	/* Entertainer audition */
	@RequestMapping(path="/getAllEntertainerAuditions", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getAllEntertainerAuditions() {
		
		try
		{
			Iterable<EntertainerAudition> auditions = entertainerAuditionRepository.findAll();
			if (auditions == null) {
				throw new NoDataAvailableException();
			}
			
			return new ResponseEntity<Iterable<EntertainerAudition>>(auditions, HttpStatus.OK);
			
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
		
	}
	
	@RequestMapping(path="/getEntertainerAuditionById", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getEntertainerAuditionById(@RequestParam String _id) {
		
		try
		{
			EntertainerAudition audition = entertainerAuditionRepository.findOne(_id);
			if(audition == null)
			{
				throw new EntertainerAuditionNotFoundException();
			}
			return new ResponseEntity<EntertainerAudition>(audition, HttpStatus.OK);
			
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
		
	}
	
	@RequestMapping(path="/deleteEntertainerAuditionById/{_id}", method = RequestMethod.DELETE)
	public @ResponseBody ResponseEntity<?> deleteEntertainerAuditionById(@PathVariable String _id)
	{
		try
		{
			BartenderApplication bartenderApplication = barTenderApplicationRepository.findOne(_id);
			if(bartenderApplication == null) {
				throw new BartenderApplicationNotFoundException();
			}
			barTenderApplicationRepository.delete(bartenderApplication);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	@RequestMapping(path="/createOrupdateEntertainerAudition", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> createOrUpdateEntertainerAudition(@RequestBody EntertainerAudition audition) {
		try 
		{
			EntertainerAudition entertainerAudition = entertainerAuditionRepository.findOne(audition.get_id());
			
			if (entertainerAudition == null) {
				entertainerAuditionRepository.insert(entertainerAudition);
				return new ResponseEntity<HttpStatus>(HttpStatus.OK);
			}
			else
			{
				entertainerAuditionRepository.save(entertainerAudition);
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
	
	/* Staff member */
	/* Staff member */
	@RequestMapping(path="/getAllStaffMembers", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getAllStaffMembers() {
		
		try
		{
			Iterable<StaffMember> staffmembers = staffMemberRepository.findAll();
			if (staffmembers == null) {
				throw new NoDataAvailableException();
			}
			
			return new ResponseEntity<Iterable<StaffMember>>(staffmembers, HttpStatus.OK);
			
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
		
	}
	
	@RequestMapping(path="/getStaffMemberById", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getStaffMemberById(@RequestParam String _id) {
		
		try
		{
			StaffMember staffMember = staffMemberRepository.findOne(_id);
			if(staffMember == null) {
				throw new StaffMemberNotFoundException();
			}
			return new ResponseEntity<StaffMember>(staffMember, HttpStatus.OK);
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
		
	}
	
	@RequestMapping(path="/deleteStaffMemberById/{_id}", method = RequestMethod.DELETE)
	public @ResponseBody ResponseEntity<?> deleteStaffMemberById(@PathVariable String _id)
	{
		try
		{
			StaffMember staffMember = staffMemberRepository.findOne(_id);
			if(staffMember == null) {
				throw new StaffMemberNotFoundException();
			}
			staffMemberRepository.delete(staffMember);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	@RequestMapping(path="/createOrUpdateStaffMember", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> createOrUpdateStaffMember(@RequestBody StaffMember member) {
		try 
		{
			StaffMember staffMember = staffMemberRepository.findOne(member.get_id());
			
			if (staffMember == null) {
				staffMemberRepository.insert(staffMember);
				return new ResponseEntity<HttpStatus>(HttpStatus.OK);
			}
			else
			{
				staffMemberRepository.save(staffMember);
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
