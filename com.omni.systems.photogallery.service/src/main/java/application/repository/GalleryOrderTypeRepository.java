package application.repository;

import org.springframework.data.repository.CrudRepository;

import application.domain.GalleryOrderType;

public interface GalleryOrderTypeRepository extends CrudRepository<GalleryOrderType, Long> {

	/**
	 * @param id
	 * @return
	 */
	GalleryOrderType findById(Integer id);

	long count();
}
