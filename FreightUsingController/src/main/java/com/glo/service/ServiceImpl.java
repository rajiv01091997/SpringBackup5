package com.glo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.glo.entity.Freight;

@Service
public class ServiceImpl {
	@Autowired
	com.glo.repository.Repository repository;
	
	public String msg()
	{
		return "hello world";
	}
	
	public Freight add(Freight freight)
	{
		return repository.save(freight);
	}
	
	public List<Freight> getAll()
	{
		return repository.findAll();
	}
	
	public Freight getById(int id)
	{
		return repository.findById(id).get();
	}
 
	public String deleteById(int id)
	{
		repository.deleteById(id);
		return "deleted";
	}
}
