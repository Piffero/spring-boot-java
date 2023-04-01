package com.parking.api.parkingctrlapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ParkingCtrlApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkingCtrlApiApplication.class, args);
	}

	@GetMapping("/")
	public String index() {
		return "Hellow Word";
	}

}
