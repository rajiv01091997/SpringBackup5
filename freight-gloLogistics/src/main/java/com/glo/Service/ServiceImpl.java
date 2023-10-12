package com.glo.Service;

import java.util.List;

import com.glo.model.Freight;
import com.glo.repository.Repository;

public class ServiceImpl implements ServiceInterface{
	
	
	Repository repo;
	
	
	

	public Repository getRepo() {
		return repo;
	}

	public void setRepo(Repository repo) {
		this.repo = repo;
	}

	
	public void save(Freight frieght) {
		////////
	}

	public List<Freight> getAll() {
		
		return repo.getFreightDatabase();
	}

}
