/**
*	MIT License
*
*	Copyright (c) 2018 Billy Bissic
*
*	Permission is hereby granted, free of charge, to any person obtaining a copy
*	of this software and associated documentation files (the "Software"), to deal
*	in the Software without restriction, including without limitation the rights
*	to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
*	copies of the Software, and to permit persons to whom the Software is
*	furnished to do so, subject to the following conditions:
*
*	The above copyright notice and this permission notice shall be included in all
*	copies or substantial portions of the Software.
*
*	THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
*	IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
*	FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
*	AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
*	LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
*	OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
*	SOFTWARE.
**/
package application.controller;

import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import application.domain.EmploymentApplicationType;
import application.domain.EmploymentArrangementType;
import application.domain.EmploymentPositionStatus;
import application.domain.EmploymentPositionType;
import application.exception.NoApplicationTypesFoundException;
import application.exception.NoPositionStatusFoundException;
import application.exception.NoPositionTypesFoundException;
import application.repository.ApplicationTypeRepository;
import application.repository.ArrangementTypeRepository;
import application.repository.PositionStatusRepository;
import application.repository.PositionTypeRepository;

/**
 * @author Billy Bissic
 *
 */

@Controller
@RequestMapping(path="/SharedStaticDataServices")
public class SharedDataServicesController {

	@Autowired
	private ApplicationTypeRepository applicationTypeRepository;
	
	@Autowired
	private PositionStatusRepository positionStatusRepository;
	
	@Autowired
	private PositionTypeRepository positionTypeRepository;
	
	@Autowired
	private ArrangementTypeRepository arrangementTypeRepository;
	
	@RequestMapping(value="/getApplicationTypes", method = RequestMethod.GET)
	public ResponseEntity<?> getApplicationTypes() {
		
		try
		{
			Iterable<EmploymentApplicationType> applicationTypes = applicationTypeRepository.findAll();
		
			if(applicationTypes == null) {
				throw new NoApplicationTypesFoundException();
			}
		
			return new ResponseEntity<Iterable<EmploymentApplicationType>>(applicationTypes, HttpStatus.OK);
		}
		catch (HibernateException ex)
		{
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@RequestMapping(value="/saveApplicationType", method = RequestMethod.POST)
	public ResponseEntity<?> saveApplicationType(EmploymentApplicationType applicationType) {
		
		try
		{
			applicationTypeRepository.save(applicationType);
			Iterable<EmploymentApplicationType> applicationTypes = applicationTypeRepository.findAll();
			
			return new ResponseEntity<Iterable<EmploymentApplicationType>>(applicationTypes, HttpStatus.OK);
		}
		catch (HibernateException ex)
		{
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@RequestMapping(value="/deleteApplicationType", method = RequestMethod.POST)
	public ResponseEntity<?> deleteApplicationType(Integer id) {
		try
		{
			EmploymentApplicationType appType = applicationTypeRepository.findOne(id);
			if(appType == null) {
				throw new NoApplicationTypesFoundException();
			}
			
			applicationTypeRepository.delete(appType);
			return new ResponseEntity<HttpStatus>(HttpStatus.ACCEPTED);
		}
		catch (HibernateException ex)
		{
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@RequestMapping(value="/getPositionStatuses", method = RequestMethod.GET)
	public ResponseEntity<?> getPositionStatuses() {
		try
		{
			Iterable<EmploymentPositionStatus> positionStatuses = positionStatusRepository.findAll();
		
			if(positionStatuses == null) {
				throw new NoPositionStatusFoundException();
			}
			
			return new ResponseEntity<Iterable<EmploymentPositionStatus>>(positionStatuses, HttpStatus.OK);
		}
		catch (HibernateException ex)
		{
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@RequestMapping(value="/savePositionStatus", method = RequestMethod.POST)
	public ResponseEntity<?> savePositionStatus(EmploymentPositionStatus positionStatus) {
		
		try
		{
			positionStatusRepository.save(positionStatus);
			Iterable<EmploymentPositionStatus> positionStatuses = positionStatusRepository.findAll();
			
			return new ResponseEntity<Iterable<EmploymentPositionStatus>>(positionStatuses, HttpStatus.OK);
		}
		catch (HibernateException ex)
		{
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@RequestMapping(value="/deletePositionStatus", method = RequestMethod.POST)
	public ResponseEntity<?> deletePositionStatus(Integer id) {
		try
		{
			EmploymentPositionStatus posStatus = positionStatusRepository.findOne(id);
			if(posStatus == null) {
				throw new NoPositionStatusFoundException();
			}
			
			positionStatusRepository.delete(posStatus);
			return new ResponseEntity<HttpStatus>(HttpStatus.ACCEPTED);
		}
		catch (HibernateException ex)
		{
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@RequestMapping(value="/getPositionTypes", method = RequestMethod.GET)
	public ResponseEntity<?> getPositionTypes() {
		
		try
		{
			Iterable<EmploymentPositionType> positionTypes = positionTypeRepository.findAll();
			
			if(positionTypes == null) {
				throw new NoPositionTypesFoundException();
			}
			
			return new ResponseEntity<Iterable<EmploymentPositionType>>(positionTypes, HttpStatus.OK);
		}
		catch (HibernateException ex)
		{
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@RequestMapping(value="/savePositionType", method = RequestMethod.POST)
	public ResponseEntity<?> savePositionType(EmploymentPositionType positionType) {
		try
		{
			positionTypeRepository.save(positionType);
			Iterable<EmploymentPositionType> positionTypes = positionTypeRepository.findAll();
			
			return new ResponseEntity<Iterable<EmploymentPositionType>>(positionTypes, HttpStatus.OK);
		}
		catch (HibernateException ex)
		{
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@RequestMapping(value="/deletePositionType", method = RequestMethod.POST)
	public ResponseEntity<?> deletePositionType(Integer id) {
		try
		{
			EmploymentPositionStatus posType = positionStatusRepository.findOne(id);
			if(posType == null) {
				throw new NoPositionTypesFoundException();
			}
			
			positionStatusRepository.delete(posType);
			return new ResponseEntity<HttpStatus>(HttpStatus.ACCEPTED);
		}
		catch (HibernateException ex)
		{
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@RequestMapping(value="/getArrangementTypes", method = RequestMethod.GET)
	public ResponseEntity<?> getArrangementTypes() {
		
		try
		{
			Iterable<EmploymentArrangementType> arrangementTypes = arrangementTypeRepository.findAll();
			
			if(arrangementTypes == null) {
				throw new NoPositionTypesFoundException();
			}
			
			return new ResponseEntity<Iterable<EmploymentArrangementType>>(arrangementTypes, HttpStatus.OK);
		}
		catch (HibernateException ex)
		{
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@RequestMapping(value="/saveArrangementType", method = RequestMethod.POST)
	public ResponseEntity<?> saveArrangementType(EmploymentArrangementType arrangementType) {
		try
		{
			arrangementTypeRepository.save(arrangementType);
			Iterable<EmploymentArrangementType> arrangementTypes = arrangementTypeRepository.findAll();
			
			return new ResponseEntity<Iterable<EmploymentArrangementType>>(arrangementTypes, HttpStatus.OK);
		}
		catch (HibernateException ex)
		{
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@RequestMapping(value="/deleteArrangementType", method = RequestMethod.POST)
	public ResponseEntity<?> deleteArrangementType(Integer id) {
		try
		{
			EmploymentArrangementType arranType = arrangementTypeRepository.findOne(id);
			if(arranType == null) {
				throw new NoPositionTypesFoundException();
			}
			
			arrangementTypeRepository.delete(arranType);
			return new ResponseEntity<HttpStatus>(HttpStatus.ACCEPTED);
		}
		catch (HibernateException ex)
		{
			System.out.println(ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.BAD_REQUEST);
		}
	}

}
