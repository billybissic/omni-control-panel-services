package application.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import application.domain.Gallery;
import application.domain.GalleryItem;

public interface GalleryItemRepository extends CrudRepository<GalleryItem, Long> {

	@Query("SELECT gallery_item_id,        \n"
		 + "       gallery_object_type_id, \n"
		 + "       display_object_id,      \n"
		 + "       media_type_id,          \n"
		 + "       image_id,               \n"
		 + "       item_weight,            \n"
		 + "       gallery_id,             \n"
		 + "       last_changed_timestamp, \n"
		 + "       last_changed_by_uuid    \n"
		 + " FROM  GalleryItem             \n"
		 + "WHERE  gallery_item_id = ?1    \n"
		 + "  AND  gallery_id = ?2           ")
	Optional<GalleryItem> findById(Integer gallery_id, Integer gallery_item_id);

	@Query("SELECT count(gallery_item_id) FROM GalleryItem WHERE gallery_id = ?1")
	Long countGalleryItems(Integer gallery_id);

	@Query("SELECT gallery_item_id,        \n"
		 + "       gallery_object_type_id, \n"
		 + "       display_object_id,      \n"
		 + "       media_type_id,          \n"
		 + "       image_id,               \n"
		 + "       item_weight,            \n"
		 + "       gallery_id,             \n"
		 + "       last_changed_timestamp, \n"
		 + "       last_changed_by_uuid    \n"
		 + " FROM  GalleryItem             \n"
		 + "WHERE  gallery_id = ?1           ")
	Iterable<GalleryItem> findAllGalleryItemsForGallery(Integer gallery_id);

}
