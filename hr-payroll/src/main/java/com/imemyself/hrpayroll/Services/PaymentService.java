package com.imemyself.hrpayroll.Services;

import com.imemyself.hrpayroll.Entities.Payment;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(long workerId, int days) {
        return new Payment("bobb", 200.0, days);
    }

}
