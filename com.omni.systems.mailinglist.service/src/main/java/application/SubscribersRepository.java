package application;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface SubscribersRepository extends CrudRepository<Subscribers, Long> {
	@Query("SELECT s.subscriber_email FROM Subscribers s where s.subscriber_email = ?1")
	List<Subscribers> findBySubscriberEmail(String email);
}
