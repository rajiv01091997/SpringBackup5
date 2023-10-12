package com.glo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.glo.model.Customer;
import com.glo.service.CustomerService;

@Component
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	public Customer save(Customer customer)
	{
		return customerService.save(customer);
	}
	

}
