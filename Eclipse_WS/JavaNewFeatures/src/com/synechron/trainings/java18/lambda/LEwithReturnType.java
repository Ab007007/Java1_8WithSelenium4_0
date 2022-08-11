package com.synechron.trainings.java18.lambda;

import com.synechron.trainings.basic.interfaces.GetCompanyInterface;

public class LEwithReturnType {
	
	public static void main(String[] args) {
		GetCompanyInterface gc = () -> "Synechron" ;
		
		String cn = gc.getCompanyName();
		System.out.println("employee  belongs to " + cn);
		
	}

}
