package com.compumarket.compumarket.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.compumarket.compumarket.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
