package com.hotelBookingSystem.group.validators;


public class DateValidator {

    boolean isValidISODateTime(String date) {
        try {
            java.time.format.DateTimeFormatter.ISO_DATE.parse(date);
            return true;
        } catch (java.time.format.DateTimeParseException e) {
            return false;
        }
    }
}

