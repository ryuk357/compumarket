package com.compumarket.compumarket.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.compumarket.compumarket.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
