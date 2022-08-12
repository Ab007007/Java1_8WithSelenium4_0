package com.synechron.trainings.java18.coll;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEachRemainingDemo {

	
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		names.add("AHB");
		names.add("KLG");
		names.add("KLH");
		names.add("TPS");
		names.add("TSP");
		names.add("NBS");
		
		
		
		Iterator<String> it = names.iterator();
		//it.forEachRemaining(ele -> System.out.println("Element " + ele));
	
		//System.out.println
		it.forEachRemaining(System.out :: println);
	}
	
}
