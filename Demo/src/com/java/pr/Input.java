package com.java.pr;
 import java.util.Scanner;
public class Input {
public static void main (String[] args) {
	Scanner obj=new Scanner(System.in);
	System.out.println("enter name and age");
	
	String name=obj.nextLine();
	int age =obj.nextInt();
    System.out.println("name is"+name);
    System.out.println("age is"+age);
}
}
