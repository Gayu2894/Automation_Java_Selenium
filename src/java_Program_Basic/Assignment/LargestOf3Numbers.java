package java_Program_Basic.Assignment;

public class LargestOf3Numbers {

	public static void main(String[] args) {
		
		int a=-430, b=430, c=430;
		if((a>b) && (a>c))
		System.out.println(a+ " is greater than " +b+ " and "+c);
		else if ((b>a) &&(b>c))
	    System.out.println(b+ " is greater than " +a+ " and "+c);
		else if((a==b) ||(b==c) || (a==c))
		System.out.println("All the 3 numbers are same");
		else
		System.out.println(c+ " is greater than " +a+ " and "+b);
		
		

	}

}
