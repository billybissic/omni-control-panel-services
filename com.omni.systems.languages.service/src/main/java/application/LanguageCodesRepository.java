package application;

import org.springframework.data.repository.CrudRepository;

public interface LanguageCodesRepository extends CrudRepository<LanguageCodes, Long> {
	Iterable<LanguageCodes> findByLanguageCode(String languagecode);
}
