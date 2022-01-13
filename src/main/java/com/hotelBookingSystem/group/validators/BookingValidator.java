package com.hotelBookingSystem.group.validators;

import com.hotelBookingSystem.group.models.Booking;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;


public class BookingValidator implements Validator {

    private DateValidator dateValidator = new DateValidator();

    @Override
    public boolean supports(Class<?> clazz) {
        return Booking.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Booking booking = (Booking) target;
        if (!checkDate(booking.getCheckIn())) {
            errors.rejectValue("checkIn", "Invalid format");
        }
    }

    private boolean checkDate(String input) {
        return input != null && dateValidator.isValidISODateTime(input);
    }


}
