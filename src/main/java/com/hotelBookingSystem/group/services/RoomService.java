package com.hotelBookingSystem.group.services;
import org.springframework.stereotype.Service;
import com.hotelBookingSystem.group.models.Room;

import java.util.List;
@Service
public class RoomService {
    public List<Room> getRooms() {
        return List.of(new Room(4000L, 100, "family_room", 3));
    }
}
