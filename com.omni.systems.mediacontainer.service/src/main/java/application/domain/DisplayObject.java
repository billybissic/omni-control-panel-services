package application.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DisplayObject {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer object_id;
	private Integer display_object_type_id;
	private String url;
	private Integer height;
	private Integer width;
	private String html_output;
	private String script_output;
	
	/**
	 * @return the object_id
	 */
	public Integer getObject_id() {
		return object_id;
	}
	/**
	 * @param object_id the object_id to set
	 */
	public void setObject_id(Integer object_id) {
		this.object_id = object_id;
	}
	/**
	 * @return the display_object_type_id
	 */
	public Integer getDisplay_object_type_id() {
		return display_object_type_id;
	}
	/**
	 * @param display_object_type_id the display_object_type_id to set
	 */
	public void setDisplay_object_type_id(Integer display_object_type_id) {
		this.display_object_type_id = display_object_type_id;
	}
	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * @return the height
	 */
	public Integer getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(Integer height) {
		this.height = height;
	}
	/**
	 * @return the width
	 */
	public Integer getWidth() {
		return width;
	}
	/**
	 * @param width the width to set
	 */
	public void setWidth(Integer width) {
		this.width = width;
	}
	/**
	 * @return the html_output
	 */
	public String getHtml_output() {
		return html_output;
	}
	/**
	 * @param html_output the html_output to set
	 */
	public void setHtml_output(String html_output) {
		this.html_output = html_output;
	}
	/**
	 * @return the script_output
	 */
	public String getScript_output() {
		return script_output;
	}
	/**
	 * @param script_output the script_output to set
	 */
	public void setScript_output(String script_output) {
		this.script_output = script_output;
	}
}
