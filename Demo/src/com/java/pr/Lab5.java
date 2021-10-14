package com.java.pr;
/*5. Define a class called CommandLine, develop a program in Java that accepts  two floats and integers as its command line 
arguments and perform addition, multiplication, subtraction and division and display the result.*/
public class Lab5 {
public static void main(String args[]) {
	int a,b;
	float c,d;

	a=Integer.parseInt(args[0]);
	b=Integer.parseInt(args[1]);
	c=Float.parseFloat(args[2]);
	d=Float.parseFloat(args[3]);
	System.out.println("int operation:");
	System.out.println("addition:"+(a+b)+"\nsub:"+(a-b) +"\nmul:"+(a*b)+"\ndiv:"+(a/b));
	System.out.println("float operation:");
	System.out.println("addition:"+(a+b)+"\nsub:"+(a-b) +"\nmul:"+(a*b)+"\ndiv:"+(a/b));

}
}
