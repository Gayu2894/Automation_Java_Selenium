package java_Program_Basic;

public class ConstructorDemo {

	  int a,b,c;
	  ConstructorDemo() //Default Constructor
	  {
		   a=100;
		   b=200;
	  }
	  
	  ConstructorDemo(int x,int y) //Parameterized Constructor
	  {
		a=x;
		b=y;
	  }
	  ConstructorDemo(int x,int y,int z) //Parameterized Constructor
	  {
		a=x;
		b=y;
		c=z;
	  }
	  void sum()
	  {
		System.out.println("Sum of 2 numbers: "+(a+b)); 
		System.out.println("Sum of 2 numbers: "+(a+b+c));  
	  }
	  
	
	public static void main(String[] args) {
      
		//ConstructorDemo cd=new ConstructorDemo();
		ConstructorDemo cd=new ConstructorDemo(23,56);
		cd.sum();

	}

}
