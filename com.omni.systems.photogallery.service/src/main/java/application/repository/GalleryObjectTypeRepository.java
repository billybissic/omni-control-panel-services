package application.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import application.domain.Gallery;
import application.domain.GalleryObjectType;

public interface GalleryObjectTypeRepository extends CrudRepository<GalleryObjectType, Long> {

	@Query("SELECT id, gallery_object_type_name, gallery_object_type_description "
		  + " FROM GalleryObjectType "
		  + "WHERE gallery_object_type_name = ?1")
	Optional<Gallery> findByTypeName(String gallery_object_type_name);

	/**
	 * @param id
	 * @return
	 */
	GalleryObjectType findById(Integer id);
	
	long count();
	

}
