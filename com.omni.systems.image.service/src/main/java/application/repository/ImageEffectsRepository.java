package application.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import application.domain.ImageEffects;

public interface ImageEffectsRepository extends CrudRepository<ImageEffects, Long> {
	
	@Query("SELECT image_effect_id, image_style_id, image_effect_name, image_effect_description FROM ImageEffects WHERE image_effect_id = ?1")
	Optional<ImageEffects> findById(Integer image_effect_id);
	
	long count();
	
	//void delete(Integer image_effect_id);
}
