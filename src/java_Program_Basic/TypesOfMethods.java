package java_Program_Basic;

public class TypesOfMethods {

	
	//No Params No Return Value
	void m1()
	{
		System.out.println("Hello.........");
	}
	
	//No Params Return Value
	String m2()
	{
	  return "Hello, How are you ?";	
	}
	
	//Takes Param No Return Value 
	void m3(String name)
	{
      System.out.println("Your name is "+ name);		
	}
	
	//Takes Param Takes Return value
	int m4(int id)
	{
		System.out.println("Your Id is: "+id);
		return id;
	}
	
	
}

