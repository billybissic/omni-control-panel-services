package application.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import application.domain.Gallery;
import application.domain.GalleryOrderDirection;

public interface GalleryOrderDirectionRepository extends CrudRepository<GalleryOrderDirection, Long> {

	/**
	 * @param id
	 * @return
	 */
	GalleryOrderDirection findById(Integer id);

	/**
	 * @param galleryOrderDirectionName
	 * @return
	 */
	Optional<Gallery> findByGalleryOrderDirectionName(String galleryOrderDirectionName);

	long count();

}
