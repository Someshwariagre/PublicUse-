package com.Xworkz.Wings.collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {	
  HashMap<Integer,String> map = new HashMap<>();
  map.put(560078, "Minhaj Nagar");
  map.put(560098, "RR Nagar");
  map.put(563201, "Hasan");
  map.put(562109, "RamaNagara");
  map.put(560076, "Kothnur");
  map.put(571433, "Maddur");
  
  for(Map.Entry<Integer, String> entry : map.entrySet()) {
	  System.out.println(entry.getKey() + ": "+ entry.getValue());
  }
  
  for(Map.Entry<Integer, String> entry : map.entrySet()) {
	  if(entry.getValue().equals("Ramnagar")) {
		  System.out.println("pincode of Ramanagar :- " + entry.getKey() );
	  }
  }
}
}