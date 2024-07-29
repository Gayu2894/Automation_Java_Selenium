package java_Program_Basic;

import java.util.Scanner;

public class ExceptionsDemo {

	public static void main(String[] args) {
	
		System.out.println("......Program Started.....");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		//int num=sc.nextInt();
		//System.out.println(num/100); //0 - Arithmetic Exception
		
		/*int a[]=new int[5];
		System.out.println("Enter the postion[0-4]: ");
		int pos=sc.nextInt();
		
		System.out.println("Enter the Value: ");
		int b=sc.nextInt();
		
		a[pos]=b;*/ //ArrayIndexoutofbound Exceptions
		
		/*String s="Welcome"; //NumberFormatException  
		int num=Integer.parseInt(s);//converting String to integer
		System.out.println(num);*/
	
		String s1= null;
		System.out.println(s1.length());
		System.out.println("......Program Completed.....");
		System.out.println("......Program Exited.....");
		
		
		
	}

}
