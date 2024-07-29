package java_Program_Basic.Assignment;

import java.util.Arrays;

public class SortingStringArray {

	public static void main(String[] args) {
	
		//String a[]= {"A","R","M","I","D"};
		String []a= {"Lalitha","Anvar","Akash","Yash","Nilan","Amudhan","Gayu","Hashi","Siva"};
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("After sorting");
		System.out.println(Arrays.toString(a));
	}

}
