package java_Program_Basic;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		
		
		System.out.println("Program is started.....");
		String s=null;
		
		try {
			System.out.println(s.length());
			}
		catch(ArithmeticException ae)
		{
			System.out.println("Handled Exception....");
			System.out.println(ae.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("Handled Exception....");
			System.out.println(ae.getMessage());
		}
		catch(NullPointerException ae)
		{
			System.out.println("Handled Exception....");
			System.out.println(ae.getMessage());
		}
		catch(NumberFormatException ae)
		{
			System.out.println("Handled Exception...."); 
			System.out.println(ae.getMessage());
		}
		System.out.println("Program Completed......");
	}

}
