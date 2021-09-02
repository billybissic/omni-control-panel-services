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

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import application.domain.Subscriber;


public interface SubscriberRepository extends JpaRepository<Subscriber, Integer> {

	/* set entity manager */
	
	
	@Query("SELECT s.subscriberEmail FROM Subscriber s WHERE s.subscriberEmail = ?1")
	List<Subscriber> findBySubscriberEmail(String email);

	@Query("SELECT s.subscriberId, s.firstName, s.lastName, s.subscriberEmail, s.birthDay FROM Subscriber s WHERE s.subscriberId = ?1")
	Subscriber findById(Integer subscriber_id);

	@Transactional
	@Modifying
	@Query("DELETE FROM Subscriber WHERE subscriberId = ?1")
	void deleteById(Integer id);

	@Query("SELECT s.subscriberId, s.firstName, s.lastName, s.subscriberEmail, s.birthDay "
			+ "FROM Subscriber s WHERE s.subscriberId NOT IN ( SELECT subscriberId FROM SubscriberGroupMembers)")
	Iterable<Subscriber> findUnAssignedSubscribers();

	/* TODO: needs more research on the named query to allow for NOT IN clause support */
	/*@Query( value = "SELECT s.subscriber_id, s.first_name, s.last_name, s.subscriber_email, s.birth_day  "
		          + "  FROM Subscribers s,               "
		          + " WHERE s.subscriber_id IN (     "
		          + "SELECT sgm.subcriber_id             "
		          + "  FROM SubscriberGroupMembers sgm)  ")
	Iterable<SubscriberGroups> findUnAssignedSubscribers();*/

		//CriteriaBuilder builder = em.getCriteriaBuilder();
	
		/* build query */
		//CriteriaQuery<Subscribers> q = builder.createQuery(Subscribers.class);
		//Root<Subscribers> root = q.from(Subscribers.class);
		
		//TypedQuery<Subscribers> query = em.createQuery(q);
		//Iterable<Subscribers> subscribers = query.getResultList();
	
	@Query("SELECT s.subscriberId, s.firstName, s.lastName, s.birthDay, s.subscriberEmail "
			+ "FROM Subscriber s,"
			+ " SubscriberGroupMembers sgm"
			+ " WHERE s.subscriberId = sgm.subscriberId"
			+ " AND sgm.subscriberGroupId = ?1")
	Iterable<Subscriber> subscribersOfGroup(Integer subscriberGroupId);
}

