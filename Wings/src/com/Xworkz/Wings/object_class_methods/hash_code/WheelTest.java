package com.Xworkz.Wings.object_class_methods.hash_code;

public class WheelTest {
  public static void main(String[] args) {
	Wheel carWheel = new Wheel();
	int carWheelHashCode = carWheel.hashCode();
	System.out.println("Hash code for car wheel:- "+ carWheelHashCode);
	
	Wheel bikeWheel=new Wheel();
	int bikeWheelHashCode= bikeWheel.hashCode();
	System.out.println("Hash code for car wheel:- "+ bikeWheelHashCode);
}
}
