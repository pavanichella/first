package com.java.pr;
/*Shyam has a drawing competition in school, he has to draw the following pattern. Suggest a solution to Shyam for winning the competition.
*
**
***
****  */

public class Lab4 {
	public static void main(String[] args){
	
		for (int i=1; i<=4; i++)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }

}

