package application;

import org.springframework.data.repository.CrudRepository;

public interface InterfaceMessagesRepository extends CrudRepository<InterfaceMessages, Long> {
	Iterable<InterfaceMessages> findByInterfaceMessageId(Integer interfacemessagesid);
}
