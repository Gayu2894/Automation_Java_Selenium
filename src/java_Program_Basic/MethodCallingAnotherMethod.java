package java_Program_Basic;

public class MethodCallingAnotherMethod {
	
	void m1()
	{
		System.out.println("This is m1 method");
	}
    void m2()
    {
    	m1();
    	System.out.println("This is m2 method");
    	
    }
	
	

	public static void main(String[] args) {

		MethodCallingAnotherMethod m=new MethodCallingAnotherMethod();
		m.m2();

	}

}
