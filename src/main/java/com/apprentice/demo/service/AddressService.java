package com.apprentice.demo.service;

import com.apprentice.demo.domain.Address;
import com.apprentice.demo.domain.User;
import com.apprentice.demo.repository.AddressRepository;
import com.apprentice.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public Address create(Address address) {
        return addressRepository.save(address);
    }
}
