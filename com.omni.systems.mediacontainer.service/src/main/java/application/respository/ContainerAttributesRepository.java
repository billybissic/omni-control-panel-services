package application.respository;

import org.springframework.data.repository.CrudRepository;

import application.domain.ContainerAttributes;

public interface ContainerAttributesRepository extends CrudRepository<ContainerAttributes, Long> {

}
