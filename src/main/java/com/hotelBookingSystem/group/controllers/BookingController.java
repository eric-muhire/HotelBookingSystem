package com.hotelBookingSystem.group.controllers;

import com.hotelBookingSystem.group.models.Booking;
import com.hotelBookingSystem.group.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.util.Arrays;
import java.util.List;

@Controller

public class BookingController {

    @Autowired
    private BookingRepository bookingRepository;

    @PostMapping("/register")
    public String saveBooking ( Booking booking){


        bookingRepository.save(booking);
        return "register_success";
    }

    @GetMapping("/register")
    public String showForm(Model model) {
        Booking booking = new Booking();
        model.addAttribute("booking", booking);

        List<String> listRoomView = Arrays.asList("Sea view", "City view", "Pool view");
        model.addAttribute("listRoomView", listRoomView);

        List<String> listRoomTypes = Arrays.asList("SINGLE ROOM", "DOUBLE ROOM", "FAMILY ROOM", "LUXURY SUITE");
        model.addAttribute("listRoomTypes", listRoomTypes);


        return "register_form";
    }


   //OLD
    /*
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
    */

}
