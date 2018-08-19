package application.repository;

import org.springframework.data.repository.CrudRepository;

import application.domain.ImageMetaData;

public interface ImageMetaDataRepository extends CrudRepository<ImageMetaData, Long> {

}
