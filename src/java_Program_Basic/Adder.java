package java_Program_Basic;

public class Adder {
	
	int a=20,b=40;
	
	void sum() //1
	{
		System.out.println(a+b);
	}
	int sum(int a) //1
	{
		System.out.println(a);
		return a;
	}
    void sum(int x, int y) //2
    {
    	System.out.println(x+y);
    }
    void sum(double x,int y) //3
    {
    	System.out.println(x+y);
    }
    void sum(int a,int b, int c)
    {
    	System.out.println(a+b+c);
    }
}
