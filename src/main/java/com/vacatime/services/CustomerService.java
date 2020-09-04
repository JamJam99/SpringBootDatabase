package com.vacatime.services;

import com.vacatime.models.Customer;
import com.vacatime.repositories.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }
    public Customer getCustomer(Long id){
        return customerRepository.getOne(id);
    }
}
