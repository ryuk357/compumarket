package com.compumarket.compumarket.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.compumarket.compumarket.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
