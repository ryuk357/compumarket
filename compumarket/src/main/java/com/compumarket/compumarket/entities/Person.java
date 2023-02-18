package com.compumarket.compumarket.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

public abstract class Person {
	//attributes
	
	private String firstName;
	private String lastName;
	
	
	//getters & setters
	
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
}
