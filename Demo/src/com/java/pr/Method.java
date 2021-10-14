package com.java.pr;

public class Method {
static void m1(){
	System.out.println("this is my fisrt method");
}

static void m2(String lname) {
	System.out.println(lname + " " +"chella");
}
static void m3(String name ,int age) {
	System.out.println("I am "+name+"aged"+age);
}
public static void main(String args[]) {
	//call function
	m1();
	m2("pavani");
	m2("deepak");
	m2("kavitha");
	m3("pvani" ,20);
	m3("ammu",15);
}
}
