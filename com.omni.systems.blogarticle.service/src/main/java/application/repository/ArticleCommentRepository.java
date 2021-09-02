package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import application.domain.ArticleComment;

public interface ArticleCommentRepository extends JpaRepository<ArticleComment, Integer>{

}
