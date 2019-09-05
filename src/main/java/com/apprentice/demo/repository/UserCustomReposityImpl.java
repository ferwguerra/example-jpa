package com.apprentice.demo.repository;

import com.apprentice.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserCustomReposityImpl implements UserCustomRepository{

    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public List<User> findByGrade(String grade) {
        return mongoTemplate.find(
                Query.query(Criteria.where("courses").all().gt(grade)), User.class);
    }
}
