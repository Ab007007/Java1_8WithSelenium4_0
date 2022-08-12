package com.synechron.trainings.java18.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class TimeDemo {

	
	public static void main(String[] args) {
		LocalDate currentdate = LocalDate.now();
		System.out.println("current date : " + currentdate);
		System.out.println(LocalDate.of(2014, 12, 2));
		
		System.out.println("Current tiime " + LocalTime.now());
		System.out.println("Current time Zone " + LocalTime.now(ZoneId.of("America/Anchorage")));
		System.out.println("Current time Zone " + LocalDateTime.now(ZoneId.of("America/Anchorage")));
	}
}
