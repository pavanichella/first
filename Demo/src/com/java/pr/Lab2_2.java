package com.java.pr;

/*A student visits the university library and in the month of June, July, and August he read fiction and non-fiction books, and magazines,
 both in paper copies and online. You want to keep track of how many different types of books and magazines he read, and store that information in matrices.
  Here is the information below:

	 

June
         PAPER   ONLINE
Fiction      2    4
Non-fiction  3    1
Magazines    4    5

 

July
         PAPER    ONLINE
Fiction      3    2
Non-fiction  1    1
Magazines    5    3

 

August
         PAPER    ONLINE
Fiction        1    3
Non-fiction    2    3
Magazines      4    6*/
import java.util.Scanner;
public class Lab2_2 {
public static void main(String[] args) {
	int m,n,i,j;
	Scanner obj=new Scanner(System.in);
	System.out.println("enter the no of rows and columns of a matrix");
	m=obj.nextInt();
	n=obj.nextInt();
	//arrays
	int june[][]=new int[m][n];
	int july[][]=new int[m][n];
	int august[][]=new int[m][n];
	int sum[][]=new int[m][n];
	
	System.out.println("enter the books which student reAD IN JUNE");
	
	for(i=0;i<m;i++)
		for(j=0;j<n;j++)
			june[i][j]=obj.nextInt();
	
System.out.println("enter the books which student reAD IN JUly");
	
	for(i=0;i<m;i++)
		for(j=0;j<n;j++)
			july[i][j]=obj.nextInt();
	
System.out.println("enter the books which student reAD IN august");
	
	for(i=0;i<m;i++)
		for(j=0;j<n;j++)
			august[i][j]=obj.nextInt();
System.out.println("sum is");
	
	for(i=0;i<m;i++)
		for(j=0;j<n;j++)
			
	sum[i][j]=june[i][j]+july[i][j]+august[i][j];
System.out.println("total no of books");
	
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
			System.out.println(sum[i][j]+"\t");
		
	}

System.out.println();
}

}
