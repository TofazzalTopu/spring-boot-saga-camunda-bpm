package com.info.camunda.controller;

import com.info.camunda.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/create/{orderId}")
    public ResponseEntity<String> createOrder(@PathVariable String orderId) {
        orderService.createOrder(orderId);
        return ResponseEntity.ok("Order " + orderId + " is being processed!");
    }
}

