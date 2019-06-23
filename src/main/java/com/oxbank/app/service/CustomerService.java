package com.oxbank.app.service;


import com.oxbank.app.exception.CustomerAlreadyExistsException;
import com.oxbank.app.model.CustomerDetails;

public interface CustomerService {
	
	public CustomerDetails addUser(CustomerDetails customerDetails)throws CustomerAlreadyExistsException;
	
	
	

}
