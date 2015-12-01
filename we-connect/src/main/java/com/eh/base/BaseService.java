package com.eh.base;

import java.io.Serializable;
import java.util.List;

/**
 * Created by David Li on 2015/11/23.
 */
public interface BaseService<ID extends Serializable, T extends Identifier<ID>> {

	/**
	 * Create given entity
	 *
	 * @param entity
	 * @return
	 */
	T create(T entity);

	/**
	 * Delete entity by id
	 *
	 * @param id
	 */
	void delete(ID id);

	/**
	 * Update given entity
	 *
	 * @param entity
	 * @return
	 */
	void update(T entity);

	/**
	 * Find entity by id
	 *
	 * @param id
	 * @return
	 */
	T findById(ID id);

	/**
	 * Find all entities
	 *
	 * @return
	 */
	List<T> findAll();
}
