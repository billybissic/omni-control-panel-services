package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import application.domain.ArticleCategory;

public interface ArticleCategoryRepository extends JpaRepository<ArticleCategory, Integer> {

}
