package com.example.nestedJsonParse.Controller;

import com.example.nestedJsonParse.DAO.CustomerDAO;
import com.example.nestedJsonParse.Entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class MyController {
    @Autowired
    private CustomerDAO customerDAO;

    @PostMapping("/addData")
    public Customer addData(Customer customer){
        customerDAO.save(customer);
        return customer;
    }
    @GetMapping("/getAllData")
    public List<Customer> getAllData(){
        return customerDAO.findAll();
    }

    @GetMapping("/home")
    public String home(){
        return "Hello World!";
    }
}
