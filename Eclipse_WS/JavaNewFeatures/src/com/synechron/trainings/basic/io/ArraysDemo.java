package com.synechron.trainings.basic.io;

public class ArraysDemo {

	public static void main(String[] args) {
		
		
		int[] marks = new int[6];
//		int marks[] ;
		
		for (int i = 0; i < marks.length; i++)
		{
			marks[i] = 100 + i;
		}
		
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}
	}
}
