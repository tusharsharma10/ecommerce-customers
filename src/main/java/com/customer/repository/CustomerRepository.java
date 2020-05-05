package com.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.customer.entities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

	
	public Customer findByFirstName(String name);
}
