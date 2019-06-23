package com.oxbank.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oxbank.app.model.CustomerDetails;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerDetails, Integer>{



}
