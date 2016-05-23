package tn.com.healthcare.core.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import tn.com.healthcare.core.model.Measure;
import tn.com.healthcare.core.repository.HealthcareEntityDao;

public interface MeasureDao extends HealthcareEntityDao<Measure, Long> {

	@Query("select m from Patient p join p.measures m where p.lastName = :lastName")
	List<Measure> searchMeasure(@Param("lastName") String lastName);

}
