package tn.com.healthcare.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.com.healthcare.core.dao.PerformanceReportDao;
import tn.com.healthcare.core.model.PerformanceReport;
import tn.com.healthcare.core.service.PerformanceReportService;

@Service("performanceReportService")
public class PerformanceReportServiceImpl extends
		AbstractHealthcareEntityService<PerformanceReport, Long> implements
		PerformanceReportService {
	private PerformanceReportDao performanceReportDao;

	@Autowired
	public PerformanceReportServiceImpl(
			PerformanceReportDao performanceReportDao) {
		super(performanceReportDao);
		this.performanceReportDao = performanceReportDao;
	}

}
