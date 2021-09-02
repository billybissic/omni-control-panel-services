package application.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ArticlePostRelationship {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer article_post_id;
	private Integer article_related_post_id;
	
	public Integer getArticle_post_id() {
		return article_post_id;
	}
	public void setArticle_post_id(Integer article_post_id) {
		this.article_post_id = article_post_id;
	}
	public Integer getArticle_related_post_id() {
		return article_related_post_id;
	}
	public void setArticle_related_post_id(Integer article_related_post_id) {
		this.article_related_post_id = article_related_post_id;
	}
	
	
}
