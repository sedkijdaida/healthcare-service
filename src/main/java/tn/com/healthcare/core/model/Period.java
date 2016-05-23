package tn.com.healthcare.core.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Period extends AbstractHealthcareEntity {

	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.TIMESTAMP)
	private Date startDate;

	@Temporal(TemporalType.TIMESTAMP)
	private Date endDate;

	@ManyToMany(mappedBy = "periods")
	private List<AbstractHealthCareStaff> healthCareStaffs;

	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate
	 *            the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate
	 *            the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * @return the healthCareStaffs
	 */
	public List<AbstractHealthCareStaff> getHealthCareStaffs() {
		return healthCareStaffs;
	}

	/**
	 * @param healthCareStaffs
	 *            the healthCareStaffs to set
	 */
	public void setHealthCareStaffs(
			List<AbstractHealthCareStaff> healthCareStaffs) {
		this.healthCareStaffs = healthCareStaffs;
	}

}
