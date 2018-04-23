package application;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ServiceType {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="service_type_id")
	private Integer serviceTypeId;
	@Column(name="service_type_name")
	private  String serviceTypeName;
	@Column(name="service_type_description")
	
	private  String serviceTypeDescription;
	/**
	 * @return the serviceTypeId
	 */
	public Integer getServiceTypeId() {
		return serviceTypeId;
	}
	/**
	 * @param serviceTypeId the serviceTypeId to set
	 */
	public void setServiceTypeId(Integer serviceTypeId) {
		this.serviceTypeId = serviceTypeId;
	}
	/**
	 * @return the serviceTypeName
	 */
	public String getServiceTypeName() {
		return serviceTypeName;
	}
	/**
	 * @param serviceTypeName the serviceTypeName to set
	 */
	public void setServiceTypeName(String serviceTypeName) {
		this.serviceTypeName = serviceTypeName;
	}
	/**
	 * @return the serviceTypeDescription
	 */
	public String getServiceTypeDescription() {
		return serviceTypeDescription;
	}
	/**
	 * @param serviceTypeDescription the serviceTypeDescription to set
	 */
	public void setServiceTypeDescription(String serviceTypeDescription) {
		this.serviceTypeDescription = serviceTypeDescription;
	}
}
