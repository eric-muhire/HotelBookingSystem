package com.hotelBookingSystem.group.services;
import com.hotelBookingSystem.group.models.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    public List<Customer> getCustomer() {
        return List.of(new Customer(
                100L,
                "Anna",
                "Andersson",
                "+4755555",
                "e.hotmail.com",
                "västergatan 10",
                "Gothenburg",
                "45595",
                "Sweden"));

    }
}
