package com.glo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.glo.model.Customer;
import com.glo.repository.CustomerRepo;

@Service
public class CustomerService {
	@Autowired
	CustomerRepo customerRepo;

	
	public Customer save(Customer customer)
	{
		return customerRepo.save(customer);
	}
}
