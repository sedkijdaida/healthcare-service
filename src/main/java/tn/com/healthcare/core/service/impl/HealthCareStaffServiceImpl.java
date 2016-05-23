/**
 * 
 */
package tn.com.healthcare.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.com.healthcare.core.dao.HealthCareStaffDao;
import tn.com.healthcare.core.model.AbstractHealthCareStaff;
import tn.com.healthcare.core.service.HealthCareStaffService;

/**
 * @author sedki
 * 
 */
@Service("healthCareStaffService")
public class HealthCareStaffServiceImpl extends
		AbstractHealthcareEntityService<AbstractHealthCareStaff, Long>
		implements HealthCareStaffService {

	private HealthCareStaffDao healthCareStaffDao;

	@Autowired
	public HealthCareStaffServiceImpl(HealthCareStaffDao healthCareStaffDao) {
		super(healthCareStaffDao);
		this.healthCareStaffDao = healthCareStaffDao;

	}

}
