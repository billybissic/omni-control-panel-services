package application.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import application.domain.Gallery;
import application.domain.GalleryGroupType;

public interface GalleryGroupTypeRepository extends CrudRepository<GalleryGroupType, Long> {

	@Query("SELECT group_type_id, group_type_name, group_type_description FROM GalleryGroupType WHERE group_type_name = ?1")
	Optional<GalleryGroupType> findByGroupName(String group_type_name);

}
