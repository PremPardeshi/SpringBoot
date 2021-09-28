package com.spring.main.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.main.model.Employee;

public interface Empdao extends JpaRepository<Employee,Integer>  {

	Employee getByName(String name);

	List<Employee> findBySalaryBetween(float sal1, float sal2);

}
