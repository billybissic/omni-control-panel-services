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
public class SubscriberGroupMembers {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer subscriber_group_id;
	private Integer subscriber_id;
	/**
	 * @return the subscriber_group_id
	 */
	public Integer getSubscriber_group_id() {
		return subscriber_group_id;
	}
	/**
	 * @param subscriber_group_id the subscriber_group_id to set
	 */
	public void setSubscriber_group_id(Integer subscriber_group_id) {
		this.subscriber_group_id = subscriber_group_id;
	}
	/**
	 * @return the subscriber_id
	 */
	public Integer getSubscriber_id() {
		return subscriber_id;
	}
	/**
	 * @param subscriber_id the subscriber_id to set
	 */
	public void setSubscriber_id(Integer subscriber_id) {
		this.subscriber_id = subscriber_id;
	}
}
