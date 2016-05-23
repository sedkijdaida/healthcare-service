package tn.com.healthcare.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.com.healthcare.core.dao.BlocDao;
import tn.com.healthcare.core.model.Bloc;
import tn.com.healthcare.core.service.BlocService;

@Service("blocService")
public class BlocServiceImpl extends
		AbstractHealthcareEntityService<Bloc, Long> implements BlocService {

	private BlocDao blocDao;

	@Autowired
	public BlocServiceImpl(BlocDao blocDao) {
		super(blocDao);
		this.blocDao = blocDao;
	}

	@Override
	public Bloc searchBloc(long id) {
		Bloc bloc = blocDao.searchBloc(id);
		return bloc;
	}

}
