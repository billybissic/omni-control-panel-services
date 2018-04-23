package application;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LanguageCodes {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="language_code_id")
	private Integer languageCodeId;
	@Column(name="language_code")
	private String languageCode;
	@Column(name="language")
	private String language;
	
	/**
	 * @return the languageCodeId
	 */
	public Integer getLanguageCodeId() {
		return languageCodeId;
	}
	/**
	 * @param languageCodeId the languageCodeId to set
	 */
	public void setLanguageCodeId(Integer languageCodeId) {
		this.languageCodeId = languageCodeId;
	}
	/**
	 * @return the languageCode
	 */
	public String getLanguageCode() {
		return languageCode;
	}
	/**
	 * @param languageCode the languageCode to set
	 */
	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}
	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}
	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}
}
