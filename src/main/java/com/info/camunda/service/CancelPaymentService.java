package com.info.camunda.service;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component("cancelPaymentService")
public class CancelPaymentService implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) throws Exception {
        String orderId = (String) execution.getVariable("orderId");
        System.out.println("Cancelling payment for Order ID: " + orderId);
    }
}

