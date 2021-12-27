package com.hotelBookingSystem.group.models;

/*
import javax.persistence.*;

@Entity
@Table
public class Room {
    @Id
    @SequenceGenerator(
            name = "room_sequence",
            sequenceName = "room_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "room_sequence"
    )*/

public class Room {

    private Long id;
    private Integer room_number;
    private String room_type;
    private Integer number_beds;

    public Room() {
    }

    public Room(Long id, Integer room_number, String room_type, Integer number_beds) {
        this.id = id;
        this.room_number = room_number;
        this.room_type = room_type;
        this.number_beds = number_beds;
    }

    public Room(Integer room_number, String room_type, Integer number_beds) {
        this.room_number = room_number;
        this.room_type = room_type;
        this.number_beds = number_beds;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getRoom_number() {
        return room_number;
    }

    public void setRoom_number(Integer room_number) {
        this.room_number = room_number;
    }

    public String getRoom_type() {
        return room_type;
    }

    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }

    public Integer getNumber_beds() {
        return number_beds;
    }

    public void setNumber_beds(Integer number_beds) {
        this.number_beds = number_beds;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", room_number='" + room_number + '\'' +
                ", room_type='" + room_type + '\'' +
                ", number_beds=" + number_beds +
                '}';
    }
}
