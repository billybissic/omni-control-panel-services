package application.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GalleryStat {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer gallery_stats_id;
	private Integer gallery_id;
	private String viewed_since_timestamp;
	private Integer number_of_albums;
	private Integer number_of_media_items;
	private Integer number_of_views;
	
	public Integer getGallery_stats_id() {
		return gallery_stats_id;
	}
	public void setGallery_stats_id(Integer gallery_stats_id) {
		this.gallery_stats_id = gallery_stats_id;
	}
	public Integer getGallery_id() {
		return gallery_id;
	}
	public void setGallery_id(Integer gallery_id) {
		this.gallery_id = gallery_id;
	}
	public String getViewed_since_timestamp() {
		return viewed_since_timestamp;
	}
	public void setViewed_since_timestamp(String viewed_since_timestamp) {
		this.viewed_since_timestamp = viewed_since_timestamp;
	}
	public Integer getNumber_of_albums() {
		return number_of_albums;
	}
	public void setNumber_of_albums(Integer number_of_albums) {
		this.number_of_albums = number_of_albums;
	}
	public Integer getNumber_of_media_items() {
		return number_of_media_items;
	}
	public void setNumber_of_media_items(Integer number_of_media_items) {
		this.number_of_media_items = number_of_media_items;
	}
	public Integer getNumber_of_views() {
		return number_of_views;
	}
	public void setNumber_of_views(Integer number_of_views) {
		this.number_of_views = number_of_views;
	}
}
