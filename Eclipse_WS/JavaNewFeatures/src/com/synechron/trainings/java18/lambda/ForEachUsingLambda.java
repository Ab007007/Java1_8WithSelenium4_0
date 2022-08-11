package com.synechron.trainings.java18.lambda;

import java.util.ArrayList;

public class ForEachUsingLambda {
	
	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Harry");
		names.add("Vkey");
		names.add("Shivu");
		names.add("Giri");
		names.add("Nandish");

		names.forEach((ele) -> {
			System.out.println("From Lambda -> " + ele);
		});
	
	}
}
