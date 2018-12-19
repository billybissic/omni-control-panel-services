package application.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ArticleImage {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String image;
	private Integer article_post_id;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Integer getArticle_post_id() {
		return article_post_id;
	}
	public void setArticle_post_id(Integer article_post_id) {
		this.article_post_id = article_post_id;
	}
}
