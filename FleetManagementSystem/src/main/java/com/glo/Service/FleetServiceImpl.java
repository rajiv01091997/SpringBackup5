package com.glo.Service;

import java.util.List;

import com.glo.model.Fleet;
import com.glo.repository.FleetRepository;

public class FleetServiceImpl implements FleetService {
	
	
	FleetRepository repo;
	
	
	

	
	public FleetRepository getRepo() {
		return repo;
	}

	public void setRepo(FleetRepository repo) {
		this.repo = repo;
	}
	

	public List<Fleet> getAllFleets() {
		
		return repo.getFleetStorage();
	}

	public Fleet getFleetById(long id) {
	   List<Fleet> list=repo.getFleetStorage();
		for(Fleet fleet:list)
		{
			if(fleet.getFleetId()==id)
				return fleet;
		}
		return null;
	}

}
