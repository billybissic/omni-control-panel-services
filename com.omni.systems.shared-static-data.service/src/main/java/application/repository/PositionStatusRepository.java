package application.repository;

import org.springframework.data.repository.CrudRepository;

import application.domain.EmploymentPositionStatus;

public interface PositionStatusRepository extends CrudRepository<EmploymentPositionStatus, Integer> {

}
