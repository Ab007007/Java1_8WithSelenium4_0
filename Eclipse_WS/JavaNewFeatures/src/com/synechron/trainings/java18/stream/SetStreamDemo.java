package com.synechron.trainings.java18.stream;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class SetStreamDemo {

	
	public static void main(String[] args) {
		Set<Integer> al = new HashSet<Integer>();
		
		al.add(25);
		al.add(55);
		al.add(89);
		
		Stream<Integer> stream1 = al.stream();
		
		stream1.forEach(System.out :: println);
	}
}
