package application.repository;

import org.springframework.data.repository.CrudRepository;

import application.domain.ArticleAuthor;

public interface ArticleAuthorRepository extends CrudRepository<ArticleAuthor, Long>{

}
