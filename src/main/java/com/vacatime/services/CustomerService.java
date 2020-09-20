package com.vacatime.services;

import com.vacatime.dto.CustomerReqDto;
import com.vacatime.exception.ResourceNotFoundException;
import com.vacatime.models.Booking;
import com.vacatime.models.Customer;
import com.vacatime.repositories.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    public Customer saveCustomer(CustomerReqDto dto) {
        Customer customer = new Customer();
        customer.setEmail(dto.getEmail());
        customer.setPassword(dto.getPassword());
        customer.setUserName(dto.getUsername());
        return customerRepository.save(customer);
    }

    public Customer findById(Long id) {
        return customerRepository.findById(id).orElseThrow(ResourceNotFoundException::new);
    }
}
