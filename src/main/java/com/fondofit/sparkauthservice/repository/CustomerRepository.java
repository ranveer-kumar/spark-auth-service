package com.fondofit.sparkauthservice.repository;

import com.fondofit.sparkauthservice.domain.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CustomerRepository extends MongoRepository<Customer, String> {

    List<Customer> findByEmail(String email);
}
