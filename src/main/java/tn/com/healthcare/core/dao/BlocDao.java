package tn.com.healthcare.core.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import tn.com.healthcare.core.model.Bloc;
import tn.com.healthcare.core.repository.HealthcareEntityDao;

public interface BlocDao extends HealthcareEntityDao<Bloc, Long> {

	@Query("select b from Bloc b where b.id = :id")
	Bloc searchBloc(@Param("id") long id);

}
