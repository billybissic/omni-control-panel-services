package application;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ApplicationSettings {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="application_settings_id")
	private Integer applicationSettingsId; 
	
	@Column(name="application_name")
	private String applicationName;
	
	@Column(name="application_setting_name")
	private String applicationSettingName;
	
	@Column(name="application_setting_description")
	private String applicationSettingDescription; 
	
	@Column(name="application_setting_value")
	private String applicationSettingValue; 
	
	@Column(name="last_changed_timestamp")
	private String lastChangedTimestamp;
	
	@Column(name="last_modified_userid")
	private Integer lastModifiedUserid;
	
	/**
	 * @return the applicationSettingsId
	 */
	public Integer getApplicationSettingsId() {
		return applicationSettingsId;
	}
	/**
	 * @param applicationSettingsId the applicationSettingsId to set
	 */
	public void setApplicationSettingsId(Integer applicationSettingsId) {
		this.applicationSettingsId = applicationSettingsId;
	}
	/**
	 * @return the applicationName
	 */
	public String getApplicationName() {
		return applicationName;
	}
	/**
	 * @param applicationName the applicationName to set
	 */
	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}
	/**
	 * @return the applicationSettingName
	 */
	public String getApplicationSettingName() {
		return applicationSettingName;
	}
	/**
	 * @param applicationSettingName the applicationSettingName to set
	 */
	public void setApplicationSettingName(String applicationSettingName) {
		this.applicationSettingName = applicationSettingName;
	}
	/**
	 * @return the applicationSettingDescription
	 */
	public String getApplicationSettingDescription() {
		return applicationSettingDescription;
	}
	/**
	 * @param applicationSettingDescription the applicationSettingDescription to set
	 */
	public void setApplicationSettingDescription(String applicationSettingDescription) {
		this.applicationSettingDescription = applicationSettingDescription;
	}
	/**
	 * @return the applicationSettingValue
	 */
	public String getApplicationSettingValue() {
		return applicationSettingValue;
	}
	/**
	 * @param applicationSettingValue the applicationSettingValue to set
	 */
	public void setApplicationSettingValue(String applicationSettingValue) {
		this.applicationSettingValue = applicationSettingValue;
	}
	/**
	 * @return the lastChangedTimestamp
	 */
	public String getLastChangedTimestamp() {
		return lastChangedTimestamp;
	}
	/**
	 * @param lastChangedTimestamp the lastChangedTimestamp to set
	 */
	public void setLastChangedTimestamp(String lastChangedTimestamp) {
		this.lastChangedTimestamp = lastChangedTimestamp;
	}
	/**
	 * @return the lastModifiedUserid
	 */
	public Integer getLastModifiedUserid() {
		return lastModifiedUserid;
	}
	/**
	 * @param lastModifiedUserid the lastModifiedUserid to set
	 */
	public void setLastModifiedUserid(Integer lastModifiedUserid) {
		this.lastModifiedUserid = lastModifiedUserid;
	}
}