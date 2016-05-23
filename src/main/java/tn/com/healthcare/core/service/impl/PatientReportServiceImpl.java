package tn.com.healthcare.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.com.healthcare.core.dao.DoctorDao;
import tn.com.healthcare.core.dao.PatientReportDao;
import tn.com.healthcare.core.model.Doctor;
import tn.com.healthcare.core.model.PatientReport;
import tn.com.healthcare.core.service.PatientReportService;

@Service
public class PatientReportServiceImpl extends
		AbstractHealthcareEntityService<PatientReport, Long> implements
		PatientReportService {

	private PatientReportDao patientReportDao;

	@Autowired
	private DoctorDao doctorDao;

	@Autowired
	public PatientReportServiceImpl(PatientReportDao patientReportDao) {
		super(patientReportDao);
		this.patientReportDao = patientReportDao;

	}

	public PatientReport updatePatientReport(PatientReport patientReport,
			long idDoctor) {
		PatientReport patientReport1 = patientReportDao.save(patientReport);
		Doctor doctor = doctorDao.findOne(idDoctor);
		patientReport1.setDoctor(doctor);
		return patientReportDao.saveAndFlush(patientReport1);
	}

}
