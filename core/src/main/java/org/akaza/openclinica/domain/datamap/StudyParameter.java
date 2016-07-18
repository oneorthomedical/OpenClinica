package org.akaza.openclinica.domain.datamap;

import org.akaza.openclinica.domain.DataMapDomainObject;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * StudyParameter generated by hbm2java
 */
@Entity
@Table(name = "study_parameter", uniqueConstraints = @UniqueConstraint(columnNames = "handle"))
@GenericGenerator(name = "id-generator", strategy = "native", parameters = { @Parameter(name = "sequence_name", value = "study_parameter_study_parameter_id_seq") })
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class StudyParameter  extends DataMapDomainObject {

	private int studyParameterId;
	private String handle;
	private String name;
	private String description;
	private String defaultValue;
	private Boolean inheritable;
	private Boolean overridable;
	private Set studyParameterValues = new HashSet(0);

	public StudyParameter() {
	}

	public StudyParameter(int studyParameterId) {
		this.studyParameterId = studyParameterId;
	}

	public StudyParameter(int studyParameterId, String handle, String name,
			String description, String defaultValue, Boolean inheritable,
			Boolean overridable, Set studyParameterValues) {
		this.studyParameterId = studyParameterId;
		this.handle = handle;
		this.name = name;
		this.description = description;
		this.defaultValue = defaultValue;
		this.inheritable = inheritable;
		this.overridable = overridable;
		this.studyParameterValues = studyParameterValues;
	}

	@Id
	@Column(name = "study_parameter_id", unique = true, nullable = false)
	public int getStudyParameterId() {
		return this.studyParameterId;
	}

	public void setStudyParameterId(int studyParameterId) {
		this.studyParameterId = studyParameterId;
	}

	@Column(name = "handle", unique = true, length = 50)
	public String getHandle() {
		return this.handle;
	}

	public void setHandle(String handle) {
		this.handle = handle;
	}

	@Column(name = "name", length = 50)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "description")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "default_value", length = 50)
	public String getDefaultValue() {
		return this.defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	@Column(name = "inheritable")
	public Boolean getInheritable() {
		return this.inheritable;
	}

	public void setInheritable(Boolean inheritable) {
		this.inheritable = inheritable;
	}

	@Column(name = "overridable")
	public Boolean getOverridable() {
		return this.overridable;
	}

	public void setOverridable(Boolean overridable) {
		this.overridable = overridable;
	}
}
