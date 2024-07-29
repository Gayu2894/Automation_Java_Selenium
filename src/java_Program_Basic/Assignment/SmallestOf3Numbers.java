package java_Program_Basic.Assignment;

public class SmallestOf3Numbers {

	public static void main(String[] args) {
		
		int a=430, b=6000, c=30;
		if((a<b) && (a<c))
		System.out.println(a+ " is Smaller than " +b+ " and "+c);
		else if ((b<a) &&(b<c))
	    System.out.println(b+ " is Smaller than " +a+ " and "+c);
		else if((a==b) ||(b==c) || (a==c))
		System.out.println("All the 3 numbers are same");
		else
		System.out.println(c+ " is smaller than " +a+" and "+b) ;
		
		
	}

}
