package tn.com.healthcare.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.com.healthcare.core.dao.HealthCareStaffTypeDao;
import tn.com.healthcare.core.model.HealthCareStaffType;
import tn.com.healthcare.core.service.HealthCareStaffTypeService;

@Service
public class HealthCareStaffTypeServiceImpl extends
		AbstractHealthcareEntityService<HealthCareStaffType, Long> implements
		HealthCareStaffTypeService {
	private HealthCareStaffTypeDao healthCareStaffTypeDao;

	@Autowired
	public HealthCareStaffTypeServiceImpl(
			HealthCareStaffTypeDao healthCareStaffTypeDao) {
		super(healthCareStaffTypeDao);
		this.healthCareStaffTypeDao = healthCareStaffTypeDao;
		// TODO Auto-generated constructor stub
	}

}
