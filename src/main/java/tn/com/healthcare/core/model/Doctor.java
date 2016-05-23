package tn.com.healthcare.core.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Doctor extends AbstractHealthCareStaff {

	private static final long serialVersionUID = 1L;

	@OneToOne(cascade = CascadeType.PERSIST)
	private DoctorGrade grade;

	@OneToMany(mappedBy = "doctor")
	private List<PatientReport> patientReport;

	/**
	 * @return the grade
	 */
	public DoctorGrade getGrade() {
		return grade;
	}

	public List<PatientReport> getPatientReport() {
		return patientReport;
	}

	public void setPatientReport(List<PatientReport> patientReport) {
		this.patientReport = patientReport;
	}

	/**
	 * @param grade
	 *            the grade to set
	 */
	public void setGrade(DoctorGrade grade) {
		this.grade = grade;
	}

}
