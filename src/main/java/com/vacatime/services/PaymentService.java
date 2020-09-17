package com.vacatime.services;

import com.vacatime.models.Payment;
import com.vacatime.repositories.PaymentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    private PaymentRepository paymentRepository;

    @Autowired
    public PaymentService(PaymentRepository paymentRepository){
        this.paymentRepository = paymentRepository;
    }

    public Payment getPayment(long id){
        return paymentRepository.getOne(id);
    }
}
