package tn.com.healthcare.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.com.healthcare.core.dao.MeasureDao;
import tn.com.healthcare.core.dao.PatientDao;
import tn.com.healthcare.core.model.Measure;
import tn.com.healthcare.core.model.Patient;
import tn.com.healthcare.core.service.MeasureService;

@Service
public class MeasureServiceImpl extends
		AbstractHealthcareEntityService<Measure, Long> implements
		MeasureService {
	private MeasureDao measureDao;

	@Autowired
	private PatientDao patientDao;

	@Autowired
	public MeasureServiceImpl(MeasureDao measureDao) {
		super(measureDao);
		this.measureDao = measureDao;
	}

	public List<Measure> searchMeasure(String name) {
		List<Measure> measures = measureDao.searchMeasure(name);
		return measures;
	}

	public Measure updatePatientMeasure(Measure measure, long idPatient) {
		Measure measureResult = measureDao.save(measure);
		Patient patient = patientDao.findOne(idPatient);
		measureResult.setPatient(patient);
		return measureDao.saveAndFlush(measureResult);

	}
}
