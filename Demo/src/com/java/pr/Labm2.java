package com.java.pr;
import java.util.Scanner;
public class Labm2 {
public static void main(String[] args) {

	Scanner obj=new Scanner(System.in);
	System.out.println("enter the size of an array");
	int size=obj.nextInt();
	int A[]=new int[size];
	System.out.println("enter array elements:");
	for(int i=0;i<size;i++)
	{
		A[i]=obj.nextInt();
	}
	System.out.println("print the values");
	for(int i=0;i<size;i++) {
		System.out.println(A[i]);
	}
	
}
}
