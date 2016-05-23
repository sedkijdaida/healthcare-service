package tn.com.healthcare.core.service;

import tn.com.healthcare.core.model.MaleNurse;

public interface MaleNurseService extends
		HealthcareEntityService<MaleNurse, Long> {

	MaleNurse searchBylogin(String login);

}
