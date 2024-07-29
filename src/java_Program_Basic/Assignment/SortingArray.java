package java_Program_Basic.Assignment;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		
		int a[]= {1,7,3,1,8,6,5,5,10,89,-1,-55};
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);//sorting an array now it has a sorted array values in a
		System.out.println();
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(a));
	}

}
