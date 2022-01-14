package com.hotelBookingSystem.group.controllers;

import com.hotelBookingSystem.group.models.Booking;
import com.hotelBookingSystem.group.models.Room;
import com.hotelBookingSystem.group.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class BookingController {
    @Autowired
    private BookingRepository bookingRepository;

    @PostMapping("/booking")
    public Booking saveBooking ( @RequestBody Booking booking){
        return bookingRepository.save(booking);
    }

    @GetMapping("/booking/{id}")
    public Booking getBooking(@PathVariable("id") String bookingId){
        return bookingRepository.getBookingById(bookingId);
    }

    @GetMapping("/bookings")
    public List<Booking> getAll(){
        return bookingRepository.getAll();
    }

    @DeleteMapping("/booking/{id}")
    public String deleteBooking(@PathVariable("id") String bookingId){
        return bookingRepository.delete(bookingId);
    }

    @PutMapping ("/booking/{id}")
    public String updateBooking (@PathVariable("id") String bookingId, @RequestBody Booking booking){
        return bookingRepository.update(bookingId, booking);
    }
}
