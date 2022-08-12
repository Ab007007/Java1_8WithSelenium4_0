package com.synechron.trainings.java18.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamArray {

	public static void main(String[] args) {
		int[] marks = {55,33,55,66,88,99,125};
		IntStream stream1 = Arrays.stream(marks);
		
		stream1.forEach(System.out :: println);
		
		
	}
}
