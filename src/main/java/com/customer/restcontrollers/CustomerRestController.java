package com.customer.restcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.entities.Customer;
import com.customer.exception.CustomerErrorResponse;
import com.customer.exception.CustomerNotFoundException;
import com.customer.repository.CustomerRepository;

@RestController
public class CustomerRestController {

	@Autowired CustomerRepository cRepo;
	
	@GetMapping("/store")
	public void store() {
		
		System.out.println("Working...");
		
	Customer c1 = new Customer("Chota", "Ronaldo", 109, "Baroda", "India"
			, Long.valueOf("441616464949"), "parthiv@gmail.com", "sadjaksjd");
	
			
	cRepo.save(c1);
		

	}
	
	
	
	@GetMapping("/customer")
	public void getCustomer() {
		
		Customer c1 = cRepo.findByFirstName("kaka");
		
		if(c1 == null)
			throw new CustomerNotFoundException("Customer with first name not found");
		
		System.out.println(c1.getLastName());
	}
	
	
	
}
