package com.oxbank.app.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oxbank.app.model.LoanDetails;
import com.oxbank.app.repository.LoanDetailsRepository;
import com.oxbank.app.service.LoanAccountService;

@Service
public class LoanAccountServiceImpl implements LoanAccountService{
	
	@Autowired
	LoanDetailsRepository loanDetailsRepository;

	@Override
	public LoanDetails appoveById(int id) {
		
		LoanDetails loan = loanDetailsRepository.getOne(id);
		
		
		
		return null;
	}
	
	

}
