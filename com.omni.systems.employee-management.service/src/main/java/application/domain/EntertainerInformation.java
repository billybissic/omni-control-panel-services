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
package application.domain;

/**
 * @author Billy Bissic
 *
 */

public class EntertainerInformation {
	private String phone;
	private String hireDate;
	private EmergencyContact emergencyContacts;
	private Identification identification;
	private String stageName;
	private String highestLevelOfEducation;
	private boolean hasDancedBefore;
	
	/**
	 * @return the stageName
	 */
	public String getStageName() {
		return stageName;
	}
	/**
	 * @param stageName the stageName to set
	 */
	public void setStageName(String stageName) {
		this.stageName = stageName;
	}
	/**
	 * @return the hasDancedBefore
	 */
	public boolean isHasDancedBefore() {
		return hasDancedBefore;
	}
	/**
	 * @param hasDancedBefore the hasDancedBefore to set
	 */
	public void setHasDancedBefore(boolean hasDancedBefore) {
		this.hasDancedBefore = hasDancedBefore;
	}
}
