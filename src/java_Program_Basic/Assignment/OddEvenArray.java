package java_Program_Basic.Assignment;

public class OddEvenArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,9,46};
		int even=0,odd=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				even++;
			else
				odd++;
		}
		System.out.println("Count of the even numbers are "+even);
		System.out.println("Count of the odd numbers are "+odd);


	}

}
