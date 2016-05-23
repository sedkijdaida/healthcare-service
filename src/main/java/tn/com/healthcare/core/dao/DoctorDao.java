package tn.com.healthcare.core.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import tn.com.healthcare.core.model.Doctor;
import tn.com.healthcare.core.repository.HealthcareEntityDao;

public interface DoctorDao extends HealthcareEntityDao<Doctor, Long> {

	@Query("select d from Doctor d where d.login = :login")
	Doctor searchBylogin(@Param("login") String login);

}
