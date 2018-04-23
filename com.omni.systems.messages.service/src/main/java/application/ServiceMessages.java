package application;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ServiceMessages {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="service_message_id")
	private Integer serviceMessageId;
	@Column(name="service_message_text")
	private String serviceMessageText;
	@Column(name="language_code")
	private Integer languageCode;
	/**
	 * @return the serviceMessageId
	 */
	public Integer getServiceMessageId() {
		return serviceMessageId;
	}
	/**
	 * @param serviceMessageId the serviceMessageId to set
	 */
	public void setServiceMessageId(Integer serviceMessageId) {
		this.serviceMessageId = serviceMessageId;
	}
	/**
	 * @return the serviceMessageText
	 */
	public String getServiceMessageText() {
		return serviceMessageText;
	}
	/**
	 * @param serviceMessageText the serviceMessageText to set
	 */
	public void setServiceMessageText(String serviceMessageText) {
		this.serviceMessageText = serviceMessageText;
	}
	/**
	 * @return the languageCode
	 */
	public Integer getLanguageCode() {
		return languageCode;
	}
	/**
	 * @param languageCode the languageCode to set
	 */
	public void setLanguageCode(Integer languageCode) {
		this.languageCode = languageCode;
	}
}
