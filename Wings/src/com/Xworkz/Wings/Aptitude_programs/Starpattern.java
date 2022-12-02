package com.Xworkz.Wings.Aptitude_programs;

class Starpattern{

public static void main (String Args[]){

for(int i=1; i<=4; i++){
for(int j=1; j<=i; j++){
System.out.print("  ");
}
for (int k=4; k>=i; k--){

System.out.print(" *");
}

System.out.println();
}
}
}
