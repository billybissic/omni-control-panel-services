package application.repository;

import org.springframework.data.repository.CrudRepository;

import application.domain.UserVideos;

public interface UserVideosRepository extends CrudRepository<UserVideos, Long> {

}
