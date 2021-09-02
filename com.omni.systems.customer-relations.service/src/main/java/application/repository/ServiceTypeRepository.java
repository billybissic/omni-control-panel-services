package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import application.domain.ServiceType;

public interface ServiceTypeRepository extends JpaRepository<ServiceType, Integer>{

}
