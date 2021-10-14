package com.java.pr;
/*Create a String “ScienceTechnology” using StringBuffer, Perform the following operations
a.    insert string “for” at location 7
b.    insert 0 at location 2
c.    insert “true” at location 3
d.    insert a character array*/
public class Lab2_6 {
	public static void main(String[] args) {
		
StringBuffer s=new StringBuffer("Science Technology");
s.insert(7,"for");
System.out.println(s);
s.insert(2,0);
System.out.println(s);
s.insert(3,"true");
System.out.println(s);
char[] c= {'j','a','v','a'};
s.insert(2,c);
System.out.println(s);



	}
}
