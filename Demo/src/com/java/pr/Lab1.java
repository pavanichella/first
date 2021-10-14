package com.java.pr;
/*1. In an Examination hall students of second year and third year students sits in an odd and even number 
positions consecutively. Then a teacher asks one of the students to find the sum of even and odd positions
separately. The total seating capacity of an exam hall is 100. 
Develop a software application to perform the above operations.*/
public class Lab1 {
public static void main (String args[]) {
	int sumeven=0;
	int sumodd=0;
	for(int i=0;i<=100;i++) {
		if(i%2==0) {
			sumeven=sumeven+i;
			
		}
		else {
			sumodd=sumodd+i;
			
		}
		
	}
	System.out.println("sumof even is:"+sumeven);
	System.out.println("sum of odd is :"+sumodd);
}
}
