package tn.com.healthcare.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.com.healthcare.core.dao.HospitalServiceDao;
import tn.com.healthcare.core.model.HospitalService;
import tn.com.healthcare.core.service.HospitalServices;

@Service
public class HospitalServicesImpl extends
		AbstractHealthcareEntityService<HospitalService, Long> implements
		HospitalServices {
	private HospitalServiceDao hospitalServiceDao;

	@Autowired
	public HospitalServicesImpl(HospitalServiceDao hospitalServiceDao) {
		super(hospitalServiceDao);
		this.hospitalServiceDao = hospitalServiceDao;

	}

}
