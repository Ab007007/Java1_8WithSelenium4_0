package com.synechron.trainings.java18.lambda;

import com.synechron.trainings.basic.interfaces.PrintName;

public class LambdaExpressionsWithMulitpleLine {

	public static void main(String[] args) {
		PrintName pn = () -> {
			System.out.println("-------------------------");
			System.out.println("My New Lambda expression");
			System.out.println("--------------------------");
		};
		pn.printUserName();
	
	}
}
