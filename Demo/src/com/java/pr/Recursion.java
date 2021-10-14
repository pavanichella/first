package com.java.pr;

public class Recursion {
	static int  m1(int k) {
		if(k>0) {
		return k+ m1(k-1);
	}
		else{
			return 0;
		}
	}
	
		public static int sum(int start, int end) {
		    if (end > start) {
		      return end + sum(start, end - 1);
		    } else {
		      return end;
		    }
		}
	
	public static void main(String args[]) {
		int result=m1(10);
		System.out.println("answer is "+result);
		int r = sum(5, 10);
	    System.out.println(r);
	}
	}
