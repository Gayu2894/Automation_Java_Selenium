package java_Program_Basic.Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class ReadWriteDataIntoArray {

	public static void main(String[] args) {
		
		int a[]=new int[4];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter value for the position "+ i+" :");	
			 a[i]=sc.nextInt();
		}
		
		System.out.println("Printing array elements:");
		System.out.println(Arrays.toString(a));
	}

}
