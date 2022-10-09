class Student {

   String name;
   String USN;
   String DOB;
   String branch;
   String college;
    
     void studying(){

     System.out.println(name+" "+"is studying" + " " + " " + branch + " " + "in" + " " +college);
}

  
public static void main(String[] args){

    Student smita = new Student();

    smita.name = "Smita";
    smita.USN = "3PD18IP017";
    smita.DOB = "4/2/2000";
    smita.branch = "I&PE";
    smita.college = "PDA Engineering College Kalaburagi";

    smita.studying();

    Student aishwarya = new Student();

    aishwarya.name = "Aishwarya";
    aishwarya.USN = "002";
    aishwarya.DOB = "18/11/2000";
    aishwarya.branch = "Electric and electronics";
    aishwarya.college = "GIT ENGINEERING COLLEGE BELGAUM";
   
    aishwarya.studying();

    Student maheshwari = new Student();

    maheshwari.name = "Maheshwari";
    maheshwari.USN = "003";
    maheshwari.DOB = "18/11/2000";
    maheshwari.branch = "CSE";
    maheshwari.college = "JAIN engineering college belgaum ";
   
    maheshwari.studying();

     Student suma = new Student();

    suma.name = "Suma";
    suma.USN = "004";
    suma.DOB = "18/11/2000";
    suma.branch = "Mechanical";
    suma.college = "KLE's college of engineering of belgaum ";
   
    suma.studying();

    

}
}

