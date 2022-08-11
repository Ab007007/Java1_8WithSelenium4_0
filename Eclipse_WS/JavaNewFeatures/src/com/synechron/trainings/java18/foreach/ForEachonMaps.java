package com.synechron.trainings.java18.foreach;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class ForEachonMaps {
	public static void main(String[] args) {
		Map<Integer, String> mp = new HashMap<Integer, String>();
		mp.put(1, "Emp123");
		mp.put(2, "Emp124");
		mp.put(3, "Emp125");
		mp.put(4, "Emp126");
		mp.put(5, "Emp127");
		BiImplementation bi = new BiImplementation();
		mp.forEach(bi);
	}
}

class BiImplementation implements BiConsumer<Integer, String>
{

	@Override
	public void accept(Integer t, String u) {
		
		System.out.println("Key : " + t  + " Value : " + u);
		
	}
	
}