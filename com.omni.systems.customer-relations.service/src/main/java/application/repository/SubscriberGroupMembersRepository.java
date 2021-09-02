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
package application.repository;

/**
 * @author Billy Bissic
 *
 */
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import application.domain.SubscriberGroupMembers;
import application.domain.SubscriberGroups;
import application.domain.Subscriber;

public interface SubscriberGroupMembersRepository extends JpaRepository<SubscriberGroupMembers, Integer> {

	/*@Query("SELECT s.subscriberId, s.subscriberEmail, s.firstName, s.lastName, s.birthDay "
			+ "FROM Subscribers s,"
			+ " SubscriberGroupMembers sgm"
			+ " WHERE s.subscriberId = sgm.subscriberId"
			+ " AND sgm.subscriberGroupId = ?1")
	Iterable<Subscribers> subscribersOfGroup(Integer subscriberGroupId);*/
	
	/*@Query("SELECT subscriberGroupId, subscriberId FROM SubscriberGroupMembers WHERE subscriberGroupId = ?1")
	Iterable<SubscriberGroupMembers> subscribersOfGroup(Integer subscriberGroupId);*/

	@Transactional
	@Modifying
	@Query("DELETE FROM SubscriberGroupMembers WHERE subscriberGroupId = ?1 AND subscriberId = ?2")
	void deleteById(Integer subscriberGroupId, Integer subscriberId);

	@Query("SELECT subscriberId FROM SubscriberGroupMembers") 
	Iterable<Integer> findMemberIds();
}
