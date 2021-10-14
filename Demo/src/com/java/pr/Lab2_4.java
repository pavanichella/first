package com.java.pr;
/*johns role is employee db - includes id name age and salary.criteria for 
  maintaining is he need to store all records in single table.how john gng to access all records which he sorted */
//array of obj

public class Lab2_4 {
int id;
String name;
int age;
float salary;
 Lab2_4(int eid,String ename,int eage,float esalary){
	id=eid;
	name=ename;
	age=eage;
	salary=esalary;
}
void m1() {
	System.out.println(id+"\t"+name+"\t"+age+"\t"+salary+"\t");
}
}

   class Arrayobj{
	 public static void main(String[] args) {
		 Lab2_4 e[]=new Lab2_4[5];
		 e[0]=new Lab2_4(100,"chotu",20,10000);
		 e[1]=new Lab2_4(200,"ammu",23,20000);
		 e[2]=new Lab2_4(300,"simmu",20,50000);
		 e[3]=new Lab2_4(400,"priya",30,10000);
		 e[4]=new Lab2_4(500,"jay",20,70000);
		 e[0].m1();
		 e[1].m1();
		 e[2].m1();
		 e[3].m1();
		 e[4].m1();
		 
	 }
  }
 

