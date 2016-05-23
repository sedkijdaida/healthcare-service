package tn.com.healthcare.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.com.healthcare.core.dao.PeriodDao;
import tn.com.healthcare.core.model.Period;
import tn.com.healthcare.core.service.PeriodService;

@Service("periodService")
public class PeriodServiceImpl extends
		AbstractHealthcareEntityService<Period, Long> implements PeriodService {

	private PeriodDao periodDao;

	@Autowired
	public PeriodServiceImpl(PeriodDao periodDao) {
		super(periodDao);
		this.periodDao = periodDao;
	}

}
