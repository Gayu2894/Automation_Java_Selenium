package java_Program_Basic;

interface I1MultipleInheritance {

	int a=10;
	int m1();
}
interface I2MultipleInheritance 
{   
	int b=20;
	int m2();
}
interface I3MultipleInheritance extends I2MultipleInheritance
{
	void m3();
}

class Inheritance2 {

	void m5() {
		System.out.println("HelloWorld");
	}
}
class Inheritance extends Inheritance2 implements I3MultipleInheritance,I1MultipleInheritance
{
	void m4() {
		System.out.println("Welcome");
	}

	@Override
	public void m3() {
		
		int b= a*a;
		System.out.println("m3 method--abstract method: "+b);
	}

	@Override
	public int m2() {
		int b= a*a;
		System.out.println("m2 method--abstract method: "+b);
		return b;
	}

	@Override
	public int m1() {
		
		int b1= b*b;
		System.out.println("m1 method--abstract method: "+b1);
		return b1;
	}
}


 
class Inheritance3 
{
	public static void main(String[] a)
	{
		Inheritance inObj=new Inheritance();
		inObj.m1();
		inObj.m2();
		inObj.m3();
		inObj.m4();
		inObj.m5();
	}
}

