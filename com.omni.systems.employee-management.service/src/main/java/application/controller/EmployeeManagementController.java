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
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import application.repository.EmployeeEducationRepository;
import application.repository.EmployeeEmploymentPositionRepository;
import application.repository.EmployeeHistoryRepository;
import application.repository.EmployeeInformationRepository;
import application.repository.EmployeeReferencesRepository;
import application.repository.EmployeeSignatureRepository;
import application.repository.EmploymentPositionTypeRepository;
import application.repository.EntertainerAuditionsRepository;
import application.repository.EntertainerExperienceRepository;
import application.repository.EntertainerInformationRepository;

/**
 * @author Billy Bissic
 *
 */

@Controller
@RequestMapping(path="/api/EmployeeManagementService")
public class EmployeeManagementController {

	@Autowired
	private EmployeeEducationRepository employeeEducationRepository;
	@Autowired
	private EmployeeEmploymentPositionRepository employeeEmploymentPositionRepository;
	@Autowired 
	private EmployeeHistoryRepository employeeHistoryRepository;
	@Autowired
	private EmployeeInformationRepository employeeInformationRepository;
	@Autowired
	private EmployeeReferencesRepository employeeReferencesRepository;
	@Autowired
	private EmployeeSignatureRepository employeeSignatureRepository;
	@Autowired
	private EmploymentPositionTypeRepository employmentPositionTypeRepository;
	@Autowired
	private EntertainerAuditionsRepository entertainerAuditionsRepository;
	@Autowired
	private EntertainerExperienceRepository entertainerExperienceRepository;
	@Autowired
	private EntertainerInformationRepository entertainerInformationRepository;
	
}
