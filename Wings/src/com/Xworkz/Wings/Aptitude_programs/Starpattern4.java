package com.Xworkz.Wings.Aptitude_programs;

class Starpattern4{

public static void main (String Args[]){

for(int i=1; i<=4; i++){
for(int j=3; j>=i; j--){
System.out.print(" ");
}
for (int k=1; k<=i; k++){

System.out.print("*");
}

System.out.println();
}
}
}
