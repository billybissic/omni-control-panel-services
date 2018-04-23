package application;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ArticlePost {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String title;
	private String article;
	private String title_clean;
	private String file;
	private Integer author_id;
	private String date_published;
	private String banner_image;
	private Integer featured;
	private Integer enabled;
	private Integer comments_enabled;
	private Integer views;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArticle() {
		return article;
	}
	public void setArticle(String article) {
		this.article = article;
	}
	public String getTitle_clean() {
		return title_clean;
	}
	public void setTitle_clean(String title_clean) {
		this.title_clean = title_clean;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public Integer getAuthor_id() {
		return author_id;
	}
	public void setAuthor_id(Integer author_id) {
		this.author_id = author_id;
	}
	public String getDate_published() {
		return date_published;
	}
	public void setDate_published(String date_published) {
		this.date_published = date_published;
	}
	public String getBanner_image() {
		return banner_image;
	}
	public void setBanner_image(String banner_image) {
		this.banner_image = banner_image;
	}
	public Integer getFeatured() {
		return featured;
	}
	public void setFeatured(Integer featured) {
		this.featured = featured;
	}
	public Integer getEnabled() {
		return enabled;
	}
	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}
	public Integer getComments_enabled() {
		return comments_enabled;
	}
	public void setComments_enabled(Integer comments_enabled) {
		this.comments_enabled = comments_enabled;
	}
	public Integer getViews() {
		return views;
	}
	public void setViews(Integer views) {
		this.views = views;
	}
}
