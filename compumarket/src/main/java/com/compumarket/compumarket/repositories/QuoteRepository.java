package com.compumarket.compumarket.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.compumarket.compumarket.entities.Quote;

public interface QuoteRepository extends JpaRepository<Quote, Integer>{

}
