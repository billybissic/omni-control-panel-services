package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import application.domain.ArticleImage;

public interface ArticleImageRepository extends JpaRepository<ArticleImage, Integer> {

}
