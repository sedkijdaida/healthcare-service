package tn.com.healthcare.core.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;

import tn.com.healthcare.core.model.AbstractHealthcareEntity;

public interface HealthcareEntityService<T extends AbstractHealthcareEntity, ID extends Serializable> {

	/**
	 * Returns all entities.
	 * 
	 * @return all entities.
	 */
	List<T> findAll();

	/**
	 * Returns all entities sorted by the given options.
	 * 
	 * @param sort
	 *            : the sort criteria.
	 * @return all entities sorted by the given options.
	 */
	List<T> findAll(Sort sort);

	/**
	 * Returns the entities with the given ids.
	 * 
	 * @param ids
	 *            : the identifiers to search the related entities for.
	 * @return a list of entities.
	 */
	List<T> findAll(Iterable<ID> ids);

	/**
	 * Saves all the given entities.
	 * 
	 * @param entities
	 *            : the entities to save.
	 * @return the saved entities.
	 */
	<S extends T> List<S> save(Iterable<S> entities);

	/**
	 * Flushes all pending changes to the database.
	 */
	void flush();

	/**
	 * Saves an entity and flushes changes instantly.
	 * 
	 * @param entity
	 * @return the saved entity
	 */
	T saveAndFlush(T entity);

	/**
	 * Deletes the given entities in a batch which means it will create a single
	 * {@link Query}. Assume that we will clear the
	 * {@link javax.persistence.EntityManager} after the call.
	 * 
	 * @param entities
	 */
	void deleteInBatch(Iterable<T> entities);

	/**
	 * Deletes all entities in a batch call.
	 */
	void deleteAllInBatch();

	/**
	 * Returns a {@link Page} of entities meeting the paging restriction
	 * provided in the {@code Pageable} object.
	 * 
	 * @param pageable
	 * @return a page of entities
	 */
	Page<T> findAll(Pageable pageable);

	/**
	 * Saves a given entity. Use the returned instance for further operations as
	 * the save operation might have changed the entity instance completely.
	 * 
	 * @param entity
	 * @return the saved entity
	 */
	<S extends T> S save(S entity);

	/**
	 * Retrieves an entity by its id.
	 * 
	 * @param id
	 *            must not be {@literal null}.
	 * @return the entity with the given id or {@literal null} if none found
	 * @throws IllegalArgumentException
	 *             if {@code id} is {@literal null}
	 */
	T findOne(ID id);

	/**
	 * Returns whether an entity with the given id exists.
	 * 
	 * @param id
	 *            must not be {@literal null}.
	 * @return true if an entity with the given id exists, {@literal false}
	 *         otherwise
	 * @throws IllegalArgumentException
	 *             if {@code id} is {@literal null}
	 */
	boolean exists(ID id);

	/**
	 * Returns the number of entities available.
	 * 
	 * @return the number of entities
	 */
	long count();

	/**
	 * Deletes the entity with the given id.
	 * 
	 * @param id
	 *            must not be {@literal null}.
	 * @throws IllegalArgumentException
	 *             in case the given {@code id} is {@literal null}
	 */
	void delete(ID id);

	/**
	 * Deletes a given entity.
	 * 
	 * @param entity
	 * @throws IllegalArgumentException
	 *             in case the given entity is (@literal null}.
	 */
	void delete(T entity);

	/**
	 * Deletes the given entities.
	 * 
	 * @param entities
	 * @throws IllegalArgumentException
	 *             in case the given {@link Iterable} is (@literal null}.
	 */
	void delete(Iterable<? extends T> entities);

	/**
	 * Deletes all entities managed by the repository.
	 */
	void deleteAll();

}
