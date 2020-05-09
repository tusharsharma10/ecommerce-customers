package com.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.customer.entities.User;
import com.customer.repository.UserRepository;


@SpringBootApplication
//@EnableDiscoveryClient
public class CustomerApplication {

	
	public static void main(String[] args) {
		
		SpringApplication.run(CustomerApplication.class, args);
		
	
	}
	
	
	
	public static String jsonCreate(String args[]) {
		
		StringBuilder  json = new StringBuilder();
		json.append("{").append("\n");
		
		for(int i=0;i<args.length;i++) {
			
			json.append("\"").append(args[i]).append("\"").append(":").append("\"\"").append("\n");
			
		}
		
		json.append("}");
		
		System.out.println(json.toString());
		
		return json.toString();
		
	}
	
	public static void passwordGen() {
		 BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
			
			String password = 	encoder.encode("password");
			
			System.out.println(password);
	}
	
}
