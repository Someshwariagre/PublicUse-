class UnaryAssignment{

public static void main(String args[]){

int a=10;
int b= a++;
int c= (--b)+(--a);
c++;
++a;
b--;

System.out.println(a--);
System.out.println(b+c);
System.out.println(--b);
System.out.println(b+c);
}
}