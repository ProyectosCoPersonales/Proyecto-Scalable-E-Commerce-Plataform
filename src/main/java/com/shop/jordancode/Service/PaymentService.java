package com.shop.jordancode.Service;


import org.springframework.stereotype.Service;

import com.shop.jordancode.Entities.Payment.Payment;
import com.shop.jordancode.Repositories.PaymentRepository;

import java.util.List;


@Service
public class PaymentService {

    private final PaymentRepository paymentRepository;

    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    public Payment savePayment(Payment payment) {
        return paymentRepository.save(payment);
    }

}

