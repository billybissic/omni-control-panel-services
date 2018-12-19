package application.repository;

import org.springframework.data.repository.CrudRepository;

import application.domain.ArticleCategory;

public interface ArticleCategoryRepository extends CrudRepository<ArticleCategory, Long> {

}
