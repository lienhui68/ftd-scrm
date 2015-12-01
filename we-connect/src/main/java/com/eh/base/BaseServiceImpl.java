package com.eh.base;

import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by David Li on 2015/11/23.
 */
public abstract class BaseServiceImpl<ID extends Serializable, T extends Identifier<ID>, Dao extends MongoDao<ID, T>> implements
        BaseService<ID, T> {

    @Autowired
    protected Dao dao;

    @Override
    public T create(T entity) {
        dao.insert(entity);
        return entity;
    }

    @Override
    public void delete(ID id) {
        dao.delete(id);
    }

    @Override
    public void update(T entity) {
        dao.update(entity);
    }

    @Override
    public T findById(ID id) {
        return dao.findById(id);
    }

    @Override
    public List<T> findAll() {
        return dao.findAll();
    }
}
