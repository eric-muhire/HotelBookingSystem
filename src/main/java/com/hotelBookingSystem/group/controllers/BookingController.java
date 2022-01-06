package com.hotelBookingSystem.group.controllers;
import com.hotelBookingSystem.group.models.Booking;
import com.hotelBookingSystem.group.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/booking")
public class BookingController {

    private final BookingService BookingService;

    @Autowired
    public BookingController(BookingService bookingService) {
        this.BookingService = bookingService;
    }


    @GetMapping
    public List<Booking> getBooking() {
        return BookingService.getBooking();

    }
}
