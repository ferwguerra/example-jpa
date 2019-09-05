package com.apprentice.demo.service;

import com.apprentice.demo.domain.Address;
import com.apprentice.demo.domain.Course;
import com.apprentice.demo.domain.User;
import com.apprentice.demo.repository.AddressRepository;
import com.apprentice.demo.repository.CourseRepository;
import com.apprentice.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private CourseRepository courseRepository;

    public User findById(Integer id) {
        return userRepository.findById(id).get();
    }

    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

    public User create(User user, Address address) {
        address = addressRepository.findById(address.getId()).get();
        user.setAddress(address);
        return userRepository.save(user);
    }

    public User assignCourseToUser(User user, Course course) {
        course = courseRepository.findById(course.getId()).get();
        user = userRepository.findById(user.getId()).get();
        user.getCourses().add(course);

        userRepository.save(user);

        return user;
    }
}
