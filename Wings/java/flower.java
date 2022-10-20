class Flower {

   String name;
   String colour;
    
     void sheddingfragrance(){

     System.out.println(colour+" "+name+" "+" is Shedding fragrance");
}

     void blooming(){
     
     System.out.println(colour+" "+name+" "+ "is Blooming");
}
 
public static void main(String[] args){

    flower rose = new flower();

    rose.name = "ROSE";
    rose.colour = "RED";

     rose.blooming();
     rose.sheddingfragrance();

    flower lilly = new flower();
     
    lilly.name = "Lilly";
    lilly.colour= "White";
  
    lilly.blooming();
    lilly.sheddingfragrance(); 

    flower lotus = new flower();
     
    lotus.name = "Lotus";
    lotus.colour= "Pink";
  
    lotus.blooming();
    lotus.sheddingfragrance();
}
}

