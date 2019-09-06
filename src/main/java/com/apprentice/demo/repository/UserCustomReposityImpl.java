package com.apprentice.demo.repository;

import com.apprentice.demo.domain.User;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Filters.gt;
import static org.springframework.data.mongodb.core.query.Criteria.*;
import static org.springframework.data.mongodb.core.query.Query.*;

@Repository
public class UserCustomReposityImpl implements UserCustomRepository{

    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public List<User> findByName(String name) {
        return mongoTemplate.find(query(where("name").is(name)), User.class);
    }
}
