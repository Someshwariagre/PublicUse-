package com.Xworkz.Wings.Aptitude_programs;

class Daigonalpattern1{

public static void main (String Args[]){
    int n=9;
for(int i=0; i<=n; i++){
for(int j=0; j<=n; j++){
if(i==0||j==0|| i==n|| j==n ||  i+j==n){
System.out.print("*  ");
}
else{
 System.out.print("   ");
}

}

System.out.println();
}
}
}




