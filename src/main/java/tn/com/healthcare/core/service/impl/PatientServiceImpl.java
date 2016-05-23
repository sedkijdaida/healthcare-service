package tn.com.healthcare.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.com.healthcare.core.dao.PatientDao;
import tn.com.healthcare.core.model.Doctor;
import tn.com.healthcare.core.model.Patient;
import tn.com.healthcare.core.service.PatientService;

@Service("patientService")
public class PatientServiceImpl extends
		AbstractHealthcareEntityService<Patient, Long> implements
		PatientService {
	private PatientDao patientDao;

	@Autowired
	public PatientServiceImpl(PatientDao patientDao) {
		super(patientDao);
		this.patientDao = patientDao;
	}

	public List<Patient> searchById(long id, String name) {
		List<Patient> patients = patientDao.searchById(id, name);
		return patients;
	}

	public Doctor searchMobileNumber(long id) {
		// TODO Auto-generated method stub
		Doctor doctor = patientDao.searchMobileNumber(id);
		return doctor;
	}

	@Override
	public Patient searchByIdentityCardNumber(long identityCardNumber) {
		Patient patient = patientDao
				.searchByIdentityCardNumber(identityCardNumber);
		return patient;
	}

}
