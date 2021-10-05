package com.spring.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.main.model.Employee;

@Service
public class Empservice {

	@Autowired
	public Empdao dao;
	
	public Employee saveEmp(Employee e) {
		return dao.save(e);
		
	}
	public List<Employee> saveEmps(List<Employee> emps){
		return dao.saveAll(emps);
		
		
	}
	
	public List<Employee> getallEmps()
	{
		//return dao.findAll();
		return dao.getalluser();
	}
	public Employee getEmpById(int id) {
		return dao.getById(id);
		
	}
	public Employee getEmpByName(String name) {
		return dao.getByName(name);
		
	}
	
	public String deleteEmp(int id) {
		dao.deleteById(id);
		return "Employee Removed"+id;
		
	}
	public List<Employee> findempinrange(float sal1,float sal2){
		
		return dao.findBySalaryBetween(sal1,sal2);
		
	}
	public Employee findname(String name) {
		
		return dao.getByName(name);
		
	}
}
