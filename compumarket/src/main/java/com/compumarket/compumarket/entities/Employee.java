package com.compumarket.compumarket.entities;

import javax.persistence.Entity;

@Entity
public class Employee extends Person {
	
	//attributes
	private boolean isAdmin;
	
	//constructor
	public Employee(boolean bool) {
		super();
		this.isAdmin = bool;
	}
	
	//getters & setters
	public Boolean isAdmin() {
		return this.isAdmin;
	}
	
	public void isAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	
}
