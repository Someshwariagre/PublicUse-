class VariableTest{

static int a;
static int b;
  

  public static void main(String args[]){

int c;
b=10;
a= 100;
System.out.println("a : "+a);
System.out.println("b : "+b);


VariableTest test = new VariableTest();

test.a=10;
test.b=50;
System.out.println("test.a : "+test.a);
System.out.println("test.b : "+test.b);



VariableTest test1 = new VariableTest();

test1.a=10;
test1.b=25;

System.out.println("test1.a : " +test1.a);
System.out.println("test1.b : "+test1.b);

}
}
