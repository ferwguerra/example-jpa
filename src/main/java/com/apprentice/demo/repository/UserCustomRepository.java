package com.apprentice.demo.repository;

import com.apprentice.demo.domain.User;

import java.util.List;

public interface UserCustomRepository {

    List<User> findByGrade(String grade);

}
