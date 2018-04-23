package application;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Uploads {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer upload_id; 
	private Integer external_id; 
	private Integer language_code; 
	private Integer uuid; 
	private Integer consumed_quota; 
	private  String timestamp; 
	private Integer last_status_update; 
	private Integer status_id; 
	private Integer info; 
	private Integer error_code; 
	private Integer event_code; 
	private Integer cluster_job_ids;
	
	/**
	 * @return the upload_id
	 */
	public Integer getUpload_id() {
		return upload_id;
	}
	/**
	 * @param upload_id the upload_id to set
	 */
	public void setUpload_id(Integer upload_id) {
		this.upload_id = upload_id;
	}
	/**
	 * @return the external_id
	 */
	public Integer getExternal_id() {
		return external_id;
	}
	/**
	 * @param external_id the external_id to set
	 */
	public void setExternal_id(Integer external_id) {
		this.external_id = external_id;
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
	/**
	 * @return the consumed_quota
	 */
	public Integer getConsumed_quota() {
		return consumed_quota;
	}
	/**
	 * @param consumed_quota the consumed_quota to set
	 */
	public void setConsumed_quota(Integer consumed_quota) {
		this.consumed_quota = consumed_quota;
	}
	/**
	 * @return the timestamp
	 */
	public String getTimestamp() {
		return timestamp;
	}
	/**
	 * @param timestamp2 the timestamp to set
	 */
	public void setTimestamp(String timestamp2) {
		this.timestamp = timestamp2;
	}
	/**
	 * @return the last_status_update
	 */
	public Integer getLast_status_update() {
		return last_status_update;
	}
	/**
	 * @param last_status_update the last_status_update to set
	 */
	public void setLast_status_update(Integer last_status_update) {
		this.last_status_update = last_status_update;
	}
	/**
	 * @return the status_id
	 */
	public Integer getStatus_id() {
		return status_id;
	}
	/**
	 * @param status_id the status_id to set
	 */
	public void setStatus_id(Integer status_id) {
		this.status_id = status_id;
	}
	/**
	 * @return the info
	 */
	public Integer getInfo() {
		return info;
	}
	/**
	 * @param info the info to set
	 */
	public void setInfo(Integer info) {
		this.info = info;
	}
	/**
	 * @return the error_code
	 */
	public Integer getError_code() {
		return error_code;
	}
	/**
	 * @param error_code the error_code to set
	 */
	public void setError_code(Integer error_code) {
		this.error_code = error_code;
	}
	/**
	 * @return the event_code
	 */
	public Integer getEvent_code() {
		return event_code;
	}
	/**
	 * @param event_code the event_code to set
	 */
	public void setEvent_code(Integer event_code) {
		this.event_code = event_code;
	}
	/**
	 * @return the cluster_job_ids
	 */
	public Integer getCluster_job_ids() {
		return cluster_job_ids;
	}
	/**
	 * @param cluster_job_ids the cluster_job_ids to set
	 */
	public void setCluster_job_ids(Integer cluster_job_ids) {
		this.cluster_job_ids = cluster_job_ids;
	}
}
