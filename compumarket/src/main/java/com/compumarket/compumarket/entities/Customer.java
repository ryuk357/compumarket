package com.compumarket.compumarket.entities;

import javax.persistence.Entity;

@Entity
public class Customer extends Person {
	
	//attributes
	private String address;
	private String email;
	
	//constructor
	public Customer(String address, String email) {
		super();
		this.address = address;
		this.email = email;
	}
	
	//Getters & Setters
	public String getAddress() {
		return this.address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
}
