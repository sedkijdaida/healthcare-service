package tn.com.healthcare.core.model;

import javax.persistence.Entity;

@Entity
public class ReportType extends AbstractHealthcareEntity {

	private static final long serialVersionUID = 1L;

	private String name;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
