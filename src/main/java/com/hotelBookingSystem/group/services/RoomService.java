package com.hotelBookingSystem.group.services;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import com.hotelBookingSystem.group.models.Room;
@Service
public class RoomService {
    private List<Room> roomList = Collections.emptyList();
    public List<Room> getRooms() {
        return List.of(new Room(4000L, 100, "family_room", 3));
    }
    public Room addRoom(Room room) {
        roomList.add(room) ;
        return room;
    }
}
