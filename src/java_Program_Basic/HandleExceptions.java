package java_Program_Basic;

import java.util.Scanner;

public class HandleExceptions {

	public static void main(String[] args)
	{
		System.out.println("......Program Started.....");
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("Enter the number: ");
        int num=sc.nextInt();
		System.out.println(100/num); //0 - Arithmetic Exception
		}
		catch(ArithmeticException e)
		{
			System.out.println("Invalid Data");
		}
		System.out.println("......Program Completed.....");
		System.out.println("......Program Exited.....");
	}

}
