package com.java.pr;
/*Develop a java program with two classes an Outer and Inner class. Each of the class have one data member,
the inner class has member function which displays
the data members. Write a main function to access both inner and outer inner members.*/
public class Lab11 {
 int outer=10;
 inner i =new inner();
 void m1() {
	System.out.println("this is outer class calling inner func");
	i.m2();
}
 void disp() {
	System.out.println("this is func in outer func");
}

  class inner{
	  int inner=20;
	  
	  void m2() {
		  System.out.println("this is inner diplay func");
		  System.out.println("the outer value is"+outer);
		  System.out.println("the inner value is"+inner);
	  }
  }
  
  public static void main(String[] args) {
	  Lab11 ob=new Lab11();
	  ob.m1();
	  Lab11.inner ob1=new Lab11().new inner();
	  ob1.m2();
	  
	  
  }
}
