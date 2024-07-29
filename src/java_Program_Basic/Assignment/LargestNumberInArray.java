package java_Program_Basic.Assignment;

public class LargestNumberInArray {

	public static void main(String[] args) {
		/*
		 int[] arr = {10, 324, 45, 90, 9808};
	        int max = arr[0];
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > max) {
	                max = arr[i];
	            }
	        }
	        System.out.println("Largest in given array is " + max);
	    }*/
		
		int a[]= {456,12,13,14,15};
		int temp=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>temp)
			{
				temp=a[i];
			}
			
				
		}
		System.out.println("Greater number: "+temp);
		
		
	}
}

