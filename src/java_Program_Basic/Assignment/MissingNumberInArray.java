package java_Program_Basic.Assignment;

public class MissingNumberInArray {

	public static void main(String[] args) {
	
		int a[]= {23,25,26,21,22,};
		int s1=0;
		for(int i=0;i<a.length;i++)
		{
			s1=s1+a[i];
		}
		System.out.println("Sum of an given array: "+s1);
		int s2=0;
		for(int i=21;i<=26;i++)
		{
			s2=s2+i;
		}
		System.out.println("Sum of an given array by adding missing number: "+s2);
		int m=s2-s1;
		System.out.println("Missing number of giving array is: "+m);
	}

}
