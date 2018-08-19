package application.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import application.domain.ImageStyles;

public interface ImageStylesRepository extends CrudRepository<ImageStyles, Long>{
	@Query("SELECT image_style_id, image_style_name FROM ImageStyles WHERE image_style_id = ?1")
	Optional<ImageStyles> findbyId(Integer image_style_id);
	
	@Query("SELECT image_style_id, image_style_name FROM ImageStyles WHERE image_style_name = ?1")
	Optional<ImageStyles> findByStyleName(String image_style_name);
	
	long count();

	//void delete(Integer image_style_id);
}
