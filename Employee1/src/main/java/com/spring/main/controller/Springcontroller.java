package com.spring.main.controller;



import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.main.model.Employee;
import com.spring.main.service.Empservice;


@RestController
//@Controller
public class Springcontroller {
	
	@Autowired
	public Empservice service;
	
	@RequestMapping(value={"welcome", "/"},method= RequestMethod.GET)
	public String welcomepage(){
		System.out.println("homepage");
		return "welcome";
		
	
	}
	@RequestMapping(value="add",method= RequestMethod.GET)
	public String addemp(){
		
		return "addemp";
		
		
	}
	@RequestMapping(value="add1",method= RequestMethod.GET)
	public String saveEmployee(HttpServletRequest request ,ModelMap model){
		int id=Integer.parseInt(request.getParameter("id"));
		String dept=request.getParameter("dept");
		String name=request.getParameter("name");
		float sal=Float.parseFloat(request.getParameter("salary"));
		Employee e=new Employee(id,name,sal, dept);
		service.saveEmp(e);
		return "empadded";
		
	}
	@RequestMapping(value={"del"},method= RequestMethod.GET)
	public String delemp(){
		
		return "empdel";
		
	}
	
	@RequestMapping(value="delete",method = RequestMethod.GET)
	public String delete(HttpServletRequest request){
		int id=Integer.parseInt(request.getParameter("id"));
		service.deleteEmp(id);
		return "empdell";
		
	}


	@RequestMapping(value="getbyid",method= RequestMethod.GET)
	public String getempId(){
		
		return "empinfo";
		
	}
	
	@RequestMapping(value="get2",method = RequestMethod.GET)
	public String getempinfo(HttpServletRequest request,ModelMap model){
		int id=Integer.parseInt(request.getParameter("id"));
		Employee e=service.getEmpById(id);
		model.addAttribute("e",e);
		return "empee";
		
	}
	
	@RequestMapping(value="get",method= RequestMethod.GET)
	public String getemp(ModelMap model){
		List<Employee> ls=service.getallEmps();
		model.addAttribute("ls",ls);
		return "empinfoall";
		
	}

	
	@RequestMapping(value="range",method= RequestMethod.GET)
	public String range(){
		
		return "emprange";
		
		
	}
	@RequestMapping(value="empran",method= RequestMethod.GET)
	public String emprange(HttpServletRequest request,ModelMap model){
		float a=Float.parseFloat(request.getParameter("sal1"));
		float b=Float.parseFloat(request.getParameter("sal2"));
		List<Employee> lst2=service.findempinrange(a,b);
		model.addAttribute("lst2",lst2);
		return "empdisp";
		
	}
	@RequestMapping(value="empname/{name}",method= RequestMethod.GET)
	public Employee empname(@PathVariable("name") String name){
//		float a=Float.parseFloat(request.getParameter("sal1"));
//		float b=Float.parseFloat(request.getParameter("sal2"));
		//Employee lst=service.findname(name);
		//model.addAttribute("lst2",lst2);
		return this.service.findname(name);
		
	}
	
	
}
