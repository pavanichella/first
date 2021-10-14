package com.java.pr;
import java.util.Scanner;
public class Array4 {
public static void main(String [] args) {
	Scanner obj=new Scanner(System.in);
	System.out.println("enter the array:");
	int n=obj.nextInt();
	int a[]=new int[n];
	int sum=0;
	int avg=0;
	for(int i:a)
	{
		a[i]=obj.nextInt();
		sum+=a[i];
	}
	System.out.println("sum :"+sum);
	System.out.println("avg"+(sum/a.length));
}
}
