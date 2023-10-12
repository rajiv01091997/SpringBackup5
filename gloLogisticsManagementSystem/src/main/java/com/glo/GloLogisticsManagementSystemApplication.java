package com.glo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.glo.model.Freight;
import com.glo.service.Service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@SpringBootApplication
public class GloLogisticsManagementSystemApplication implements CommandLineRunner{
	
//	
//	@Qualifier("Service1")
//    @Autowired
	Service service;
	
	@Autowired
	public GloLogisticsManagementSystemApplication(@Qualifier("Service1") Service service,@Qualifier("Service2") Service service2) {
		super();
		this.service=service;
		System.out.println("inside main constructor");
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		SpringApplication.run(GloLogisticsManagementSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		service.save(new Freight(101,"Kolkata","Bangalore"));
		service.save(new Freight(102,"Mumbai","Chandigarh"));
		
		System.out.println(service.getAll());
		System.out.println(service.findByid(102));
		
	}
	@PostConstruct
	public void init()
	{
		System.out.println("main bean created");
	}
	@PreDestroy
	public void exit()
	{
		System.out.println("main destroyed");
	}

}
