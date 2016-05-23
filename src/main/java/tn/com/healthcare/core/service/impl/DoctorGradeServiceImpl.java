package tn.com.healthcare.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.com.healthcare.core.dao.DoctorGradeDao;
import tn.com.healthcare.core.model.DoctorGrade;
import tn.com.healthcare.core.service.DoctorGradeService;

@Service
public class DoctorGradeServiceImpl extends
		AbstractHealthcareEntityService<DoctorGrade, Long> implements
		DoctorGradeService {
	private DoctorGradeDao doctorGradeDao;

	@Autowired
	public DoctorGradeServiceImpl(DoctorGradeDao doctorGradeDao) {
		super(doctorGradeDao);
		this.doctorGradeDao = doctorGradeDao;
	}

}
