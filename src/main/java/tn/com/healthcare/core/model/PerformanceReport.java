package tn.com.healthcare.core.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class PerformanceReport extends Report {

	private static final long serialVersionUID = 1L;

	private String notice;

	@OneToOne
	private ReportType type;

	/**
	 * @return the notice
	 */
	public String getNotice() {
		return notice;
	}

	/**
	 * @param notice
	 *            the notice to set
	 */
	public void setNotice(String notice) {
		this.notice = notice;
	}

	/**
	 * @return the type
	 */
	public ReportType getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(ReportType type) {
		this.type = type;
	}

}
