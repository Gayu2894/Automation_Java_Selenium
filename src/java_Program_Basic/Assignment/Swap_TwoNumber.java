package java_Program_Basic.Assignment;

public class Swap_TwoNumber {

	public static void main(String[] args) 
	{
        //Swapping 2 numbers without using temp variable to store 
		int a=234,b=123;
		System.out.println("Before Swapping");
		System.out.println("The Value of a = "+a);
		System.out.println("The Value of b = "+b);
		a=a+b;//6
		b=a-b;//2
		a=a-b;//4
		System.out.println("After Swapping");
		System.out.println("The Value of a = "+a);
		System.out.println("The Value of b = "+b);
			
	}

}
