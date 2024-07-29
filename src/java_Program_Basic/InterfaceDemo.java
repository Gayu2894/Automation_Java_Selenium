package java_Program_Basic;

interface Shape
{
	int length= 10; //by default variable become static and final once assigned in interface
	int width=20;
	
	void circle(); // abstract method
	
    default void square()
    {
    	System.out.println("This is Square....Default Method");
    }
    
    static void Triangle()
    {
    	System.out.println("This is Tiangle.....Static Method");
    }
    static void Rectangle()
    {
    	System.out.println("This is Ractangle.....Static Method");
    }
    default void semiCircle()
    {
       System.out.println("This is SemiCircle......DEfault Method");	
    }
    
}

public class InterfaceDemo implements Shape 
{
	static int a=90;
	public void circle() //we have to make public modifier to interface - abstract methods
	 {
		 System.out.println("This is Circle...... Implemented abstract methods");
	 }
    int Cube()
	{
		System.out.println("This is Cube.... default method "+(a*a*a));
		return a;
	}

    
    
    
	public static void main(String[] args) {
		
		//Scenario:1
		InterfaceDemo idobj=new InterfaceDemo();
		idobj.circle();//Abstract Method
		
		//a=70;
		int cubeValue=idobj.Cube(); //default method
		//System.out.println(cubeValue);
	
		System.out.println();
		idobj.semiCircle();//default method
		idobj.square(); //defualt method
		Shape.Rectangle();//Static method directly access from Interface 
		Shape.Triangle();//Static method directly access from Interface
		System.out.println(Shape.length*Shape.width); //Final and Static variables from Shape interface
		//accessing Static variable using interface shape
		
		
		//Scenario:2
		Shape sobj=new InterfaceDemo(); //Interface Shape (object Reference Variable) for InterfaceDemo Class
		sobj.circle();
		sobj.semiCircle();
		sobj.square();
		Shape.Rectangle();
		Shape.Triangle();
		System.out.println(Shape.length*Shape.width);//Final and Static variables from Shape interface
		//accessing Static variable using interface Shape
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
