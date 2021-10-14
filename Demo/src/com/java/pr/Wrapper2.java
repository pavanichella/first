package com.java.pr;

public class Wrapper2 {
	  
		   public static void main(String[] args) {
				Integer a =new Integer(20);
				int b=a.intValue();// wrapper to primitive
				int k=a; //unboxing
				System.out.println(a);
				System.out.println(b);
				System.out.println(k);
			}
	   }

