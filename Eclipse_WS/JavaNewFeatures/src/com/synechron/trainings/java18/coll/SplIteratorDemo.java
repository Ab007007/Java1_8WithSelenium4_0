package com.synechron.trainings.java18.coll;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class SplIteratorDemo 
{
	public static void main(String[] args) 
	{
		List<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < 100; i++) 
		{
			al.add(i);
			
		}
		
		Spliterator<Integer> it = al.spliterator();
		Spliterator<Integer> childIt = it.trySplit();
		
		it.forEachRemaining(ele -> System.out.println("Main iterator " + ele));
		childIt.forEachRemaining(ele -> System.out.println("Child iterator " + ele));
		
		
		
	}

}
