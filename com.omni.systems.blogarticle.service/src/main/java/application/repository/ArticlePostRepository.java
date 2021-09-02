package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import application.domain.ArticlePost;

public interface ArticlePostRepository extends JpaRepository<ArticlePost, Integer>{

}
