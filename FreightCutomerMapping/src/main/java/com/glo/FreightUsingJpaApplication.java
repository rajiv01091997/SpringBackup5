package com.glo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.glo.controller.Controller;
import com.glo.controller.CustomerController;
import com.glo.model.Customer;
import com.glo.model.Freight;

@SpringBootApplication
public class FreightUsingJpaApplication implements CommandLineRunner
{
	@Autowired
   Controller controller;
	@Autowired
	CustomerController controller2;
	public static void main(String[] args)  
	{
		SpringApplication.run(FreightUsingJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		Freight freight1=new Freight(1, "Kolkata", "Bangalore");
		Customer customer=new Customer(0, "Rajiv","Kolkata", freight1);
		//saving
		System.out.println(controller2.save(customer));
		
		
		//fetching
		//System.out.println("List of all Freights:\n"+controller.getAll());
		
	}

}
