package java_Program_Basic;

public class DateConversionMethods {

	public static void main(String[] args) {
		
		String s="Welcome"; //cannot convert to int
		String s1= "1234";
		int a=Integer.parseInt(s1);
		System.out.println(a);
		
		String b="20";
		String c= "30";
		System.out.println(a+b);
		int sum; 
		System.out.println( sum=Integer.parseInt(b)+Integer.parseInt(c)); //converting string to int
		
		String b1="20.12";
		String c1= "30.34";
		//System.out.println(a+b1);
		double sum1; 
		System.out.println( sum1=Double.parseDouble(b1)+Double.parseDouble(c1)); //converting string to int
		
		String w="true"; //other than true if we pass any string that will return false
		//String s1= "1234";
		boolean a2=Boolean.parseBoolean(w);
		System.out.println(a2);
		
		
		//converting any data type to string
		int q1= 500;
		double q2= 23.33;
		char q3 = 'q';
		boolean q4 = true;
		
		String q5= String.valueOf(q1);
		System.out.println(q5);
		
		q5= String.valueOf(q2);
		System.out.println(q5);
		
		 q5= String.valueOf(q3);
		System.out.println(q5);
		
		 q5= String.valueOf(q4);
		System.out.println(q5);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
