package com.java.pr;
/*2. A Teacher asks one of the students in a class to do the arithmetic operations based on a choice. 
Here at a time student have to perform one arithmetic operation only.
Write a Java program to perform the above operations*/
 import java.util.Scanner;
public class Lab2 {
	public static void main(String args[]) {
		
	Scanner obj=new Scanner(System.in);
	System.out.println("enter a and b:");
	 int a=obj.nextInt();
	int  b=obj.nextInt();
	System.out.println("value of a is"+a);
	System.out.println("value of b is"+b);
	
	System.out.println("enter the choice");
	System.out.println("1.add\n 2.sub \n 3.mul \n 4.div \n");
	int ch=obj.nextInt();
	switch(ch) {
	case 1:
		System.out.println("addition is "+(a+b));
	break;
	case 2:
		System.out.println("subtractioin is "+(a-b));
	break;
	case 3:
		System.out.println("multiplication is "+(a*b));
	break;
	case 4:
		System.out.println("division is "+(a/b));
	default:
		System.out.println("wrong choice");
	}
	
	}

}
