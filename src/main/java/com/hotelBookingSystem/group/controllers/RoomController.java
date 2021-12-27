package com.hotelBookingSystem.group.controllers;

import com.hotelBookingSystem.group.models.Room;
import com.hotelBookingSystem.group.services.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/room")
public class RoomController {

    private final RoomService roomService;

    @Autowired
    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping("/rooms")
    public List<Room> getRooms() {
        return roomService.getRooms();
    }
    @PostMapping("/room")
    public Room addRoom(@RequestBody Room room) {
        return roomService.addRoom(room);
    }
}
