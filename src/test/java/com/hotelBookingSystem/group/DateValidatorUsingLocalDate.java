package com.hotelBookingSystem.group;

import com.hotelBookingSystem.group.models.DateValidator;
import com.hotelBookingSystem.group.models.DateValidatorUsingDateTimeFormatter;

import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.Locale;

/*
public class DateValidatorUsingLocalDate {

    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("uuuu-MM-dd", Locale.US)
            .withResolverStyle(ResolverStyle.STRICT);
    DateValidator validator = new DateValidatorUsingDateTimeFormatter(dateFormatter);

    assertTrue(validator.isValid("2019-02-28"));
    assertFalse(validator.isValid("2019-02-30"));
}
*/