package com.customer.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "CUSTOMER")
@ApiModel("Customers details")
//@JsonIgnoreProperties(value= {"password"}) (Avoid hard coded approach)
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long customerId;

	@NotNull
	private String firstName;
	@NotNull
	private String lastName;

	 @Min(value = 2, message = "Value should be more than 2")
	 @ApiModelProperty("Value should be more than 2")
	private Integer houseNum;

	private String billingAddress;
	private String city;
	private String state;
	private Integer postalCode;
	private String country;
	@NotNull
	private Long phone;
	@NotNull
	private String emailId;
	@NotNull
	@JsonIgnore
	private String password;
	
	
	
	
	
	public Customer() {
	}
	
	
	
	
	public Customer( @NotNull String firstName, @NotNull String lastName,
			@Min(value = 2, message = "Value should be more than 2") Integer houseNum, String city, String country,
			@NotNull Long phone, @NotNull String emailId, @NotNull String password) {
		super();
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.houseNum = houseNum;
		this.city = city;
		this.country = country;
		this.phone = phone;
		this.emailId = emailId;
		this.password = password;
	}




	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Integer getHouseNum() {
		return houseNum;
	}

	public void setHouseNum(Integer houseNum) {
		this.houseNum = houseNum;
	}

	public String getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(Integer postalCode) {
		this.postalCode = postalCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

	
	
	
}
