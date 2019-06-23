package com.oxbank.app.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringRunner;

import com.oxbank.app.exception.CustomerAlreadyExistsException;
import com.oxbank.app.model.CustomerDetails;
import com.oxbank.app.repository.CustomerRepository;
import com.oxbank.app.serviceImpl.CustomerServiceImpl;

@RunWith(SpringRunner.class)
public class CustomerServiceTest {
	
	@InjectMocks
	CustomerServiceImpl customerServiceImpl;
	
	@Mock
	CustomerRepository customerRepository;
	
	private CustomerDetails customer;
	
	
	@Before
	public void setUp()
	{
		MockitoAnnotations.initMocks(this);
		customer = new CustomerDetails();
		
	}
	
	@After
	public void tearDown()
	{
		customer = null;
	}
		
	@Test
	public void testaddUser() throws CustomerAlreadyExistsException {
		when(customerRepository.save(customer)).thenReturn(customer);
		CustomerDetails fetchCustomer = customerServiceImpl.addUser(customer);
		assertEquals(fetchCustomer, customer);
		verify(customerRepository, times(1)).save(customer);
	}
	
	

}
