package com.apprentice.demo.repository;

import com.apprentice.demo.domain.User;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends MongoRepository<User, String> {

    List<User> findByName(@Param("name") String name);

    @Query("{'address.street': ?0}")
    List<User> findByStreet(final String grade);
}
