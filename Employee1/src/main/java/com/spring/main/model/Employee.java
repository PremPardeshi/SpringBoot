package com.spring.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="Employee",uniqueConstraints={@UniqueConstraint(columnNames = { "id" })})
public class Employee {
@Id
@Column(length=20)
int id;
@Column(length=20)
String name;
@Column(length=20)
public
float salary;
@Column(length=20)
String Dept;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int id, String name, float salary, String dept) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	Dept = dept;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
public String getDept() {
	return Dept;
}
public void setDept(String dept) {
	Dept = dept;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary
			+ ", Dept=" + Dept + "]";
}


}