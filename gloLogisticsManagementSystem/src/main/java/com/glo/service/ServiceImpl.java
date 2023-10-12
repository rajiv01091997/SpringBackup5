package com.glo.service;

import java.beans.BeanProperty;
import java.lang.annotation.Annotation;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


import com.glo.model.Freight;
import com.glo.repository.Repository;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
@Service("Service1")
public class ServiceImpl implements com.glo.service.Service{

	@Autowired
Repository repo;
	

//	@Autowired
//    public ServiceImpl(@Qualifier("rep") Repository repo)
//    { System.out.println("parameterised service construcotr");
//		this.repo=repo;
//    	
//    }
	
	
	
	public ServiceImpl() {
	super();
	System.out.println("inside service constructor");
	// TODO Auto-generated constructor stub
}

	public Repository getRepo() {
		System.out.println("inside service getter for repo");
		return repo;
	}

	public void setRepo(Repository repo) {
		System.out.println("inside service setter for repo");
		this.repo = repo;
	}

	

	
	public void save(Freight frieght) {
		repo.getFreightDatabase().add(frieght);
	}

	public List<Freight> getAll() {
		
		return repo.getFreightDatabase();
	}
	public Freight findByid(int id)
	{
		List<Freight> list=repo.getFreightDatabase();
		return list.stream().filter(e->e.getOrderId()==id).findAny().orElse(null);
		
	}

	@PostConstruct
	public void init()
	{
		System.out.println("service bean created");
	}
	@PreDestroy
	public void exit()
	{
		System.out.println("service will get destroyed");
	}
	
}
