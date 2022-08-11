package com.synechron.trainings.basic.constructor;

public class Person 
{
	public String name;
	public String email;
	public int age;
	public int mobile;
	
	
	public void printInfo() {
		System.out.println("Details : \n Name :  " + this.name +
				" Email :  " + this.email);
	}
	
	public Person()
	{
		System.out.println("####################");
		System.out.println("Object Created");
	}
	
	
	public Person(String name, String email,int age, int mobile)
	{
		this.name = name;
		this.email = email;
		this.age = age;
		this.mobile = mobile;
	}

}
