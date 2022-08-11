package com.synechron.trainings.java18.innerclasses;

import com.synechron.trainings.basic.interfaces.PrintName;

public class StaicInnerClassDemo {

	static class ImplementName implements PrintName
	{
		@Override
		public void printUserName() {
			System.out.println("From inner class");
			
		}
	}
	
	
	public static void main(String[] args) {
		
		ImplementName in = new ImplementName();
		in.printUserName();
	}
	
	
	public static void test() {
		ImplementName in = new ImplementName();
		in.printUserName();
	}
}
