package application;

import org.springframework.data.repository.CrudRepository;

public interface ServiceMessagesRepository extends CrudRepository<ServiceMessages, Long> {
	Iterable<ServiceMessages> findByServiceMessageId(Integer servicemessageid);
}
