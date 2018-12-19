package application.repository;

import org.springframework.data.repository.CrudRepository;

import application.domain.ArticlePostRelationship;

public interface ArticlePostRelationshipRepository extends CrudRepository<ArticlePostRelationship, Long> {

}
