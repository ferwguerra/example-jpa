package com.apprentice.demo.service;

import com.apprentice.demo.domain.User;
import com.apprentice.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findById(Integer id) {
        return userRepository.findById(id).get();
    }

    public User create(User user) {
        return userRepository.save(user);
    }
}
