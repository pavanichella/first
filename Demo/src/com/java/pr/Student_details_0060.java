package com.java.pr;

public class Student_details_0060 {
	String name, school,branch, fee_category;
	int fee_paid;
	Student_details_0060(){
		name="Raj";
		school="SOE";
		branch="CSE";
		fee_category="S";
		fee_paid=10000;
	}
	Student_details_0060(String name,String school,String branch,String fee_category,int fee_paid){
		this.name=name;
		this.school=school;
		this.branch=branch;
		this.fee_category=fee_category;
		this.fee_paid=fee_paid;
	}
	Student_details_0060(Student_details_0060 s){
		this.name=s.name;
		this.school=s.school;
		this.branch=s.branch;
		this.fee_category=s.fee_category;
		this.fee_paid=s.fee_paid;
	}
	void m1_0060() {
		System.out.println("name:"+name+"\nschool:"+school+"\nbranch:"+branch+"\nfee_category:"+fee_category+"\nfee_paid:"+fee_paid);
	}
	public static void main(String[] args) {
		Student_details_0060 s1=new Student_details_0060();
		Student_details_0060 s2=new Student_details_0060("chotu","SOM","COM","M",20000);
		Student_details_0060  s3=new Student_details_0060(s2);
		s1.m1_0060();
		s2.m1_0060();
		s3.m1_0060();	
	}
}
