package com.synechron.trainings.java18.innerclasses;

import com.synechron.trainings.basic.interfaces.PrintName;

public class LocalInnerClass {
	
	
	public static void main(String[] args) {
		
		class LocalImplementation implements PrintName
		{
			@Override
			public void printUserName() {
				System.out.println("local inner class");
				
			}
		}
		
		LocalImplementation limp = new LocalImplementation();
		limp.printUserName();
	}	
}
