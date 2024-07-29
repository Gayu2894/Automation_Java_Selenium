package java_Program_Basic;

class parent
{
	String name="Nilan";
	void m1()
	{
		System.out.println("This is the m1 method parent class");
	}
}

class child extends parent
{
	
	int id =12;
	void m2()
	{
		
		System.out.println("This is the m2 method from child class");
	}
}

public class CastingObjects{

	public static void main(String[] args) {
		/*
		parent p=new parent();
		System.out.println(p.name);
		p.m1();
		
		child c=new child();
		System.out.println(c.name);
		System.out.println(c.id);
		c.m1();
		c.m2();
		
		//p1 child object and parent class object reference variable can only access methods from parent class
		parent p1=new child();  
		System.out.println(p1.name);
		p1.m1(); 
		*/
		
		parent p2= new parent();
		child c1=(child)p2;
		System.out.println(c1.id);
		System.out.println(c1.name);
		c1.m1();
		c1.m2();
		
		
		
		
		
		//child c= new parent
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
