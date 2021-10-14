package com.java.pr;
import java.util.Scanner;
public class Matrix {

	public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);	
	
	System.out.println("enter no of rows");
	int m=obj.nextInt();

	System.out.println("enter no of columns");
	int n=obj.nextInt();
int june[][]=new int[m][n];
int july[][]=new int[m][n];
int aug[][]=new int[m][n];
int sum[][]=new int[m][n];
System.out.println("enter no of books in june");
for(int i=0;i<m;i++) {
	for(int j=0;j<n;j++) {
		june[i][j]=obj.nextInt();
		
}
	}
System.out.println("enter no of books in july");
for(int i=0;i<m;i++) {
	for(int j=0;j<n;j++) {
		july[i][j]=obj.nextInt();
		
}
	}
System.out.println("enter no of books in aug");
for(int i=0;i<m;i++) {
	for(int j=0;j<n;j++) {
		aug[i][j]=obj.nextInt();
		
}
	}
for(int i=0;i<m;i++) {
	for(int j=0;j<n;j++) {
		sum[i][j]=june[i][j]+july[i][j]+aug[i][j];
		
}
	}
for(int i=0;i<m;i++) {
	for(int j=0;j<n;j++) {
	System.out.println("sum of matrices is:"+sum[i][j]);
		
}
	}

System.out.println();
}
}