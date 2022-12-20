package com.Xworkz.Wings.collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;

import com.Xworkz.Wings.collection.array_list.StudentDetails;
import com.Xworkz.Wings.collection.array_list.Trainer;
import com.Xworkz.Wings.collection.linked_list.PatientDetails;

public class CoustomerBankMap {
	public static void main(String[] args) {
	Bank hdfc = new Bank();
	hdfc.setName("HDFC");
	
	Bank sbi = new Bank();
	sbi.setName("SBI");
	
	Bank karnataka = new Bank();
	karnataka.setName("Karnataka Bank");
	
	Customer smita = new Customer();
	smita.setName("Smita");
	smita.setAccNo(868310100);
	smita.setPlace("JP nagar");
	
	Customer sampatti = new Customer();
	sampatti.setName("Sampatti");
	sampatti.setAccNo(868310101);
	sampatti.setPlace("Vijayanagar");
	
	Customer someshwari = new Customer();
	someshwari.setName("Someshwari");
	someshwari.setAccNo(868310103);
	someshwari.setPlace("Banshakari");
	
	ArrayList<Customer> customerList1 = new ArrayList<Customer> ();
	customerList1.add(someshwari);
	customerList1.add(smita);
	customerList1.add(sampatti);
	 
	Customer rudresh = new Customer();
	rudresh.setName("Rudresh");
	rudresh.setAccNo(868310104);
	rudresh.setPlace("Rajaji Nagar");
	
	Customer veeresh = new Customer();
	veeresh.setName("Veeresh");
	veeresh.setAccNo(868310105);
	veeresh.setPlace("Vidyapeeth Nagar");
	
	Customer aishwarya = new Customer();
	aishwarya.setName("Aishwarya");
	aishwarya.setAccNo(868310106);
	aishwarya.setPlace("Check Post");
	
	ArrayList<Customer> customerList2 = new ArrayList<Customer> ();
	customerList2.add(rudresh);
	customerList2.add(veeresh);
	customerList2.add(aishwarya);
	
	Customer shanti = new Customer();
	shanti.setName("Shanti");
	shanti.setAccNo(868310107);
	shanti.setPlace("Marathalli");
	
	Customer priya = new Customer();
	priya.setName("Priya");
	priya.setAccNo(868310108);
	priya.setPlace("Electronic City");
	
	Customer basavaraj = new Customer();
	basavaraj.setName("Basavaraj");
	basavaraj.setAccNo(868310110);
	basavaraj.setPlace("Bommasandra");
	
	ArrayList<Customer> customerList3 = new ArrayList<Customer> ();
	customerList3.add(shanti);
	customerList3.add(priya);
	customerList3.add(basavaraj);
	
	HashMap<Bank,ArrayList<Customer>> mapBankAndCustomer = new HashMap<>();
	mapBankAndCustomer.put(karnataka, customerList3);
	mapBankAndCustomer.put(sbi, customerList2);
	mapBankAndCustomer.put(hdfc, customerList1);
	
	for(Map.Entry<Bank, ArrayList<Customer>> entry: mapBankAndCustomer.entrySet() ) {
		if( entry.getKey().equals(karnataka)) {
		System.out.println(entry.getKey());
		System.out.println("customer details ");
	for(Customer c :entry.getValue()) {
		       System.out.println("customer details ");
				System.out.println("name:-   "+c.getName());
				System.out.println("Acc no:- "+ c.getAccNo());
				System.out.println("place:-  "+ c.getPlace());

			
	}
	//Iterator<Customer> itr = entry.getValue().iterator();
	//if(entry.getValue().equals(customerList3)){
		//while(itr.hasNext()) {
		
		

	
		}
		
}
}	
}


	







