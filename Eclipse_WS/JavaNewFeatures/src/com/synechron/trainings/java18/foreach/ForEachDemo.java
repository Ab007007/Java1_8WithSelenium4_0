package com.synechron.trainings.java18.foreach;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachDemo {

	
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		
		al.add(25);
		al.add(55);
		al.add(89);
		
		ListConsumer lc = new ListConsumer();
		
		al.forEach(lc);
	}
}

class ListConsumer implements Consumer<Integer>
{

	@Override
	public void accept(Integer t) 
	{
		System.out.println("Consume : " + t);		
	}
	
}
