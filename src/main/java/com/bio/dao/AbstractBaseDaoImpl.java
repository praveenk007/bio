package com.bio.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import javax.management.Query;

public abstract class AbstractBaseDaoImpl<T> {

    @Autowired
    private MongoTemplate mongoTemplate;

    /*public T findById(Class<T> clazz, Object id) throws Exception {
        return mongoTemplate.findById(id, clazz);
    }*/
}
