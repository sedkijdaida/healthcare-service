package tn.com.healthcare.core.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public abstract class AbstractHealthCareStaff extends User {

	private static final long serialVersionUID = 1L;

	private int numberAssignment;

	@ManyToMany
	private List<Patient> patients;

	@ManyToMany
	private List<Period> periods;

	@OneToOne
	private HealthCareStaffType healthCareStaffType;

	public List<Patient> getPatients() {
		return patients;
	}

	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}

	/**
	 * @return the periods
	 */
	public List<Period> getPeriods() {
		if (periods == null)
			periods = new ArrayList<Period>();
		return periods;
	}

	/**
	 * @param periods
	 *            the periods to set
	 */
	public void setPeriods(List<Period> periods) {
		this.periods = periods;
	}

	public HealthCareStaffType getHealthCareStaffType() {
		return healthCareStaffType;
	}

	public void setHealthCareStaffType(HealthCareStaffType healthCareStaffType) {
		this.healthCareStaffType = healthCareStaffType;
	}

	/**
	 * @return the healthCareStaffType
	 */

	public int getNumberAssignment() {
		return numberAssignment;
	}

	public void setNumberAssignment(int numberAssignment) {
		this.numberAssignment = numberAssignment;
	}
}
