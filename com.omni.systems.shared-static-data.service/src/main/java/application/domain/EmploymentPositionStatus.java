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
@Table(name = "employment_position_statuses")
public class EmploymentPositionStatus {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "position_status_id")
	private Integer id;
	@Column(name = "position_status_name")
	private String positionStatusName;
	@Column(name = "position_status_desc")
	private String positionStatusDescription;
	
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
	 * @return the positionStatusName
	 */
	public String getPositionStatusName() {
		return positionStatusName;
	}
	/**
	 * @param positionStatusName the positionStatusName to set
	 */
	public void setPositionStatusName(String positionStatusName) {
		this.positionStatusName = positionStatusName;
	}
	/**
	 * @return the positionStatusDescription
	 */
	public String getPositionStatusDescription() {
		return positionStatusDescription;
	}
	/**
	 * @param positionStatusDescription the positionStatusDescription to set
	 */
	public void setPositionStatusDescription(String positionStatusDescription) {
		this.positionStatusDescription = positionStatusDescription;
	}
}
