package application.repository;

import org.springframework.data.repository.CrudRepository;

import application.domain.ArticleImage;

public interface ArticleImageRepository extends CrudRepository<ArticleImage, Long> {

}
