package com.Xworkz.Wings.collection.array_list;

import java.util.ArrayList;
import java.util.ListIterator;

public class StudentDetailsDemo {
public static void main(String[] args) {
	
	
	StudentDetails smita = new StudentDetails("Smita" , "A1", "BE");
	StudentDetails someshwari = new StudentDetails("Someshwari" , "A1", "Bsc");
	StudentDetails sampatti = new StudentDetails("Sampatti" , "A1","BCA" );
	StudentDetails aishwarya = new StudentDetails("Aishwarya" , "A1", "BE");
	StudentDetails rudresh = new StudentDetails("Rudresh" , "A1",  "BCA");
	StudentDetails basvaraj = new StudentDetails("Basvaraj" , "A2", "Bsc");
	StudentDetails preeti = new StudentDetails("Preeti" , "A2", "BE");
	StudentDetails saroja = new StudentDetails("Saroja" , "A1", "BE");
	StudentDetails soumya = new StudentDetails("Soumya" , "A2", "Bsc");
	StudentDetails sangeeta = new StudentDetails("Sangeeta" , "A1","BCA" );
	StudentDetails shraddha = new StudentDetails("Shraddha" , "A1", "BE");
	StudentDetails raghu = new StudentDetails("Raghu" , "A1",  "BCA");
	StudentDetails vinod = new StudentDetails("Vinod" , "A2", "Bsc");
	StudentDetails vinay = new StudentDetails("Vinay" , "A1", "BE");
	
	ArrayList<StudentDetails> ashaStudentList = new ArrayList<StudentDetails>();
	ashaStudentList.add(sangeeta);
	ashaStudentList.add(preeti);
	ashaStudentList.add(rudresh);
	ashaStudentList.add(someshwari);
	ashaStudentList.add(smita);
	ashaStudentList.add(sampatti);
	ashaStudentList.add(aishwarya);
	
	ArrayList<StudentDetails> omkarStudentList = new ArrayList<StudentDetails>();
	omkarStudentList.add(vinay);
	omkarStudentList.add(vinod);
	omkarStudentList.add(raghu);
	omkarStudentList.add(shraddha);
	omkarStudentList.add(soumya);
	omkarStudentList.add(saroja);
	omkarStudentList.add(basvaraj);
	
	
	
	Trainer asha = new Trainer("Asha",ashaStudentList);
	Trainer omkar = new Trainer("Omkar",omkarStudentList);
	
	ArrayList<Trainer> TrainerList = new ArrayList<Trainer>();
	TrainerList.add(omkar);
	TrainerList.add(asha);
	
	ListIterator<Trainer> itr = TrainerList.listIterator();
	 System.out.println("Asha's Student List");
	for(StudentDetails s : ashaStudentList ) {
		if(s.equals(asha));
		System.out.println(s);
		
	

		}
}
}

