package com.compumarket.compumarket.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer extends Person {
	
	//attributes
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String address;
	private String email;
	@OneToMany(mappedBy = "customer")
	private List<Quote> quote; 
	
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
