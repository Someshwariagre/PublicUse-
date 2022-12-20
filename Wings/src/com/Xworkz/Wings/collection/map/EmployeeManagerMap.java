package com.Xworkz.Wings.collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class EmployeeManagerMap {
public static void main(String[] args) {
	Manager shambu = new Manager();
	shambu.setName("Shambu");
	shambu.setId("m01");
	
	Manager sharat = new Manager();
	sharat.setName("Sharat");
	sharat.setId("m02");
	
	Employee bharat = new Employee();
	bharat.setName("Bharat");
	bharat.setId("e01");
	
	Employee sampatti = new Employee();
	sampatti.setName("Sampathi");
	sampatti.setId("e02");
	
	ArrayList<Employee> employeeList1 = new ArrayList();
	employeeList1.add(sampatti);
	employeeList1.add(bharat);
	
	Employee santosh = new Employee();
	santosh.setName("Santosh");
	santosh.setId("e03");
	
	Employee someshwari = new Employee();
	someshwari.setName("Someshwari");
	someshwari.setId("e04");
	
	ArrayList<Employee> employeeList2 = new ArrayList();
	employeeList2.add(santosh);
	employeeList2.add(someshwari);
	
	HashMap<Manager,ArrayList<Employee>> mapManagerAndEmployees = new HashMap<>();
	mapManagerAndEmployees.put(sharat, employeeList2);
	mapManagerAndEmployees.put(shambu, employeeList1);
	
	for(Map.Entry<Manager, ArrayList<Employee>> entry: mapManagerAndEmployees.entrySet() ) {
		System.out.print(entry.getKey()+ " :" );
		Iterator<Employee> itr = entry.getValue().iterator();
		while(itr.hasNext()) {
		System.out.print(itr.next().getName()+ ",");
	}
	System.out.println();
}

}
}
