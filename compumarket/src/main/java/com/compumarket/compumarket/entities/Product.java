package com.compumarket.compumarket.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="product")
public class Product {
	
	//attributes
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private float price;
	@ManyToOne
	@JoinColumn(name="category_id")
	private Category category;
	@ManyToMany
	@JoinTable(name = "product_quote",
		joinColumns = @JoinColumn(name = "quote_id", referencedColumnName = "id" ),
		inverseJoinColumns = @JoinColumn(name = "product_id",
		referencedColumnName = "id"))
	private List<Quote> quotes;
	
	//constructor
	public Product() {}
	
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
	
	public List<Quote> getQuotes(){
		return this.quotes;
	}
	
	public void setQuotes(List<Quote> quotes) {
		this.quotes = quotes;
	}
	
	public Category getCategory() {
		return this.category;
	}
	
	public void setCategory(Category category) {
		this.category = category;
	}
}
