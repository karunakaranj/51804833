package com.oxbank.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oxbank.app.model.LoanDetails;

@Repository
public interface LoanDetailsRepository extends JpaRepository<LoanDetails,Integer>{

}
