package com.synechron.trainings.java18.coll;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;


public class ExtendedFunctioninList {

	
	public static void main(String[] args) {
		// create a integer list and print all the values
		List<Integer> al  = new ArrayList<Integer>();
		al.add(50);
		al.add(51);
		al.add(52);
		al.add(53);
		al.add(54);
		al.add(55);
		
		
		Iterator<Integer> it =  al.iterator();
		it.forEachRemaining(System.out :: println);
		
		
		al.removeIf(ele -> (ele % 5 ==0));
		System.out.println("Element after remove");
		System.out.println(al);
		
		UnaryOperator<Integer> opt = new UnaryOperator<Integer>() {

			@Override
			public Integer apply(Integer t) {
				return t * 100;
			}
		};
		al.replaceAll(opt);
		
		System.out.println("Element after replace");
		System.out.println(al);
		
		al.replaceAll(ele -> (ele/100));
		
		System.out.println("LAMBDA" + al);
	}
}
