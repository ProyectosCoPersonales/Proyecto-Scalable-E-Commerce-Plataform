package com.shop.jordancode.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shop.jordancode.Entities.Payment.Payment;


@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {

}