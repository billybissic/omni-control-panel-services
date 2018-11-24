package application.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import application.domain.Gallery;
import application.domain.GalleryGroupType;
import application.domain.GalleryStyleType;

public interface GalleryStyleTypeRepository extends CrudRepository<GalleryStyleType, Integer> {

	@Query("SELECT id, galleryStyleName, galleryStyleDescription, mimeTypeGroupId FROM GalleryStyleType WHERE galleryStyleName = ?1")
	Optional<GalleryStyleType> findByStyleTypeName(String galleryStyleName);

	/**
	 * @param id
	 * @return
	 */
	Optional<GalleryStyleType> findById(Integer id);

	/**
	 * @param id
	 * @return
	 */
	Long countGalleryStylesById(Integer id);

	@Query("SELECT id, galleryStyleName, galleryStyleDescription, mimeTypeGroupId FROM GalleryStyleType WHERE mimeTypeGroupId = ?1")
	Iterable<GalleryStyleType> findAllGalleryStylesForMimeTypeId(Integer id);

	/**
	 * @param id
	 * @return
	 */
	GalleryStyleType getById(Integer id);
	
	long count();
}
