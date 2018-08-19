package application.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import application.domain.Gallery;
import application.domain.GalleryOrderCategory;

public interface GalleryOrderCategoryRepository extends CrudRepository<GalleryOrderCategory, Long> {

	@Query("SELECT gallery_order_category_id, gallery_order_category_name, gallery_order_category_description FROM GalleryOrderCategory "
		 + "WHERE gallery_order_category_name = ?1")
	Optional<GalleryOrderCategory> findByCategoryName(String gallery_order_category_name);

}
