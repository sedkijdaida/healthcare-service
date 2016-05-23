package tn.com.healthcare.core.service;

import java.util.List;

import tn.com.healthcare.core.model.Doctor;
import tn.com.healthcare.core.model.Patient;

public interface PatientService extends HealthcareEntityService<Patient, Long> {

	List<Patient> searchById(long id, String name);

	Doctor searchMobileNumber(long id);

	Patient searchByIdentityCardNumber(long identityCardNumber);
}
