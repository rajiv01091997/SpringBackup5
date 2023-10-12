package com.glo.repository;
import java.util.List;

import com.glo.model.*;
public class Repository {
	
	List<Freight> freightDatabase;

	public List<Freight> getFreightDatabase() {
		return freightDatabase;
	}

	public void setFreightDatabase(List<Freight> freightRepo) {
		this.freightDatabase = freightRepo;
	}
	
	

}
