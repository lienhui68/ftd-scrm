package com.eh.base;

import com.mongodb.WriteResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/**
 * Created by David Li on 2015/11/23.
 */
public abstract class MongoDaoImpl<ID extends Serializable, T extends Identifier<ID>> implements MongoDao<ID, T> {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void insert(T t) {
        mongoTemplate.insert(t);
    }

    @Override
    public boolean delete(ID id) {
        Query query = new Query(Criteria.where(Identifier.ID).is(id));
        WriteResult wr = mongoTemplate.remove(query, getEntityClass());
        if (!wr.wasAcknowledged()) {
            return true;
        }
        return wr.isUpdateOfExisting();
    }

    @Override
    public void update(T t) {
        mongoTemplate.save(t);
    }

    @Override
    public T findById(ID id) {
        Query query = new Query(Criteria.where(Identifier.ID).is(id));
        return (T) mongoTemplate.findOne(query, getEntityClass());
    }

    @Override
    public List<T> findAll() {
        List<T> list = (List<T>) mongoTemplate.findAll(getEntityClass());
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    @Override
    public List<T> find(Query query) {
        List<T> list = (List<T>) mongoTemplate.find(query, getEntityClass());
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }
}
