package com.eh.base;

import org.springframework.data.mongodb.core.query.Query;

import java.io.Serializable;
import java.util.List;

/**
 * Created by David Li on 2015/11/23.
 */
public interface MongoDao<ID extends Serializable, T extends Identifier<ID>> {

    /**
     * Get entity class type
     *
     * @return
     */
    Class<?> getEntityClass();

    /**
     * Insert entity into database
     *
     * @param t
     */
    void insert(T t);

    /**
     * Delete entity by id
     *
     * @param id
     * @return
     */
    boolean delete(ID id);

    /**
     * update given entity
     *
     * @param t
     */
    void update(T t);

    /**
     * Find entity by id
     *
     * @param id
     * @return
     */
    T findById(ID id);

    /**
     * Find all entity
     *
     * @return
     */
    List<T> findAll();

    /**
     * Find entities by condition
     * @param query
     * @return
     */
    List<T> find(Query query);
}
