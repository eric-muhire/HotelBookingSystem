package com.hotelBookingSystem.group.repositories;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBSaveExpression;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;
import com.hotelBookingSystem.group.models.Booking;
import com.hotelBookingSystem.group.models.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class BookingRepository {

    @Autowired
    private DynamoDBMapper dynamoDBMapper;

    public Booking save(Booking booking){
        dynamoDBMapper.save(booking);
        return booking;
    }
    public Booking getBookingById(String bookingId){
        return dynamoDBMapper.load(Booking.class, bookingId);
    }
    public String delete(String bookingId){
        Booking bok = dynamoDBMapper.load(Booking.class, bookingId);
        dynamoDBMapper.delete(bok);
        return "Booking Deleted!";
    }
    public String update(String bookingId, Booking booking){
        dynamoDBMapper.save(booking,
                new DynamoDBSaveExpression().withExpectedEntry("bookingId",
                        new ExpectedAttributeValue(
                                new AttributeValue().withS(bookingId)
                        )));
        return bookingId;
    }
    public List<Booking> getAll() {
        return dynamoDBMapper.scan(Booking.class, new DynamoDBScanExpression());
    }
}
