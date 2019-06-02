/**
 * 
 */
package application.repository;

import org.springframework.data.repository.CrudRepository;

import application.domain.EmploymentApplicationType;

/**
 * @author Billy Bissic
 *
 */
public interface ApplicationTypeRepository extends CrudRepository<EmploymentApplicationType, Integer>{

}
