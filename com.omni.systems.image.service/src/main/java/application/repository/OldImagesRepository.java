package application.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import application.domain.OldImages;

public interface OldImagesRepository extends CrudRepository<OldImages, Long>{
	@Query("SELECT old_image_id,           \n"
		 + "	   old_image_name,         \n"
		 + "	   old_image_archive_name, \n"
		 + "	   old_image_size,         \n"
		 + "	   old_image_width,        \n"
		 + "	   old_image_height,       \n"
		 + "	   old_image_bits,         \n"
		 + "	   old_image_description,  \n"
		 + "	   old_image_uuid,         \n"
		 + "	   old_image_user_text,    \n"
		 + "	   old_image_timestamp,    \n"
		 + "	   old_image_meta_data,    \n"
		 + "	   old_image_media_type,   \n"
		 + "	   old_image_major_mime,   \n"
		 + "	   old_image_minor_mime,   \n"
		 + "	   old_image_deleted       \n"
		 + " FROM OldImages                \n"
		 + "WHERE old_image_id = ?1          ")
	Optional<OldImages> findbyId(Integer old_image_id);

	long count();
	
	//void delete(Integer image_id);
}
