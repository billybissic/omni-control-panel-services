package application;

import org.springframework.data.repository.CrudRepository;

public interface CustomerMailinglistRepository extends CrudRepository<CustomerMailinglist, Long> {
	Iterable<CustomerMailinglist> findByEmail(String email);
	Iterable<CustomerMailinglist> findByBirthday(String birthday);
	Iterable<CustomerMailinglist> findByEntryId(Integer EntryId);
}
