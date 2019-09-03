package com.apprentice.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;


@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/{id}", method = GET)
    @ResponseBody
    public User getUser(@PathVariable("id") Integer id) {
        return userService.findById(id);
    }

    @RequestMapping(value = "/creation/{name}", method = GET) // THIS SHOULD BE POST!
    @ResponseBody
    public User createUser(@PathVariable("name") String name) {
        User user = new User();
        user.setName(name);
        user.setAge(44);
        user.setAddress("bla 123");
        return userService.create(user);
    }


}
