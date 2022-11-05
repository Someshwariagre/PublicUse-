package com.Xworkz.Wings.encapsulation;

public class HospitalTest {
public static void main(String[] args) {
	 Hospital hospital = new Hospital();
	  
	 hospital.setName("Jeevan jyoti");
	 hospital.setType("Dentist Hospital");
	 hospital.setNoOfDoctors(10);
	 hospital.setNoOPatients(6);
	 
	 System.out.println("Hospital Name is " + hospital.getName() );
	 System.out.println("Hospital type is "+ hospital.getType());
	 System.out.println("Number of Doctors in Hospital =  " + hospital.getNoOfDoctors() );
	 System.out.println("Number of patients in Hospital =  "+ hospital.getNoOPatients());
}
}
