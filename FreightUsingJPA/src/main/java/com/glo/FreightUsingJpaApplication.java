package com.glo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.glo.controller.Controller;
import com.glo.model.Freight;

@SpringBootApplication
public class FreightUsingJpaApplication implements CommandLineRunner
{
	@Autowired
   Controller controller;
	public static void main(String[] args)  
	{
		SpringApplication.run(FreightUsingJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		Freight freight1=new Freight(1, "Kolkata", "Bangalore");
		Freight freight2=new Freight(2, "Ballia", "Lucknow");
		Freight freight3=new Freight(3, "Indore", "Bangalore");
		
		//saving
		System.out.println(controller.save(freight1));
		System.out.println(controller.save(freight2));
		System.out.println(controller.save(freight3));
		
		
		//fetching
		System.out.println("List of all Freights:\n"+controller.getAll());
		
	}

}
