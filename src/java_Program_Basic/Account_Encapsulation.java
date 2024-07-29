package java_Program_Basic;

public class Account_Encapsulation {
	
	private int accno;
	private String name;
	private double amount;
	
	void setaccno(int accno)
	{
		this.accno=accno;// this keyword refer current class variable, we can specify same variable name
	}
	int getaccno()
	{
		return accno;
	}
	

}
