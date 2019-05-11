package application.repository;

import org.springframework.data.repository.CrudRepository;

import application.domain.EmploymentPositionType;

public interface PositionTypeRepository extends CrudRepository<EmploymentPositionType, Integer> {

}
