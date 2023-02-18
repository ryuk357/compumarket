package com.compumarket.compumarket.entities;

import javax.persistence.Entity;

@Entity
public class Category {
	
	//attributes
	private String name;
	
	//constructor
	public Category(String name) {
		this.name = name;
	}
	//getters & setters
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
