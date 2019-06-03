package repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import domain.Volunteer;

@Repository
public interface VolunteerRepository extends MongoRepository<Volunteer, String>{

}
