package com.synechron.trainings.java18.dc;

public class DobuleColonDemo {
	
	static void printMyName() {
		System.out.println("My name is Aravind");
	}
	
	public static void main(String[] args) {
		Testable tb = DobuleColonDemo ::printMyName;
		
		tb.printName();
	}

}
