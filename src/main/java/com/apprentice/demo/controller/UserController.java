package com.apprentice.demo.controller;

import com.apprentice.demo.domain.User;
import com.apprentice.demo.repository.UserCustomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;


@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserCustomRepository userRepository;

    @RequestMapping(value = "/grade/{minimum}", method = GET)
    @ResponseBody
    public List<User> getUserByMinimumGrade(@PathVariable("minimum") String minimum) {
        return userRepository.findByGrade(minimum);
    }
}

