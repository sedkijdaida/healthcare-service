package tn.com.healthcare.core.service;

import tn.com.healthcare.core.model.Doctor;

public interface DoctorService extends HealthcareEntityService<Doctor, Long> {

	Doctor searchBylogin(String login);

}
