package java_Program_Basic.Assignment;

import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int sum=0;
		while(n>0)
		{
		sum=sum+n%10;
		n=n/10;
		}
		System.out.println("The sum of digits are "+sum);
	}
	   

}
