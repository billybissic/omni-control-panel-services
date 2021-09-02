package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import application.domain.ArticlePostRelationship;

public interface ArticlePostRelationshipRepository extends CrudRepository<ArticlePostRelationship, Integer> {

	@Transactional
	@Query("SELECT article_post_id, article_related_post_id FROM ArticlePostRelationship WHERE article_post_id = ?1 AND article_related_post_id =?2")
	ArticlePostRelationship findArticlePostRelationship(Integer article_post_id, Integer article_related_post_id);


}
