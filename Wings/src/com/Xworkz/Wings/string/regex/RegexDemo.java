package com.Xworkz.Wings.string.regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexDemo {
public static void main(String[] args) {
String x = ",";
String y = "a";

Pattern pt= Pattern.compile(x);
Matcher mt = pt.matcher(y);
System.out.println(pt);
System.out.println(y);

boolean result = mt.matches();
System.out.println(result);
}
}
