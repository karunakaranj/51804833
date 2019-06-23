package com.oxbank.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oxbank.app.exception.CustomerAlreadyExistsException;
import com.oxbank.app.model.CustomerDetails;
import com.oxbank.app.service.CustomerService;

@RestController
@RequestMapping("/personalloan")
public class CustomerController {
	
	
	@Autowired
	CustomerService customerService;
	
	@PostMapping("/save")
	public CustomerDetails addUser(@RequestBody CustomerDetails customer) throws CustomerAlreadyExistsException
	{
		return customerService.addUser(customer);
	}
	
	

}
