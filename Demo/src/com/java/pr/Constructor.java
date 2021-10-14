package com.java.pr;

 class Constructor {
	
	String name;
	int rollno;
	Constructor(String name,int rollno){
	this.name=name;
	this.rollno=rollno;
	}

public static void main(String[] args) {
	
	Constructor s1=new Constructor ("pavani",20);
	Constructor s2=new Constructor ("koushik",22);
	System.out.println("name is "+s1.name+" "+"rollno is" +s1.rollno);
	System.out.println("name is "+s2.name+" "+ "rollno is" +s2.rollno);
	
}
}