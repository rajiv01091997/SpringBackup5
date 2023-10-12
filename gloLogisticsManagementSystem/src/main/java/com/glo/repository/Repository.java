package com.glo.repository;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.glo.model.*;
import com.glo.service.Service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
//@Qualifier("rep")
@org.springframework.stereotype.Repository("rep")
public class Repository {
	
	List<Freight> freightDatabase;
	
	Service service;
	
	@Autowired
	public Repository(@Qualifier("Service2")Service service) {
		this();
		System.out.println("insode repository param constructor");
		this.service = service;
	}

	public Repository() {
		super();
		System.out.println("insode repository constructor");
		freightDatabase=new ArrayList<>();
	}

	public List<Freight> getFreightDatabase() {
		return freightDatabase;
	}

	public void setFreightDatabase(List<Freight> freightRepo) {
		this.freightDatabase = freightRepo;
	}
	@PostConstruct
	public void init()
	{
		System.out.println("Repo bean created");
	}
	@PreDestroy
	public void exit()
	{
		System.out.println("repo will be destroyed");
	}

}
