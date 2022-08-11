package com.synechron.trainings.java18.innerclasses;

import com.synechron.trainings.basic.interfaces.PrintName;

public class GenericApproach 
{
	public static void main(String[] args) {
		MyImp mp = new MyImp();
		mp.printUserName();
	}

}


class MyImp implements PrintName
{
	
	@Override
	public void printUserName() {
		System.out.println("Generic way");
	}
}