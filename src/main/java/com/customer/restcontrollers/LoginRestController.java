package com.customer.restcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.customer.beans.Authentication;
import com.customer.beans.UserBean;
import com.customer.entities.User;
import com.customer.repository.UserRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class LoginRestController {

	private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
	
	@Autowired UserRepository userRepo;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/hi")
	public UserBean store() {
		
		return new UserBean("tushar", "ADMIN");
		
		
	
	}
	
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/login")
	public Authentication login() {
		
		return new Authentication("You are authenticated.");
}
	
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/register")
	public void register(@RequestBody User u) {
		
		u.setPassword(encoder.encode(u.getPassword()));
		
		userRepo.save(u);
		

		
	
		
	}
	
	
	
	
	
}
