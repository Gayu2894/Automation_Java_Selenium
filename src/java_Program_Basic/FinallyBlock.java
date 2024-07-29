package java_Program_Basic;

public class FinallyBlock {

	public static void main(String[] args) {
		
		System.out.println("Program is started.....");
		String s=null;
		try {
			System.out.println(s.length());
			}
		catch(NumberFormatException ae)
		{
			System.out.println("Catch Block Handled Exception....");
			System.out.println(ae.getMessage());
		}
		finally
		{
			System.out.println("Entered into Finally Block");
		}
		System.out.println("Program Completed......");
		
	}

}
