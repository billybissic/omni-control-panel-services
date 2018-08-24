package application.repository;

import org.springframework.data.repository.CrudRepository;

import application.domain.Videos;

public interface VideosRepository extends CrudRepository<Videos, Long> {

}
