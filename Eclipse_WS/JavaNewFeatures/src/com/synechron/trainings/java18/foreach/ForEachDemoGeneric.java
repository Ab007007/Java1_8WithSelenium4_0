package com.synechron.trainings.java18.foreach;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachDemoGeneric {

	
	public static void main(String[] args) {
		List al = new ArrayList();
		
		al.add(25);
		al.add(55);
		al.add(89);
		al.add("DFASDF");
		al.add(true);
		
		ListConsumer1 lc = new ListConsumer1();
		
		al.forEach(lc);
	}
}

class ListConsumer1 implements Consumer
{

	@Override
	public void accept(Object t) {
		// TODO Auto-generated method stub
		System.out.println("Consume : " + t);	
	}

	
}
