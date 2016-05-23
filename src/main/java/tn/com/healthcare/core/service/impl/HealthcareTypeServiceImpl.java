package tn.com.healthcare.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.com.healthcare.core.dao.HealthcareTypeDao;
import tn.com.healthcare.core.model.HealthcareType;
import tn.com.healthcare.core.service.HealthcareTypeService;

@Service
public class HealthcareTypeServiceImpl extends
		AbstractHealthcareEntityService<HealthcareType, Long> implements
		HealthcareTypeService {
	private HealthcareTypeDao healthCareDao;

	@Autowired
	public HealthcareTypeServiceImpl(HealthcareTypeDao healthCareDao) {
		super(healthCareDao);
		this.healthCareDao = healthCareDao;

	}

}
