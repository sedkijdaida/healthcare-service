package tn.com.healthcare.core.model;

import javax.persistence.Entity;

@Entity
public class MaleNurse extends AbstractHealthCareStaff {

	private static final long serialVersionUID = 1L;

	private String actesMedicaux;

	public String getActesMedicaux() {
		return actesMedicaux;
	}

	public void setActesMedicaux(String actesMedicaux) {
		this.actesMedicaux = actesMedicaux;
	}

}
