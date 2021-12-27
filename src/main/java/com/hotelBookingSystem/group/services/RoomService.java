package com.hotelBookingSystem.group.services;

import org.springframework.stereotype.Service;
import java.util.List;
import com.hotelBookingSystem.group.models.Room;


@Service
public class RoomService {
    public List<Room> getRooms() {
        return List.of(new Room(4000L, 100, "family_room", 3));
    }
}
