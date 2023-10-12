package com.glo;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.glo.controller.ProfileController;
import com.glo.model.Post;
import com.glo.model.Profile;
import com.glo.model.User;



@SpringBootApplication
public class SocialMediaApplication implements CommandLineRunner
{
	@Autowired
    ProfileController  controller;
	
	public static void main(String[] args)  
	{
		SpringApplication.run(SocialMediaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		Post p1=new Post(0, "Jai shri ram");
		Post p2=new Post(0, "Radhe Radhe");
		Post p3=new Post(0, "Jai Mahakaal");
		
		List<Post> list=new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		User user=new User(0, "Niraj Kumar Yadav", list);
		
		Profile profile=new Profile(0, "Niraj1510", "Profile Belongs to Niraj1510", user);
		
		//controller.save(profile);
		
		//controller.deleteByProfileId(1);
		
		System.out.println(controller.getAll());
		
		
		
	}

}
