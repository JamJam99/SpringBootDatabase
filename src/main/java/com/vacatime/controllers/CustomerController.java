package com.vacatime.controllers;

import java.util.List;

import com.vacatime.models.Customer;
import com.vacatime.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    
    @Autowired
    private CustomerRepository customerRepository;


    @GetMapping("/")
    public String getHello() {
        return "Hello";
    }
    @GetMapping("/customers")
    public List<Customer> all() {
        return customerRepository.findAll();
    }

    @PostMapping("/customers")
    public Customer newCustomer(@RequestBody Customer newCustomer) {
        return this.customerRepository.save(newCustomer);          
    }

    @GetMapping("/customers/{id}")
    public Customer getCustomerById(@PathVariable("id") Long id) {
        Customer customer = customerRepository.getOne(id);
        System.out.println(customer);
        return customer;
    }
    
}
