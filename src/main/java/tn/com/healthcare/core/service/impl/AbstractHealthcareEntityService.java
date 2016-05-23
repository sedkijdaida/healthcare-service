/*
 *  Copyright 2014 the original author or authors.
 * 
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package tn.com.healthcare.core.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import tn.com.healthcare.core.model.AbstractHealthcareEntity;
import tn.com.healthcare.core.repository.HealthcareEntityDao;
import tn.com.healthcare.core.service.HealthcareEntityService;

/**
 * 
 * @author Aymen ABDALLAH
 * 
 * @param <T>
 * @param <ID>
 */
public abstract class AbstractHealthcareEntityService<T extends AbstractHealthcareEntity, ID extends Serializable>
		implements HealthcareEntityService<T, ID> {

	private HealthcareEntityDao<T, ID> dao;

	public AbstractHealthcareEntityService(HealthcareEntityDao<T, ID> dao) {
		this.dao = dao;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.tn.rnu.isitcom.medical.service.MedicalEntityService#findAll()
	 */
	public List<T> findAll() {
		return dao.findAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.tn.rnu.isitcom.medical.service.MedicalEntityService#findAll(sort)
	 */
	public List<T> findAll(Sort sort) {
		return dao.findAll(sort);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.tn.rnu.isitcom.medical.service.MedicalEntityService#findAll(ids)
	 */
	public List<T> findAll(Iterable<ID> ids) {
		return dao.findAll(ids);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.tn.rnu.isitcom.medical.service.MedicalEntityService#save(entities)
	 */
	public <S extends T> List<S> save(Iterable<S> entities) {
		return dao.save(entities);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.tn.rnu.isitcom.medical.service.MedicalEntityService#flush()
	 */
	public void flush() {
		dao.flush();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.tn.rnu.isitcom.medical.service.MedicalEntityService#saveAndFlush()
	 */
	public T saveAndFlush(T entity) {
		return dao.saveAndFlush(entity);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.tn.rnu.isitcom.medical.service.MedicalEntityService#deleteInBatch
	 * (entities)
	 */
	public void deleteInBatch(Iterable<T> entities) {
		dao.deleteInBatch(entities);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.tn.rnu.isitcom.medical.service.MedicalEntityService#deleteAllInBatch
	 * ()
	 */
	public void deleteAllInBatch() {
		dao.deleteAllInBatch();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.tn.rnu.isitcom.medical.service.MedicalEntityService#findAll(pageable)
	 */
	public Page<T> findAll(Pageable pageable) {
		return dao.findAll(pageable);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.tn.rnu.isitcom.medical.service.MedicalEntityService#save(entity)
	 */
	public <S extends T> S save(S entity) {
		return dao.save(entity);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.tn.rnu.isitcom.medical.service.MedicalEntityService#findOne(id)
	 */
	public T findOne(ID id) {
		return dao.findOne(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.tn.rnu.isitcom.medical.service.MedicalEntityService#exists(id)
	 */
	public boolean exists(ID id) {
		return dao.exists(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.tn.rnu.isitcom.medical.service.MedicalEntityService#count()
	 */
	public long count() {
		return dao.count();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.tn.rnu.isitcom.medical.service.MedicalEntityService#delete(id)
	 */
	public void delete(ID id) {
		dao.delete(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.tn.rnu.isitcom.medical.service.MedicalEntityService#delete(entity)
	 */
	public void delete(T entity) {
		dao.delete(entity);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.tn.rnu.isitcom.medical.service.MedicalEntityService#delete(entities)
	 */
	public void delete(Iterable<? extends T> entities) {
		dao.delete(entities);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.tn.rnu.isitcom.medical.service.MedicalEntityService#deleteAll()
	 */
	public void deleteAll() {
		dao.deleteAll();
	}

}
