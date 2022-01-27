package com.hotelBookingSystem.group.repositories;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBSaveExpression;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;
import com.hotelBookingSystem.group.models.Room;
import com.hotelBookingSystem.group.models.RoomTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.PUT;

@Repository
public class RoomRepository {

    @Autowired
    private DynamoDBMapper dynamoDBMapper;

    // TODO: add check so rooms with the same room number will not be created
    @RequestMapping("addNewRoom")
    public String save(Room room) {
        dynamoDBMapper.save(room);
        return "redirect:/rooms/getAll";
    }

    // TODO: do not update room numbers to a number that already exists
    @RequestMapping(value = "/updateRoom", method ={PUT, RequestMethod.GET})
    public String update(String roomId, Room room) {
        dynamoDBMapper.save(room,
                new DynamoDBSaveExpression()
                        .withExpectedEntry("roomId",
                                new ExpectedAttributeValue(
                                        new AttributeValue().withS(roomId)

                                )));
        return "redirect:/rooms/getAll";

    }
    @RequestMapping("getRoomById")
    public Room getRoomById(String roomId) {
        return dynamoDBMapper.load(Room.class, roomId);
    }

    public Room getRoomByType(RoomTypes room_type) {
        return dynamoDBMapper.load(Room.class, room_type);
    }

    public String delete(String roomId) {
        Room room = dynamoDBMapper.load(Room.class, roomId);
        dynamoDBMapper.delete(room);
        return "redirect:/rooms/getAll";
    }
    @RequestMapping("/getAll")
    public List<Room> getAll() {
        return dynamoDBMapper.scan(Room.class, new DynamoDBScanExpression());
    }
}




