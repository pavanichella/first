/*Develop a program in Java which has a static method min2() that takes two int arguments and returns the value of 
the smallest one.
Add an overloaded function that does the same thing with two double values and display the output*/
package com.java.pr;
import java.util.Scanner;
public class Lab10 {
	static int min2(int a,int b){
		if(a<b) {
			return a;
		}
		else {
			return b;
		}
	}
	static double min2(double c ,double d) {
		if(c<d) {
			return c;		
		}
		else {
			return d;
		}
	}
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two integers:");	
		int a= sc.nextInt();
		int b= sc.nextInt();
		System.out.println("smallest num:"+min2(a,b));
System.out.println("enter two integers:");
		
		double c= sc.nextDouble();
		double d= sc.nextDouble();
		System.out.println("smallest num:"+min2(c,d));		
	}
}

