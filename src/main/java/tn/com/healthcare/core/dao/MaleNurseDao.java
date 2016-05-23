package tn.com.healthcare.core.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import tn.com.healthcare.core.model.MaleNurse;
import tn.com.healthcare.core.repository.HealthcareEntityDao;

public interface MaleNurseDao extends HealthcareEntityDao<MaleNurse, Long> {
	@Query("select m from MaleNurse m where m.login = :login")
	MaleNurse searchBylogin(@Param("login") String login);

}
