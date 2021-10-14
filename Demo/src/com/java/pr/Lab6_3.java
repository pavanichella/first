package com.java.pr;

public class Lab6_3
{
 void area(int r) {
	//polymorohism 
	System.out.println("area of circle is"+3.14*r*r);
	
}
 
 void area(int l,int b) {
	 System.out.println("area of rec is"+l*b);
		
 }
 void area(int br,float h ) {
	 System.out.println("area of tri is"+0.5*br*h);
		
 }
 void area(float s) {
	 System.out.println("area of sq is"+s*s);
		
 }


public static void main(String[] args) {
	Lab6_3 obj=new Lab6_3();
	obj.area(5);
	obj.area(4,2);
	obj.area(5,6.5f);
	obj.area(8.2f);
}
}
