package application.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import application.domain.ArticleCategoryRelationship;

public interface ArticleCategoryRelationshipRepository extends CrudRepository<ArticleCategoryRelationship, Integer> {

	@Transactional
	@Query("SELECT category_id, post_id FROM ArticleCategoryRelationship WHERE category_id = ?1 AND post_id =?2")
	ArticleCategoryRelationship findCategoryRelationShip(Integer category_id, Integer post_id);


}
