package com.synechron.trainings.java18.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.jws.soap.SOAPBinding;

public class StreamDemo {
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		
		al.add(25);
		al.add(55);
		al.add(89);
		al.add(225);
		al.add(515);
		al.add(25);
		al.add(55);
		al.add(89);
		al.add(225);
		al.add(515);
		al.add(893);
		al.add(255);
		al.add(558);
		al.add(897);
		
		Stream<Integer> stream1 = al.stream();
		
		//stream1.forEach(System.out :: println);
		
		List<Integer> result = stream1.filter(new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				return t<250;
			}
		}).collect(Collectors.toList());
		System.out.println("less thatn 250");
		System.out.println(result);
		
		Stream<Integer> lambdaStream = al.stream();
		List<Integer> above250 = lambdaStream.filter(ele -> ele> 250).collect(Collectors.toList());
		System.out.println("Above 250");
		above250.forEach(System.out :: println);
		
		
		Stream<Integer> evenNumberStream = al.stream();
		List<Integer> evnum = evenNumberStream.filter(ele -> ele % 2 == 0).collect(Collectors.toList());
		System.out.println("Even numbers ");
		evnum.forEach(System.out :: println);
		
		
		Stream<Integer> oddNumberStream = al.stream();
		List<Integer> odnum = oddNumberStream.filter(ele -> ele % 2 != 0).collect(Collectors.toList());
		System.out.println("Odd numbers ");
		odnum.forEach(System.out :: println);
		
		
		System.out.println("Total Elments in list " + al.size());
		
		
		List<Integer> uniqueElements = al.stream().distinct().collect(Collectors.toList());
		System.out.println("Total Unique Elments in list " + uniqueElements.size());
		uniqueElements.forEach(System.out :: println);
		
		
		Optional<Integer> numb = al.stream().filter(ele -> ele>500).findFirst();
		
		System.out.println(numb.isPresent());
	
		Optional<Integer> numb2 = al.stream().filter(ele -> ele>1500).findFirst();
		
		System.out.println(numb2.isPresent());
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
