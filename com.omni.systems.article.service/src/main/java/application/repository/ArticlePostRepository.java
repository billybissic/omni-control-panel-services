package application.repository;

import org.springframework.data.repository.CrudRepository;

import application.domain.ArticlePost;

public interface ArticlePostRepository extends CrudRepository<ArticlePost, Long>{

}
