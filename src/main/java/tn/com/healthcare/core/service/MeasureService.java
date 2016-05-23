package tn.com.healthcare.core.service;

import java.util.List;

import tn.com.healthcare.core.model.Measure;

public interface MeasureService extends HealthcareEntityService<Measure, Long> {

	List<Measure> searchMeasure(String name);

	Measure updatePatientMeasure(Measure measure, long idPatient);

}
