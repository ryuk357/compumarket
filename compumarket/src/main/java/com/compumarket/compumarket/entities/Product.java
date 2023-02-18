package com.compumarket.compumarket.entities;

import javax.persistence.Entity;

@Entity
public class Product {
	
	//attributes
	private String name;
	private float price;
	
	//constructor
	public Product(String name, float price) {
		this.name = name;
		this.price = price;
	}
	
	//Getters & setters
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public float getPrice() {
		return this.price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
}
