package tn.com.healthcare.core.service;

import tn.com.healthcare.core.model.PatientReport;

public interface PatientReportService extends
		HealthcareEntityService<PatientReport, Long> {

	PatientReport updatePatientReport(PatientReport patientReport, long idDoctor);

}
