package tn.com.healthcare.core.model;

import javax.persistence.Entity;

@Entity
public class DoctorGrade extends AbstractHealthcareEntity {

	private static final long serialVersionUID = 1L;

	private String grade;

	/**
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}

	/**
	 * @param grade
	 *            the grade to set
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}

}
