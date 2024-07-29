package java_Program_Basic.Assignment;

import java.util.Scanner;

public class TakingMultiInputsFromKeyboard {

	public static void main(String[] args) {
		
	   
		 Scanner sc=new Scanner(System.in);
		 //Ex:1
		/*
		 System.out.println("Enter first number: ");
		 int a =sc.nextInt();
		 
		 System.out.println("Enter seecond number: ");
		 int b= sc.nextInt();
		 
		 System.out.println("Addition of 2 two numers: "+(a+b));
	    */
		 
		 System.out.println("Enter name: ");
         String name=sc.next();		
         System.out.println("Your name is: "+name);
	     System.out.println("Enter age: ");
	     int age= sc.nextInt();
	     System.out.println("Your age is: "+age);
	     System.out.println("Enter unknown value: ");
	     Object value= sc.next();
	     System.out.println("Your value is: "+value);
	
	}

}
