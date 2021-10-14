package com.java.pr;
import java.util.Scanner;

public class Lab2_7 {
public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	System.out.println("enter fathers name?");
	String fname=obj.nextLine();
	System.out.println("enter mothers name?");
	String mname=obj.nextLine();
	System.out.println("enter gender:");
	String gender=obj.nextLine();
	
	String halfName1=HalfName(fname);
	String halfName2=HalfName(mname);
	String name="";
	
		if (gender=="m") {
			name=halfName1+halfName2;
			
		}
		else {
			 name=halfName2+halfName1;
		}
		System.out.println("baby's name:"+name);
	}
	public static String HalfName(String name) {
		
		int halfIndex=name.length()/2;
		String half=name.substring(0,halfIndex);
		
				return half;
	}
}

