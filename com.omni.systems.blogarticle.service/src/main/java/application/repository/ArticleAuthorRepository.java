package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import application.domain.ArticleAuthor;

public interface ArticleAuthorRepository extends JpaRepository<ArticleAuthor, Integer>{

}
