package com.java.pr;
/*Create two Strings str1 and str2, using String functions find the
a.    Character at index 5 for str1
b.    Check if the str2 starts with “k”
c.    Find the length of str1 and str2
d.    Find if str1 and str2 are equal
e.    Find the substring of str1 for index 1:4
f.    Find the substring of str2 for index 2:6
g.    Use getchars function to add characters to a character array dst and
h.    Display it ( dst[0] and dst[1] have “a”,”b” respectively).
i.    Concatenate str2 with presidency University*/
class Lab2_5
{
  public static void main(String[] args)
  {
    String str1 = new String("Pavani chella");
    String str2 = new String(" Dragon");
    char[] dst = new char[10];
    dst[0] = 'a';
    dst[1] = 'b';
    System.out.println("Character at 5th index of "+str1+" is: "+str1.charAt(5));
    System.out.println("Does"+str2+"starts with 'K':"+str2.startsWith("K"));
    System.out.println("Length of "+str1+" is: "+str1.length());
    System.out.println("Length of "+str2+" is: "+str2.length());
    System.out.println(str1+" and "+str2+" are equal? "+str1.equals(str2));
    System.out.println("Substring of "+str1+" for 1:4 is: "+str1.substring(1,4));
    System.out.println("Substring of "+str2+" for 2:6 is: "+str2.substring(2,6));
    //getchars(int sindex,int eindex,char d[],int dbindex);
    str1.getChars(0,7,dst,2);
    
    	System.out.println(dst);
   
    System.out.println("\nConcatenating "+str2+" with Presidency University:"+str2.concat("Presidency University"));

  }
}
 
