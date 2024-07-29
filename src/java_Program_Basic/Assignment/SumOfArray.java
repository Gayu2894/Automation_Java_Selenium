package java_Program_Basic.Assignment;

public class SumOfArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		int sum=0;
		System.out.println("Length of an array is "+a.length);
		for(int i=0;i<a.length;i++)
		{
		  sum=sum+a[i];
		}
		System.out.println("Sum of an array values: "+sum);

	}

}
