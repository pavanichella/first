package com.java.pr;

public class Getchar {
public static void main(String args[]) {
	String s=new String ("Hello students");
	char c[]=new char[20];
	s.getChars(2,6,c,2);//starting,ending,char array,which position
	System.out.println(c);
}
}
