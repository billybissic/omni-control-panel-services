package application.respository;

import org.springframework.data.repository.CrudRepository;

import application.domain.DisplayObject;

public interface DisplayObjectRepository extends CrudRepository<DisplayObject, Long> {

}
