package com.hotelBookingSystem.group.controllers;

import com.hotelBookingSystem.group.models.Room;
import com.hotelBookingSystem.group.models.RoomTypes;
import com.hotelBookingSystem.group.repositories.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class RoomController {

    @Autowired
    private RoomRepository roomRepository;

    @PostMapping("/room")
    public Room saveRoom(@RequestBody Room room) {
        return roomRepository.save(room);
    }

    @GetMapping("/room/{id}")
    public Room getRoom(@PathVariable("id") String roomId) {
        return roomRepository.getRoomById(roomId);
    }

    @GetMapping("/rooms/{room_type}")
    public Room getRooms(@PathVariable("room_type") RoomTypes room_type) {
        return roomRepository.getRoomByType(room_type);
    }

    @DeleteMapping("/room/{id}")
    public String deleteRoom(@PathVariable("id") String roomId){
        return roomRepository.delete(roomId);
    }

    @PutMapping("/room/{id}")
    public String updateRoom(@PathVariable("id") String roomId, @RequestBody Room room){
        return roomRepository.update(roomId,room);
    }

}
