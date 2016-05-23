package tn.com.healthcare.core.enumerations;

public enum HealthcareType {

	CADIOLOGY("cardilogie"), GASTRIC("gastrique"), VAGUS("pneumogastrique");

	private HealthcareType(String name) {
		this.name = name;
	}

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
