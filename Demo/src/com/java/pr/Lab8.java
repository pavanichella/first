package com.java.pr;
/*8) A teacher asked the class people leader to prepare the list of student details of his classroom.
By using various parameters display the details of the students using java program. Hint: Parameterized and Copy constructors to apply overloading.*/
public class Lab8 {
String name,rollno,branch;
Lab8(){
	name="pavani";
	rollno="100";
	branch="com";
}
Lab8(String name,String rollno,String branch){
	this.name=name;
	this.rollno=rollno;
	this.branch=branch;
}
Lab8(Lab8 s){
	this.name=s.name;
	this.rollno=s.rollno;
	this.branch=s.branch;
}
void m1() {
	System.out.println("name:"+name+"\nrollno:"+rollno+"\nbranch:"+branch);
}
public static void main(String[] args) {
	Lab8 s1=new Lab8();
	Lab8 s2=new Lab8("chotu","101","cse");
	Lab8 s3=new Lab8(s2);
	s1.m1();
	s2.m1();
	s3.m1();
	
}
}
