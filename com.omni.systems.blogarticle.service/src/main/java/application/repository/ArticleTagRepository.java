package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import application.domain.ArticleTag;

public interface ArticleTagRepository extends JpaRepository<ArticleTag, Integer>{

}
