package java_Program_Basic;


class Test
{
	 final int x=100;	// constant   
}


public class FinalKeyword {

	public static void main(String[] args) {
		
		Test t=new Test();
		//System.out.println(t.x=450); - incorrect, we cannot change - final is fixed value 
		System.out.println(t.x);
	}

}
