package com.info.camunda.service;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component("paymentService")
public class PaymentService implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) throws Exception {
        String orderId = (String) execution.getVariable("orderId");
        System.out.println("Processing payment for Order ID: " + orderId);

        // Simulate failure
        if (orderId.endsWith("5")) {
            throw new RuntimeException("Payment failed!");
        }
    }
}
