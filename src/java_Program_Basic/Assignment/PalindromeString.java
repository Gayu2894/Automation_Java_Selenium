package java_Program_Basic.Assignment;

public class PalindromeString {

	public static void main(String[] args) {
		
		String s="Kayak";
		char[] a=s.toCharArray();
		//System.out.println(a.length);
		String rev="";
		for(int i=a.length-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
		System.out.println(rev);
		if(rev.equalsIgnoreCase(s))
			System.out.println("Given string is Palindrome");
		else
			System.out.println("Given String is not a Palindrome");
	}

}
