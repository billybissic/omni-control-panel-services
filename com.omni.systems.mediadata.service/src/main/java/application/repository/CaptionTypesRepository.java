package application.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import application.domain.CaptionTypes;

public interface CaptionTypesRepository extends CrudRepository<CaptionTypes, Long> {

	@Query("SELECT caption_type_id, caption_type_name, caption_type_description FROM CaptionTypes WHERE caption_type_name = ?1")
	Optional<Iterable<CaptionTypes>> findByTypeName(String caption_type_name);
	
	@Query("SELECT caption_type_id, caption_type_name, caption_type_description FROM CaptionTypes WHERE caption_type_name = ?1")
	Iterable<Object> getCaptionTypeByName(String caption_type_name);
	
}
