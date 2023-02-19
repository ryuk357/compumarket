package com.compumarket.compumarket.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee extends Person {
	
	//attributes
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private boolean isAdmin;
	@ManyToOne
	@JoinColumn(name="employee_id")
	private Agency agency;
	@OneToMany(mappedBy = "employee")
	private List<Quote> quotes;
 	
	
	//constructor
	public Employee() {}
	
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
	
	public List<Quote> getQuotes(){
		return this.quotes;
	}
	
	public void setQuotes(List<Quote> quotes) {
		this.quotes = quotes;
	}
	
	public Agency getAgency() {
		return this.agency;
	}
	
	public void setAgency(Agency agency) {
		this.agency = agency;
	}
}

