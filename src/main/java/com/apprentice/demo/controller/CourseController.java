package com.apprentice.demo.controller;

import com.apprentice.demo.domain.Course;
import com.apprentice.demo.domain.User;
import com.apprentice.demo.service.CourseService;
import com.apprentice.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;


@RestController
@RequestMapping("course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping(value = "/{id}", method = GET)
    @ResponseBody
    public Course getCourse(@PathVariable("id") Integer id) {
        return courseService.findById(id);
    }

    @RequestMapping(value = "/", method = GET)
    @ResponseBody
    public Iterable<Course> getAllCourses() {
        return courseService.findAll();
    }

}
