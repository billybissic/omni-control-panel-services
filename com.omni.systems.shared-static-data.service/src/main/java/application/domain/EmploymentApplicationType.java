/**
 * 
 */
package application.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Billy Bissic
 *
 */

@Entity
@Table(name="employment_application_types")
public class EmploymentApplicationType {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "application_type_id")
	private Integer id;
	@Column(name = "application_type_name")
	private String applicationTypeName;
	@Column(name = "application_type_desc")
	private String applicationTypeDescription;
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the applicationTypeName
	 */
	public String getApplicationTypeName() {
		return applicationTypeName;
	}
	/**
	 * @param applicationTypeName the applicationTypeName to set
	 */
	public void setApplicationTypeName(String applicationTypeName) {
		this.applicationTypeName = applicationTypeName;
	}
	/**
	 * @return the applicationTypeDescription
	 */
	public String getApplicationTypeDescription() {
		return applicationTypeDescription;
	}
	/**
	 * @param applicationTypeDescription the applicationTypeDescription to set
	 */
	public void setApplicationTypeDescription(String applicationTypeDescription) {
		this.applicationTypeDescription = applicationTypeDescription;
	}
}
