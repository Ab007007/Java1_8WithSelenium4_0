package com.synechron.trainings.java18.coll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;


public class ExtendedFunctioninSort {

	
	public static <T> void main(String[] args) {
		// create a integer list and print all the values
		List<Integer> al  = new ArrayList<Integer>();
		al.add(53);
		al.add(52);
		al.add(55);
		al.add(50);
		al.add(51);
		al.add(54);
		System.out.println("Before sorting "  +al);
//		al.sort(new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return o1.compareTo(o2);
//			}
//		});
//		
//		System.out.println("After sorting "  +al);
		
		
		al.sort((ele1, ele2) -> ele1.compareTo(ele2));
		System.out.println("After sorting "  +al);
	}
}
