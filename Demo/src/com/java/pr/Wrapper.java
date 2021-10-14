package com.java.pr;
//primitive to wrapper
public class Wrapper {
public static void main(String[] args) {
	int a=5;
	Integer i=Integer.valueOf(a);//converting int to integer
	Integer h=a; //autoboxing
	System.out.println(i);
	System.out.println(a);
	System.out.println(h);
}
}
 