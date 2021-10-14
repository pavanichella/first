package com.java.pr;
/*Two softball teams submit equipment 

lists to their sponsors. The equipment lists for Team A and Team B are as 
follows:

	 

Teams    Balls    Bats    Gloves
Team -A    12    45    15
Team -B    15    38    17

 


Equipment Name
    Cost
Balls    9$
Bats    80$
Gloves    60$*/
import java.util.Scanner;
public class Lab2_3 {
public static void main(String [] args) {
	int m,n,p,q,sum=0,c,d,k;
	Scanner obj=new Scanner(System.in);
	System.out.println("enter no of rows and columns");
	m=obj.nextInt();
	n=obj.nextInt();
	int first[][]=new int[m][n];
	System.out.println("enter the equaipment lists ");
	for(c=0;c<m;c++)
		for(d=0;d<n;d++)
			first[c][d]=obj.nextInt();
	System.out.println("enter the no of row s and columns  of second matrix");
p=obj.nextInt();
q=obj.nextInt();
 if (n!=p)
	 System.out.println("the matrices cant be multiplied");
 else
 {
	int second[][]=new int[p][q];
	int multiply[][]=new int[m][q];
	System.out.println("enter the cost of equipment");
	for (c=0;c<m;c++)
	
		for(d=0;d<q;d++)
		   second[c][d]=obj.nextInt();
	
			for(c=0;c<m;c++)
			{
			for(d=0;d<q;d++)
			{
				for(k=0;k<p;k++)
				{
					multiply[c][d]=sum;
					sum=0;
			}
		}
			System.out.println("the total is");
			for(c=0;c<m;c++)
			{
				for(d=0;d<q;d++)
                    System.out.println(multiply[c][d]+"\t");
                    
                    System.out.println("\n");

			}
	}
 }
}
}