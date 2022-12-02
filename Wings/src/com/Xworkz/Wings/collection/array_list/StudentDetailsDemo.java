package com.Xworkz.Wings.collection.array_list;

import java.util.ArrayList;

public class StudentDetailsDemo {
public static void main(String[] args) {
	ArrayList<StudentDetails> Students = new ArrayList<StudentDetails>();
	
	StudentDetails smita = new StudentDetails("Smita" , "A1", "BE","Asha");
	StudentDetails someshwari = new StudentDetails("Someshwari" , "A1", "Bsc","Asha");
	StudentDetails sampatti = new StudentDetails("Sampatti" , "A1","BCA" ,"Asha");
	StudentDetails aishwarya = new StudentDetails("Aishwarya" , "A1", "BE","Asha");
	StudentDetails rudresh = new StudentDetails("Rudresh" , "A1",  "BCA","Asha");
	StudentDetails basvaraj = new StudentDetails("Basvaraj" , "A2", "Bsc", "Sunil");
	StudentDetails preeti = new StudentDetails("Preeti" , "A2", "BE","Sunil");
	StudentDetails saroja = new StudentDetails("Saroja" , "A1", "BE","Asha");
	StudentDetails soumya = new StudentDetails("Soumya" , "A2", "Bsc","Rajshekar");
	StudentDetails sangeeta = new StudentDetails("Sangeeta" , "A1","BCA" ,"Asha");
	StudentDetails shraddha = new StudentDetails("Shraddha" , "A1", "BE","Asha");
	StudentDetails raghu = new StudentDetails("Raghu" , "A1",  "BCA","Rajshekar");
	StudentDetails vinod = new StudentDetails("Vinod" , "A2", "Bsc", "Sunil");
	StudentDetails vinay = new StudentDetails("Vinay" , "A1", "BE","Asha");
	
	Students.add(sangeeta);
	Students.add(preeti);
	Students.add(rudresh);
	Students.add(someshwari);
	Students.add(vinay);
	Students.add(vinod);
	Students.add(raghu);
	Students.add(shraddha);
	Students.add(soumya);
	Students.add(saroja);
	Students.add(basvaraj);
	Students.add(aishwarya);
	Students.add(sampatti);
	Students.add(smita);
	
	
	for(StudentDetails s1 : Students) {
		if(s1.trainerName.equals("Asha")) {
			System.out.println(s1);
		}
	}
}
}
