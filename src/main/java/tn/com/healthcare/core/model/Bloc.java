package tn.com.healthcare.core.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * 
 * @author Sedki JDAIDA
 * 
 */
@Entity
public class Bloc extends AbstractHealthcareEntity {

	private static final long serialVersionUID = 1L;

	private String name;

	@OneToOne
	private HealthcareType type;

	@OneToMany(mappedBy = "bloc")
	private List<Patient> patients;

	@ManyToOne
	private HospitalService service;

	public List<Patient> getPatients() {
		return patients;
	}

	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}

	public HospitalService getService() {
		return service;
	}

	public void setService(HospitalService service) {
		this.service = service;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the type
	 */
	public HealthcareType getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(HealthcareType type) {
		this.type = type;
	}

}
