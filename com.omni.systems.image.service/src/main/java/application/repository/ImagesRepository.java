package application.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import application.domain.ImageEffects;
import application.domain.Images;

public interface ImagesRepository extends CrudRepository<Images, Long> {

	@Query("SELECT image_id, image_meta_data_id FROM Images WHERE image_id = ?1")
	Optional<ImageEffects> findbyId(Integer image_id);

}
