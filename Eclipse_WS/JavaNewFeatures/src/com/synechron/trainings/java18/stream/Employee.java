package com.synechron.trainings.java18.stream;

public class Employee {

	private String name;
	private Integer salary;
	
	public Employee(String name , Integer salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	
	public String toString() {
		
		return "Employee Name " + this.name + " and Employee Salary : " +  this.salary;
	}
	
}
