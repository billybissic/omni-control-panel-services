package application.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import application.domain.ImageLinks;

public interface ImageLinksRepository extends CrudRepository<ImageLinks, Long>{

	@Query("SELECT image_link_id, image_url, image_id FROM ImageLinks WHERE image_id = ?1")
	Optional<ImageLinks> findByImageId(Integer image_id);
	
	long count();

	//void delete(Integer image_id);
}
