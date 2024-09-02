package com.tech.hrpayroll.services;

import com.tech.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(long workerId, int days) {
          return new Payment("Rodrigo", 200.00, days);
    }

}
