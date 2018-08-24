package application.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserVideos {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer video_id; 
	private Integer uuid;
	
	/**
	 * @return the video_id
	 */
	public Integer getVideo_id() {
		return video_id;
	}
	/**
	 * @param video_id the video_id to set
	 */
	public void setVideo_id(Integer video_id) {
		this.video_id = video_id;
	}
	/**
	 * @return the uuid
	 */
	public Integer getUuid() {
		return uuid;
	}
	/**
	 * @param uuid the uuid to set
	 */
	public void setUuid(Integer uuid) {
		this.uuid = uuid;
	}
}
