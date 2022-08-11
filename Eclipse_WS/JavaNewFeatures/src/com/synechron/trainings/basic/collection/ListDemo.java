package com.synechron.trainings.basic.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	
	public static void main(String[] args) 
	{
		List al = new ArrayList();
		
		al.add("Aravinda");
		al.add(38);
		al.add(5.8);
		
		System.out.println("Total elments in collection " + al.size());
		
		System.out.println(al.get(0));
		
		
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println("---------------------------------------------");
		
		for (Object object : al) {
			System.out.println(object);
		}
		
		System.out.println("******************************");
		Iterator it = al.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}
}
