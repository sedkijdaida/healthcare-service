package tn.com.healthcare.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.com.healthcare.core.dao.MaleNurseDao;
import tn.com.healthcare.core.model.MaleNurse;
import tn.com.healthcare.core.service.MaleNurseService;

@Service("maleNurseService")
public class MaleNurseServiceImpl extends
		AbstractHealthcareEntityService<MaleNurse, Long> implements
		MaleNurseService {
	private MaleNurseDao maleNurseDao;

	@Autowired
	public MaleNurseServiceImpl(MaleNurseDao maleNurseDao) {
		super(maleNurseDao);
		this.maleNurseDao = maleNurseDao;
	}

	@Override
	public MaleNurse searchBylogin(String login) {

		MaleNurse maleNurse = maleNurseDao.searchBylogin(login);

		return maleNurse;
	}

}
