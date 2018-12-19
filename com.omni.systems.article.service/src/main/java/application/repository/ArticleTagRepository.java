package application.repository;

import org.springframework.data.repository.CrudRepository;

import application.domain.ArticleTag;

public interface ArticleTagRepository extends CrudRepository<ArticleTag, Long>{

}
