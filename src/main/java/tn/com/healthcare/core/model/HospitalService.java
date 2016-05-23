package tn.com.healthcare.core.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class HospitalService extends AbstractHealthcareEntity {

	private static final long serialVersionUID = 1L;

	private String name;

	@OneToMany(mappedBy = "service")
	private List<Bloc> blocs;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the blocs
	 */
	public List<Bloc> getBlocs() {
		return blocs;
	}

	/**
	 * @param blocs
	 *            the blocs to set
	 */
	public void setBlocs(List<Bloc> blocs) {
		this.blocs = blocs;
	}

}
