package application.repository;

import org.springframework.data.repository.CrudRepository;

import application.domain.ArticleCategory;
import application.domain.ArticleUser;

public interface ArticleUserRepository extends CrudRepository<ArticleUser, Integer>{

}
