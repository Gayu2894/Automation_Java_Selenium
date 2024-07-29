package java_Program_Basic.Assignment;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int m =n;
		int rev=0;
		while(n>0)
		{
			rev=rev*10+n%10;
			
			n=n/10;
		}
		if(rev==m)
			System.out.println("The given number is "+m+" Palindrome number");
			else
			System.out.println("The given number is "+m+" not Palindrome number");
		
		}

}
