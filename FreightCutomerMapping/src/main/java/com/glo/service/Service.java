package com.glo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.glo.model.Freight;
import com.glo.repository.Repository;

@org.springframework.stereotype.Service
public class Service  {
	@Autowired
	Repository repository;
	
	public Freight save(Freight freight)
	{
		return repository.save(freight);
	}
	
	public List<Freight> getAll()
	{
		return repository.findAll();
	}

}
