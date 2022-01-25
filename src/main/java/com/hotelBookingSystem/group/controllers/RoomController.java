package com.hotelBookingSystem.group.controllers;

import com.hotelBookingSystem.group.models.Room;
import com.hotelBookingSystem.group.models.RoomTypes;
import com.hotelBookingSystem.group.repositories.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.groovy.GroovyMarkupConfig;

import java.util.List;

@Controller
@RequestMapping("/rooms")
public class RoomController {

    @Autowired
    private RoomRepository roomRepository;

    //OLD
//    @PostMapping("/room")
//    public Room saveRoom(@RequestBody Room room) {
//        return roomRepository.save(room);
@PostMapping("/addNewRoom")
public String saveRoom (Room room) {
    roomRepository.save(room);
    return "redirect:/rooms/getAll";
    }

    //OLD
//    @GetMapping("/room/{id}")
//    public Room getRoom(@PathVariable("id") String roomId) {
//        return roomRepository.getRoomById(roomId);
@RequestMapping("getRoomById")
@ResponseBody
public Room getRoomById(String roomId) {
    return roomRepository.getRoomById(roomId);
    }


    //OLD
    //Display a list of rooms
    //@GetMapping("/rooms")
//    public List<Room> getAll(){
//        return roomRepository.getAll();
//    @RequestMapping("/rooms")
//    public String getAll(Model model){
//        List<Room> room = roomRepository.getAll();
//        model.addAttribute("listRoom", room);
//        return "index" ;
//    public String viewHomePage(Model model){
//        model.addAttribute("listRoom", roomRepository.getAll());
//
//        return "index";
   @RequestMapping("/getAll")
//    public List<Room> getAll(){
//        return roomRepository.getAll();
   public String getAll(Model model){
     List<Room> room = roomRepository.getAll();
     model.addAttribute("rooms", room);
     return "index";



    }

    @GetMapping("/rooms/{room_type}")
    public Room getRooms(@PathVariable("room_type") RoomTypes room_type) {
        return roomRepository.getRoomByType(room_type);
    }

    @DeleteMapping("/room/{id}")
    public String deleteRoom(@PathVariable("id") String roomId){
        return roomRepository.delete(roomId);
    }

    //OLD

//    @PutMapping("/room/{id}")
//    public String updateRoom(@PathVariable("id") String roomId, @RequestBody Room room){
//        return roomRepository.update(roomId,room);
@RequestMapping("/updateRoom")
public String updateRoom(String roomId, @RequestBody Room room){
     roomRepository.update(roomId,room);
    return "redirect:/rooms/getAll";
    }

}
