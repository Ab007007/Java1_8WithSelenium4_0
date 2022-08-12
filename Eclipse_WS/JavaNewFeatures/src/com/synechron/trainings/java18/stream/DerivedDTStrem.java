package com.synechron.trainings.java18.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DerivedDTStrem {

	
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("AHB3" , 222552));
		employees.add(new Employee("AHB5" , 225252));
		employees.add(new Employee("AHB1" , 3225252));
		employees.add(new Employee("AHB2" , 1225252));
		employees.add(new Employee("AHB4" , 4225252));
		List<Employee> empSorted = employees.stream().sorted( (emp1, emp2) -> emp1.getName().compareTo(emp2.getName()))
				.collect(Collectors.toList());
		
		empSorted.forEach(System.out :: println);
		
		List<Employee> empSortedsal = employees.stream().sorted( (emp1, emp2) -> emp1.getSalary().compareTo(emp2.getSalary()))
				.collect(Collectors.toList());
		
		empSortedsal.forEach(System.out :: println);
		
	}
}
