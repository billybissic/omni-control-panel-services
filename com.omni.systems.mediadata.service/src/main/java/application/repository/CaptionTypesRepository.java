package application.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import application.domain.CaptionTypes;

@Repository
public interface CaptionTypesRepository extends CrudRepository<CaptionTypes, Integer> {

	//@Query("SELECT caption_type_id, caption_type_name, caption_type_description FROM CaptionTypes WHERE caption_type_name = ?1")
	Optional<Iterable<CaptionTypes>> findByCaptionTypeName(String captionTypeName);

	/**
	 * @param caption_type_id
	 * @return
	 */
	CaptionTypes findById(Integer id);

	/**
	 * @param captionTypeName
	 * @return
	 */
	Iterable<CaptionTypes> getByCaptionTypeName(String captionTypeName);

	/**
	 * @param id
	 * @return
	 */
	
}
