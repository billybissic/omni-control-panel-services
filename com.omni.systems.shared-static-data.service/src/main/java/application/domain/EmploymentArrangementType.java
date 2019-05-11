package application.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employment_arrangement_types")
public class EmploymentArrangementType {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "arrangement_type_id")
	private Integer id;
	@Column(name = "arrangement_type_name")
	private String arrangementTypeName;
	@Column(name = "arrangement_type_desc")
	private String arrangementTypeDesc;
	
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
	 * @return the arrangementTypeName
	 */
	public String getArrangementTypeName() {
		return arrangementTypeName;
	}
	/**
	 * @param arrangementTypeName the arrangementTypeName to set
	 */
	public void setArrangementTypeName(String arrangementTypeName) {
		this.arrangementTypeName = arrangementTypeName;
	}
	/**
	 * @return the arrangementTypeDesc
	 */
	public String getArrangementTypeDesc() {
		return arrangementTypeDesc;
	}
	/**
	 * @param arrangementTypeDesc the arrangementTypeDesc to set
	 */
	public void setArrangementTypeDesc(String arrangementTypeDesc) {
		this.arrangementTypeDesc = arrangementTypeDesc;
	}
}
