package com.synechron.trainings.java18.dc;

public class MethodAssignWithArgs {

	static void addition(int a , int b)
	{
		System.out.println("sum of two numbers is : " + (a + b) );
	}

	public static void main(String[] args) {
		Summable sm = MethodAssignWithArgs :: addition;
		
		sm.sum(55, 55);
	}
}


