package com.synechron.trainings.java18.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class MapStreamDemo {

	
	public static void main(String[] args) {
		Map<Integer, String> mp = new HashMap<Integer, String>();
		
		mp.put(1, "AGAG");
		mp.put(2, "ww");
		mp.put(3, "A22GAG");
		mp.put(4, "333dd");
		
		Stream<Entry<Integer, String>> stream1 = mp.entrySet().stream();
		
		stream1.forEach(System.out :: println);
		//PRINT ONLY KEY AND ONLY VALUE USING ::
		
		Stream<Integer> keys = mp.keySet().stream();
		Stream<String> values = mp.values().stream();
		
		keys.forEach(System.out :: println);
		values.forEach(System.out :: println);
		
		
	}
}
