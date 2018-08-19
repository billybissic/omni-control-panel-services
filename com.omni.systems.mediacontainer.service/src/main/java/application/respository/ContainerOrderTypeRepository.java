package application.respository;

import org.springframework.data.repository.CrudRepository;

import application.domain.ContainerOrderType;

public interface ContainerOrderTypeRepository extends CrudRepository<ContainerOrderType, Long>{

}
