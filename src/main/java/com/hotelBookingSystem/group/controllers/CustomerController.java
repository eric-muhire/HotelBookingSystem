package com.hotelBookingSystem.group.controllers;
import com.hotelBookingSystem.group.models.Customer;
import com.hotelBookingSystem.group.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/customer")
public class CustomerController {

    private final CustomerService CustomerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.CustomerService = customerService;
    }


    @GetMapping
    public List<Customer> getCustomer() {
        return CustomerService.getCustomer();

    }
}
