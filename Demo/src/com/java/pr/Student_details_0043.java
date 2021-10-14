package com.java.pr;
/*Presidency University academic section need a software having Menu driven
to Read, Count, Search and Display to maintain student’s records. During the Student
Registration, read the details like {name, school, branch, fee category (M / S), fee
paid} Using constructor overloading to initialize the above details of the student.  
 Default Constructor with default values as “RAJ”,”SOE”,”CSE”, ’S’,
10,000. ∙ Parameterized constructor
 Copy constructor
Once the data is available, it should be able to do the following:
 Find the total number of students who are admitted to university using a static
method “Count”.  
 Find and print the student details of the students comes under the “CSE” branch.
Hint: Create two class 1. Student details Class: - which includes above
methods. 2. Main Method Class to demonstrate the application.
3. Use array of objects and Switch Case for Menu Driven Approach.*/
public class Student_details_0043 {
	String name, school,branch, fee_category;
	int fee_paid;
	Student_details_0043(){
		name="Raj";
		school="SOE";
		branch="CSE";
		fee_category="S";
		fee_paid=10000;
	}
	Student_details_0043(String name,String school,String branch,String fee_category,int fee_paid){
		this.name=name;
		this.school=school;
		this.branch=branch;
		this.fee_category=fee_category;
		this.fee_paid=fee_paid;
	}
	Student_details_0043(Student_details_0043 s){
		this.name=s.name;
		this.school=s.school;
		this.branch=s.branch;
		this.fee_category=s.fee_category;
		this.fee_paid=s.fee_paid;
	}
	void m1_0043() {
		System.out.println("name:"+name+"\nschool:"+school+"\nbranch:"+branch+"\nfee_category:"+fee_category+"\nfee_paid:"+fee_paid);
	}
		 
	public static void main(String[] args) {
		Student_details_0043 s1=new Student_details_0043();
		Student_details_0043 s2=new Student_details_0043("chotu","SOM","COM","M",20000);
		Student_details_0043  s3=new Student_details_0043(s2);
		s1.m1_0043();
		s2.m1_0043();
		s3.m1_0043();	
	}
	}
	

