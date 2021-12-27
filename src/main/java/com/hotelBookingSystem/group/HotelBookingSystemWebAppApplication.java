package com.hotelBookingSystem.group;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
public class HotelBookingSystemWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelBookingSystemWebAppApplication.class, args);
	}

}

