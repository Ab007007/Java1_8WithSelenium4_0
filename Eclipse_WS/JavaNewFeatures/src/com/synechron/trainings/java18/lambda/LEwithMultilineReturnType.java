package com.synechron.trainings.java18.lambda;

import com.synechron.trainings.basic.interfaces.GetCompanyInterface;

public class LEwithMultilineReturnType {
	
	public static void main(String[] args) {
		GetCompanyInterface gc = () ->{
			return "Synechron" ;
		};
		
		String cn = gc.getCompanyName();
		System.out.println("employee  belongs to " + cn);
		
	}

}
