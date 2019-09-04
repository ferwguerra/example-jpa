package com.apprentice.demo.repository;

import com.apprentice.demo.domain.Address;
import com.apprentice.demo.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<Address, Integer> {

}
