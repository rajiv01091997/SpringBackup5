package com.glo.service;

import java.util.List;

import com.glo.model.Freight;

public interface Service {

	public void save(Freight frieght);
	public List<Freight> getAll();
	public Freight findByid(int id);

}
