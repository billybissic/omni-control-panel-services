package application.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employment_position_types")
public class EmploymentPositionType {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "position_type_id")
	private Integer id;
	@Column(name = "position_type_name")
	private String positionTypeName;
	@Column(name = "position_type_desc")
	private String positionTypeDescription;
	
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
	 * @return the positionTypeName
	 */
	public String getPositionTypeName() {
		return positionTypeName;
	}
	/**
	 * @param positionTypeName the positionTypeName to set
	 */
	public void setPositionTypeName(String positionTypeName) {
		this.positionTypeName = positionTypeName;
	}
	/**
	 * @return the positionTypeDescription
	 */
	public String getPositionTypeDescription() {
		return positionTypeDescription;
	}
	/**
	 * @param positionTypeDescription the positionTypeDescription to set
	 */
	public void setPositionTypeDescription(String positionTypeDescription) {
		this.positionTypeDescription = positionTypeDescription;
	}
}
