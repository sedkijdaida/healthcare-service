package tn.com.healthcare.core.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import tn.com.healthcare.core.model.Doctor;
import tn.com.healthcare.core.model.Patient;
import tn.com.healthcare.core.repository.HealthcareEntityDao;

public interface PatientDao extends HealthcareEntityDao<Patient, Long> {

	@Query("select p from Patient p join p.healthCareStaffs u where u.id = :id AND p.bloc.name = :name")
	List<Patient> searchById(@Param("id") long id, @Param("name") String name);

	@Query("select d from Doctor d join d.patients p where p.id = :id")
	Doctor searchMobileNumber(@Param("id") long id);

	@Query("select p from Patient p where p.identityCardNumber = :identityCardNumber")
	Patient searchByIdentityCardNumber(
			@Param("identityCardNumber") long identityCardNumber);
}
