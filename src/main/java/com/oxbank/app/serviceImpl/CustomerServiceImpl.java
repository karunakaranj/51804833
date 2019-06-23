package com.oxbank.app.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oxbank.app.exception.CustomerAlreadyExistsException;
import com.oxbank.app.model.CustomerDetails;
import com.oxbank.app.repository.CustomerRepository;
import com.oxbank.app.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	@Override
	public CustomerDetails addUser(CustomerDetails customerDetails) throws CustomerAlreadyExistsException {
		CustomerDetails customer = customerRepository.save(customerDetails);
		if (customer == null) {
			return null;
		} else {
			return customer;
		}

}
}
