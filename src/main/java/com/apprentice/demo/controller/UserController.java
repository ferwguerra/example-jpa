package com.apprentice.demo.controller;

import com.apprentice.demo.domain.Address;
import com.apprentice.demo.service.UserService;
import com.apprentice.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.web.bind.annotation.RequestMethod.GET;


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

    @RequestMapping(value = "/creation/{name}/address/{addressId}", method = GET) // THIS SHOULD BE POST!
    @ResponseBody
    public User create(@PathVariable("name") String name, @PathVariable("addressId") int addressId) {
        User user = new User();
        user.setName(name);
        user.setAge(44);
        return userService.create(user, addressId);
    }


}
