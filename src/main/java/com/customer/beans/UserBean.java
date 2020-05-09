package com.customer.beans;

public class UserBean {

	private String username;
	
	private String password;
	
	private String role;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public UserBean(String username, String role) {
		this.username = username;
		this.role = role;
	}

	public UserBean() {
	}
	
	
	
	
}
