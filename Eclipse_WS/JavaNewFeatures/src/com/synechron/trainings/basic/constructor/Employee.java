package com.synechron.trainings.basic.constructor;

public class Employee extends Person
{
	String empID;
	String companyName;
	
	
	@Override
	public void printInfo() {
		
		super.printInfo();
		System.out.println(this.empID);
		System.out.println(this.companyName);
		
	}
	public static void main(String[] args) {
		Employee e1 = new Employee();
		
		e1.name = "emp1";
		e1.age = 38;
		e1.companyName = "synechron";
		e1.empID = "emp123";
		
		e1.printInfo();
	}
}
