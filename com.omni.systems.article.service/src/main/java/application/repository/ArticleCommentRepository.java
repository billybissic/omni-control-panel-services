package application.repository;

import org.springframework.data.repository.CrudRepository;

import application.domain.ArticleComment;

public interface ArticleCommentRepository extends CrudRepository<ArticleComment, Long>{

}
