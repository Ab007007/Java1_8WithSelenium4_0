package com.synechron.trainings.java18.innerclasses;

import com.synechron.trainings.basic.interfaces.PrintName;

public class AnnoymousInnerClass {

	public static void main(String[] args) {
		
		PrintName pn = new PrintName() {
			
			@Override
			public void printUserName() {
				System.out.println("AIC");
			}
		};
		
		pn.printUserName();
	}
}
