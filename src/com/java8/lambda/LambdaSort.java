package com.java8.lambda;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class LambdaSort {
	
	public static void main(String[] args) {
		
	PersonInfo p1 = new PersonInfo("Yashaswini","Reddy","23","7000$");
	PersonInfo p2 = new PersonInfo("Mamatha","Nalla","45","3000$");
	
	List<PersonInfo> listAll=new ArrayList<PersonInfo>();
	listAll.add(p1);
	listAll.add(p2);
	
	// Before Sorting
	
	System.out.println("Persons details before sorting based on FirstName:");
	PrintAll(listAll);
	
	System.out.println("\n" + "Persons details before sorting based on LastName:");
	PrintAll(listAll);
	
	System.out.println("\n" + "Persons details before sorting based on Age:");
	PrintAll(listAll);	
	
	System.out.println("\n" + "Persons details before sorting based on Salary:");
	PrintAll(listAll);
	
	// After Sorting (UsingLambdaExpression)
	
	Collections.sort(listAll,(o1,o2)-> o1.getFirstName().compareTo(o2.getFirstName()));
	System.out.println("\n" + "Persons details after sorting based on FirstName:");
	PrintAll(listAll);	
	
	Collections.sort(listAll,(o1,o2)-> o1.getLastName().compareTo(o2.getLastName()));
	System.out.println("\n" + "Persons details after sorting based on LastName:");
	PrintAll(listAll);
	
	Collections.sort(listAll,(o1,o2)-> o1.getAge().compareTo(o2.getAge()));
	System.out.println("\n" + "Persons details after sorting based on Age:");
	PrintAll(listAll);	
	
	Collections.sort(listAll,(o1,o2)-> o1.getSalary().compareTo(o2.getSalary()));
	System.out.println("\n" + "Persons details after sorting based on Salary:");
	PrintAll(listAll);	

	}

	private static void PrintAll(List<PersonInfo> listAll) {
		
		for(PersonInfo personInfo:listAll)
		{
			System.out.println(personInfo);
		}
	}

}