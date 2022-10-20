class human{
   String name;
   String Height;
   String Wieght;
   String dob;
   String Gender;
    
 void appearance(){
    
    System.out.println(name+"'s details");
    System.out.println("height is"+" "+ Height);
    System.out.println("wieght is"+" "+ Wieght);
    System.out.println("DOB is"+" "+ dob);
    System.out.println("gender is"+" "+ Gender);
    
}

    public static void main(String [] args){

     human Rudresh = new human();
     Rudresh.name =  "Rudra";
     Rudresh.Height = "5.6 foot";
     Rudresh.Wieght = "65 kg";
     Rudresh.dob  =  "26/11/1999";
     Rudresh.Gender = "Male";

     Rudresh.appearance();
}
}