package com.glo.Service;

import java.util.List;

import com.glo.model.Freight;

public interface ServiceInterface {
	
	public void save(Freight frieght);
	public List<Freight> getAll();

}
