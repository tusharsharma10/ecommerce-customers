package com.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(CustomerApplication.class, args);
	
//		String arr[] = {"customerId","firstName","lastName","phone","emailId","password"};
//		
//		jsonCreate(arr);
	
	
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
	
}
