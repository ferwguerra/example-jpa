package com.apprentice.demo.controller;

import com.apprentice.demo.domain.Address;
import com.apprentice.demo.domain.User;
import com.apprentice.demo.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @RequestMapping(value = "/creation/{street}/{number}", method = GET) // THIS SHOULD BE POST!
    @ResponseBody
    public Address create(@PathVariable("street") String street, @PathVariable("number") int number) {
        Address address = new Address();
        address.setStreet(street);
        address.setNumber(number);
        return addressService.create(address);
    }
}
