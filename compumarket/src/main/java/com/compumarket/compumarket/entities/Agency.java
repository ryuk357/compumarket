package com.compumarket.compumarket.entities;

import javax.persistence.Entity;

@Entity
public class Agency {
	
	//attributes
	private String name;
	private String address;
	
	//constructor
	
	public Agency(String name, String address) {
		this.address = address;
	}
	
	//getters & setters
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void setAddress(String address) {
		this.address = address; 
	}
}
