package tn.com.healthcare.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.com.healthcare.core.dao.DoctorDao;
import tn.com.healthcare.core.model.Doctor;
import tn.com.healthcare.core.service.DoctorService;

@Service("doctorService")
public class DoctorServiceImpl extends
		AbstractHealthcareEntityService<Doctor, Long> implements DoctorService {

	private DoctorDao doctorDao;

	@Autowired
	public DoctorServiceImpl(DoctorDao doctorDao) {
		super(doctorDao);
		this.doctorDao = doctorDao;
	}

	@Override
	public Doctor searchBylogin(String login) {

		Doctor doctor = doctorDao.searchBylogin(login);

		return doctor;
	}

}
