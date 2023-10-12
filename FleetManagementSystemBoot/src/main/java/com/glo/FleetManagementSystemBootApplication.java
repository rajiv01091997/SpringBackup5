package com.glo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.glo.Service.FleetService;
import com.glo.exception.IdNotFoundException;
import com.glo.model.Fleet;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class FleetManagementSystemBootApplication implements CommandLineRunner {
    @Autowired
	FleetService service;
	
	public static void main(String[] args) {
		SpringApplication.run(FleetManagementSystemBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		service.save(new Fleet(1001,"Kolkata","Bangalore"));
		service.save(new Fleet(1002,"Kolkata","Bangalore"));
		
	    service.getAllFleets();
	    try {
		service.getFleetById(1002);
	    }
	    catch (IdNotFoundException e) {
			System.out.println(e.getMsg());
		}
//		System.out.println("All fleets"+service.getAllFleets());
//		System.out.println("fleet with given id"+service.getFleetById(1001));
		
	}

}
