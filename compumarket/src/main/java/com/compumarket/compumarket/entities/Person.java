package com.compumarket.compumarket.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

public abstract class Person {
	//attributes
	@Column(nullable = false)
	private String login;
	@Column(nullable = false)
	private String firstName;
	@Column(nullable = false)
	private String lastName;
	@Column(nullable = false)
	private String pwd;
	
	
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
	
	public String getPwd() {
		return pwd;
	}
	
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
