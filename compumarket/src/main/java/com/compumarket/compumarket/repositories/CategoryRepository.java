package com.compumarket.compumarket.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.compumarket.compumarket.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
