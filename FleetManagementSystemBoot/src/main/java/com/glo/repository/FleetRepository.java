package com.glo.repository;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import com.glo.model.*;

@Repository
public class FleetRepository {
	
	List<Fleet> fleetStorage;
	
	

	public FleetRepository() {
		super();
		fleetStorage=new ArrayList<>();
	}

	public List<Fleet> getFleetStorage() {
		return fleetStorage;
	}

	public void setFleetStorage(List<Fleet> fleetStorage) {
		this.fleetStorage = fleetStorage;
	}
	
	
	
	

}
