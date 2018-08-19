package application.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import application.domain.Gallery;

public interface GalleryRepository extends CrudRepository<Gallery, Long> {

	@Query("SELECT gallery_id,             \n"
		 + "       gallery_name,           \n"
		 + "       gallery_summary,        \n"
		 + "       serial_number,          \n"
		 + "       gallery_group_type_id,  \n"
		 + "       gallery_order_type_id,  \n"
		 + "       gallery_caption_id,     \n"
		 + "       gallery_start_date,     \n"
		 + "       gallery_end_date,       \n"
		 + "       gallery_is_private,     \n"
		 + "       gallery_color_theme_id, \n"
		 + "       gallery_admin_uuid,     \n"
		 + "       last_changed_timestamp, \n"
		 + "       last_changed_by_uuid    \n"
		 + "FROM Gallery                   \n"
		 + "WHERE gallery_id = ?1")
	Optional<Gallery> findById(Integer gallery_id);

}
