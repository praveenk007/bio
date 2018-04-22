package com.bio.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

public abstract class AbstractBaseDaoImpl<T> {

    @Autowired
    private MongoTemplate mongoTemplate;

    public T findById(Class<T> clazz, Object id) throws Exception {
        System.out.println("[AbstractBaseDaoImpl] [findById] id: "+id);
        System.out.println("[AbstractBaseDaoImpl] [findById] db: "+mongoTemplate.getMongoDbFactory().getDb().getName() + ", coll name: " + mongoTemplate.getCollectionName(clazz));
        return mongoTemplate.findById(id, clazz);
    }
}
