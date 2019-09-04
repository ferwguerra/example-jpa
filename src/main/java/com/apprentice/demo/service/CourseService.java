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
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public Course findById(Integer id) {
        return courseRepository.findById(id).get();
    }

    public Iterable<Course> findAll() {
        return courseRepository.findAll();
    }

}
