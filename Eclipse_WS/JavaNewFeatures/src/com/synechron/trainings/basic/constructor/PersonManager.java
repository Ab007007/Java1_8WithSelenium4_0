package com.synechron.trainings.basic.constructor;

public class PersonManager {

	public static void main(String[] args) {
		Person p = new Person();
		
		System.out.println(p.name);
		p.name = "aravinda";
		p.age = 38;
		
		System.out.println(p.name);
		
		
		
		Person p1 = new Person("harry", "ahaha@dfd.com",25,56565);
		
		
		System.out.println(p1.name);
	}
}
