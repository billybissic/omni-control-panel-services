package application;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DisplayObject {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer object_id;
	private String url;
	private Integer view_size;
	private Integer display_object_type_id;
	private Integer height;
	private Integer width;
	private String html_output;
	private String script_output;
	
	public Integer getObject_id() {
		return object_id;
	}
	public void setObject_id(Integer object_id) {
		this.object_id = object_id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Integer getView_size() {
		return view_size;
	}
	public void setView_size(Integer view_size) {
		this.view_size = view_size;
	}
	public Integer getDisplay_object_type_id() {
		return display_object_type_id;
	}
	public void setDisplay_object_type_id(Integer display_object_type_id) {
		this.display_object_type_id = display_object_type_id;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	public Integer getWidth() {
		return width;
	}
	public void setWidth(Integer width) {
		this.width = width;
	}
	public String getHtml_output() {
		return html_output;
	}
	public void setHtml_output(String html_output) {
		this.html_output = html_output;
	}
	public String getScript_output() {
		return script_output;
	}
	public void setScript_output(String script_output) {
		this.script_output = script_output;
	}
}
