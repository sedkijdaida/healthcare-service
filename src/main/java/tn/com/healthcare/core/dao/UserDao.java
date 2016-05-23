package tn.com.healthcare.core.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import tn.com.healthcare.core.model.User;
import tn.com.healthcare.core.repository.HealthcareEntityDao;

public interface UserDao extends HealthcareEntityDao<User, Long> {
	@Query("select u from User u where u.login = :login AND u.password = :password")
	User checkConnection(@Param("login") String login,
			@Param("password") String password);

}
