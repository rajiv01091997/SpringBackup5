package com.glo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.glo.exception.IdNotFoundException;
import com.glo.model.Fleet;
import com.glo.repository.FleetRepository;
@Service
public class FleetServiceImpl implements FleetService {
	
	@Autowired
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
	   Fleet tempFleet=null;
		for(Fleet fleet:list)
		{
			if(fleet.getFleetId()==id)
			{
				tempFleet=fleet;
				break;
			}
		}
		if(tempFleet==null)
		{
			throw new IdNotFoundException("Fleet with given id not Present");
		}
		return tempFleet;
	}

	@Override
	public void save(Fleet fleet) {
		
		repo.getFleetStorage().add(fleet);
		//logger
	}

}
