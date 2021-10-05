package com.spring.main.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;


import com.spring.main.model.Employee;

public interface Empdao extends JpaRepository<Employee,Integer>  {

	@Query(value="select * from Employee where name= ?",nativeQuery = true)
	Employee getByName(String name);

	List<Employee> findBySalaryBetween(float sal1, float sal2);
	
	@Query(value="select * from Employee",nativeQuery = true)
	List<Employee> getalluser();
	

}
