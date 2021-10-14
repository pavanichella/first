package com.java.pr;

public class Method1 {
//static method and public
	static void m1() {
		System.out.println("this is first method");
	}
	
	public void m2() {
		System.out.println("this is second method");
	}
	
	public static void main(String[] args ) {
		m1();
		Method1 ob=new Method1();
		ob.m2();
		
	}
}
