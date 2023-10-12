package com.glo.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.glo.model.Freight;
@Component("Service2")
public class ServiceImpl2 implements Service {

	Logger log=LoggerFactory.getLogger("ServiceImpl2");
	
	
	

	public ServiceImpl2() {
		super();
		System.out.println("inside Service2 constructor");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void save(Freight frieght) {
		// TODO Auto-generated method stub
		
		log.info("this is save of ServiceImpl2");
	}

	@Override
	public List<Freight> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Freight findByid(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
