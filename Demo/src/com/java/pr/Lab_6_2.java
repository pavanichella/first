package com.java.pr;
import java.util.Scanner;
public class Lab_6_2 {
	
//by merthods
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the choice:"+"\n1.circle"+"\n2.rectangle"+"\n3.square"+"\n4.triangle");
		int ch=obj.nextInt();
		switch(ch) {
		case 1:
		System.out.println("r");
		int r=obj.nextInt();
		System.out.println("area of circle is :"+circle( r));
		case 2:
		
		System.out.println("l");
		System.out.println("b");
		int l=obj.nextInt();
		int b=obj.nextInt();
		System.out.println("area of rectangle is:"+rectangle( l, b));
		case 3:
		System.out.println("s");
		int s=obj.nextInt();
		System.out.println("area of square is"+square( s));
		case 4:
		
		
		System.out.println("br");
		System.out.println("h");
		int br=obj.nextInt();
		int h=obj.nextInt();
		System.out.println("area of tri:"+triangle(br,h));
		default:
			System.out.println("invalid choice");
		
		}
	}



static double circle(int r) {
	return 3.14*r*r;
}
static double rectangle(int l,int b) {
	return l*b;
}
static double square(int s) {
	return s*s;
}
static double triangle(int br,int h) {
	return 0.5*br*h;
}
}	
	


