package com.synechron.trainings.java18.lambda;

import com.synechron.trainings.basic.interfaces.PrintInfo;
import com.synechron.trainings.basic.interfaces.PrintName;

public class LambdaExpressionsWithArguments {

	public static void main(String[] args) {
		PrintName pn = () -> System.out.println("My New Lambda expression");
		pn.printUserName();
	
		
		PrintInfo pInfo = (String n, int a) ->{
			System.out.println("Name : " + n + " and Age : " + a);
			if(a>=18) {
				System.out.println("Eligible for Applying DL");
			}
			else {
				System.out.println("your age is too low to apply DL, wait for " + (18-a));
			}
		};
		
		pInfo.printUserInfo("aravinda", 38);
		pInfo.printUserInfo("harry", 35);
		pInfo.printUserInfo("nandish", 40);
		pInfo.printUserInfo("girish", 88);
		pInfo.printUserInfo("vikram", 8);
	}
}
