package com.example.nestedJsonParse.DAO;

import com.example.nestedJsonParse.Entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDAO extends MongoRepository<Customer,Integer> {
}
