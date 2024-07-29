package java_Program_Basic.Assignment;

public class SmallestInArray {

	public static void main(String[] args) {
		
		int a[]= {12,23,34,45};
		int min= a[0];
		for(int i=1;i<a.length;i++)
		{
		  if(a[i]<min)
			  min=a[i];
		}
		
			System.out.println("Smallest of given Array: "+min);	
	
	
	
	
	}

}
