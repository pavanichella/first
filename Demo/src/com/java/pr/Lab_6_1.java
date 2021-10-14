package com.java.pr;
/*6. A teacher gave a project to student in the classroom to find the area of different shapes.
A student has to find the area of different 
shapes based on the choice of different parameters and display the results*/
 import java.util.Scanner;
public class Lab_6_1 {
public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	System.out.println("enter the choice:"+"\n1.circle"+"\n2.rectangle"+"\n3.square"+"\n4.triangle");
	int ch=obj.nextInt();
	switch(ch) {
	case 1:
	System.out.println("r");
	int r=obj.nextInt();
	System.out.println("area of circle is :"+3.14*r*r);
	case 2:
	
	System.out.println("l");
	System.out.println("b");
	int l=obj.nextInt();
	int b=obj.nextInt();
	System.out.println("area of rectangle is:"+l*b);
	case 3:
	System.out.println("s");
	int s=obj.nextInt();
	System.out.println("area of square is"+s*s);
	case 4:
	
	
	System.out.println("br");
	System.out.println("h");
	int br=obj.nextInt();
	int h=obj.nextInt();
	System.out.println("area of tri:"+0.5*br*h);
	default:
		System.out.println("invalid choice");
	}
}
}
