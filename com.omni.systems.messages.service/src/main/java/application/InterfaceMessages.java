package application;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class InterfaceMessages {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="interface_message_id")
	private Integer interfaceMessageId;
	@Column(name="interface_message_text")
	private String InterfaceMessageText;
	@Column(name="language_code")
	private Integer language_code;
	/**
	 * @return the interfaceMessagesId
	 */
	public Integer getInterfaceMessageId() {
		return interfaceMessageId;
	}
	/**
	 * @param interfaceMessagesId the interfaceMessagesId to set
	 */
	public void setInterfaceMessageId(Integer interfaceMessagesId) {
		interfaceMessageId = interfaceMessagesId;
	}
	/**
	 * @return the interfaceMessageText
	 */
	public String getInterfaceMessageText() {
		return InterfaceMessageText;
	}
	/**
	 * @param interfaceMessageText the interfaceMessageText to set
	 */
	public void setInterfaceMessageText(String interfaceMessageText) {
		InterfaceMessageText = interfaceMessageText;
	}
	/**
	 * @return the language_code
	 */
	public Integer getLanguage_code() {
		return language_code;
	}
	/**
	 * @param language_code the language_code to set
	 */
	public void setLanguage_code(Integer language_code) {
		this.language_code = language_code;
	}
}
