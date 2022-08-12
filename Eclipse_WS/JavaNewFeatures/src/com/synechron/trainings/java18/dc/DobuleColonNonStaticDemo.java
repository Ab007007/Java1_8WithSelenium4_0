package com.synechron.trainings.java18.dc;

public class DobuleColonNonStaticDemo {
	
	void printMyName() {
		System.out.println("My name is Aravind");
	}
	
	public static void main(String[] args) {
		DobuleColonNonStaticDemo dcd = new DobuleColonNonStaticDemo();
		Testable tb = dcd ::printMyName;
		
		tb.printName();
	}

}
