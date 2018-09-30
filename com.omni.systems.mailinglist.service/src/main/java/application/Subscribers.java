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
package application;

/**
 * @author Billy Bissic
 *
 */
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Subscribers {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long subscriber_id;
	private String first_name;
	private String last_name;
	private String birth_day;
	private String subscriber_email;
	
	/**
	 * @return the subscriber_id
	 */
	public Long getSubscriber_id() {
		return subscriber_id;
	}
	/**
	 * @param subscriber_id the subscriber_id to set
	 */
	public void setSubscriber_id(Long subscriber_id) {
		this.subscriber_id = subscriber_id;
	}
	/**
	 * @return the first_name
	 */
	public String getFirst_name() {
		return first_name;
	}
	/**
	 * @param first_name the first_name to set
	 */
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	/**
	 * @return the last_name
	 */
	public String getLast_name() {
		return last_name;
	}
	/**
	 * @param last_name the last_name to set
	 */
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	/**
	 * @return the birth_day
	 */
	public String getBirth_day() {
		return birth_day;
	}
	/**
	 * @param birth_day the birth_day to set
	 */
	public void setBirth_day(String birth_day) {
		this.birth_day = birth_day;
	}
	/**
	 * @return the subscriber_email
	 */
	public String getSubscriber_email() {
		return subscriber_email;
	}
	/**
	 * @param subscriber_email the subscriber_email to set
	 */
	public void setSubscriber_email(String subscriber_email) {
		this.subscriber_email = subscriber_email;
	}
}
