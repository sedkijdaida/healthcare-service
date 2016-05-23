package tn.com.healthcare.core.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import tn.com.healthcare.core.model.AbstractHealthcareEntity;

/**
 * A common base interface for all your domain repositories.
 * 
 * @param <T>
 *            : the target entity.
 * @param <ID>
 *            : the entity identifier.
 */
@NoRepositoryBean
public interface HealthcareEntityDao<T extends AbstractHealthcareEntity, ID extends Serializable>
		extends JpaRepository<T, ID> {

}
