package java_Program_Basic;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		
		//Declaring arrays
		//Approach 1:
		/*int a[]=new int[5];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		*/
		
		//Approach 2:
		/*int a[]= {1,2,3,4,5};
		int b=a.length;
	    System.out.println("Length of an array "+a.length);
	    for(int i=0;i<a.length;i++ )
	    {
	    	System.out.println(a[i]);
	    }*/
		
		//Advanced for loop
		int a[]= {1,2,3,4,5};
		System.out.println("Length of an array "+a.length);
		System.out.println("Array values are: " );
		for(int x:a)
		{
			System.out.println(x);
		}
	    
	    
	    
	}

}
