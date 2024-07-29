package java_Program_Basic;

public class StaticDemo {
	
	static int a=10;//static variable
	int b=20;// non static variable
	private static int b2;
	
	static void m1()//static method
	{
		System.out.println("This is a static method");
	}
	 void m2() //non-static method
	{
		System.out.println("This is a non-static method");
	}
	 void m()//non static method
	 {
		 System.out.println(a);
		 System.out.println(b);
		 m1();
		 m2();
	 }

	/*public static void main(String[] args) {
		System.out.println(a);
      m1();
      StaticDemo sd=new StaticDemo();
      System.out.println(sd.b);
      sd.m2();
      sd.m();
	}*/

}
