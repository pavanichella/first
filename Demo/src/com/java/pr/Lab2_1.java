package com.java.pr;
import java.util.Scanner;
/*The company has announced a lucky dip for the employees for Diwali festival. It is released coupons with unique number printed on it. The criteria to
win the prize are the first and last number should match and reverse of the number should be same as the given number.There is a chance of winning only 3 prizes. On the festival day, 5
employees with different coupon id entered into the final round. Now identify the 3 employees who will win the lucky dip out of 5.*/
public class Lab2_1 {
	      public static void main(String args[])
	      {
	        int coup[] = new int[5];//creat array
	        int count=0;
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Enter the coupon number");
	        for(int i=0;i<5;i++)
	           {
	             int coupon = scan.nextInt();
	             coup[i] = coupon;
	           }
	            for(int i=0;i<5;i++)
	             {
	                int n=coup[i];
	                int r,rev=0,temp;
	                temp=n;
	                while(n>0)
	                {
	                  r = n%10;
	                  rev= (rev*10)+r;
	                  n = n/10;
	                }
	                 //check whether the coupon is palindrome or not
	                 if(temp==rev)
	                   {
	                      System.out.println("Coupon number "+(i+1)+" won the prize");
	                      count++;
	                   }
	                   else
	                   {
	                     System.out.println("Coupon number "+(i+1)+" not won");
	                   }
	                  if(count==3)
	                  break;
	             }
	       }
	}