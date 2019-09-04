package com.apprentice.demo.service;

import com.apprentice.demo.domain.Address;
import com.apprentice.demo.domain.User;
import com.apprentice.demo.repository.AddressRepository;
import com.apprentice.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AddressRepository addressRepository;

    public User findById(Integer id) {
        return userRepository.findById(id).get();
    }

    public User create(User user, int addressId) {
        Address address = addressRepository.findById(addressId).get();
        user.setAddress(address);
        return userRepository.save(user);
    }
}
