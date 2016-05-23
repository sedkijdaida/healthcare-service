package tn.com.healthcare.core.service;

import tn.com.healthcare.core.model.Bloc;

public interface BlocService extends HealthcareEntityService<Bloc, Long> {

	Bloc searchBloc(long id);

}
