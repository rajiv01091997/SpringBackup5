package com.glo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.glo.entity.Freight;
import com.glo.service.ServiceImpl;

@RestController
@RequestMapping("/freight")
public class Controller {
	@Autowired
	ServiceImpl service;
	
//	@GetMapping("/get")
//	public String msg()
//	{
//		return service.msg();
//	}
 
	@PostMapping("/save")
	public Freight save(@RequestBody Freight freight)
	{
		return service.add(freight);
	}
	
	@GetMapping("/get/{id}")
	public Freight getById(@PathVariable int id)
	{
		return service.getById(id);
	}
	
	@GetMapping("/get")
	public List<Freight> getAll()
	{
		return service.getAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteById(@PathVariable   int id)
	{
		return service.deleteById(id);
	}
}
