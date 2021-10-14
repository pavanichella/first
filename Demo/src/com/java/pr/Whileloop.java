package com.java.pr;

public class Whileloop {
	public static void main(String args[]) {
		int i=0;
		while(i<10) {
			System.out.println("'im while loop"+i);
			i++;
		}
		
		int j=1;
		do {
			
			System.out.println("'im do while loop"+j);
			j++;
		
		}while(j<10);
		
		for (int k = 0; k < 5; k++) {
			  System.out.println(k);
			}
		//for each loop
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for (String l : cars) {
		  System.out.println(l);
		}
	
}
}
