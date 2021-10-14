package com.java.pr;

public class Method_overloading {
	//multiple methods can have same name with different parameters
	static int m1(int x,int y) {
		return x+y;
		
	}
static String m1(String x,String y) {
//	return x+y;
}
public static void main(String args[]) {
	int a=m1(4,5);
	String b=m1("pavani","simmu");
	System.out.println("addition is"+a);
	System.out.println("concate is"+b);
}

}
