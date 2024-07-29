package java_Program_Basic;

class Bank
{
	double roi()
	{
		return 1;
	}
}

class ICICI //extends Bank
{
	double roi()
	{
		return 0;
	}
}
class SBI extends Bank
{
	double roi()
	{
		return 13.5;
	}
}


public class OverridingDemo {
	
	public static void main(String[] args) {
		SBI sb= new SBI();
		System.out.println(sb.roi());
		ICICI ic= new ICICI();
		System.out.println(ic.roi());
		Bank b= new Bank();
		System.out.println(b.roi());
		
	}

}
