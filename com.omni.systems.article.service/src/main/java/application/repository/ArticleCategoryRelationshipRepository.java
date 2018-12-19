package application.repository;

import org.springframework.data.repository.CrudRepository;

import application.domain.ArticleCategoryRelationship;

public interface ArticleCategoryRelationshipRepository extends CrudRepository<ArticleCategoryRelationship, Long> {

}
