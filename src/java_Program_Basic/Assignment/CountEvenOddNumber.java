package java_Program_Basic.Assignment;

import java.util.Scanner;

public class CountEvenOddNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int evenCount=0;
		int oddCount=0;
		while(n>0)
		{
			int rem=n%10;
			if(rem%2==0)
			{	
			evenCount++;
			}
			else
			{
			oddCount++;
			}
			
			n=n/10;
			
        }

		System.out.println("The count of an Even number is " +evenCount);
		System.out.println("The count of an odd number is " +oddCount);
		
	}

}
