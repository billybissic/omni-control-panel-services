package application.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Images {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer image_id;
	private Integer image_meta_data_id;
	//private LongBlob image_data;
	
	/**
	 * @return the image_id
	 */
	public Integer getImage_id() {
		return image_id;
	}
	/**
	 * @param image_id the image_id to set
	 */
	public void setImage_id(Integer image_id) {
		this.image_id = image_id;
	}
	/**
	 * @return the image_meta_data_id
	 */
	public Integer getImage_meta_data_id() {
		return image_meta_data_id;
	}
	/**
	 * @param image_meta_data_id the image_meta_data_id to set
	 */
	public void setImage_meta_data_id(Integer image_meta_data_id) {
		this.image_meta_data_id = image_meta_data_id;
	}
}
