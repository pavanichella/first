package com.java.pr;
/*Swiggy App is celebrating its birthday, so it wants to give 80% discount for those customers who have order number 
which is prime and others will get 50% discount. 
Help the application to identify the discount rate for customers*/
import java.util.Scanner;
public class Lab3 {
public static void main(String [] args) {
Scanner obj=new Scanner(System.in);	
System.out.println("enter the order number:");
int order_no=obj.nextInt();
int count=0,discount=0;
for( int i=1;i<=order_no;i++) {
	if(i%order_no==0) {
		count++;
	}
	if(count==2) {
		discount=80;
	}
	else {
	discount=50;
	}
}
System.out.println("discount is "+discount+"%");
}
}
