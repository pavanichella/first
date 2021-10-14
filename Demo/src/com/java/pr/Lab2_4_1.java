package com.java.pr;
/*MODULE - 2
PROGRAM - 4
Mr. John has joined the CGI Company as Database Administrator and his major role is to maintain the Employee database which includes Employee Id, Employee Name, Age and Employee Salary.
The criteria for maintaining is that, he need to store all the records in one single table. How the John is going to access all the records which he has stored?*/
import java.io.*;
import java.util.*;

class Lab2_4_1
{
         String name;
         String Id;
         int age;
         float salary;
         Scanner scan=new Scanner(System.in);
         void store()
         {
                System.out.println("Enter the name of Employee");
                name=scan.next();
                System.out.println("Enter the Employee Id");
                Id=scan.next();
                System.out.println("Enter the Employee age");
                age=scan.nextInt();
                System.out.println("Enter the Employee salary");
                salary=scan.nextFloat();
          }
          void access()
          {
                System.out.println("Employee Details");
                System.out.println("Name= "+name+"\t  ID= "+Id+"\t  Age="+age+"\t  Salary="+salary);
          }
}

class M1
{
           public static void main(String[] args)
           {
                Scanner scan=new Scanner(System.in);
                System.out.println("Enter the number of Employee");
                int n=scan.nextInt();
                Lab2_4_1 obj[]=new Lab2_4_1[n];
                for(int i=0;i<n;i++)
                {
                       obj[i]=new Lab2_4_1(); //system gives one default constructor
                       obj[i].store();
                }
                for(int i=0;i<n;i++)
                           obj[i].access();
          }

}