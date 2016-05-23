package tn.com.healthcare.core.service;

import tn.com.healthcare.core.model.User;

public interface UserService extends HealthcareEntityService<User, Long> {

	User checkConnection(String login, String password);

}
