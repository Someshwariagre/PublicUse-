package com.Xworkz.Wings.collection.stack;

import java.util.Stack;

public class StackDemo {
public static void main(String[] args) {
	Stack st = new Stack();
	st.add("Sun");
	st.add("mon");
	st.add("tue");
	st.add("wed");
	st.add("thu");
	st.add("fri");
	st.add("sat");
	System.out.println(st);
  
    System.out.println(st.empty());
    System.out.println(st.peek());
    System.out.println(st.pop());
    System.out.println(st.push(st));
    System.out.println(st.get(3));
    System.out.println(st.remove(4));
	
}
}
