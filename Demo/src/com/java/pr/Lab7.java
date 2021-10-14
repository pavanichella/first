package com.java.pr;
/*7. Create a class named 'Rectangle' with two data members- length and breadth and a method 
to calculate the area which is 'length*breadth'. The class has three constructors which are
i -having no parameter - values of both length and breadth are assigned zero.
ii - having two numbers as parameters - the two numbers are assigned as length and breadth 
respectively.
iii - having one number as parameter - both length and breadth are assigned that number.
Now, create objects of the 'Rectangle' class having none, one and two parameters and print their areas. */

public class Lab7 {
int length;
int breadth;
void area() {
	System.out.println("area of rectangle is:"+length*breadth);
}
Lab7(){
	length=0;
	breadth=0;
}
Lab7(int l,int b){
	length=l;
	breadth=b;
	
}
Lab7(int len){
	length=len;
	breadth=len;
}
public static void main(String[] args) {
	Lab7 a1=new Lab7();
	a1.area();
	Lab7 a2=new Lab7(6,5);
	a2.area();
	Lab7 a3=new Lab7(9);
	a3.area();
}
}
