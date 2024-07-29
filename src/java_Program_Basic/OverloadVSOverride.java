package java_Program_Basic;



 class Add
 {
	 
	 void m1(int a, int b)
	 {
		 System.out.println("Addition: "+(a+b));
	 }	 
	 void m2(int a, int b)
	 {
		 System.out.println(a + b);
	 }
 }
 
 class Sub extends Add
 {
	 void m1(int a,int b) //Overriding
	 {
		 System.out.println("Subtraction: "+(a-b));
	 }
	 void m2(int a, int b)
	 {
		 System.out.println(a + b);
	 }
 }
 
 class Mul extends Sub
 {
	 void m1(int a, int b) //Overriding concepts
	 {
		 System.out.println("Multiplication of 2 numbers "+(a*b));
	 }
	 void m2(int a, int b)//Overloading -same definition but parameter differs
	 {
		 System.out.println("Multiplication of 3 numbers: "+(a*b));
	 }
 }

public class OverloadVSOverride {

	public static void main(String[] args) {
		
		Add aobj= new Add();
		aobj.m1(11, 22);
		Sub sobj= new Sub();
		sobj.m1(33, 44);
		Mul mobj= new Mul();
		mobj.m1(11, 22);
		mobj.m2(12, 12);
	}

}
