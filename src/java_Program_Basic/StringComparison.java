package java_Program_Basic;

public class StringComparison {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Case 1
	/*	String s1="Welcome";
		String s2="Welcome";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
*/
		//case2
		/*String s1=new String ("Welcome");//Whenever uses the new keyword , object will be created
		String s2= new String("Welcome");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);// == compares the object , here s1==s2 not equal to 
		System.out.println(s1.equals(s2));//compares the values of an object*/
		
		//case3
		/*String s="abc";
		String s1=new String("abc");
		System.out.println(s==s1);
		System.out.println(s.equals(s1));*/
		
		String s="abc";
		String s1=new String("abc");
		String s2=s1;
		
		System.out.println(s1);
		System.out.println(s2);
		//Syso
		
	
		
		
		System.out.println(s2==s);
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
		System.out.println(s1==s2);
		System.out.println(s.equals(s2));
	}

}
