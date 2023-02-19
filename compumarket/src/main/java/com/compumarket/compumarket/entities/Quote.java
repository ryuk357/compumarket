package com.compumarket.compumarket.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="quote")
public class Quote {

	//attributes
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private Date date;
	private int rate;
	@ManyToOne
	@JoinColumn(name="customer_id")
	private Customer customer;
	@ManyToOne
	@JoinColumn(name="employee_id")
	private Employee employee;
	@ManyToMany(mappedBy = "quotes")
    private List<Product> products;
	
	
	//constructor
	public Quote() {}
	
	public Quote(Date date, int rate) {
		this.date = date;
		this.rate = rate;
	}
	
	//getters & setters 
	
	public Date getDate() {
		return this.date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public int getRate() {
		return this.rate;
	}
	
	public void setRate(int rate) {
		this.rate = rate;
	}
	
	public Customer getCustomer() {
		return this.customer;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public Employee getEmployee() {
		return this.employee;
	}
	
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public List<Product> getProducts(){
		return this.products;
	}
	
	public void setProducts(List<Product> products) {
		this.products = products;
	}
}
