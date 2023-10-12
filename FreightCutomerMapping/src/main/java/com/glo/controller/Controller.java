package com.glo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.glo.model.Freight;
import com.glo.service.Service;
@Component
public class Controller {
	@Autowired
	Service service;
	
	public Freight save(Freight freight)
	{
		return service.save(freight);
	}
	
	public List<Freight> getAll()
	{
		return service.getAll();
	}

}
