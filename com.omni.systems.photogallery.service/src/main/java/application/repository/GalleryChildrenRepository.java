package application.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import application.domain.Gallery;
import application.domain.GalleryChildren;

public interface GalleryChildrenRepository extends CrudRepository<GalleryChildren, Long>{
	
	@Query("SELECT child_id FROM GalleryChildren WHERE parent_id = ?1 AND child_id = ?2")
	Optional<GalleryChildren> findGalleryChild(Integer parent_id, Integer child_id);

	@Query("SELECT COUNT(child_id) FROM GalleryChildren WHERE parent_id = ?1")
	Long countChildrenOfParent(Integer parent_id);
	
	@Query("SELECT child_id FROM GalleryChildren WHERE parent_id = ?1")
	Iterable<GalleryChildren> findAllChildrenOfParent(Integer parent_id);

}
